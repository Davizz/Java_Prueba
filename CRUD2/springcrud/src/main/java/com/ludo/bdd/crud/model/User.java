package com.ludo.bdd.crud.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name = "USER_TBL")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private Long id;
	
	@Column(name = "name")
	@Size(min = 3, max = 20, message = "{user.name.invalid}")
	private String name;
	
	@Column(name = "email", unique = true)
	@Email(message = "{user.email.invalid}")
	private String email;	
	
	public User() {			
	}


	public User(Long id, String name, String email) {		
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
	}
	
	//GETTERS + SETTERS


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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
