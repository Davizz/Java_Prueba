package com.nombrealumno.poo.poo_anotaciones;

public class Aventuras implements Categoria {

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return "aventure";
	}
	
	String categoria;

	public Aventuras(String categoria) {
		this.categoria = categoria; 
		// TODO Auto-generated constructor stub
	} 
	
	

}
