package com.ludo.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ludo.crud.dao.UserDao;
import com.ludo.crud.model.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	@Transactional
	public void save(User user) {
		userDao.save(user);

	}

	@Override
	@Transactional
	public List<User> list() {
		return userDao.list();
	}
	
	
	
	
	
	
	

}
