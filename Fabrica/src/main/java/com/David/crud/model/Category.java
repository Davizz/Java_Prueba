package com.David.crud.model;

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

	@Column(name = "category_name")
	@NotBlank(message = "{book.value.required}")
	@Size(max = 100, min = 1, message = "{book.category_name.invalid}")
	private String category_name;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "category")
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
