package com.ludo.bdd.crud.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.bdd.crud.model.Category;


@Repository
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	@Override
	public List<?> list() {
		//@SuppressWarnings("unchecked")
		//TypedQuery<Book> query = sessionFactory.getCurrentSession().createQuery("from Book");
		String sentencia = "from Category c Order by c.category_name";
		TypedQuery<?> query = sessionFactory.getCurrentSession().createQuery(sentencia);
		return query.getResultList();
	}
	
	@Override
	public void delete(long id) {
		//esto solo borra la categoria que estamos llamando
		//no borra la relacion que tiene la categorua con el categorydetail
		//Query query = sessionFactory.getCurrentSession().createQuery("delete from Book where id =:id");
		//query.setParameter("id", id);
		//query.executeUpdate();
		
		Category savedCategoryEntity = sessionFactory.getCurrentSession().find(Category.class, id);
		sessionFactory.getCurrentSession().remove(savedCategoryEntity);
	}

	@Override
	public Category get(long id) {	
		Session session = sessionFactory.getCurrentSession();
		Category category = session.get(Category.class, id);	
		return category;
	}

	@Override
	public long num() {
		long count = ((long) sessionFactory.getCurrentSession()
				.createQuery("SELECT COUNT(*) FROM Category")
				.uniqueResult());
		return count;
	}

}
