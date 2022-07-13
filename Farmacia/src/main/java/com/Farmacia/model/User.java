package com.Farmacia.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user", 
uniqueConstraints = { 
		@UniqueConstraint(columnNames={"email"},
		 name="uk_email_unik")
})
public class User extends DateColumns {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;

	@Column(name = "name")
	@Size(max = 20, min = 3, message = "{user.name.invalid}")
	private String name;

	@Column(name = "email", length= 40)
	@Email(message = "{user.email.invalid}")
	private String email;

	//https://stackoverflow.com/questions/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api
	@ManyToMany(cascade = {CascadeType.MERGE, 
			CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.DETACH}, fetch = FetchType.EAGER)
	@JoinTable(name = "user_product", joinColumns = { 
			@JoinColumn(name = "user_id") }, 
	inverseJoinColumns = {
			@JoinColumn(name = "product_id") })
	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public User() {
	}

	public User(long id, String name, String email) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	
	public User(String name, String email) {
	
		this.setName(name);
		this.setEmail(email);
	}

	// GETTERS + SETTERS

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

}
