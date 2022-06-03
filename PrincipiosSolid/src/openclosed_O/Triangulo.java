package openclosed_O;

class Triangulo extends Poligono {
	int base;
	int altura;

	public Triangulo(int base, int height) {
		this.base = base;
		this.altura = height;
	}

	public double area() {
		return base * altura / 2;
	}

	/*
	 * El principio de abierto-cerrado como el resto de principios nos ofrecen una
	 * gu�a para crear dise�os de software flexible, pero tambi�n hay que tener en
	 * cuenta que hacer un dise�o flexible implica tiempo y esfuerzo adicional e
	 * introduce un nuevo nivel de abstracci�n que aumenta la complejidad del
	 * c�digo. Por lo tanto antes de aplicar cualquier principio es necesario
	 * conocer nuestras necesidades y d�nde es interesante aplicar estos principios,
	 * como por ejemplo en �reas que es m�s probable que se modifiquen.
	 * 
	 * Hay muchos patrones de dise�o que nos ayudan a extender el c�digo sin
	 * cambiarlo como por ejemplo, el patr�n Decorator nos ayuda a seguir el
	 * principio de abierto-cerrado. 
	 * 
	 * https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)
	 * 
	 * Tambi�n el patr�n Factory 
	 * 
	 * https://es.wikipedia.org/wiki/Factory_Method_(patr%C3%B3n_de_dise%C3%B1o)
	 * 
	 * o el patr�n Observer
	 * 
	 * https://en.wikipedia.org/wiki/Observer_pattern
	 * 
	 * pueden usarse para dise�ar una aplicaci�n f�cil de extender con m�nimos
	 * cambios en el c�digo existente. Os invito a consultar estas 3 referencias.
	 */
}