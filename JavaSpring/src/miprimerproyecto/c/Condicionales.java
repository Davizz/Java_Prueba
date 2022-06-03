package miprimerproyecto.c;


import javax.swing.JOptionPane;

/**
 *
 * @author Ludovic Laisnez
 */
public class Condicionales {
     public static void main(String[] args) {
         //Pedimos la entrada de datos al usuario
         //Le pedimos que introduzca una edad
         String entrada = JOptionPane.showInputDialog("¿Qué edad tienes?");
         /*
         Convertimos al tipo de dato entero el número del usuario        
         */
         int edad = Integer.parseInt(entrada);
         //En función de su entrada, sacamos un comentario en pantalla
         //Se puede plantear de varios formas 
         
         //Uso booleano
         if (edad > 18) {
             System.out.println("Eres mayor de edad");
         } else {
             System.out.println("Eres menor de edad");
         }
         
         //Con una estructura con tres respuestas posibles
         if (edad > 65) {
             System.out.println("Ya tienes edad para jubilarte");
         } else if (edad < 18){
             System.out.println("Todavía no puedes ni votar, ni conducir un coche");
         } else {
             System.out.println("Eres adulto!");
         }
         
         // con una estructura más compleja
          if (edad < 18){
             System.out.println("Todavía no puedes ni votar, ni conducir un coche");
         } else if (edad < 40) {
             System.out.println("Eres jóven");
         } else if (edad < 65) {
             System.out.println("Ya eres maduro");
         } else {
             System.out.println("Ya tienes edad para jubilarte");
         }                           
         
     }
}

