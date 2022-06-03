package miprimerproyecto.c;


import javax.swing.JOptionPane;

/**
 * * @author Ludovic Laisnez
 */
public class BucleDoWhile {

    public static void main(String[] args) {
        String genero = "";                          
        
        int altura = 0;
        
        do {
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
            
        } while (genero.equalsIgnoreCase("M") == false && genero.equalsIgnoreCase("H") == false);
        
        
        altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));        
        int pesoIdeal = 0;
        
        if(genero.equalsIgnoreCase("M")){
            pesoIdeal = altura - 120;
        } else if (genero.equalsIgnoreCase("H")){
            pesoIdeal = altura - 110;
        }
        System.out.println("Tu peso ideal es de " + pesoIdeal + " kilos");
        System.exit(0);
    }
}
