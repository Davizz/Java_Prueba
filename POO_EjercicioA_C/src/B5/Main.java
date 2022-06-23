package B5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Funciones miMetodo = new Funciones();
		
		Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario
 
        while (!salir) {
 
            System.out.println("1. Ejercicio B5 1");
            System.out.println("2. Ejercicio B5 2");
            System.out.println("3. Ejercicio B5 3");
            System.out.println("4. Ejercicio B5 4");
            System.out.println("5. Ejercicio B5 5");
            System.out.println("6. Salir");
 
            try {
 
                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();
 
                switch (opcion) {
                    case 1:
                    	miMetodo.ejercicio_B5_1();
                        break;
                    case 2:
                    	miMetodo.ejercicio_B5_2();
                        break;
                    case 3:
                    	miMetodo.ejercicio_B5_3();
                        break;
                    case 4:
                    	miMetodo.ejercicio_B5_4();
                        break;
                    case 5:
                    	miMetodo.ejercicio_B5_5();
                        break;    
                    case 6:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 6");
                }
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }



		
		
	}

}
