package A0;

public class Main {

	/*
	 * Ej A0_1 
		Escriba un programa que muestre en consola la expresi�n �Hola! �.

		Ej A0_2 
		Presentaci�n sencilla de cada alumno. 
		Se pide crear una clase Presentaci�n con las variables edad (int) y precio (double) e 
		imprimir en consola el nombre, apellidos (en un println) y los datos num�ricos (en un printf). 

	 */
	public static void main(String[] args) {
		//Ej. A0_1
		System.out.println("Hola");
		
		//Ej. A0_2
		int edad = 51;
		double precio = 33.25;
		
		System.out.println("Rafa Rodriguez");
		System.out.printf("Edad %d, Precio %f",edad, precio);
	}

}
