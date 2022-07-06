package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ManejoFicheros {
	public static void getExtension(String fichero) {
		// File location
		File f = new File(fichero);

		// If file exists
		if (f.exists()) {
			String fileType = "Undetermined";
			String fileName = f.getName();
			String extension = "";
			int i = fileName.lastIndexOf('.');

			if (i > 0) {
				extension = fileName.substring(i + 1);
			}
			try {
				fileType = Files.probeContentType(f.toPath());
			} catch (IOException ioException) {
				System.out.println(
						"No podemos determinar la extensión del fichero " + f.getName() + " por el problema siguiente: " + ioException);
			}

			// Print Extension
			System.out.println("La extensión del fichero es -> " + extension + " y es probablemente un fichero de tipo " + fileType);
		} else {
			System.out.println("El fichero no existe!");
		}

	}
}
