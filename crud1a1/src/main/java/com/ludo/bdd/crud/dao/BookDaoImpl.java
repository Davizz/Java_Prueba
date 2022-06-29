package com.ludo.bdd.crud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.model.Book;


@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Book book) {
		sessionFactory.getCurrentSession().saveOrUpdate(book);
	}

	@Override
	public List<?> list() {
		String sentencia = "from Book b ORDER BY b.title";
		TypedQuery<?> query = sessionFactory.getCurrentSession().createQuery(sentencia);
		return query.getResultList();
	}
	
	@Override
	public void delete(long id) {
		//Esto solo borra el Book que estamos llamando
		//No borra la relación que tiene el Book con el BookDetails
		//Query query = sessionFactory.getCurrentSession().createQuery("delete from Book where id =:id");
		//query.setParameter("id", id);
		//query.executeUpdate();
		//Esto borra el Book y la relación que existe con el BookDetails
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
		//Book no book
		long count = ((long) sessionFactory.getCurrentSession()
				.createQuery("SELECT COUNT(*) FROM Book").uniqueResult());
		return count;
	}

}
