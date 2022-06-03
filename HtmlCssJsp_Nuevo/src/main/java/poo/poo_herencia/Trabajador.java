package poo.poo_herencia;

import java.time.LocalDateTime;

public class Trabajador extends Persona {
	
	private double sueldo; 
	private String puesto; 
	
	public Trabajador() {
		super("Ludovic");	
		this.sueldo = 1500;
		this.puesto = "Oficial de segunda";
	}	

	public Trabajador(String nombre) {
		super(nombre);	
		this.sueldo = 1500;
		this.puesto = "Oficial de segunda";
	}	

	/**
	 * @param nombre
	 * @param sueldo
	 * @param puesto
	 */
	public Trabajador(String nombre, double sueldo, String puesto) {
		super(nombre);	
		this.sueldo = sueldo;
		this.puesto = puesto;
	}	

	@Override
	public String toString() {
		return "Ha fichado el Trabajador con "
				+ "nombre " + getNombre() + ", \n"
				+ "puesto " + getPuesto()+ ", \n"			
				+ "sueldo " + getSueldo() + ": \n"
				+ LocalDateTime.now() + ".";
	}

	public String getPuesto() {
		return puesto;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	


	
	
	
	
	
	

}
