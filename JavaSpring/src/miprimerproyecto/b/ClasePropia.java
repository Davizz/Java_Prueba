package miprimerproyecto.b;

import java.util.*;

public class ClasePropia {

	public static void main(String[] args) {

		// Declarar un objeto e inicializar con
		// el objeto de entrada estándar predefinido
		Scanner s = new Scanner(System.in);
		System.out.println("Como te llamas?");
		// entrada de una cadena
		String nombre = s.nextLine();
		// entrada de un carácter
		System.out.println("Introduce tu genero por favor");
		char gender = s.next().charAt(0);
		// System.out.println(nombre);
		System.out.println("Introduce tu edad por favor");
		// Entrada de datos numéricos
		// byte, short y float
		int edad = s.nextInt();
		System.out.println("Introduce tu teléfono");
		long movilNo = s.nextLong();

		System.out.println("Hola " + nombre + " el año que "
				+ "viene tendrás " + (edad + 1) + " años.");
		// Imprima los valores para verificar si la entrada
		// fue obtenida correctamente.

		System.out.println("Género: " + gender);
		System.out.println("Teléfono: " + movilNo);
	
	

		double raiz = Math.sqrt(9);
		System.out.println(raiz);

//		double base = 15;
//		double exponente = 8; 
//		double resultado = Math.pow(base, exponente);
		// System.out.println(resultado);

		double num1 = 5.85;
		int num2 = (int) Math.ceil(num1);

		System.out.println("Si redondeamos " + num1 + " obtenemos un " + num2 + ".");

		float x = 4567.9874f;
		//los números con tipo de dato FLOAT pueden perder precisión
		//https://docs.microsoft.com/en-us/cpp/build/why-floating-point-numbers-may-lose-precision?view=msvc-170
		System.out.println("Probando a redondear un float " +Math.round(x));

		double base = 15;
		double exponente = 8;
		int resultado = (int) Math.pow(base, exponente);
		System.out.println(resultado);
		// Ojo con los límites de cada tipo de dato
		// No hacerlo puede llevar a tener sorpresas
		// límite de int 2147483647 imprimido
		// resultado real obtenido 2562890625

	}

}
