//mio
package com.ludo.bdd.crud.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;


@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private SessionFactory sessionFactory;

//	@Override
//	public void save(Book book) {
//		//sessionFactory.getCurrentSession().saveOrUpdate(book);
//		Category category = null;
//		category = (Category)sessionFactory.getCurrentSession()
//				.createQuery("FROM Catecory c WHERE c.catecory_name = :categoria_enviada")
//				.setParameter("categoria_enviada", book.getCategory().getCategory_name()).uniqueResult();
//		if(category!=null) {
//			book.setCategory(category);
//			category.getBooks().add(book);
//			if(book.getId() > 0) {
//				System.out.println("actualización de libro");
//				sessionFactory.getCurrentSession().merge(category);
//			}else {
//				System.out.println("creación de libro");
//				sessionFactory.getCurrentSession().persist(category);
//			}
//		}
//	}

	@Override
	public void save(Book book) {
		//sessionFactory.getCurrentSession().saveOrUpdate(book);
		
		Category category = null; 
		category = (Category)sessionFactory.getCurrentSession()
				.createQuery("from Category c where c.category_name = :categoria_enviada")
				.setParameter("categoria_enviada", book.getCategory().getCategory_name())
				.uniqueResult();
		
		if(category!=null) {
			book.setCategory(category);
			category.getBooks().add(book);
			if(book.getId() > 0) {
				System.out.println("Actualización de libro");
				sessionFactory.getCurrentSession().merge(category);
				
				
			} else {
				System.out.println("Creación de libro");
				sessionFactory.getCurrentSession().persist(category);
				
			}
			
			
		}
		
	}

	@Override
	public List<?> list() {
		//@SuppressWarnings("unchecked")
		//TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
		String sentencia = "from Book b Order by b.title";
		TypedQuery<?> query = sessionFactory.getCurrentSession().createQuery(sentencia);
		return query.getResultList();
	}
	
	@Override
	public void delete(long id) {
		//esto solo borra el book que estamos llamando
		//no borra la relacion que tiene el book con el bookdetail
		//Query query = sessionFactory.getCurrentSession().createQuery("delete from Book where id =:id");
		//query.setParameter("id", id);
		//query.executeUpdate();
		
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
		long count = ((long) sessionFactory.getCurrentSession()
				.createQuery("SELECT COUNT(*) FROM Book")
				.uniqueResult());
		return count;
	}

}
