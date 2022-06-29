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
public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void save(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);
	}

	@Override
	public Category get(long id) {
		Session session = sessionFactory.getCurrentSession();
		Category category = session.get(Category.class, id);	
		return category;
	}


	@Override
	public void delete(long id) {
		// Esto borra el Category y la relación que existe con el Book
		Category savedCategoryEntity = sessionFactory.getCurrentSession().find(Category.class, id);
		sessionFactory.getCurrentSession().remove(savedCategoryEntity);

	}

	@Override
	public long num() {
		//Category no category
		long count = ((long) sessionFactory.getCurrentSession().createQuery("SELECT COUNT(*) FROM Category")
				.uniqueResult());
		return count;
	}

	@Override
	public List<?> list() {
		String sentencia = "from Category c ORDER BY c.category_name";
		TypedQuery<?> query = sessionFactory.getCurrentSession().createQuery(sentencia);
		return query.getResultList();
	}

}
