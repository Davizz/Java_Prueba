package ficheros;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EditarFichero2 {
	
	public static void escribe(String nuevoFichero) {
		/************************************/
		
		
		File fichero = new File(nuevoFichero);

		if (fichero.exists())
		  System.out.println("El fichero " + nuevoFichero + " ya existe");
		else {
		  try{
		     BufferedWriter bw = new BufferedWriter(new FileWriter(nuevoFichero));
				
		     // Escribimos 10 filas
		     for (int x=0;x<10;x++)
		       bw.write("Fila numero " + x + "\n");

		     // Hay que cerrar el fichero
		     bw.close();
		  } catch (IOException ioe){
		     ioe.printStackTrace();
		  }
		}
	}

}
