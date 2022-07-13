package com.ludo.spring.dao;

import com.ludo.spring.model.User;

public interface UserDao {
	User findUserByUsername(String name);
}
