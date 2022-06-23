package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.Book;

public interface BookDao {
	void save(Book user);

	List<?> list();
	
	void delete(long id);
	
	Book get(long id);
	
	long num();
}
