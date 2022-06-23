package com.David.crud.dao;

import java.util.List;

import com.David.crud.model.Book;

public interface BookDao {
	void save(Book user);

	List<Book> list();
	
	void delete(long id);
	
	Book get(long id);
	
	long num();
}
