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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "title")
	@Size(max = 225, min = 1, message = "{book.title.invalid}")
	private String title;

	@Column(name = "author")
	private String author;

	//https://stackoverflow.com/questions/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "book", fetch = FetchType.LAZY)
	private BookDetails bookDetails;

	public BookDetails getBookDetail() {
		return bookDetails;
	}

	public void setBookDetail(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	@ManyToOne
	@JoinColumn(name = "cat_id")
	private Category category;

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "books")
	private List<User> users = new ArrayList<>();

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Book() {
	}

	public Book(long id, String title, String author) {	
		this.id = id; 
		this.title = title;
		this.author = author;
	}
	
	public Book(String title, String author) {		
		this.title = title;
		this.author = author;
	}

	// MÁS GETTERS / SETTERS

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

}
