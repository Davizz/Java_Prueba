package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Category;
import com.ludo.bdd.crud.model.Product;

public class ExecuteRel1ToMany {

	public static void execute1ToMany(Session session) {
		
		Category category = new Category(); 
		category.setCategory_name("Calzado"); 
		
		Product product1 = new Product(); 
		product1.setName("Zapato de seguridad");
		product1.setPrice(225);
		product1.setVat(21);
		product1.setCategory(category);
		
		Product product2 = new Product(); 
		product2.setName("Chanclas");
		product2.setPrice(20);
		product2.setVat(21);
		product2.setCategory(category);
		
		Product product3 = new Product(); 
		product3.setName("Zapatillas de deporte");
		product3.setPrice(125);
		product3.setVat(21);
		product3.setCategory(category);
		
		category.getProducts().add(product1);
		category.getProducts().add(product2);
		category.getProducts().add(product3);
		
		session.persist(category);
		
		
		
	}

}
