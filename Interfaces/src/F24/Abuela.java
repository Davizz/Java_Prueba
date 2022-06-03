package F24;


//La clase abuela ejecuta el método creado en la interfaz jubilación
public  class Abuela implements Jubilacion_int{
	
	public String nombre;
	private int edad;
	public Abuela() {
		// TODO Auto-generated constructor stub
	}
	public Abuela(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
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
	
	@Override
	public String getJubilacion() {
		if (edad>50)
		return "Esta jubilado";
		else return "No esta jubilado";
	}
	@Override
	public String toString() {
		return "Abuela [nombre=" + nombre + ", edad=" + edad + ", getNombre()=" + getNombre() + ", getEdad()="
				+ getEdad() + ", getJubilacion()=" + getJubilacion() + "]";
	}
		

}
