package F18_Rafa;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;




public class Funciones {
	final String SI_NO[] = {"SI","NO"};
	final String estado[] = {"Nuevo","2ª Mano","En Depósito"};
	
	/*  Ej F18-1 
		Tienes que realizar un programa que en menos de 16 líneas de código que cuente las vocales 
		que contiene una palabra que pasarás por teclado. 
 	 */
	
	//***** EJERCICIO F18_1 EN 5 LINEAS *****
	public void F18_1() {
/*1*/		final Pattern vocales = Pattern.compile("[aeiouAEIOUáéíóú]");
/*2*/		String cadena = JOptionPane.showInputDialog(null,"\n\nPalabra o Frase : ", "Cuenta vocales", JOptionPane.PLAIN_MESSAGE);
/*3*/		int n=0;
/*4*/		for(int i= 0;i<cadena.length();i++) { if(vocales.matcher(cadena.charAt(i)+"").matches()) { n++; } }
/*5*/		JOptionPane.showMessageDialog(null, "[ " + cadena + " ]\n\nTiene " + n + " vocal" + ((n==1)?"":"es"), "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
	
	/*  Ej F18-2 – Clase Libro
		Diseñar una clase Libro con las propiedades título, id, autor, año de publicación, prestado a, fecha de préstamo y estado. 
		Es necesario definir los atributos de cada propiedad (finales y/o estáticas o no) para poder diseñar la clase y 
		realizar la creación de los métodos GETTERS/ SETTERS adecuados. 
		
		Instancia 10 ejemplares de la clase y haz uso del método toString para imprimir en pantalla cada una de las propiedades de los objetos. 
		Ten en cuenta que, por cada instanciación, la salida del método toString tiene que devolver una id única por cada libro 
		y una fecha en formato dd/MM/yyyy. 
 	 */
	
	static ArrayList<Libro> libros = new ArrayList<>();
	
	public void F18_2() {
		//fecha del sistema
		Date fecha = new Date();
		
		
		try {
		
		libros.add(new Libro(Integer.parseInt(JOptionPane.showInputDialog(null, "ISBN: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE)),
				JOptionPane.showInputDialog(null, "Titulo: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE),
				JOptionPane.showInputDialog(null, "Autor: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE),
				pedirAA(),
				JOptionPane.showInputDialog(null, "Prestado: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE,
						null, SI_NO, "Selecciona"),
				fecha,
				JOptionPane.showInputDialog(null, "Prestado: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE,
						null, estado, "Selecciona")));
		
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
		}
		JOptionPane.showMessageDialog(null, libros.get(0).toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static int pedirAA() {
		int yy;
		do {	
			yy = Integer.parseInt(JOptionPane.showInputDialog(null, "Año de Publicación: ", "Alta de Libros", JOptionPane.PLAIN_MESSAGE));	
		}while(!comprobarAA(yy));
		return yy;
	}
	
	public static boolean comprobarAA(int yy) {
		Calendar cal= Calendar.getInstance();
		
		if (yy<=cal.get(Calendar.YEAR) && yy>1800) {
			return true;
		}else {
			return false;
		}
	}
	
}
