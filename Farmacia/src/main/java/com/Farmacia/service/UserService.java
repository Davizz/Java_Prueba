package com.Farmacia.service;

import java.util.List;

import com.Farmacia.model.User;

public interface UserService {
	void save(User user);

	List<User> listUsers();
	
	void deleteUser(long id);
	
	User getUser(long id);	
	
	long numUsers();

	void loanBooks(User user);

	void loanProducts(User user);

	
}

