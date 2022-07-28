package com.ludo.bdd.crud.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
/*he cambiado la clase importada*/
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.User;
import com.ludo.bdd.crud.other.Fecha;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}

	@Override
	public List<User> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	@Override
	public void delete(String username) {
		Query<?> query = sessionFactory.getCurrentSession().createQuery("delete from User where username =:username");
		query.setParameter("username", username);
		query.executeUpdate();
	}

	@Override
	public User get(String username) {
		User user = null;
		Session session = sessionFactory.getCurrentSession();
		user = session.get(User.class, username);
		return user;
	}

	@Override
	public long num() {
		long count = ((long) sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) FROM User")
				.uniqueResult());
		return count;
	}

	@Override
	public void loanBooks(User user) {
		// Qué lista tenemos ?
		// System.out.println(user.getBooks());
		// Metemos la lista en una provisional
		List<Book> listaEnviada = user.getBooks();
		// Borramos la lista anterior
		// Eso provoca que se borrará los registros de la BDD
		user.setBooks(new ArrayList<>());
		// Cargamos los libros enviados en una nueva lista
		for (Book book : listaEnviada) {
			// Por cada elemento enviado en el form
			// hacemos una frase que usaremos para la consulta
			String sentencia = "from Book book where book.title = :title";
			// Cargamos la session factory y a base de la frase, hacemos una consulta
			// para sacar un único libro
			Book loanedBookEntity = (Book) sessionFactory.getCurrentSession().createQuery(sentencia)
					.setParameter("title", book.getTitle()).uniqueResult();
			// Añadimos el libro a la lista de libros que tiene nuestro usuario
			user.getBooks().add(loanedBookEntity);
		}
		// Grabamos
		user.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
		sessionFactory.getCurrentSession().merge(user);
		// Sincronizamos la BDD
		sessionFactory.getCurrentSession().flush();

	}

//	@Override
//	public boolean confirmExisting(String email) {
//		String sentencia = "from User user where user.email = :email";
//		Session session = sessionFactory.getCurrentSession();
//		
//		return (boolean) session.createQuery(sentencia).uniqueResult();
//	}

}
