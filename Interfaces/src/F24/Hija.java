package F24;

public class Hija extends Padre implements Estudio_int{

	public Hija() {
		// TODO Auto-generated constructor stub
	}

	public Hija(String nombre, int edad) {
		super(nombre, edad);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getEstudio() {
		// TODO Auto-generated method stub
		return "Esta en edad de estudiar";
	}

	@Override
	public String toString() {
		return "Hija [nombre=" + nombre + ", getEstudio()=" + getEstudio() + ", getNombre()=" + getNombre()
				+ ", getEdad()=" + getEdad() + ", getJubilacion()=" + getJubilacion() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
