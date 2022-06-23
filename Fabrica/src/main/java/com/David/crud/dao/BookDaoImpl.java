package com.David.crud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.David.crud.model.Book;


@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public List<Book> list() {
		@SuppressWarnings("unchecked")
		TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
		return query.getResultList();
	}
	
	@Override
	public void delete(long id) {
		Query query = sessionFactory.getCurrentSession().createQuery("delete from Book where id =:id");
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@Override
	public Book get(long id) {	
		Session session = sessionFactory.getCurrentSession();
		Book book = session.get(Book.class, id);	
		return book;
	}

	@Override
	public long num() {
		long count = ((long) sessionFactory.getCurrentSession()
				.createQuery("SELECT COUNT(*) FROM Book")
				.uniqueResult());
		return count;
	}

}
