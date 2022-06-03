package miprimerproyecto.c;

/**
 *
 * @author Ludovic Laisnez
 */
public class BucleForEach {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*String [] paises = new String[12];
        paises[0] = "Alemania";
        paises[1] = "Francia";
        paises[2] = "Bélgica";
        paises[3] = "Italia";
        paises[4] = "Luxemburgo";
        paises[5] = "Países Bajos";
        paises[6] = "Dinamarca";
        paises[7] = "Irlanda";
        paises[8] = "Reino Unido";
        paises[9] = "Grecia";
        paises[10] = "Portugal";
        paises[11] = "España";*/
        
        String [] paises = {"Alemania", "Francia", "Bélgica", "Italia", 
            "Luxemburgo", "Países Bajos", "Dinamarca", "Irlanda", 
            "Reino Unido", "Grecia", "Portugal", "España"};
        
        System.out.println("Orden de entrada de los Paises en la UE:");
        /*for(int i = 0; i < paises.length; i++) {
            
            System.out.println("número " + (i+1) + " " + paises[i]);
        }  */
        
        int contador = 1;
        
        for(String pais:paises){
            
            System.out.println("número " + (contador) + " " + pais);
            contador++;
        }
    }
}
