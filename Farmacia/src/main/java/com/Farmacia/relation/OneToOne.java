package com.Farmacia.relation;

import org.hibernate.Session;

import com.Farmacia.model.Product;
import com.Farmacia.model.ProductDetails;

public class OneToOne {
	public static void executeRelation1To1(Session session) {
		Product product = new Product();
		product.setTitle("Le tour du monde en 80 jours");
		product.setAuthor("Jules Vernes");

		ProductDetails productDetails = new ProductDetails();
		productDetails.setPage_number("290");
		productDetails.setPublication_year("1864");
		productDetails.setPurchase_year("1990");

		productDetails.setProduct(product);

		product.setProductDetails(productDetails);
		//guarda solo el objeto book
		//session.save(book);
		//guarda book y sus hijos
		session.persist(product);
	}
}
