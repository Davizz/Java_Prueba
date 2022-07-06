package ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero2 {

	public static void Lee(String ruta) {

		try {
			// no es obligatorio que sea un .txt
			FileReader lectura = new FileReader(ruta);

			//Lee línea a línea
			BufferedReader reader = new BufferedReader(lectura);
			String linea = "";

			while (linea != null) {
				linea = reader.readLine();
				if (linea != null) {
					System.out.println(linea);
				}
			}		
			// Pasamos línea
			System.out.println();
			// Cerramos el flujo
			lectura.close();			
		} catch (IOException ex) {
			System.err.println("No se ha encontrado el fichero");
		}

	}

}
