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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "category")
public class Category extends DateColumns{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id; 
	
	
	@Column(name = "category_name", unique = true)	
	@NotBlank(message = "{category.value.required}") //Campo requerido
	@Size(max = 60, min = 1, message = "{category.category_name.invalid}")
	private String category_name;
	
	//DETACH quita la relación que hay entre 2 tablas para realizar un acción especifico
	//REMOVE permite borrar en cascada a partir del modelo indicado en remove(MODEL)
	//MERGE actualiza el modelo y las tablas con los que tiene relación establecida
	//PERSIST guarda el modelo y las tablas con los que tiene relación establecida
	@OneToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST, 
			CascadeType.REMOVE, CascadeType.DETACH}, mappedBy = "category")
	private List<Book> books = new ArrayList<>();

	public List<Book> getBooks() {
		return books;
	}	
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Category(String category_name) {		
		this.category_name = category_name;
	}



	public Category() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Category [getId()=" + getId() + ", getCategory_name()=" + getCategory_name() + "]";
	}

	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getCategory_name() {
		return category_name;
	}


	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	} 
	
	
	

}
