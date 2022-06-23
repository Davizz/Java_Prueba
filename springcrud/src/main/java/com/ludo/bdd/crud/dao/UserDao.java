package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();
	
	void delete(long id);
	
	User get(long id);
	
	
}
