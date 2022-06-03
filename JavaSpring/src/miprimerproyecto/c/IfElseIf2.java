package miprimerproyecto.c;

import java.util.Scanner;

/**
 * En un casino de juegos se desea mostrar los mensajes respectivos 
 * por el puntaje obtenido en el lanzamiento de tres dados de un cliente, 
 * de acuerdo a los siguientes resultados:
 * Si los tres dados son seis, mostrar el mensaje Excelente
 * Si dos dados se obtiene seis, mostrar el mensaje Muy bien
 * Si un dado se obtienen seis, mostrar el mensaje Regular
 * Si ningún dado se obtiene seis, mostrar el mensaje Pésimo
 * @author Ludovic Laisnez
 */
public class IfElseIf2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dado = 0;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Qué resultado has obtenido en el primer lanzamiento?");
        dado = (teclado.nextInt() == 6) ? ++dado : dado;  
        System.out.println("¿Qué resultado has obtenido en el segundo lanzamiento?");
        dado = (teclado.nextInt() == 6) ? ++dado : dado; 
        System.out.println("¿Qué resultado has obtenido en el último lanzamiento?");
        dado = (teclado.nextInt() == 6) ? ++dado : dado; 
        
        if(dado == 3){
            System.out.println("¡Excellente!");
        } else if(dado == 2){
            System.out.println("¡Muy bien!");
        } else if(dado == 1){
            System.out.println("¡Regular!");
        } else {
            System.out.println("¡Pésimo!");
        }
        teclado.close(); 
    }

}
