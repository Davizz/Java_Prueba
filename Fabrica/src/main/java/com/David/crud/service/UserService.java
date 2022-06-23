package com.David.crud.service;

import java.util.List;

import com.David.crud.model.User;

public interface UserService {
	void save(User user);

	List<User> listUsers();
	
	void deleteUser(long id);
	
	User getUser(long id);	
	
	long numUsers();
}
