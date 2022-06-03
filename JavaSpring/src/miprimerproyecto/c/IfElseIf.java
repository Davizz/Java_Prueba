package miprimerproyecto.c;

import java.util.Scanner;

/**
 * Se solicita leer un número entero positivo y determinar si es un número de 1, 2,3 o 4 cifras.
 * @author Ludovic Laisnez
 */
public class IfElseIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int num; 
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca un número de 1 a 100000");
        num = teclado.nextInt();
        if(num > 0 && num < 10){
            System.out.println("el número es de 1 cifra");
        } else if(num >=10  && num < 100) {
            System.out.println("el número es de 2 cifras");
        } else if(num >= 100 && num < 1000) {
            System.out.println("el número es de 3 cifras");
        } else if(num >= 1000 && num < 10000) {
            System.out.println("el número es de 4 cifras");
        } else if(num >= 10000 && num < 100000){
            System.out.println("el número es de 5 cifras");
        } else {
            System.out.println("Este número no está permitido");
        }
        teclado.close();
        
        
    }

}
