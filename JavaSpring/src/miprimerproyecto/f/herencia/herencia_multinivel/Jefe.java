package miprimerproyecto.f.herencia.herencia_multinivel;

public class Jefe extends Empleado {
	//22
	private String funcion;

	public Jefe(String nombre, int edad, String emailEmpresa, int telEmpresa, String funcion) {
		super(nombre, edad, emailEmpresa, telEmpresa);
		this.funcion = funcion; 
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		if(funcion.contains("jefe")) {
			return super.toString() + "Es " + funcion + " entonces, seguro que le puedes llamar cuando quieras";
			
		} else {
			return super.toString() + "Pero es " + funcion + " entonces, es mejor que esperes mediodía antes de llamarle.";
			
		}
	}
	
	
	
	

}
