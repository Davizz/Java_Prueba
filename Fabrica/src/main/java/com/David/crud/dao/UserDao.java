package com.David.crud.dao;

import java.util.List;

import com.David.crud.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();
	
	void delete(long id);
	
	User get(long id);
	
	long num();
	
	
}