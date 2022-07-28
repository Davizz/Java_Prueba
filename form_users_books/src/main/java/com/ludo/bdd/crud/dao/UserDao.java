package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();

	void delete(String username);

	User get(String username);

	long num();

	void loanBooks(User user);

}
