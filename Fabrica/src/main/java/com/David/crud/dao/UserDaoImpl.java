package com.David.crud.dao;

import java.util.List;

import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.David.crud.model.User;

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
	public void delete(long id) {
		Query query = sessionFactory.getCurrentSession().createQuery("delete from User where id =:id");
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
		long count = ((long) sessionFactory.getCurrentSession()
				.createQuery("SELECT COUNT(*) FROM User")
				.uniqueResult());
		return count;
	}

}
