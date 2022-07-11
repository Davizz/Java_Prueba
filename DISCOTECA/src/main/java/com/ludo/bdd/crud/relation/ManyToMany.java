package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.model.User;

public class ManyToMany {
	public static void executeRelationManyToMany(Session session) {
		Book book1 = new Book("Carry", "Stephen King");
		Book book2 = new Book("Cujo", "Stephen King");

		User user1 = new User("María Arozamena", "maria@gmail.com");
		user1.getBooks().add(book1);
		user1.getBooks().add(book2);

		User user2 = new User("Jerôme Fournier", "jekouille@gmail.com");
		user2.getBooks().add(book1);

		session.save(user1);
		session.save(user2);
	}
}
