package com.ludo.bdd.crud.dao;

import java.util.List;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.User;

public interface BookDao {
	void save(Book book);

	List<?> list();
	
	void delete(long id);
	
	Book get(long id);
	
	long num();	
}
