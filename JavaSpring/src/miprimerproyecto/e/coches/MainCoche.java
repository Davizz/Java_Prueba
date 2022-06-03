package miprimerproyecto.e.coches;

import miprimerproyecto.e.modificadoresacceso.MiClaseCocheOtroPaquete;

public class MainCoche {
	// 13 partes
	public static void main(String[] args) {

		// 1 MiClaseCoche
		// 2 MiClaseCoche
		// 3 MainCoche
		MiClaseCoche renault = new MiClaseCoche("Renault", "R26", 4, 4228, 1777, 1437);
//		System.out.print("Mi coche tiene " + renault.ruedas 
//				+ " ruedas. Es un coche de carrera.");
//		System.out.println("\nMide " + renault.longitud  
//				+ " centimetros. Es un coche largo y bonito.");
		// Esta forma de programar es muy peligroso
		// En serio, las propiedades de mis objetos no están para
		// nada protegidos
		// Ejemplo:
		// 4 MainCoche
//		renault.ruedas += 10; 
//		renault.longitud += 10000; 
//		System.out.print("Mi coche de carrera tiene " + renault.ruedas 
//				+ "ruedas. Es un mil pies");
//		System.out.println("\nMide " + renault.longitud  
//				+ " centimetros. Es increiblemente largo.");
		// Es un ejemplo de violación de datos
		// Y para evitarlo tenemos que usar por lo menos
		// el nivel de acceso protected. ACEPTABLE PERO NO IDEAL
		// o private. LO MÁS ADECUADO
		// 5 MainCoche
		// ver esquema

		// VEMOS COMO HAREMOS PARA ACCEDER A ELLO
		System.out.println("El coche mide " + renault.getAnchura() + " mm de ancho");
		System.out.println("por " + renault.getLongitud() + " mm de largo y ");
		System.out.println(renault.getAltura() + " mm de alto");
		System.out.println("Por supuesto tiene " + renault.getRuedas() + " ruedas");

		// Los métodos GETTERS y SETTERS sirven a controlar los cambios y acceso a datos
		// Con un SETTER podemos impedir que se cambie un valor por uno
		// no aceptable o que se intente romper la aplicación
		// de la misma forma que con un bucle o un try catch intentéis
		// controlar las intervenciones del usuario

		// ESPACIO DE MEMORIA
		// Por defecto, los objetos de la clase Coche no apuntan al mismo espacio de
		// memoria.
//		MiClaseCoche dedeuche = new MiClaseCoche("Citroen", "Deux chevaux", 4, 3800, 1480, 1600);
//		if (renault.equals(dedeuche) && (renault == dedeuche)) {
//			System.out.println("Los objetos " + renault.toString() + " y " + dedeuche.toString()
//					+ "apuntan al mismo espacio de memoria.");
//		} else {
//			System.out.println("Los objetos " + renault.toString() + " y " + dedeuche.toString()
//					+ "ya no apuntan al mismo espacio de memoria.");
//		}
		// Con Spring veremos que este comportamiento cambia.
		// 6 MiClaseCoche
		// 7 MiClaseCoche
		// 8 MiClaseCoche
		// 9 MiClaseCoche
		
		//16
		System.out.println(MainCoche.accediendoDesdeOtraClase());
		System.out.println(MainCoche.accediendoDesdeOtroPaquete());

	}

	// 10 MainCoche
	public static String accediendoDesdeOtraClase() {
		return "Accediendo a variables desde otra clase: " + MiClaseCoche.ejAcceso;
//		 No funciona si el modificador de acceso está configurado como
//		 private.
	}

	// 11 MiClaseSeat
	// 12 MiClaseCocheOtroPaquete
	// 13 MainCoche 
	//desde la clase MiClaseCocheOtroPaquete del paquete 
	//modificadoresacceso
	public static String accediendoDesdeOtroPaquete() {
//		 No accedo a ella si su visibilidad es private, (por defecto),
//		 o protected. Solo funcionará con la visibilidad pública
//		return "Accediendo a variables " + "desde misma clase: " + ""
//				+ miprimeroproyecto.e.modificadoresacceso.MiClaseCocheOtroPaquete.ejAcceso;
	//14 o importantdo el paquete apropriado
	return "Accediendo a variables otro paquete: " + ""
	+ MiClaseCocheOtroPaquete.ejAcceso;
	}
	
	

}
