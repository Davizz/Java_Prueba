package int3;

public class Heroe implements Experiencia {
	private Enemigos trasgo;	

	private String nombre; 
	private int edad; 
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Heroe(Enemigos trasgo, String nombre, int edad) {
		this.trasgo = trasgo;
		this.nombre = nombre; 
		this.edad = edad; 
	} 	

	public String puedeLuchar() {
		return "Nuestro personaje sabe luchar muy bien.\n";
	}

	@Override
	public String getExperiencias() {
		// TODO Auto-generated method stub
		return "En su vida ha tenido muchas experiencias.\n" + trasgo.getEnemigos();
	}

	@Override
	public String toString() {
		return puedeLuchar() + getExperiencias();
	}
}
