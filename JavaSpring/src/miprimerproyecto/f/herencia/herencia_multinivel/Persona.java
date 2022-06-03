package miprimerproyecto.f.herencia.herencia_multinivel;

public class Persona {
	//20
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	

	@Override
	public String toString() {
		return "Esta persona se llama "+ getNombre() 
		+ ", tiene " + getEdad() + " años.\n";
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
