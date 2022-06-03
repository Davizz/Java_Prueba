package miprimerproyecto.e.recursividad;

public class MainRecursividad {

	public static void main(String[] args) {
		/*
		 * En general, la recursividad es el proceso de definir algo en términos de sí
		 * mismo y es algo similar a una definición circular. El componente clave de un
		 * método recursivo es una declaración que ejecuta una llamada a sí mismo. La
		 * recursividad es un poderoso mecanismo de control.
		 */

		Factorial f = new Factorial();
		System.out.println("Factorial utilizando un método recursivo:");
		System.out.println("El factorial de 3 es: " + f.facR(3));
		System.out.println("El factorial de 6 es: " + f.facR(6));
		System.out.println();
		System.out.println("Factorial utilizando un método iterativo:");
		System.out.println("El factorial de 3 es: " + f.facI(3));
		System.out.println("El factorial de 6 es: " + f.facI(6));
		System.out.println();

		/*
		 * Las versiones recursivas de muchas rutinas pueden ejecutarse un poco más
		 * lentamente que sus equivalentes iterativos debido a la sobrecarga adicional
		 * de las llamadas a métodos adicionales. Demasiadas llamadas recursivas a un
		 * método podrían causar un desbordamiento de la pila.
		 * 
		 * Como el almacenamiento para los parámetros y las variables locales está en la
		 * pila y cada llamada nueva crea una nueva copia de estas variables, es posible
		 * que la pila se haya agotado. Si esto ocurre, el sistema de tiempo de
		 * ejecución (run-time) de Java causará una excepción. Sin embargo,
		 * probablemente no tendrás que preocuparte por esto a menos que una rutina
		 * recursiva se vuelva loca.
		 * 
		 * La principal ventaja de la recursividad es que algunos tipos de algoritmos se
		 * pueden implementar de forma más clara y más recursiva de lo que pueden ser
		 * iterativamente. Por ejemplo, el algoritmo de clasificación Quicksort es
		 * bastante difícil de implementar de forma iterativa. Además, algunos
		 * problemas, especialmente los relacionados con la IA, parecen prestarse a
		 * soluciones recursivas.
		 * 
		 * https://javadesdecero.es/intermedio/recursividad-con-ejemplos/
		 */

	}

}
