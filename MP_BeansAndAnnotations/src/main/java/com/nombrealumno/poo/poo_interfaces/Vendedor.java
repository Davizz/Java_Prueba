package com.nombrealumno.poo.poo_interfaces;


public class Vendedor implements Tareas {

	private String nombre;
	private double sueldo;
	
	@Override
	public String getTareas() {
		// pisa el m�todo de la interfaz
		return "Tiene que vender cosas para ganarse la vida.";
	}

	@Override
	public String getVentas() {
		// TODO Auto-generated method stub
		return "Este vendedor ha realizado muchas ventas este mes.";
	}

	/**
	 * Genera el constructor de la clase (Por defecto)
	 */
	public Vendedor() {

	}

	/**
	 * Genera otro constructor de la clase
	 * Este constructor es el que usamos con el bean Michel
	 * Para que funcione correctamente necesita el 
	 * SETTER setTienda(TiendaMadrid tienda)
	 */
	public Vendedor(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	private Tiendas tienda;

	public void setTienda(TiendaMadrid tienda) {
		this.tienda = tienda;
	}

	/**
	 * Genera otro constructor de la clase haciendo 
	 * inyecci�n de dependencias
	 * en el caso de ya tener el objeto creado
	 */
//	public Vendedor(TiendaMadrid tienda) {
//
//		this.nombre = "Annie";
//		this.sueldo = 3000;
//		this.tienda = tienda;
//	}
//	
	public Vendedor(TiendaBilbao tienda) {

		this.nombre = "Annie";
		this.sueldo = 3000;
		this.tienda = tienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Ha fichado el Vendedor con nombre " + getNombre() + ", \nsueldo " + getSueldo() + " euros, \nTareas: "
				+ getTareas() + "<br/>" + getVentas()+ "<br/>" + getTienda();
	}
	
	public String getTienda() {
		return tienda.getTienda();
	}



}
