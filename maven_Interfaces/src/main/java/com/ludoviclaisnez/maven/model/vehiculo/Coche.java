package com.ludoviclaisnez.maven.model.vehiculo;

public class Coche extends Vehiculo {
	private int codigo;
	private static int id = 1;
	private String descripcion;

	public Coche(String color, String marca, String modelo) {
		super(color, marca, modelo);

		this.codigo = id++;
	}

	public Coche() {
		super();
		this.codigo = id++;

	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/*
	 * ES IMPORTANTE TENER EN CUENTA EL HECHO QUE SPRING NO LLAMA A LA PROPIEDAD SI
	 * NO AL MÉTODO REALIZA UN TIPO DE CONCATENACIÓN PARA FORMAR LA PALABRA
	 * description DESDE getDescription()
	 */
	public String getDescription() {
		return "Es " + getColor() + " de la marca " + getMarca() + " y de modelo " + getModelo();
	}

	@Override
	public String toString() {
		return super.toString();
	}

}
