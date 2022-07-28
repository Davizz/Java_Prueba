package com.ludo.bdd.crud.dao;

import java.util.Date;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.other.Fecha;

@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Book book) {
		Category category = null;
		category = (Category) sessionFactory.getCurrentSession()
				.createQuery("from Category c where c.category_name = :categoria_enviada")
				.setParameter("categoria_enviada", book.getCategory().getCategory_name()).uniqueResult();
		if (category != null) {
			System.out
					.println("category name cargada:" + book.getCategory().getCategory_name() + ". Fecha" + new Date());
			book.setCategory(category);
			category.getBooks().add(book);
			if (book.getId() > 0) {
				System.out.println("Actu de libro");
				book.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
				sessionFactory.getCurrentSession().merge(category);
			} else {
				System.out.println("Creación de libro");
				book.setUpdatedAt(Fecha.getTimeStamp("Europe/Madrid"));
				book.setCreatedAt(Fecha.getTimeStamp("Europe/Madrid"));
				sessionFactory.getCurrentSession().persist(category);
			}

		}

		// sessionFactory.getCurrentSession().flush();
	}

	@Override
	public List<?> list() {
		String sentencia;
		TypedQuery<?> query;
		sentencia = "from Book b ORDER BY b.title";
		System.out.println(sentencia);
		query = sessionFactory.getCurrentSession().createQuery(sentencia);
		return query.getResultList();
	}

	@Override
	public void delete(long id) {
		Book savedBookEntity = sessionFactory.getCurrentSession().find(Book.class, id);
		sessionFactory.getCurrentSession().remove(savedBookEntity);

	}

	@Override
	public Book get(long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = session.get(Book.class, id);
		return book;
	}

	@Override
	public long num() {
		long count = ((long) sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) FROM Book")
				.uniqueResult());
		return count;
	}

}
