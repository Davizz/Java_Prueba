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
	 * Si en el c�digo anterior quisi�ramos a�adir un nuevo tipo de pol�gono, por
	 * ejemplo un tri�ngulo, tendr�amos que crear la nueva clase Triangulo que
	 * extender�a de Pol�gono, y a�adir diversos cambios en la clase Calculos para
	 * a�adir un nuevo m�todo areaTriangulo y modificar getArea para registrar el
	 * nuevo tipo de pol�gono.
	 * 
	 * En este caso ser�a necesario realizar bastantes modificaciones en Calculos
	 * para poder extender la funcionalidad, estar�amos incumpliendo el principio de
	 * abierto-cerrado.
	 * 
	 * A continuaci�n vamos a refactorizar el c�digo anterior para que cumpla el
	 * principio de abierto-cerrado, modificando el dise�o de tal manera que permite
	 * a�adir funcionalidades, en este caso concreto nuevos tipos de pol�gonos, sin
	 * modificar las clases y m�todos existentes
	 */

	public double getArea(Poligono p) {
		return p.area();
	}

	/*
	 * En este segundo ejemplo hemos creado el m�todo area en la clase padre
	 * Poligono, los objetos que extienden de ella, Cuadrado y Circulo, implementan la
	 * l�gica del c�lculo del �rea, que ser� diferente para cada pol�gono. De este
	 * modo la clase Calculos queda mucho m�s limpia y no ser� necesario
	 * modificarla cada vez que a�adamos un nuevo tipo de objeto Poligono o queramos
	 * modificar la l�gica del c�lculo del �rea en alguna implementaci�n concreta.
	 * 
	 * Para a�adir un pol�gono de tipo triangulo, solo ser�a necesario a�adir la
	 * siguiente clase, de esta manera podemos extender la aplicaci�n pero sin
	 * modificar el c�digo existente.
	 */
}
