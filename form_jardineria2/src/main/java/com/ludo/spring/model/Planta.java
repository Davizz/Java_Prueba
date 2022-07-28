package com.ludo.spring.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "planta")
public class Planta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	@Column
	private String nombre;
	@Column(name = "fecha", nullable = false, updatable = true)
	@Temporal(TemporalType.TIMESTAMP)
	@CreatedDate
	private Date fecha;
	@Column
	private double precio;

	/*JUNTO LOS ELEMENTOS PROPIEDAD / GETTERS SETTERS DE LAS RELACIONES */
	@OneToOne (cascade = CascadeType.ALL, mappedBy = "planta")
	private Semilla semilla;
	
	
	public Semilla getSemilla() {
		return semilla;
	}

	public void setSemilla(Semilla semilla) {
		this.semilla = semilla;
	}
	
	/**/

	@ManyToOne
	@JoinColumn(name = "invernadero_id")
	private Invernadero invernadero;

	public Invernadero getInvernadero() {
		return invernadero;
	}

	public void setInvernadero(Invernadero invernadero) {
		this.invernadero = invernadero;
	}
	
	@ManyToMany(mappedBy = "plantas", fetch = FetchType.EAGER)
	private List <Cliente> clientes = new ArrayList<Cliente>();
	
	
	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Planta(int id, String nombre, Date fecha, double precio) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.precio = precio;
	}

	public Planta(String nombre, Date fecha, double precio) {

		this.nombre = nombre;
		this.fecha = fecha;
		this.precio = precio;
	}

	public Planta() {
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

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Planta [getId()=" + getId() + ", getNombre()=" + getNombre() + ", getFecha()=" + getFecha()
				+ ", getPrecio()=" + getPrecio() + "]";
	}

}
