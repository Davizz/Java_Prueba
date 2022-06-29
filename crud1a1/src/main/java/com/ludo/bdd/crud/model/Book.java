package com.ludo.bdd.crud.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.beans.factory.annotation.Required;

@Entity
@Table(name = "book")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id; //long no Long
	
	@Column(name = "title")
	@NotBlank(message = "{book.title.required}")
	@Size(max = 225, min = 1, message = "{book.title.invalid}")
	private String title; 
	
	@Column(name = "author")
	@NotBlank(message = "{book.author.required}")
	private String author;	
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "book")
	private BookDetails bookDetails; 	
	
	public BookDetails getBookDetails() {
		return bookDetails;
	}

	public void setBookDetails(BookDetails bookDetails) {
		this.bookDetails = bookDetails;
	}

	public Book() {		
	}

	public Book(long id, String title, String author) {	
		this.id = id;
		this.title = title;
		this.author = author;
	}

	//MÁS GETTERS / SETTERS

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
