package com.ludo.bdd.crud.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "name")
	@Size(max = 20, min = 3, message = "{user.name.invalid}")
	private String name;
	
	@Column(name = "email", unique = true)
	@Email(message = "{user.email.invalid}")
	private String email;	
	
	public User() {			
	}


	public User(long id, String name, String email) {		
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	
	//GETTERS + SETTERS


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
