package miprimerproyecto.a;


/**
 *
 * @author Ludovic Laisnez
 */
public class Cadenas {
    public static void main(String[] args) {
        
        String name = "Ludovic";
        
        System.out.println("Mi nombre es " + name);
        
        System.out.println("Mi nombre tiene " + name.length() + " caracteres.");
        
        System.out.println("La primera letra de tu nombre es " + name.charAt(0)+ ".");
        
        System.out.println("La última letra de tu nombre es " + name.charAt(name.length()-1)+ ".");
        
        String frase = "Hoy es un estupendo día para aprender a programar en JAVA.";
        
        String resumen = frase.substring(29, frase.length()-1);
        
        System.out.println(resumen.substring(0,1).toUpperCase()+resumen.substring(1) + ".");
        
        String profesor = "ludovic";
        
        System.out.println(name.equals(profesor));
        System.out.println(name.equalsIgnoreCase(profesor));        
        
    }
}
