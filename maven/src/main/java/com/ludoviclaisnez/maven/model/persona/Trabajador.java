package com.ludoviclaisnez.maven.model.persona;

public class Trabajador extends Persona {
	
	private String empresa; 
	private int experiencia; 
	

	public Trabajador() {
		
	}


	public Trabajador(String email, String nombre, String empresa, int experiencia) {
		super(email, nombre);
		this.empresa = empresa;
		this.experiencia = experiencia;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}


	public int getExperiencia() {
		return experiencia;
	}


	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}


	@Override
	public String toString() {
		return super.toString() + " Trabajador [empresa=" + empresa + ", experiencia=" + experiencia + "]";
	}
	
	
	
	
	
	

}
