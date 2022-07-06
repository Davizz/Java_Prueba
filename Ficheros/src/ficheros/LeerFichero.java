package ficheros;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	public static void Lee(String ruta) {
		try {
			
			// no es obligatorio que sea un .txt
			/// Ficheros/src/ficheros/texto.txt
			FileReader lectura = new FileReader(ruta);
			// OJO\ La ruta será distinta en tu ordenador
			int c = 0;
			// Hasta acabar con el conjunto de caracteres disponibles
			// en el fichero
			//EOF
			while (c != -1) {
				c = lectura.read();
				// Obtenemos el código unicode y lo convertimos a CHAR
				char letra = (char) c;
				if (c != -1) {
					System.out.print(letra);
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
