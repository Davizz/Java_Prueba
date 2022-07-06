package ficheros;

import java.io.FileWriter;
import java.io.IOException;

public class EditarFichero {
    public static void escribe(String nuevoFichero){
        String frase = "Acabo de crear una SUPER frase!!!!";
        
        try {
        	//FileWriter escrituraPisandoLoExistante = new FileWriter(nuevoFichero);
            FileWriter escrituraSobreFicheroExistanteConservandoDatos = new FileWriter(nuevoFichero, true);
            for (int i = 0; i < frase.length(); i++){
            	escrituraSobreFicheroExistanteConservandoDatos.write(frase.charAt(i));
            }
            escrituraSobreFicheroExistanteConservandoDatos.close();
            
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
