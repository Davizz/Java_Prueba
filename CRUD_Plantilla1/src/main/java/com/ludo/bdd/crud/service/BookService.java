package com.ludo.bdd.crud.service;

import java.util.List;

import com.ludo.bdd.crud.model.Book;

public interface BookService {
	void save(Book book);

	List<?> listBooks();

	void deleteBook(long id);

	Book getBook(long id);

	long numBooks();
}
