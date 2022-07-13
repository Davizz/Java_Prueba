package com.ludo.spring.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ludo.spring.model.User;

@Repository
public class UserDaoImp implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	  public User findUserByUsername(String name) {
	    return sessionFactory.getCurrentSession().get(User.class, name);
	  }

}
