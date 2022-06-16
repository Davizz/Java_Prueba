package com.nombrealumno.pruebamaven.models;

public class Libro extends Producto {

	private String idioma;
	private String autor;
	
	private Categoria categoria; 
	
	public Libro(Categoria categoria) {
		this.setCategoria(categoria); 		
	}	

	public Libro() {
		super();
	}

	public Libro(String nombre, double precio, String idioma, String autor) {
		super(nombre, precio);
		this.idioma = idioma;
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [toString()=" + super.toString() + ", getIdioma()=" + getIdioma() + ", getAutor()=" + getAutor()
				+ "Categoria: " + this.categoria.getCategoria() + "]";
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getCategoria() {
		return categoria.getCategoria();
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
