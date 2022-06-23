package com.nombrealumno.poo.poo_herencia;

import java.time.LocalDateTime;

public class Estudiante extends Persona {
	
	public Estudiante() {}

	public Estudiante(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	private String curso;
	private double beca;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public double getBeca() {
		return beca;
	}

	public void setBeca(double beca) {
		this.beca = beca;
	}

	@Override
	public String toString() {
		return "Ha entrado en el edificio el Estudiante con nombre " + getNombre() 
		+ ", \n del curso " + getCurso()
		+ ", \n y con una beca de " + getBeca() 
		+ ": \n" + LocalDateTime.now() + ".";
	}

}
