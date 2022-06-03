package miprimerproyecto.e.productos;

import miprimerproyecto.e.productos.TiposEnumerados.Tallas;

public class Ropa {
	// IMPOSIBLE HACER UN OBJETO CON UN ENUM
	// PORQUE NO ES UNA CLASE
	// Tallas misTallas = new Tallas();
	private final Tallas talla;
	private String nombre;
	private double precio;

	// Tenemos que usarlo en un método o en el constructor
	// en private y como constante
	public Ropa(Tallas talla, String nombre, double precio) {
		this.talla = talla;
		this.nombre = nombre;
		this.precio = precio;
	}	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	



	public String getTalla() {
		return talla.getAbreviatura();
	}


	@Override
	public String toString() {
		return "Prenda: " + getNombre() 
		+ ", Precio: " + getPrecio() 
		+ "€, Talla: " + getTalla() + "]";
	}
	
	

}
