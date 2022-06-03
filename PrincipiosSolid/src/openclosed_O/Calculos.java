package openclosed_O;

class Calculos {
	/*mal
//	public double getArea(Poligono p) {
//		double result = 0;
//		if (p.type == 1) {
//			result = areaCuadrado((Cuadrado) p);
//		} else if (p.type == 2) {
//			result = areaCirculo((Circulo) p);
//		}
//		return result;
//	}
//
//	public double areaCirculo(Circulo circle) {
//		return Math.PI * Math.pow(circle.getRadio(), 2);
//	}
//
//	public double areaCuadrado(Cuadrado square) {
//		return Math.pow(square.getLado(), 2);
//	}
 * mal*/

	/*
	 * Si en el código anterior quisiéramos añadir un nuevo tipo de polígono, por
	 * ejemplo un triángulo, tendríamos que crear la nueva clase Triangulo que
	 * extendería de Polígono, y añadir diversos cambios en la clase Calculos para
	 * añadir un nuevo método areaTriangulo y modificar getArea para registrar el
	 * nuevo tipo de polígono.
	 * 
	 * En este caso sería necesario realizar bastantes modificaciones en Calculos
	 * para poder extender la funcionalidad, estaríamos incumpliendo el principio de
	 * abierto-cerrado.
	 * 
	 * A continuación vamos a refactorizar el código anterior para que cumpla el
	 * principio de abierto-cerrado, modificando el diseño de tal manera que permite
	 * añadir funcionalidades, en este caso concreto nuevos tipos de polígonos, sin
	 * modificar las clases y métodos existentes
	 */

	public double getArea(Poligono p) {
		return p.area();
	}

	/*
	 * En este segundo ejemplo hemos creado el método area en la clase padre
	 * Poligono, los objetos que extienden de ella, Cuadrado y Circulo, implementan la
	 * lógica del cálculo del área, que será diferente para cada polígono. De este
	 * modo la clase Calculos queda mucho más limpia y no será necesario
	 * modificarla cada vez que añadamos un nuevo tipo de objeto Poligono o queramos
	 * modificar la lógica del cálculo del área en alguna implementación concreta.
	 * 
	 * Para añadir un polígono de tipo triangulo, solo sería necesario añadir la
	 * siguiente clase, de esta manera podemos extender la aplicación pero sin
	 * modificar el código existente.
	 */
}
