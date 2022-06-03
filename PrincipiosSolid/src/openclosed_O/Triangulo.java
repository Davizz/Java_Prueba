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
	 * guía para crear diseños de software flexible, pero también hay que tener en
	 * cuenta que hacer un diseño flexible implica tiempo y esfuerzo adicional e
	 * introduce un nuevo nivel de abstracción que aumenta la complejidad del
	 * código. Por lo tanto antes de aplicar cualquier principio es necesario
	 * conocer nuestras necesidades y dónde es interesante aplicar estos principios,
	 * como por ejemplo en áreas que es más probable que se modifiquen.
	 * 
	 * Hay muchos patrones de diseño que nos ayudan a extender el código sin
	 * cambiarlo como por ejemplo, el patrón Decorator nos ayuda a seguir el
	 * principio de abierto-cerrado. 
	 * 
	 * https://es.wikipedia.org/wiki/Decorator_(patr%C3%B3n_de_dise%C3%B1o)
	 * 
	 * También el patrón Factory 
	 * 
	 * https://es.wikipedia.org/wiki/Factory_Method_(patr%C3%B3n_de_dise%C3%B1o)
	 * 
	 * o el patrón Observer
	 * 
	 * https://en.wikipedia.org/wiki/Observer_pattern
	 * 
	 * pueden usarse para diseñar una aplicación fácil de extender con mínimos
	 * cambios en el código existente. Os invito a consultar estas 3 referencias.
	 */
}