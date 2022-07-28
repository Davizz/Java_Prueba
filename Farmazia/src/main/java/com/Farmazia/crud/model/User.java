package com.Farmazia.crud.model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.validation.annotation.Validated;

import com.Farmazia.crud.validation.PasswordMatch;

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "email" }, name = "uk_email_unik") })
@PasswordMatch(baseField = "password", matchField = "confirmPassword")
@Validated
public class User extends DateColumns {

	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "name")
	@Size(max = 50, min = 3, message = "{user.name.invalid}")
	private String name;

	@Column(name = "surname")
	@Size(max = 50, min = 3, message = "{user.surname.invalid}")
	private String surname;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "password")
	@NotBlank(message = "{user.password.invalid}")
	@Size(max = 255, min = 3, message = "{user.password.invalid}")
	private String password;
	@Column(name = "confirmPassword")
	private String confirmPassword;
	@Column(name = "email", length = 40)
	@Email(message = "{user.email.invalid}")
	private String email;

	// https://stackoverflow.com/questions/2990799/difference-between-fetchtype-lazy-and-eager-in-java-persistence-api
	@ManyToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REMOVE,
			CascadeType.DETACH }, fetch = FetchType.EAGER)
	@JoinTable(name = "user_book", joinColumns = { @JoinColumn(name = "user_id") }, inverseJoinColumns = {
			@JoinColumn(name = "book_id") })
	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setBooks(List<Product> products) {
		this.products = products;
	}

	@OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST }, mappedBy = "user")
	private Set<Role> roles = new HashSet<>();

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	// Constructores
	public User() {
	}

	public User(String username, String name, String surname, boolean enabled, String password, String confirmPassword,
			String email) {
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.enabled = enabled;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.email = email;
	}

	public User(String username, String name, String surname, String password, String email) {

		this.username = username;
		this.name = name;
		this.surname = surname;
		this.password = password;
		this.email = email;
	}

	public User(String name, String surname, String email) {
		this.name = name;
		this.surname = surname;
		this.email = email;
	}

	// GETTERS + SETTERS

	public String getName() {
		return name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

}
