package com.David.crud.service;

import java.util.List;

import com.David.crud.model.Book;

public interface BookService {
	

	List<Book> listBooks();

	void deleteBook(long id);

	Book getBook(long id);

	long numBooks();

	void save(Book book);
}
