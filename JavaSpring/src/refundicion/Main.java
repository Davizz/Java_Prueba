package refundicion;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		// 01-03 EMPLEADO
		// 04-05 JEFE
		// 06-09 MAIN
		// 10-11 DIRECTOR
		// 12-13 MAIN
		// 14 PRESIDENTE

		// 6 crear unos cuantos empleados
		Empleado asier = new Empleado("Asier", 1500, "Informática");
		Empleado aitor = new Empleado("Aitor", 1600, "Informática");
		Empleado david = new Empleado("David", 1700, "Informática");
		Empleado ignacio = new Empleado("Ignacio", 1500, "Informática");
		Empleado gorka = new Jefe("Gorka", 1600, 200, "Informática");
		Empleado roberto = new Jefe("Roberto", 1700, 500, "Informática");

		ArrayList<Empleado> empleados = new ArrayList<Empleado>(
				Arrays.asList(asier, aitor, david, ignacio, gorka, roberto));

		// 7
		// en mi arraylist, gorka y roberto son unos empleados.
		// han beneficiado del constructor de la clase jefe pero
		// sin embargo al meter todos los empleados en un
		// mismo paquete, con estos 2 empleados
		// no tengo acceso al método setIncentivo
		// gorka.se
		// Para poder tener acceso tengo que hacer una refundición
		// del objeto. convertir el empleado Gorka en jefe.
		Jefe jefeFinanciero = (Jefe) gorka;
		Jefe jefeEquipo = (Jefe) roberto;
		// 8 
		// podemos actualizar el incentivo 
		// o simplemente tenerlo en el constructor
		//En nuestro ejmeplo actual lo tenemos en el constructor
		//Por eso comentará las líneas setIncentivo aquí abajo
		// Es solo después de hacerlo que tendré acceso a sus métodos propios
//		jefeFinanciero.setIncentivo(500);
//		jefeEquipo.setIncentivo(200);

		// 9 Sin embargo, ya que Asier no ha sido declarado como jefe,
		// no puedo convertirle en jefe como lo hice con Gorka
		// Jefe jefeSeguridad = (Jefe) asier;
		// Solo se puede hacer refundiciones si a la pregunta
		// ¿Es un jefe el empleado asier? contestamos que sí

		// 12
		Empleado ana = new Director("Ana", 3500, 200, 500, "Informática");
		empleados.add(ana);
		Director director = (Director) ana;
		
		//uso de setIncentivo y setBonificacion
//		director.setIncentivo(100);
//		director.setBonificaciones(500);

		// 13 Imprimiendo la lista de empleados
		for (Empleado empleado : empleados) {
			System.out.println(empleado);
		}

	}

}
