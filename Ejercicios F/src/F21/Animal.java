package F21;

public class Animal {

	/* Primera parte: 
		Crear una clase Animal sin el m�todo main con las propiedades privadas nombre, esperanzaDeVidaMax y edad.
		Crear un constructor de la superclase recibiendo todos los par�metros por par�metro.  
		A�adirle los m�todos GETTER y SETTER adecuados. 
		Pisar el m�todo toString y hacer que contenga cada uno de los m�todos GETTER. 
	 */
	
	private String nombre;
	private int esperanzaDeVidaMax;
	private int edad;
	
	public Animal(String nombre, int esperanzaDeVidaMax, int edad) {
		super();
		this.nombre = nombre;
		this.esperanzaDeVidaMax = esperanzaDeVidaMax;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEsperanzaDeVidaMax() {
		return esperanzaDeVidaMax;
	}

	public void setEsperanzaDeVidaMax(int esperanzaDeVidaMax) {
		this.esperanzaDeVidaMax = esperanzaDeVidaMax;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Animal [getNombre()=" + getNombre() + ", getEsperanzaDeVidaMax()=" + getEsperanzaDeVidaMax()
				+ ", getEdad()=" + getEdad() + "]";
	}
	
	public String CalculoEsperanzaVida(int EsparanzaVida, int edad) {
		if(edad > EsparanzaVida) {
			return "Es muy Viejo";
		}else {
			return "Vivir� " + (EsparanzaVida - edad)  + " a�os m�s.";
		}
	}
	
}
