package com.ludo.bdd.crud.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "category")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "category_name", unique = true)
	@NotBlank(message = "{book.value.required}")
	@Size(max = 100, min = 1, message = "{book.category_name.invalid}")
	private String category_name;
	
	
	//@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
	//relaciones una categoria tiene varios libros
	@OneToMany(cascade = {CascadeType.PERSIST,  //PERSIST = guarda el modelo y las tablas con las qye tiene relación establecida
						  CascadeType.REMOVE,   //REMOVE = permite borrar en cascada a partir del modelo indicado en remove(MODEL)
						  CascadeType.MERGE,    //MERGE = actualiza el modelo y las tablas con las que tiene relación establecida
						  CascadeType.DETACH   //DETACH = quita la relacion que hay entre 2 tablas para realizar una acción especifica
						  }, mappedBy = "category")
	private List<Book> books = new ArrayList<>();
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Category() {
	}

	public Category(String category_name) {
		this.category_name = category_name;
	}

	// MÁS GETTERS / SETTERS
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

	@Override
	public String toString() {
		return "Category [getId()=" + getId() + ", getCategory_name()=" + getCategory_name() + "]";
	}



}
