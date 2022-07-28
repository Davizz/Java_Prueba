package com.ludo.bdd.crud.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.validation.annotation.Validated;

@Entity
@Table(name = "book_details")
@Validated
public class BookDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "publication_year")
	@Digits(integer = 4, fraction = 0, message = "{book.digits.invalid}")
	@Min(value = 1500, message = "{book.publication_year_min.invalid}")
	@Max(value = 2022, message = "{book.publication_year_max.invalid}")
	private String publication_year;

	@Column(name = "purchase_year")
	@Digits(integer = 4, fraction = 0, message = "{book.digits.invalid}")
	@Min(value = 1975, message = "{book.purchase_year_min.invalid}")
	@Max(value = 2022, message = "{book.purchase_year_max.invalid}")
	private String purchase_year;

	@Column(name = "page_number")
	@Digits(integer = 4, fraction = 0, message = "{book.digits.invalid}")
	@Min(value = 20, message = "{book.page_number_min.invalid}")
	@Max(value = 2000, message = "{book.page_number_max.invalid}")
	private String page_number;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id")
	private Book book;

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public BookDetails() {
	}

	public BookDetails(long id, String publication_year, String purchase_year, String page_number) {
		this.id = id;
		this.publication_year = publication_year;
		this.purchase_year = purchase_year;
		this.page_number = page_number;
	}

	// MÁS GETTERS / SETTERS

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPublication_year() {
		return publication_year;
	}

	public void setPublication_year(String publication_year) {
		this.publication_year = publication_year;
	}

	public String getPurchase_year() {
		return purchase_year;
	}

	public void setPurchase_year(String purchase_year) {
		this.purchase_year = purchase_year;
	}

	public String getPage_number() {
		return page_number;
	}

	public void setPage_number(String page_number) {
		this.page_number = page_number;
	}

	@Override
	public String toString() {
		return "Publicado en " + getPublication_year() + "\nComprado en " + getPurchase_year() + ".\n"
				+ getPage_number() + " páginas";
	}

}
