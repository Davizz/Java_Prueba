package com.alumno.proyectogrupo;

public class Usuario {

	private String name; 
	private String password; 
	private String email; 
	private String avatar; 
	private String description; 
	private String genero; 
	private String especialidades; 
	private int edad;
	
	public Usuario() {
		
	} 	
	
	public Usuario(String name, String password, String email, String avatar, String description, String genero,
			String especialidades, int edad) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.avatar = avatar;
		this.description = description;
		this.genero = genero;
		this.especialidades = especialidades;
		this.edad = edad;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEspecialidades() {
		return especialidades;
	}
	public void setEspecialidades(String especialidades) {
		this.especialidades = especialidades;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	
	
	
}
