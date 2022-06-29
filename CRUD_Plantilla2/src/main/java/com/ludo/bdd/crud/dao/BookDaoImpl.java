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
		String sentencia;
		TypedQuery<?> query;
		/*
		 * https://docs.jboss.org/hibernate/orm/3.5/reference/es-ES/html/queryhql.html#
		 * queryhql-casesensitivity
		 */
		
		// La que conocemos
		/*BLOQUE FROM BOOK*/
		sentencia = "from Book";
		System.out.println(sentencia);	
		query = sessionFactory.getCurrentSession().createQuery(sentencia);
			
		// Con el fin de utilizar la referencia book en minusculas 
		// en otra parte de la petición
		// superior a un determinado año y usando "as book"
		//sentencia = "from Book as book where book.bookDetails.publication_year>:year";
		//System.out.println(sentencia);	
		//query = sessionFactory.getCurrentSession().createQuery(sentencia);
		//query.setParameter("year", 1880);
		// y inferior a usando Book book que es lo mismo que as book
		
		sentencia = "from Book book where book.bookDetails.publication_year < :year";
		System.out.println(sentencia);	
	query = sessionFactory.getCurrentSession().createQuery(sentencia);
	query.setParameter("year", 1880);
	
		// Que empieza por: Les
		
//		sentencia = "from Book book where book.title like :cadena ";
//		System.out.println(sentencia);	
//		query = sessionFactory.getCurrentSession().createQuery(sentencia);
//		query.setParameter("cadena", "Les%");
		
		
		// Que acaba por: es
		
//		sentencia = "from Book book where book.title like :cadena ";
//		System.out.println(sentencia);	
//		query = sessionFactory.getCurrentSession().createQuery(sentencia);
//		query.setParameter("cadena", "%es");
		
		
		// Que contenga las letras "de"
		
//		sentencia = "from Book book where book.title like :cadena ";
//		System.out.println(sentencia);	
//		query = sessionFactory.getCurrentSession().createQuery(sentencia);
//		query.setParameter("cadena", "%de%");
		
		
		// Estrictamente igual a
		//sentencia = "from Book book where book.author=:name ";
		//System.out.println(sentencia);	
		//query = sessionFactory.getCurrentSession().createQuery(sentencia);
		//query.setParameter("name", "François Rabelais");
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
		long count = ((long) sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) FROM Book")
				.uniqueResult());
		return count;
	}

}
