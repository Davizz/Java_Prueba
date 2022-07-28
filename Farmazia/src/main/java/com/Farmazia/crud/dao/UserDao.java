package com.Farmazia.crud.dao;

import java.util.List;

import com.Farmazia.crud.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();

	void delete(String username);

	User get(String username);

	long num();

	void loanProducts(User user);

}
