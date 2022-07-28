package com.ludo.bdd.crud.service;

import java.util.List;

import com.ludo.bdd.crud.model.User;

public interface UserService {
	void save(User user);

	List<User> listUsers();

	void deleteUser(String username);

	User getUser(String username);

	long numUsers();

	void loanBooks(User user);

}
