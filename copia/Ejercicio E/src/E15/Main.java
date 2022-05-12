package E15;

public class Main {
	
	enum Semana {
		  LUNES,
		  MARTES,
		  MIERCOLES,
		  JUEVES,
		  VIERNES,
		  SABADO,
		  DOMINGO
		}

	public static void main(String[] args) {
		/*
		Ejercicio E15_1 - Enum
		Vamos a listar los días de la semana en un tipo enumerado con el método de creación avanzado. A continuación, imprimiremos en pantalla el día de hoy y el de mañana.  

		*/
		Semana mySemana = Semana.MARTES; 
        
	    switch(mySemana) {
	      case LUNES:
	        System.out.println("HOY ES LUNES");
	        break;
	      case MARTES:
	        System.out.println("HOY ES MARTES");
	        break;
	      case MIERCOLES:
	        System.out.println("HOY ES MIÉRCOLES");
	        break;
	      case JUEVES:
	        System.out.println("HOY ES JUEVES");
	        break;
	      case VIERNES:
	        System.out.println("HOY ES VIERNES");
	        break;
	      case SABADO:
	        System.out.println("HOY ES SÁBADO");
	        break; 
	      case DOMINGO:
	        System.out.println("HOY ES DOMINGO");
	        break;

	    }


	}

}
