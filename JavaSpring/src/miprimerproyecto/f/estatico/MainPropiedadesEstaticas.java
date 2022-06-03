package miprimerproyecto.f.estatico;

import java.util.ArrayList;
import java.util.Arrays;

public class MainPropiedadesEstaticas {

	public static void main(String[] args) {
		//1 a 10 -> Empleado
		//13		
		Empleado hector = new Empleado("Héctor Suarez", "Informática"); 
		Empleado maria = new Empleado("María Martinez", "Informática"); 
		Empleado victoria = new Empleado("Victoria Hernández", "Informática");
		//14 lo pongo todo en un arraylist
		ArrayList<Empleado> empleados = new ArrayList<Empleado>(Arrays.asList(hector, maria, victoria));
		//15 un for para leerlos
//		for(Empleado e : empleados) {
//			System.out.println(e);
//		}
		//16 Pero qué pasa si en la ejecución del programa, meto un id repetido?
		Empleado ignacio = new Empleado("Ignacio Gonzalez", "Informática");
		empleados.add(ignacio);
		//comentaré el 15
//		for(Empleado e : empleados) {
//			System.out.println(e);
//		}
		//17 nos encontramos con dos IDs similares. 
		//y eso nos puede dar problemas sobre todo con bases de datos
		//la solución es hacer que id sea estático. 
		//le llamamos estático pero al final se vuelve dinámico ;-)
		
		//Ahora podemos hacer que el campo id se actualize solo 
		
		//22 ahora sin haber retocado nada aquí, me encuentro con 
		//el id dinámico funcional. Si ejecuto funciona...
		//23
		// eso que tendría que quitar el id del constructor
		//lo hago
		
		//24Si añado un objeto empleado con el otro constructor también
		Empleado miguelAngel = new Empleado();
		empleados.add(miguelAngel);
		//25 comentaré el bucle del 16
		for(Empleado e : empleados) {
			System.out.println(e);
		}
		
		//27 
		//El siguiente empleado tendrá la id 
		System.out.println("El siguiente empleado tendrá la id nº" + Empleado.getIdClase());
		//28
		//modificando la propiedad con el setter
		Empleado.setIdClase(10);
		Empleado marcelo = new Empleado();
		empleados.add(marcelo);
		//29 comentaré los demás bucles
		for(Empleado e : empleados) {
			System.out.println(e);
		}
		
		System.out.println("Cambio de último minuto");

	}

}
