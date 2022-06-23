package com.ludo.bdd.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "category_name")
	private String category_name;
	
	//No se puede tener un cascadeType de tipo ALL en esta anotación
	@OneToMany(cascade = CascadeType.ALL, mappedBy="category")
	private List<Product> products = new ArrayList<>();	
	
	public List<Product> getProducts() {
		return products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	

	public Category(int id, String category_name) {
		this.id = id;
		this.category_name = category_name;
	}


	public Category() {

	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", category_name=" + category_name + "]";
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
