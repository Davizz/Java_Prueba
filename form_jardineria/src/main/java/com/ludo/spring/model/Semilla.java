package com.ludo.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "semilla")
public class Semilla {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column
	private String nombre;
	@Column
	private String origen;
	@Column
	private int cantidad;

	@OneToOne
	@JoinColumn(name = "id")
	private Planta planta;
	
	public Planta getPlanta() {
		return planta;
	}

	public void setPlanta(Planta planta) {
		this.planta = planta;
	}

	public Semilla(String nombre, String origen, int cantidad) {

		this.nombre = nombre;
		this.origen = origen;
		this.cantidad = cantidad;
	}

	public Semilla(int id, String nombre, String origen, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.origen = origen;
		this.cantidad = cantidad;
	}

	public Semilla() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Semilla [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getOrigen()=" + getOrigen()
				+ ", getCantidad()=" + getCantidad() + "]";
	}

}
