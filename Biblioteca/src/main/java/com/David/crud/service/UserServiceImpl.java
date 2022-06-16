package com.David.crud.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.David.crud.dao.UserDao;
import com.David.crud.model.User;

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
