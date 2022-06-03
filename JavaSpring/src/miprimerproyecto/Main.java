package miprimerproyecto;

public class Main {

	public static void main(String[] args) {		
		/*Pasos de la clase Dudas*/		
		
		Dudas.comasOPuntos();
		Dudas.dobleLiteral();
		double miNumeroDouble = 12.25; 
		float miNumeroFloat = 12.26f; 
		System.out.println(Dudas.miMetodo(miNumeroFloat));
		System.out.println(Dudas.miMetodo(miNumeroDouble));
		System.out.println(Dudas.miMetodo(12.25f));
		System.out.println(Dudas.miMetodo(12.25));
		System.out.println(Dudas.miMetodo(12.25d));
		System.out.println( "" + (2/3.3333) );
		System.out.println( "" + (2/3.3333f) );
		System.out.println( "" + (2/3.3333d) );
		
		double ejemplo1 = 23.1f;
		float f = 23.1f;
		double ejemplo2 = (double)f;
		
		System.out.println( "EXAMPLE 1: " + ejemplo1 );
		System.out.println( "EJEMPLO 2: " + ejemplo2 );
		Dudas.switchEspecial();
		
		
		/*Pasos de la clase Funciones*/
//		String color = "rojo";
//		// JOptionPaneEjemplos pruebas = new JOptionPaneEjemplos();
//		Funciones pruebas = new Funciones();
//		System.out.println(pruebas.calculaMediaEdad(43, 44, 2));
//
//		System.out.println(pruebas.colorCoche(color));
//		System.out.println(Funciones.llamadaFuncionEstatica());
//		
//		int referencia = 12; //Es de tipo primitivo
//		pruebas.incrementaVariable(referencia);
//		System.out.println("fuera de la función el valor de "
//				+ "referencia es " + referencia);
//		
//		pruebas.incrementaVariable(referencia);
//		System.out.println("Segundo uso: fuera de la función el "
//				+ "valor de referencia sigue siendo " + referencia);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		//Una solución sería pisar el valor de la variable		
//		referencia = pruebas.incrementaVariable(referencia);
//		System.out.println("Después de pisar el valor de referencia sale con el número " + referencia);
//		referencia = pruebas.incrementaVariable(referencia);
//		System.out.println("Si repetimos, el valor de referencia sale con el número " + referencia);
//		System.out.println();
//		System.out.println();
//		System.out.println();
		
		//Funciones.cambiar(); 
		
//		System.out.println("fuera de la función el valor de la primera posición del array referencia es " + referenciaArr[0]);
//		
//		salida.incrementaVariableArray(pruebas.referenciaArr);
//		System.out.println("Segundo uso: el valor de la primera posición del array referencia es " + referenciaArr[0]);
		
		
		//Areas area = new Areas(); 

	}

}
