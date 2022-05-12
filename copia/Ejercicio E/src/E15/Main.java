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
		Vamos a listar los d�as de la semana en un tipo enumerado con el m�todo de creaci�n avanzado. A continuaci�n, imprimiremos en pantalla el d�a de hoy y el de ma�ana.  

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
	        System.out.println("HOY ES MI�RCOLES");
	        break;
	      case JUEVES:
	        System.out.println("HOY ES JUEVES");
	        break;
	      case VIERNES:
	        System.out.println("HOY ES VIERNES");
	        break;
	      case SABADO:
	        System.out.println("HOY ES S�BADO");
	        break; 
	      case DOMINGO:
	        System.out.println("HOY ES DOMINGO");
	        break;

	    }


	}

}
