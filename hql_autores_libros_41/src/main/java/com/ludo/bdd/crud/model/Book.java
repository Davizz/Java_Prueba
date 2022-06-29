package com.ludo.bdd.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id; 
	
	@Column
	private String title; 
	@Column
	private int num_page; 
	@Column
	private int year;	
	
	@ManyToOne
	@JoinColumn(name = "author_id")
	private Author author; 	

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Book(int id, String title, int num_page, int year) {
		this.id = id;
		this.title = title;
		this.num_page = num_page;
		this.year = year;
	}
	
	public Book(String title, int num_page, int year) {	
		this.title = title;
		this.num_page = num_page;
		this.year = year;
	}
	
	public Book() {
	
	}

	public int getId() {
		return id;
	}
	
	

	@Override
	public String toString() {
		return "Book [getId()=" + getId() + ", getTitle()=" + getTitle() + ", getNum_page()=" + getNum_page()
				+ ", getYear()=" + getYear() + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNum_page() {
		return num_page;
	}

	public void setNum_page(int num_page) {
		this.num_page = num_page;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	} 
	
	
	
	
	

}
