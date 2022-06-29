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
@Table(name = "author")
public class Author {

	// id, name, country;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column
	private String name;

	@Column
	private String country;
	
	@OneToMany(cascade = {
			CascadeType.PERSIST, 
			CascadeType.REMOVE, 
			CascadeType.MERGE, 
			CascadeType.DETACH
			}, mappedBy = "author")
	private List<Book> books = new ArrayList<>(); 	

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Author(int id, String name, String country) {
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public Author(String name, String country) {
		this.name = name;
		this.country = country;
	}

	public Author() {

	}
	
	

	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
