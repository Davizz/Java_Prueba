package F21;

public class Mamifero extends Animal {

	/*  Segunda parte: 
		A continuación, crear dos clases Mamífero y Ave que hereda de la clase Animales. 
		La clase mamífero tendrá la propiedad booleana tienePelo. 
		La clase Ave tendrá la propiedad booleana puedeVolar. 
		Crear un constructor de la subclase recibiendo todos los parámetros por parámetro.  
		
		Crear otro constructor de la subclase con la propiedad propia inicializada a true.  
		Añadirle métodos GETTER y SETTER adecuados. 
		
		Cada clase tiene su método toString propio. Este método debe imprimir la información que tenemos acerca de la superclase. 
		En el toString o en el método getEsperanzaDeVida(), indicar que este animal es muy viejo si su edad es superior 
		a la esperanza de vida. En caso contrario, indicar que el animal puede vivir un número de años igual al cálculo de 
		(esperanzadeVida – edad) años. 
	 */
	
	private boolean tienePelo;
	
	

	public Mamifero(String nombre, int esperanzaDeVidaMax, int edad) {
		super(nombre, esperanzaDeVidaMax, edad);
	}

	public Mamifero(String nombre, int esperanzaDeVidaMax, int edad, boolean tienePelo) {
		super(nombre, esperanzaDeVidaMax, edad);
		this.tienePelo = true;
	}

	public boolean isTienePelo() {
		return tienePelo;
	}

	public void setTienePelo(boolean tienePelo) {
		this.tienePelo = tienePelo;
	}

	@Override
	public String toString() {
		return "El Mamífero con Nombre : " + getNombre() + 
				"\nEsperanza de Vida ["+getEsperanzaDeVidaMax()+" años]: " + CalculoEsperanzaVida(getEsperanzaDeVidaMax(), getEdad()) +
				"\nEdad : " + getEdad() + " años.";
	}
	
	
	

	
	
	
	
}
