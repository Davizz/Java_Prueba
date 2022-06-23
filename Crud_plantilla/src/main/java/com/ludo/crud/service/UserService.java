package com.ludo.crud.service;

import java.util.List;

import com.ludo.crud.model.User;

public interface UserService {

	void save(User user);
	
	List<User> list();
}
