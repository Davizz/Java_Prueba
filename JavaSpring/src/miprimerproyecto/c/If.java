package miprimerproyecto.c;

import java.util.Scanner;

/**
 * En el Mercado se hace un 20% de descuento a los clientes cuya compra 
 * supera los 300 € 
 * ¿Cuál será la cantidad que pagará una persona por su compra? 
 * @author Ludovic Laisnez
 */
public class If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float compra;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cúal ha sido la cantidad comprada por el cliente?");
        compra = teclado.nextFloat();
        
        if (compra > 300){
            compra = compra - (compra * 20 / 100); 
        } 
       
        System.out.printf("El cliente ha pagado %.2f euros", compra);
        teclado.close(); 
        
    }

}
