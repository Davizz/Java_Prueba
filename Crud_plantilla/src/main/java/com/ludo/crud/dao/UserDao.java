package com.ludo.crud.dao;

import java.util.List;

import com.ludo.crud.model.User;

public interface UserDao {
	void save(User user);

	List<User> list();
}
