package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.BookDetails;

public class OneToOne {
	public static void executeRelation1To1(Session session) {
		Book book = new Book();
		book.setTitle("20000 lieues sous les mers");
		book.setAuthor("Jules Vernes");

		BookDetails bookDetails = new BookDetails();
		bookDetails.setPage_number(350);
		bookDetails.setPublication_year(1883);
		bookDetails.setPurchase_year(2000);

		bookDetails.setBook(book);

		book.setBookDetail(bookDetails);

		session.persist(book);
	}
}
