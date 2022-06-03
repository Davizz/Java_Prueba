package miprimerproyecto.b;

import java.util.Scanner;

public class Ejb4_Scanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Resolver ecuación de primer grado aX+b=c
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el valor de a");
        double a = entrada.nextLong();
        System.out.println("Escribe el valor de b");
        double b = entrada.nextLong();
        System.out.println("Escribe el valor de c");
        double c = entrada.nextLong();

        double d = (c - b) / a;
        String x;
        x = (a == 0) ? "ERROR: introduce un valor de a distinto de cero" : 
        	"El valor de x en la ecuación ax+b=c es " + Double.toString(Math.round(d*100d)/100d);
        System.out.println(x);
        entrada.close();

    }

}
