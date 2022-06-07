package com.ludoviclaisnez.maven.model.persona;

public class Persona {
	
	private String email; 
	private String nombre; 

	public Persona() {
		
	}

	public Persona(String email, String nombre) {
		this.email = email;
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Persona [email=" + email + ", nombre=" + nombre + "]";
	}
	
	
	
	
	
	
	
	

}
