package com.LibroHQL.model;

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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "author")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	@Size(max = 225, min = 1, message = "{book.title.invalid}")
	private String title;

	@Column(name = "country")
	private int num_page;

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "author", joinColumns = {
			@JoinColumn(name = "author_id")
	}, inverseJoinColumns = {
			@JoinColumn(name = "book_id")
	})
	private List<Book> products = new ArrayList<>();

	private List<Book> books; 
	

	public List<Book> getBooks() {
		return books;
	}

	public void setProducts(List<Book> books) {
		this.books = books;
	}

	
	
	public Author(long id, String title, int num_page) {
		super();
		this.id = id;
		this.title = title;
		this.num_page = num_page;
	}

	public Author() {
		super();
	}

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

	public int getNum_page() {
		return num_page;
	}

	public void setNum_page(int num_page) {
		this.num_page = num_page;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", title=" + title + ", num_page=" + num_page + ", getId()=" + getId()
				+ ", getTitle()=" + getTitle() + ", getNum_page()=" + getNum_page() + "]";
	}	
}
