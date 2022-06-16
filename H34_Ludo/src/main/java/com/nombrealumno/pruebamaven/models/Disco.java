package com.nombrealumno.pruebamaven.models;

public class Disco extends Producto implements Tipo {

	private int duracion;
	private int numCanciones;	
	

	public Disco() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Disco(String nombre, double precio, int duracion, int numCanciones, String tipo) {
		super(nombre, precio);
		this.duracion = duracion;
		this.numCanciones = numCanciones;
		
	}

	@Override
	public String toString() {
		return "Disco [toString()=" + super.toString() + ", getDuracion()=" + getDuracion() + ", getNumCanciones()="
				+ getNumCanciones() + ", getDuracion()=" + tipoDeProducto() + "]";
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public int getNumCanciones() {
		return numCanciones;
	}

	public void setNumCanciones(int numCanciones) {
		this.numCanciones = numCanciones;
	}

	@Override
	public String tipoDeProducto() {
		// TODO Auto-generated method stub
		return "Es de tipo CD";
	}
	
	

}
