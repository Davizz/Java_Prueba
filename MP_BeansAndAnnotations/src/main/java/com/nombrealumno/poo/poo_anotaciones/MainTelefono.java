package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nombrealumno.poo.poo_anotaciones.Config;

public class MainTelefono {
	
	
	//1-> Clase Samsung
	
	/*
	 * Herencia HIbrida (a trav�s de Interfaces): Es una mezcla de dos o mAs de los
	 * tipos de herencia anteriores. Como Java no admite herencia mUltiple con
	 * clases, la herencia hIbrida tampoco es posible con clases. En Java, podemos
	 * lograr herencia hIbrida solo a travEs de Interfaces.
	 */
	// Fuente: https://javadesdecero.es/poo/herencia-java-tipos-ejemplos/
	
	public static void main(String[] args) {
		System.out.println("****************HERENCIA HIBRIDA Y ANOTACIONES DE SPRING ****************************");
			
//		CincoG cincoG = new CincoG();
//		Telefono telefonoConInternet = new Telefono("SuperFone2100", "Huaaawei", 645789987, cincoG);
//		System.out.println(telefonoConInternet);
//		CandyCrush cc = new CandyCrush(); 
//		Samsung a52s = new Samsung("A52s", "Samsung", 648741741, cincoG, cc);
//		System.out.println(a52s);		
		
		// via XML
		// ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
		// "applicationContextConEscanDeSpring.xml");
		// via JAVA
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Samsung telefono = context.getBean("samsung", Samsung.class);
		System.out.println(telefono);	

		context.close();
		

	}

}
