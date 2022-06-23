package com.ludo.bdd.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ludo.bdd.crud.dao.UserDao;
import com.ludo.bdd.crud.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public void save(User user) {		
		User copiaUser = new User(); 
		copiaUser.setEmail(user.getEmail().toLowerCase());
		copiaUser.setName(user.getName().toUpperCase());
		copiaUser.setId(user.getId());		
		userDao.save(user);
	}

	@Override
	@Transactional
	public List<User> list() {
		return userDao.list();
	}

	@Override
	@Transactional
	public void delete(long id) {		
		userDao.delete(id);		
	}

	@Override
	@Transactional
	public User get(long id) {
		User user = userDao.get(id);	
		return user; 
	}

}
