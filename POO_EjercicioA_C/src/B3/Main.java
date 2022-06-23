package B3;

public class Main {
	public static void main(String[] args) {
		/*
		 * declarar una variable cad1 con tipo de dato String 
			y atribuirle el valor "EJEMPLO CADENA"
			declarar una variable cad2  con tipo de dato String 
			y atribuirle el valor "ejemplo cadena" en minúsculas
		 */
		
		String cad1 = "EJEMPLO CADENA";
		String cad2 = "ejemplo cadena";
		
		
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B3_1 ****");
		System.out.println("************************");
		System.out.println("*** OJO LUDOVIC, el resultado lo dejo entrecomillado para darle Enfasis ***\n");
		//imprimir en pantalla las dos variables usando el método println() 
		System.out.println(cad1);
		System.out.println();
		System.out.println(cad2);
		System.out.println();
		
		/*usando el método printf():
		imprimir en pantalla las dos variables.
		*/
		System.out.printf("Cadena 1 es [%s] y Cadena 2 es [%s]\n\n",cad1,cad2);
		
		//sacar en pantalla la longitud de cad1. 
		System.out.printf("El largo de la Cadena 1 es '%d'\n",cad1.length());
		
		//concatenar cad1 con cad2.
		System.out.printf("Concatenar Cadena 1 con Cadena 2 es: '%s' \n\n", cad1+cad2);
		
		//comparar las cadenas usando cada uno de los 2 métodos disponibles.
		//equals()
		if (cad1.equals(cad2)) {
			System.out.printf("Las cadenas son iguales con método equals\n");
		}else {
			System.out.printf("Las cadenas NO son iguales con método equals\n");
		}
		System.out.printf("Comparativa con el método equals es '%s'\n\n", cad1.equals(cad2));
		
		//equalsIgnoreCase()
		if (cad1.equalsIgnoreCase(cad2)) {
			System.out.printf("Las cadenas son iguales\n");
		}else {
			System.out.printf("Las cadenas NO son iguales\n");
		}
		System.out.printf("Comparativa con el método equalsIgnoreCase es '%s'\n\n",cad1.equalsIgnoreCase(cad2));
		
		//comparar las cadenas usando el método compareTo().
		System.out.printf("Usando el método compareTo(), su resultado es '%d' \n\n", cad1.compareTo(cad2));
		 
		
		//sacar en pantalla los 5 primeros caracteres de cad1.
		System.out.printf("Estos son los 5 primeros caracteres de cad1 %s\n\n",cad1.substring(0, 4));
		//pasar cad1 a minúsculas.
		System.out.printf("Paso cad1 '%s' a minúsculas, así '%s' \n\n",cad1,cad1.toLowerCase());
		
		//encontrar la ficha de compareTo(String) en la API de JAVA
		
	
			
		//obligar al sistema a hacer un punto y aparte (pasar de línea) al final del ejercicio
		System.out.printf("\n.\n\n");
		
		
		/*
		 * Ej B3_2
		Escriba un programa Java para obtener el primer carácter y el décimo de la cadena siguiente: Estamos practicando!!

		 */
		System.out.println("************************");
		System.out.println("**** EJERCICIO B3_2 ****");
		System.out.println("************************");
		System.out.println("*** OJO LUDOVIC, el resultado lo dejo entrecomillado para darle Enfasis ***\n");
		
		String cadena = "Estamos practicando!!";
		
		System.out.printf("Primer caracter es '%s' y el 10º caracter es '%s'\n",cadena.substring(0, 1), cadena.substring(9, 10));
	}

	
	public Main() {
		super();
	}

}