package com.ludoviclaisnez.maven.model.vehiculo;

public class Camion extends Vehiculo {
	
	private int codigo; 
	private static int id = 1;
	private int carga; 

	public Camion(String color, String marca, String modelo, int carga) {
		super(color, marca, modelo);
		this.carga = carga; 
		this.codigo = id++;
	}

	public Camion() {
		this.codigo = id++;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	@Override
	public String toString() {
		return super.toString() + "<br/>Es " + getColor() 
		+ " de la marca " + getMarca() 
		+ " y de modelo " + getModelo()
		+ " y su capacidad de carga es de " + getCarga() 
		+ " kilos.";
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

}
