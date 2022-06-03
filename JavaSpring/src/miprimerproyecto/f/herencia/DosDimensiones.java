package miprimerproyecto.f.herencia;

public class DosDimensiones {


	//3
//		double base;
//		double altura;	
	
	/*
	 * 5
	 * A menudo una variable de instancia de una clase se declarará privada
	 * (private) para evitar su uso no autorizado o alteración. Heredar una clase no
	 * anula la restricción de acceso privado. Por lo tanto, aunque una subclase
	 * incluye a todos los miembros de su superclase, no puede acceder a los
	 * miembros de la superclase que se han declarado privados. SUBCLASE.
	 */
	private double base;
	private double altura;

	// 6 Constructor por defecto
	public DosDimensiones() {
	}

	// 7 Constructor con las propieades
	public DosDimensiones(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	//8
	public String mostrarDimension() {
		return "La base y altura es: " + base + " y " + altura;
	}

	//9 GETTERS SETTERS
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

}
