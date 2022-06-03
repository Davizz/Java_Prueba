package miprimerproyecto.b;

public class Test {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;

		if (num1 < num2) {
			System.out.println("El primer número es el más grande");
		} else if (num1 == num2) {
			System.out.println("El primer número es igual al segundo");
		} else {
			System.out.println("El primer número es inferior al segundo");
		}

		if (num1 != num2) {
			System.out.println("El primer número es distinto al segundo");
		}

		String palabra = "palabra";
		String otraPalabra = "Palabra";

		if (palabra != otraPalabra) {
			System.out.println("La primera palabra es distincta de la otra");
		} else {
			System.out.println("Has escrito la misma palabra!!!");
		}

		if (palabra == "palabra" && num1 == 20) {
			System.out.println("Hemos encontrado la solución");
		} else if (palabra == "palabra" || num1 == 20) {
			System.out.println("Hemos encontrado una parte de la solución");
		}
		//JAVA NO ACEPTA EL USO DE === COMO SE HACE EN OTROS LENGUAJES DE PROGRAMACIÓN. 
		//TAMPOCO ACEPTA EL OPERADOR DE COMPARACIÓN <> 
		//SON OPERADORES QUE SE USAN EN PHP POR LO QUE SÉ
		//https://www.php.net/manual/es/language.operators.comparison.php

		// VAMOS A UTILIZAR UN OPERADOR TERNARIO (?)
		String miUltimaPalabra = (num1 > num2) ? "palabra" : "cambio de valor";
		System.out.println(miUltimaPalabra);

		// valor inicial de las variables
		// int num1 = 10;
		// int num2 = 20;
		num1 = 11;
		num1++;
		// num1 vale 12
		System.out.println("num1 vale " + num1);
		// num2 = num1++;
		num2 = ++num1;
		System.out.println("num1 vale " + num1 + " y num2 vale " + num2);

		int num3 = 100; 
		int num4 = 200; 
		num3 -= num4; 
		System.out.println("num3 vale " + num3 + " y num4 vale " + num4);

		int num5 = 3; 
		int num6; 
		num6 = 5; 
		num6 += 6; 
		System.out.println("num5 vale " + num5 + " y num6 vale " + num6);
		//int num7 = num6/num5;
		//double num7 = num6 / num5;
		//System.out.println("num7 vale " + num7);
	
		double num7 = (double)num6 / (double)num5;
		System.out.println("num7 vale " + num7);
		System.out.println("num6 vale " + num6);
				
		//CONSTANTES
		final int NUM = 12; 
		//NUM++;
		num6 = NUM + 1; 
		
		num6++; // num6=num6+1; 
		num6--; // num6=num6-1; 
		num6+=num6; //num6=num6+num6;
		
		
		
		
		

	}

}
