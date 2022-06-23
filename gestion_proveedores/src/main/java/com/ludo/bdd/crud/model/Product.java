package com.ludo.bdd.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column
	private String name;

	@Column
	private double price;

	@Column
	private double vat;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private Category category; 
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}	
	
	
	//Por defecto el fetch es Lazy porque hace el sistema 
	//ahorra recursos
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "products")
	private List<Provider> providers = new ArrayList<>(); 
	
	public List<Provider> getProviders() {
		return providers;
	}

	public void setProviders(List<Provider> providers) {
		this.providers = providers;
	}

	
	
	

	public Product() {

	}

	@Override
	public String toString() {
		return "Product [getId()=" + getId() + ", getName()=" + getName() + ", getPrice()=" + getPrice() + ", getVat()="
				+ getVat() + "]";
	}

	public Product(long id, String name, double price, double vat) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.vat = vat;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}



}
