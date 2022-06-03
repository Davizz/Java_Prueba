package miprimerproyecto.c;

import javax.swing.JOptionPane;



/**
 *
 * @author Ludovic Laisnez
 */
public class BucleFor {
     public static void main(String[] args) {   	 
    	 
         
         int tabla = 9;
         System.out.println("TABLA DE " + tabla);
         
         for(int i = 0 ; i < 10; i++ ){             
             System.out.println(tabla + " x " + i + " = " + (tabla * i));
         }
         
         tabla = 7;
         System.out.println("TABLA DE " + tabla);
         for(int i = 10 ; i > 0; i-- ){             
             System.out.println(tabla + " x " + i + " = " + (tabla * i));
         }
         
         int arroba = 0; 
         boolean punto = false;
         int caracter = 0;
         
         //En el siguiente ejemplo, quiero indicar que normalemente 
         //el tipo de comprobación que me apreto a programar se haría con expresiones regulares
         //que veremos más adelante
         
         String mail = JOptionPane.showInputDialog("Introduce tu email");
         
         //Por cada carácter que compone el email
         for(int i = 0 ; i < mail.length(); i++ ){                       
             //Si hay un arroba, subo el valor de arroba de 1
             if (mail.charAt(i) == '@') {
             arroba++;
             }
             //Si hay un solo arroba y que después de este arroba hay un punto 
             if(arroba == 1 && mail.charAt(i) == '.'){
                 //Valido el punto
                 punto = true;
             }
             //Si hay un arroba seguido de un punto y de caracteres
             if(arroba == 1 && punto == true){
                 //Subo el valor de caracter de 1
                 caracter++;
             }
         }
         //Finalmente, mi email será válido solo si presenta
         //Un único arroba y un punto seguido de 2 caracteres 
         if (arroba == 1 && punto == true && caracter >= 2){
             System.out.println("Email correcto");
         } else {
             System.out.println("Email incorrecto");
         }
         
         //Este código todavia se puede mejorar...
         //Además normalmente utilizaremos expresiones regulares
         //ej: @Pattern(regexp="^[^@]+@[^@]+\\.[a-zA-Z]{2,}$", message="No se ha escrito en el formato permitido")
         //En la API de java podeís encontrar información detallada 
         //sobre esta clase que vamos a utilizar
         //https://docs.oracle.com/javase/8/docs/api/java/util/regex/Pattern.html#method.summary
         //https://docs.oracle.com/javase/tutorial/essential/regex/char_classes.html
         //https://docs.oracle.com/javase/tutorial/essential/regex/index.html
         
         System.exit(0);
     }
}
