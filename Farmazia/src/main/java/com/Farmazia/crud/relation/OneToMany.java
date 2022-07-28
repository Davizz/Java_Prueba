package com.Farmazia.crud.relation;

import org.hibernate.Session;

import com.Farmazia.crud.model.Product;
import com.Farmazia.crud.model.Category;

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

		Product product3 = new Product();
		product3.setTitle("L'avare");
		product3.setAuthor("Molière");
		product3.setCategory(category);

		category.getProducts().add(product1);
		category.getProducts().add(product2);
		category.getProducts().add(product3);

		session.persist(category);
	}
}
