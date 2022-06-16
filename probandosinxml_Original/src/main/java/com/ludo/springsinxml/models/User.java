package com.ludo.springsinxml.models;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {
	
	@NotBlank(message = "Campo requerido")
	@Size(min= 3, max = 20, 
	message ="Este campo debe contener entre 3 y 20 caracteres.")
	private String name;
	
	@NotBlank(message = "Campo requerido")
	@Email(message = "Formato de email incorrecto")
	private String email;
	
	@Min(value = 18, message = "Debe ser mayor de edad")
	@Max(value = 120, message = "Demasiada edad")
	private int age;
	
	@NotBlank(message = "Campo requerido")
	@Size(min= 8, message ="Mínimo 8 caracteres.")
	private String password;
	
	private String avatar;
	
	public User() {
	
	}
	
	@Override
	public String toString() {
		return "<dl><dt>Usuario: " + getName() 
		+ "</dt><dd>Email: " + getEmail() 
		+ "</dt><dd>Edad: " + getAge()
		+ "</dt><dd>Contraseña: " + getPassword()
		+ "</dt>Avatar: " + getAvatar() + "</dd><dl>";
	}

	public User(String name, String email, int age, String password, String avatar) {
		
		this.name = name;
		this.email = email;
		this.age = age;
		this.password = password;
		this.avatar = avatar;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	


		

}
