/* 
 * Creamos un mini-juego mediante el cual el programa genera un número aleatorio 
 * entre 1 y 100 que nosotros desconocemos. Se trata de adivinar ese número lo  
 * más rapidamente posible. Para ello el programa nos irá lanzando pistas. 
 */
package miprimerproyecto.c;

import java.util.*;

/**
 * * @author Ludovic Laisnez
 */
public class BucleWhile2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//
//        //Declaramos 3 variables
//        //La primera el famoso número secreto que está incluido entre 1 y 100
        int secreto = 50;
//        //Y nos aseguramos que está incluido entre 1 y 100
//        if (secreto == 0) {
//            secreto = 1;
//        }
//  
//        //Comprobamos la calidad de la salida 
//        //Comentamos la salida porque sino no tiene gracia !
//        //System.out.println(secreto);
//
//        //El número ingresado por el usuario
        int numero = 0;         
//        //El número de intentos
        int intentos = 0;
//
        while (secreto != numero){
            System.out.println("Adivina el número secreto (entre 1 y 100)");
            intentos++;
            numero = entrada.nextInt();
            if (numero > secreto) {               
                System.out.println("El número secreto es más bajo");                
            } else if (numero < secreto) {             
                System.out.println("El número secreto es más alto");                
            } else {
                System.out.print("Lo has logrado!!! Y además lo has hecho ");
                if (intentos == 1) {
                    System.out.println("a la primera");
                } else {
                    System.out.println("en " + intentos + " veces.");
                }
            }

        } 
        entrada.close();
    	

    }
}
