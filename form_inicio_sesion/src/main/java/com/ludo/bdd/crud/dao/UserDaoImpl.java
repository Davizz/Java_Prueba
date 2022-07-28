package com.ludo.bdd.crud.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*he cambiado la clase importada*/
import org.hibernate.query.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.other.Fecha;
import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(User user) {
		if (user.getId() > 0) {
			user.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
			sessionFactory.getCurrentSession().saveOrUpdate(user);
		} else {
			user.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
			user.setCreatedAt(Fecha.getTimeStamp("Europe/Madrid"));
			sessionFactory.getCurrentSession().save(user);
		}
	}

	@Override
	public List<User> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		return query.getResultList();
	}

	@Override
	public void delete(long id) {
		Query<?> query = sessionFactory.getCurrentSession().createQuery("delete from User where id =:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public User get(long id) {
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, id);
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
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		// Sincronizamos la BDD
		sessionFactory.getCurrentSession().flush();

	}

	@Override
	public User findUserByUsername(String username) {
		// TODO Auto-generated method stub
		return sessionFactory.getCurrentSession().get(User.class, username);
	}

}
