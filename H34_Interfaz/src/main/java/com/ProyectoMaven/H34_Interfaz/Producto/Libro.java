package com.ProyectoMaven.H34_Interfaz.Producto;

public class Libro extends Producto{
	private String nombre; 
	private int precio;
	public Libro() {
		// TODO Auto-generated constructor stub
	}
	public Libro(String nombre, int precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", precio=" + precio + ", getNombre()=" + getNombre() + ", getPrecio()="
				+ getPrecio() + "]";
	}
}
