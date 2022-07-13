package com.Farmacia.dao;

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

import com.Farmacia.other.Fecha;
import com.Farmacia.dao.UserDao;
import com.Farmacia.model.Product;
import com.Farmacia.model.Category;
import com.Farmacia.model.User;

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
	public void loanProducts(User user) {
		// Qué lista tenemos ?
		// System.out.println(user.getBooks());
		// Metemos la lista en una provisional
		List<Product> listaEnviada = user.getProducts();
		// Borramos la lista anterior
		// Eso provoca que se borrará los registros de la BDD
		user.setProducts(new ArrayList<>());
		// Cargamos los libros enviados en una nueva lista
		for (Product product : listaEnviada) {
			// Por cada elemento enviado en el form
			// hacemos una frase que usaremos para la consulta
			String sentencia = "from Book book where book.title = :title";
			// Cargamos la session factory y a base de la frase, hacemos una consulta
			// para sacar un único libro
			Product loanedProductEntity = (Product) sessionFactory.getCurrentSession().createQuery(sentencia)
					.setParameter("title", product.getTitle()).uniqueResult();
			// Añadimos el libro a la lista de libros que tiene nuestro usuario
			user.getProducts().add(loanedProductEntity);
		}
		// Grabamos
		user.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		// Sincronizamos la BDD
		sessionFactory.getCurrentSession().flush();

	}

}
