package com.ludo.crud.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.crud.model.User;


@Repository
public class UserDaoImpl implements UserDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	@Override
	public void save(User user) {
		sessionFactory.getCurrentSession().save(user);

	}

	@Override
	public List<User> list() {
		
		//solicitud, consulta 
		//OJO IMPORTANTE: CON HQL TENEMOS QUE LLAMAR LA CLASE User Y NO LA TABLA user. 
		@SuppressWarnings("unchecked")
		TypedQuery<User> query = sessionFactory.getCurrentSession().createQuery("from User");
		
		return query.getResultList();
	}
	
	
	
	
	
	
	

}
