package juego;

public abstract class personaje {

	public personaje() {
		// TODO Auto-generated constructor stub
	}

	abstract public int lucha();
	abstract public int corre();
	abstract public int nada();
	
	public String nombre;
	public String raza;
	public String fuerza;
	public String percepcion;
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	@Override
	public String toString() {
		return "personaje [getNombre()=" + getNombre() + ", getRaza()=" + getRaza() + "]";
	}

	

	

	

	

	

}
