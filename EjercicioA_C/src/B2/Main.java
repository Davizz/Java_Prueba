package B2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	/*
	 * Ej B2_1
		Pedir al usuario que introduzca un n�mero entero. 
		El sistema calcula la ra�z cuadrada de este n�mero y saca en pantalla en una sola l�nea
		el resultado redonde�ndolo con 4 d�gitos y sin hacer uso de salto de l�nea. 
	 */
	public static void main(String[] args) {
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B2 ******");
		System.out.println("************************\n");
		
		DecimalFormat formateaDecimales = new DecimalFormat("###,###.####");
		
        System.out.println ("Por favor introduzca el valor num�rico entero : ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creaci�n de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un m�todo sobre un objeto Scanner
        int a = Integer.parseInt(entradaTeclado);
        
        double resultado = Math.sqrt(a);
        System.out.println ("La ra�z cuadrada del n�mero : "+entradaTeclado+" Es = "+formateaDecimales.format(resultado));
        entradaEscaner.close();
	}

}
