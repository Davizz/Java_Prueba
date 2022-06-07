package com.ludoviclaisnez.maven.model.persona;

public class Estudiante extends Persona {
	
	private int edad; 
	private String diploma; 

	public Estudiante() {
		// TODO Auto-generated constructor stub
	}

	public Estudiante(String email, String nombre, int edad, String diploma) {
		super(email, nombre);
		this.edad = edad;
		this.diploma = diploma;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDiploma() {
		return diploma;
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	@Override
	public String toString() {
		return "Estudiante [edad=" + edad + ", diploma=" + diploma + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
	
	
	
	

}
