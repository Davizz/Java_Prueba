package int3;

public class Barbaro extends Heroe implements PuedeDestruirPuertas {

	private PuedeDestruirPuertas puertas;	
	

	public Barbaro(Enemigos trasgo, PuedeDestruirPuertas puertas, String nombre, int edad) {
		super(trasgo, nombre, edad);
		this.puertas = puertas;		
	}

	public Barbaro(Enemigos trasgo, String nombre, int edad) {
		super(trasgo, nombre, edad);
	}	

	@Override
	public String puedeDestruirPuertas() {
		// TODO Auto-generated method stub
		return "Es lo bastante fuerte como para destruir puertas!!\n" + puertas.puedeDestruirPuertas();
	}

	@Override
	public String toString() {
		return getNombre() + " es un bárbaro de " + getEdad() 
		+ " años.\nEs un gran "
				+ "guerrero:\n" + super.toString() 	
		+ puedeDestruirPuertas();
	}
	
	

}
