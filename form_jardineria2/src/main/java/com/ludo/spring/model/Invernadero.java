package com.ludo.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "invernadero")
public class Invernadero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column
	private String nombre;
	@Column
	private String lugar;

	@OneToMany (mappedBy = "invernadero", cascade = {CascadeType.MERGE, CascadeType.PERSIST, 
			CascadeType.REMOVE, CascadeType.DETACH})
	
	public List <Planta> plantas = new ArrayList<Planta>();

	public List<Planta> getPlantas() {
		return plantas;
	}

	public void setPlantas(List<Planta> plantas) {
		this.plantas = plantas;
	}

	public Invernadero(String nombre, String lugar) {
		
		this.nombre = nombre;
		this.lugar = lugar;
	}

	public Invernadero(int id, String nombre, String lugar) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.lugar = lugar;
	}

	public Invernadero() {
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	@Override
	public String toString() {
		return "Invernadero [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getLugar()=" + getLugar() + "]";
	}

}
