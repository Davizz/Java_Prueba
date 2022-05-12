package B2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	/*
	 * Ej B2_1
		Pedir al usuario que introduzca un número entero. 
		El sistema calcula la raíz cuadrada de este número y saca en pantalla en una sola línea
		el resultado redondeándolo con 4 dígitos y sin hacer uso de salto de línea. 
	 */
	public static void main(String[] args) {
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B2 ******");
		System.out.println("************************\n");
		
		DecimalFormat formateaDecimales = new DecimalFormat("###,###.####");
		
        System.out.println ("Por favor introduzca el valor numérico entero : ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        int a = Integer.parseInt(entradaTeclado);
        
        double resultado = Math.sqrt(a);
        System.out.println ("La raíz cuadrada del número : "+entradaTeclado+" Es = "+formateaDecimales.format(resultado));
        entradaEscaner.close();
	}

}
