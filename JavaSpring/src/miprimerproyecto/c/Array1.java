package miprimerproyecto.c;

/**
 *
 * @author Ludo
 */
public class Array1 {

	public static void main(String[] args) {
        //Declarar
        String arr[];
        //Instanciar
        arr = new String[9];
        //Asignar valor a los elementos
        arr[0] = "Imanol y Alex";
        arr[1] = "Eric y Asier";
        arr[2] = "Iraitz y Judit";
        arr[3] = "Álvaro y Ana";
        arr[4] = "Lander y Matias";
        arr[5] = "Borja y Aida";
        arr[6] = "Ignacio y Carlos";
        arr[7] = "Elizabeth y Judit";
        arr[8] = "Samuel y Laura";

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("La mesa número "+(i+1)+" está compuesta por "+arr[i]+".\n");
//        }

        int index = 0; 
         for (String arr1 : arr) {
        	 index++;
            System.out.println("La mesa número "+index+" está compuesta por "+arr1 +".\n");
        }  
         
//         for(arr as index => value) {
//        	 System.out.println("La mesa número "+index+" está compuesta por "+value +".\n");
//        	}
//         
        
         
         
    }

}
