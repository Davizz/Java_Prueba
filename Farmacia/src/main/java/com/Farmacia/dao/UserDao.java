package com.Farmacia.dao;

import java.util.List;

import com.Farmacia.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();
	
	void delete(long id);
	
	User get(long id);
	
	long num();
	
	void loanProducts(User user);
	
	
}
