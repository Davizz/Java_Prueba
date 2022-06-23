package com.ludo.bdd.crud.relation;

import org.hibernate.Session;

import com.ludo.bdd.crud.model.Product;
import com.ludo.bdd.crud.model.Provider;

public class ExecuteManyToMany {
	
	public static void executeManyToMany(Session session) {
		
		Product product1 = new Product(); 
		product1.setName("Ordenador de sobremesa");
		product1.setPrice(2000);
		product1.setVat(21);
		
		Product product2 = new Product(); 
		product2.setName("Tableta");
		product2.setPrice(250);
		product2.setVat(21);
		
		Product product3 = new Product(); 
		product3.setName("Ratón");
		product3.setPrice(15);
		product3.setVat(21);
		
		Provider proveedor1 = new Provider();
		proveedor1.setName("El Chino");
		proveedor1.setPhone_number(944789987);
		proveedor1.setEmail("elchinocudeiri@xmail.com");
		
		Provider proveedor2 = new Provider();
		proveedor2.setName("Java SA");
		proveedor2.setPhone_number(944123123);
		proveedor2.setEmail("javasa@xmail.com");
		
		//ponemos en la lista de proveedores los productos que ellos venden
		proveedor1.getProducts().add(product1);
		proveedor1.getProducts().add(product2);
		proveedor1.getProducts().add(product3);
		proveedor2.getProducts().add(product1);
		proveedor2.getProducts().add(product2);
		proveedor2.getProducts().add(product3);
		
		
		session.persist(proveedor1);
		session.persist(proveedor2);
		
		
	}

}
