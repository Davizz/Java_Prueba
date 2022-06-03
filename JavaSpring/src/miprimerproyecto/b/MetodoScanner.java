package miprimerproyecto.b;

import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Ludovic Laisnez
 */
public class MetodoScanner {

    public static void main(String[] args) {

        //String input = "Esto es una pregunta que haré al usuario";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿Cómo te llamas?");
        //Un nombre de usuario
        String nombre = entrada.nextLine();
        
        System.out.println("Introduce tu edad por favor.");
        //Un número que inserta el usuario
        int numero = entrada.nextInt();
        
        System.out.println("Hola " + nombre + ". El año que viene, tendrás " + (numero + 1) + " años");
        //String pregunta = JOptionPane.showInputDialog("Aquí va la pregunta");

    }
}
