package com.ludoviclaisnez.maven;

public class Vehiculo {
	
	private String color; 
	private String marca; 
	private String modelo; 

	public Vehiculo(String color, String marca, String modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo() {
//		this.color = "amarillo";
//		this.marca = "Citroen";
//		this.modelo = "DS";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	//Frase que queremos que aparezca siempre en pantalla
	@Override
	public String toString() {
		return "Me he comprado un vehiculo fantástico";
	}
	
	
	
	

}
