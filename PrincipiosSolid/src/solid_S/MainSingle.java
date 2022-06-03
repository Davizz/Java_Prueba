package solid_S;

/**
 * Este principio establece que cada clase debe tener una única responsabilidad
 * dentro de nuestro software, y esta responsabilidad debe estar definida y ser
 * concreta. Todos los métodos deben estar alineados con la finalidad de la
 * clase.
 *
 */
public class MainSingle {
	public static void main(String[] args) {
		/*
		 * Single Responsability O L I D
		 * 
		 * Si nos encontramos con una clase que dispone de métodos que realiza tareas
		 * con distintas finalidades se deberáa refactorizar el código y crear clases
		 * nuevas que se corresponda con los objetivos del método.
		 * 
		 * Definir la responsabilidad única de una clase no es una tarea fácil, será
		 * necesario un análisis previo de las funcionalidades y cómo estructuramos la
		 * aplicación. Gracias a este principio nuestras clases tendrán un bajo
		 * acoplamiento y a la hora de realizar cambios menos clases se verán afectadas.
		 * Algunos síntomas que nos pueden hacer sospechar (bad smells) que no se está
		 * cumpliendo este principio serían:
		 * 
		 * Una clase es demasiado larga, demasiadas líneas de código. Cada vez que hay
		 * que introducir una modificación o una nueva funcionalidad, es necesario tocar
		 * en muchos sitios. Hay demasiadas relaciones entre clases. Mezcla
		 * funcionalidades de distintas capas de la arquitectura.
		 */

		Circulo circle = new Circulo(5);
		Cuadrado square = new Cuadrado(6);

		//Calculos calculos = new Calculos();
		//calculos.sumAreas(circle, square);

		/*
		 * Podríamos pensar que está bien crear el método de mostrar el resultado por
		 * pantalla dentro de la misma clase que realiza los cálculos, pero estaremos
		 * violando el principio de responsabilidad única, ya que no deberíamos mezclar
		 * la capa de presentación con la lógica de negocio, y posiblemente en un futuro
		 * si queremos actualizar la forma en que se muestra al usuario el resultado o
		 * queremos realizar nuevos cálculos vamos a tener que modificar todos nuestros
		 * métodos de la clase CalculationService. Aplicando el principio de
		 * responsabilidad única para refactorizar el código crearíamos una nueva clase
		 * PrintService en la que implementaremos las funciones encargadas de la
		 * presentación de nuestra aplicación:
		 */

		Calculos responsableCalculos = new Calculos();
		Impresiones responsableImpresion = new Impresiones();
		double result = responsableCalculos.sumAreas(circle, square);
		responsableImpresion.imprimeResultado(result);

	}
}
