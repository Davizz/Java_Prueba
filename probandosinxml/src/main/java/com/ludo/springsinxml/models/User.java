package com.ludo.springsinxml.models;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class User {

	@NotBlank(message = "Campo requerido")
	@Size(min = 3, max = 20, message = "Este campo debe de contener entre 3 y 20 caracteres.")
	private String name;
	@NotBlank(message = "Campo requerido")
	@Email(message = "Formato de email incorrecto")
	private String email;
	/*
	 * LA COMPROBACIÓN DE LA EDAD FUNCIONA A LA PERFECCIÓN SI LA CONFIGURAMOS COMO
	 * STRING. AL NO HACERLO EL SISTEMA NOS SIGUE DANDO UN ERROR DE COMPILACIÓN QUE
	 * NO CONSEGUIMOS CONTROLAR CORRECTAMENTE
	 */
	@Digits(integer = 10, fraction = 0, message = "Debe de ser un número entero")
	@Min(value = 18, message = "Debe de ser mayor de edad")
	@Max(value = 120, message = "Abuelete que no estás para teclear ya!!!")
	private String age;
	@NotBlank(message = "Campo requerido")
	@Size(min = 8, message = "Minimum 8 caracteres.")
	private String password;

	private String avatar;

	public User(String name, String email, String age, String password, String avatar) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.password = password;
		this.avatar = avatar;
	}

	public User() {

	}

	@Override
	public String toString() {
		return "<dl><dt>Usuario: " + getName() + "</dt><dd>Email:" + getEmail() + "<dd>Edad:" + getAge()
				+ "<dd>Contraseña:" + getPassword() + "<dd>Avatar:" + getAvatar() + "</dd></dl>";
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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
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
