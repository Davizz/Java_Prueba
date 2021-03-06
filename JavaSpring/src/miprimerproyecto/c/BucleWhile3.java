/* 
 * Creamos un mini-juego mediante el cual el programa genera un n?mero aleatorio 
 * entre 1 y 100 que nosotros desconocemos. Se trata de adivinar ese n?mero lo  
 * m?s rapidamente posible. Para ello el programa nos ir? lanzando pistas. 
 */
package miprimerproyecto.c;

import java.util.*;

/**
 * * @author Ludovic Laisnez
 */
public class BucleWhile3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
//
//        //Declaramos 3 variables
//        //La primera el famoso n?mero secreto que est? incluido entre 1 y 100
        int secreto = (int) ((Math.random()) * 100);
//        //Y nos aseguramos que est? incluido entre 1 y 100
        if (secreto == 0) {
            secreto = 1;
        }
//      
//        //Comprobamos la calidad de la salida 
//        //Comentamos la salida porque sino no tiene gracia !
//        //System.out.println(secreto);
//
//        //El n?mero ingresado por el usuario y los numeros ingresados por el 
//        //usuario para guiarle en su b?squeda del valor final
        int numero, refAlta, refBaja;
        numero = 0;
        refBaja = 0;
        refAlta = 100; 
//        //El n?mero de intentos
        int intentos = 0;

        do {
            System.out.println("Adivina el n?mero secreto "
            		+ "(entre " + refBaja + " y " + refAlta + ")");
            intentos++;
            numero = entrada.nextInt();
            if (numero > secreto) {
                refAlta = numero;
                System.out.println("El n?mero secreto es m?s bajo");                
            } else if (numero < secreto) {
                refBaja = numero;
                System.out.println("El n?mero secreto es m?s alto");                
            } else {
                System.out.print("Lo has logrado!!! Y adem?s lo has hecho ");
                if (intentos == 1) {
                    System.out.println("a la primera");
                } else {
                    System.out.println("en " + intentos + " veces.");
                }
            }
        } while (secreto != numero);
        entrada.close();
//
    }
}
