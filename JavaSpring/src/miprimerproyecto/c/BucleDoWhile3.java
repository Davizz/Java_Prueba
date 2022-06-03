/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimerproyecto.c;

import javax.swing.JOptionPane;

/**
 *
 * @author c2b421
 */
public class BucleDoWhile3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String genero = "";

        String altura;
        int numAltura = 0;

        do {
            genero = JOptionPane.showInputDialog("Introduce tu genero (H/M)");
        } while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("H") == false);

        do {
            altura = JOptionPane.showInputDialog("Introduce tu altura en cm");
            if (isNumeric(altura)) {
                numAltura = Integer.parseInt(altura);
            }
        } while (isNumeric(altura) == false);
        int pesoIdeal = 0;

        if (genero.equalsIgnoreCase("H")) {
            pesoIdeal = numAltura - 120;
        } else if (genero.equalsIgnoreCase("M")) {
            pesoIdeal = numAltura - 110;
        }

        System.out.println("Tu peso ideal es de " + pesoIdeal + "kilos");
        System.exit(0);
    }

    public static boolean isNumeric(String cadena) throws NumberFormatException {
        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException exception) {
            resultado = false;
        }

        return resultado;
    }

}
