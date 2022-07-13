package com.Farmacia.relation;

import org.hibernate.Session;

import com.Farmacia.model.Product;
import com.Farmacia.model.Category;

public class OneToMany {
	public static void executeRelation1ToMany(Session session) {
		Category category = new Category();
		category.setCategory_name("Teatro");

		Product product1 = new Product();
		product1.setTitle("Les femmes savantes");
		product1.setAuthor("Molière");
		product1.setCategory(category);

		Product product2 = new Product();
		product2.setTitle("Le bourgeois gentilhomme");
		product2.setAuthor("Molière");
		product2.setCategory(category);

		category.getProducts().add(product1);
		category.getProducts().add(product2);

		session.persist(category);
	}
}
