/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miprimerproyecto.c;

/**
 *
 * @author Ludovic Laisnez
 */
public class Matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        byte [] mi_cajon = new byte[6];
        mi_cajon[0] = 15;
        mi_cajon[1] = 25;
        mi_cajon[2] = 6;
        mi_cajon[3] = 32;
        mi_cajon[4] = -15;
        mi_cajon[5] = 90;
        
        int mi_cajon_grande[] = {150,250,60,320,-150,900};
        
        
        System.out.println(mi_cajon_grande[3]);
        
        for(int i = 0 ; i < mi_cajon.length; i++ ){             
             System.out.println("mi_cajon["+i+"] es igual a " + mi_cajon[i]);
         }
        
    }

}
