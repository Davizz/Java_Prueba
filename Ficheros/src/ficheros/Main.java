package ficheros;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * Tenga en cuenta que el nombre del archivo es suficiente solo cuando el
		 * archivo está en la misma carpeta que el directorio del proyecto de trabajo.
		 * De lo contrario, tenemos que especificar la ruta completa del archivo.
		 */
		//PRIMER MÉTODO POSIBLE PERO POCO PRÁCTICO, ESCRIBIR LA RUTA COMPLETA
		String carpeta = "C:/Users/Usuario/Documents/Eclipse/Ficheros/src/ficheros/";
		String txtFile = "texto.txt";
		//SEGUNDO MÉTODO: USAR LA CLASE FILE PARA ACCEDER A LA RUTA DEL FICHERO EN NUESTRO PROYECTO
		File f0 = new File("src/ficheros/Ejemplo.txt");
		//Y UTILIZAR EL MÉTODO GETABSOLUTEPATH()
		System.out.println(f0.getAbsolutePath());
		
		// Para leer ficheros de texto
		// 1er método: leyendo caracter a caracter
		// POCO eficiente con ficheros grandes
		//SEGÚN MÉTODO 1 DE ACCESO AL NOMBRE DE FICHERO
		//LeerFichero.Lee(carpeta + txtFile);	
		//UTILIZANDO GETABOLUTEPATH
		//LeerFichero.Lee(f0.getAbsolutePath());
		
		// Para leer ficheros de texto
		// 2ndo método UTILIZAR BufferedReader
		LeerFichero2.Lee(f0.getAbsolutePath());
		//BUFFEREDREADER UTILIZA UNA LECTURA LÍNEA A LÍNEA. PRÁCTICO CON FICHERO GRANDES
		
		
		//PARA EDITAR UN FICHERO, DISPONEMOS DE HERRAMIENTAS SIMILARES
		//UNA PRIMERA QUE TRABAJA CARACTER A CARACTER
		EditarFichero.escribe(f0.getAbsolutePath());
		File f1 = new File("src/ficheros/Otro.txt");
		//UNA SEGUNDA QUE LO TRATA TODO LÍNEA A LÍNEA
		EditarFichero2.escribe(f1.getAbsolutePath());
		
		//PARA LEER IMAGENES, UTILIZAMOS LA CLASE FileInputStream
		//ESTA CLASE ESTÁ ADAPTADA A FICHERO BINARIOS
		File fimage = new File("src/ficheros/imagen.jpg"); 
		LeerImagen.lee(fimage.getAbsolutePath()); 
		// PESO DE FICHERO		
		System.out.println("El fichero pesa " + fimage.length() + " bytes");
		System.out.println(" El fichero pesa " + fimage.length() / 1000 + " Kb");
		// EXTENSIÓN DE FICHERO
		//ESTO PUEDE RESULTAR MUY INTERESANTE A LA HORA DE COMPROBAR EL 
		//TIPO DE FICHERO QUE SE NOS ESTÁN DANDO LOS USUARIOS
		ManejoFicheros.getExtension(fimage.getAbsolutePath());
		//EL CÓDIGO PROPORCIONADO RECONOCE FICHEROS CLÁSICOS TAL Y COMO 
		//CSS, TXT, JPG, PNG, JAVA...
		File css = new File("src/ficheros/estilos.css");
		ManejoFicheros.getExtension(css.getAbsolutePath());
		//TRATARÁ LOS DEMÁS FICHEROS CON NORMALIDAD PERO NO PODRÁ 
		//INDICARNOS EL TIPO DE FICHEROS CON EL QUE ESTAMOS TRABAJANDO
		//JSP, PROPERTIES... TAMBIÉN PODRIAMOS MEJORAR EL CÓDIGO NOSOTROS
		//PARA AÑADIR ESTOS TIPOS DE FICHEROS
		File jsp = new File("src/ficheros/bookForm.jsp");
		ManejoFicheros.getExtension(jsp.getAbsolutePath());
		File propiedades = new File("src/ficheros/db.properties");
		ManejoFicheros.getExtension(propiedades.getAbsolutePath());
		File ensayo = new File("./ensayo");
		System.out.println(ensayo.getAbsolutePath());
		ManejoFicheros.getExtension(ensayo.getAbsolutePath());
		
		//MOVER UNA FICHERO EN OTRA CARPETA
		Path source = Paths.get(f1.getAbsolutePath());
		File destino = new File("src/movido/Otro.txt");
		Path target = Paths.get(destino.getAbsolutePath());
		//NECESITAMOS HACERLO EN UN BLOQUE TRY/CATCH
		try {
			Files.move(source, target);
		} catch (FileAlreadyExistsException e) {
			System.out.println("Este fichero ya existe");
		}catch (IOException e) {
			System.out.println("Fichero no encontrado");
		} catch (Exception e) {
			e.printStackTrace();
		}	
		
		//DIFERENCIA ENTRE GETPATH, GETABSOLUTEPATH Y GETCANONICALPATH
		// Cómo funcionan los métodos getPath, getAsolutePath...?
				File f2 = new File("test/ficheros/file.txt");
				File f3 = new File("test/.././file.txt");
		try {
			// getPath() obtiene la cadena de ruta que el fichero con el que se construyó el
			// objeto,
			// y puede ser el directorio actual relativo.
			System.out.println("getPath F2: " + f2.getPath());
			// getAbsolutePath() obtiene la cadena de ruta después de resolverla contra el
			// directorio actual si es relativa, resultando en una ruta completamente calificada.
			System.out.println("getAbsolutePath F3: " + f3.getAbsolutePath());
			// getCanonicalPath() obtiene la cadena de ruta después de resolver cualquier
			// ruta relativa contra el directorio actual, y elimina cualquier ruta relativa
			// ( . y .. ),
			// y cualquier enlace del sistema de archivos para devolver una ruta que el
			// sistema de archivos
			// considera el medio canónico para referenciar el objeto del sistema de
			// archivos al que apunta.
			System.out.println("getCanonicalPath F2: " + f2.getCanonicalPath());
			System.out.println("Carpeta del fichero (getParent) F2: " + f2.getParent());
			System.out.println("getPath F3: " + f3.getPath());
			System.out.println("getAbsolutePath F3: " + f3.getAbsolutePath());
			System.out.println("getCanonicalPath F3: " + f3.getCanonicalPath());

		} catch (IOException ex) {
			ex.printStackTrace();
		}		
	}	
}
