package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.Category;

public class OneToMany {
	public static void executeRelation1ToMany(Session session) {
		Category category = new Category();
		category.setCategory_name("Teatro");

		Book book1 = new Book();
		book1.setTitle("Les femmes savantes");
		book1.setAuthor("Molière");
		book1.setCategory(category);

		Book book2 = new Book();
		book2.setTitle("Le bourgeois gentilhomme");
		book2.setAuthor("Molière");
		book2.setCategory(category);

		Book book3 = new Book();
		book3.setTitle("L'avare");
		book3.setAuthor("Molière");
		book3.setCategory(category);

		category.getBooks().add(book1);
		category.getBooks().add(book2);
		category.getBooks().add(book3);

		session.persist(category);
	}
}
