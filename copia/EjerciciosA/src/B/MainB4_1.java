package B;
import java.util.Scanner; 

public class MainB4_1 {
	public static void main(String[] args) {
		/*
		 * Ej B4_1
		Escriba un programa que pida al usuario que introduzca 3 números enteros (cuadro de diálogo).
		A continuación, el programa debe mostrar la suma, el promedio y el producto de estos 3 números en un cuadro de mensaje. 
		El cálculo de la media debe dar un resultado entero.

		 */
		double a,b,c = 0;
		int i= 0;
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B4_1 ****");
		System.out.println("************************\n");
		
        System.out.println ("Por favor introduzca el valor entero de a: ");
        String entradaTeclado = "";
        Scanner entradaEscaner = new Scanner (System.in); //Creación de un objeto Scanner
        entradaTeclado = entradaEscaner.nextLine (); //Invocamos un método sobre un objeto Scanner
        a = Double.parseDouble(entradaTeclado);
        i++;
        System.out.println ("Por favor introduzca el valor entero de b: ");
        entradaTeclado = entradaEscaner.nextLine ();
        b = Double.parseDouble(entradaTeclado);
        i++;
        System.out.println ("Por favor introduzca el valor entero de c: ");
        entradaTeclado = entradaEscaner.nextLine ();
        c = Double.parseDouble(entradaTeclado);
        i++;
        
        //OPERACIONES
        //sumar
        System.out.printf("La suma de 'a', 'b' y 'c' es %d\n", (int)(a+b+c));
        
        //promedio
        System.out.printf("El promedio de 'a', 'b' y 'c' es %f\n", ((a+b+c)/i));
        
        //Producto
        System.out.printf("El producto de ' a', 'b' y 'c' es %d\n", (int)(a*b*c));
        
        //la media debe dar un entero
        System.out.printf("El valor medio de 'a', 'b' y 'c' es %d\n", (int)((a+b+c)/i));
		
		
		
		
	}
	public MainB4_1() {
		super();
	}

}