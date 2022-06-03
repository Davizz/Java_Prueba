package F24;

public class Padre extends Abuela implements Trabajo_int{

	public Padre() {
		// TODO Auto-generated constructor stub
	}

	public Padre(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getTrabajo() {
		// TODO Auto-generated method stub
		return "Tiene trabajo";
	}

	@Override
	public String toString() {
		return "Padre [nombre=" + nombre + ", getTrabajo()=" + getTrabajo() + ", getEdad()=" + getEdad() + "]";
	}

}
