package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.BookDetails;

public class OneToOne {
	public static void executeRelation1To1(Session session) {
		Book book = new Book();
		book.setTitle("Le tour du monde en 80 jours");
		book.setAuthor("Jules Vernes");

		BookDetails bookDetails = new BookDetails();
		bookDetails.setPage_number("290");
		bookDetails.setPublication_year("1864");
		bookDetails.setPurchase_year("1990");

		bookDetails.setBook(book);

		book.setBookDetails(bookDetails);
		//guarda solo el objeto book
		//session.save(book);
		//guarda book y sus hijos
		session.persist(book);
	}
}
