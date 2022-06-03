package solid_S;

/**
 * Este principio establece que cada clase debe tener una �nica responsabilidad
 * dentro de nuestro software, y esta responsabilidad debe estar definida y ser
 * concreta. Todos los m�todos deben estar alineados con la finalidad de la
 * clase.
 *
 */
public class MainSingle {
	public static void main(String[] args) {
		/*
		 * Single Responsability O L I D
		 * 
		 * Si nos encontramos con una clase que dispone de m�todos que realiza tareas
		 * con distintas finalidades se deber�a refactorizar el c�digo y crear clases
		 * nuevas que se corresponda con los objetivos del m�todo.
		 * 
		 * Definir la responsabilidad �nica de una clase no es una tarea f�cil, ser�
		 * necesario un an�lisis previo de las funcionalidades y c�mo estructuramos la
		 * aplicaci�n. Gracias a este principio nuestras clases tendr�n un bajo
		 * acoplamiento y a la hora de realizar cambios menos clases se ver�n afectadas.
		 * Algunos s�ntomas que nos pueden hacer sospechar (bad smells) que no se est�
		 * cumpliendo este principio ser�an:
		 * 
		 * Una clase es demasiado larga, demasiadas l�neas de c�digo. Cada vez que hay
		 * que introducir una modificaci�n o una nueva funcionalidad, es necesario tocar
		 * en muchos sitios. Hay demasiadas relaciones entre clases. Mezcla
		 * funcionalidades de distintas capas de la arquitectura.
		 */

		Circulo circle = new Circulo(5);
		Cuadrado square = new Cuadrado(6);

		//Calculos calculos = new Calculos();
		//calculos.sumAreas(circle, square);

		/*
		 * Podr�amos pensar que est� bien crear el m�todo de mostrar el resultado por
		 * pantalla dentro de la misma clase que realiza los c�lculos, pero estaremos
		 * violando el principio de responsabilidad �nica, ya que no deber�amos mezclar
		 * la capa de presentaci�n con la l�gica de negocio, y posiblemente en un futuro
		 * si queremos actualizar la forma en que se muestra al usuario el resultado o
		 * queremos realizar nuevos c�lculos vamos a tener que modificar todos nuestros
		 * m�todos de la clase CalculationService. Aplicando el principio de
		 * responsabilidad �nica para refactorizar el c�digo crear�amos una nueva clase
		 * PrintService en la que implementaremos las funciones encargadas de la
		 * presentaci�n de nuestra aplicaci�n:
		 */

		Calculos responsableCalculos = new Calculos();
		Impresiones responsableImpresion = new Impresiones();
		double result = responsableCalculos.sumAreas(circle, square);
		responsableImpresion.imprimeResultado(result);

	}
}
