package miprimerproyecto.c;

public class Funciones {
	
	public Funciones() {
		edad = 20; 
	}
	
	public int edad; 
	


	public void devuelveNada() {

		System.out.println("Sería decir una mentira "
				+ "afirmar que este método no "
				+ "devuelve nada ???");
	}

	public String devuelveUnTexto() {
		return "Devuelve algo este método?";
	}

	public double calculaMediaEdad() {
		int edadPersona1, edadPersona2, numPersonas; // double
		double media;
		edadPersona1 = 21;
		edadPersona2 = 44;
		numPersonas = 2;
		media = (edadPersona1 + edadPersona2) / numPersonas;
		return media;
	}

	public double calculaMediaEdad(int edadPersona1, 
			int edadPersona2, int numPersonas) {
		double media;
		media = (double)(edadPersona1 + edadPersona2) / numPersonas;
		return media;
	}

	public String colorCoche(String color) {
		return "El color del coche es " + color;
	}

	public static String llamadaFuncionEstatica() {
		return "Esto es una función estática";
	}

	public static String llamadaFuncionEstaticaConParam(String param) {
		return "Esto es una función estática que devuelve además "
				+ "el parámetro " + param;
	}

	public static void cambiar(int a, int[] b) {
		a = 50;
		b[0] = 60;
		b[1] = 70;
		System.out.println("Dentro: " + a + " " + b[0] + " " + b[1]);
	}
	
	public int incrementaVariable(int referencia) {
		referencia++;  
		System.out.println("Dentro del método el valor de referencia es " + referencia);
		return referencia; 
	}
	
	public int incrementaVariableArray(int[] referencia) {
		referencia[0]++;  
		System.out.println("Con un array, el resultado es distinto. Ahora Referencia vale " + referencia[0]);
		return referencia[0]; 
	}



	public static void main(String[] args) {
		//
		//Parte 1
		//
		Funciones salida = new Funciones();
//		salida.devuelveNada();
//		salida.devuelveUnTexto();
//		// La función se ha ejecutado con normalidad
//		// Devuelve un string pero no se contempla ya que no hemos pedido al sistema que
//		// lo imprima en pantalla.
//		System.out.println(salida.devuelveUnTexto());
//
//		// Para comprobarlo podemos crear funciones que vayan a realizar cálculos
//		double resultado = salida.calculaMediaEdad();
//		System.out.println("1 - La media de edad de estas personas es: " + resultado);
		
		
		
		// Qué observamos? Como lo podemos solucionar? Uso de Double para no perder

		//	Qué sepáis que hemos utilizado Variables locales
		// edadPersona1, edadPersona2, numPersonas no valen nada fuera del método
		//	Los hemos declarado dentro del método y solo pueden emplearse 
		//	dentro del propio método. Estas variables locales pueden ser de un tipo primitivo o de un tipo referencia. 
		//	Su existencia (reserva de espacio en memoria) sólo dura mientras se está ejecutando la llamada al método.

		// Podemos utilizar parámetros en las funciones
//		System.out.println(salida.colorCoche("rojo"));
		
		// También podemos sobrescribir funciones a condición de no repetir el número de
		// parámetros
//		System.out.println("2 - La media de edad de estas personas es: " + salida.calculaMediaEdad(21, 44, 2));
		// Los parámetros dan a las funciones la posiblidad de ser más dinámicas

		// Funciones estáticas
		// Las funciones estáticas se llaman directamente sin pasar por la instancia de
		// la clase Funciones en nuestro caso
//		System.out.println(llamadaFuncionEstatica());
//
//		System.out.println(llamadaFuncionEstaticaConParam("Cualquiera"));
		
		
		//
		//Parte 2 
		//
//		System.out.println();
//		System.out.println();
//		System.out.println();
		

		
		//Podemos intentar modificar un variable que hemos 
		//creado en la clase y que instanciamos dentro del método
		//A ver qué pasa? 
		int referencia = 12; //Es de tipo primitivo
//		salida.incrementaVariable(referencia);
//		System.out.println("fuera de la función el valor de "
//				+ "referencia es " + referencia);
//		
//		salida.incrementaVariable(referencia);
//		System.out.println("Segundo uso: fuera de la función el "
//				+ "valor de referencia sigue siendo " + referencia);
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		//Una solución sería pisar el valor de la variable		
//		referencia = salida.incrementaVariable(referencia);
//		System.out.println("Después de pisar el valor de referencia sale con el número " + referencia);
//		referencia = salida.incrementaVariable(referencia);
//		System.out.println("Si repetimos, el valor de referencia sale con el número " + referencia);
////		System.out.println();
////		System.out.println();
////		System.out.println();
//		
		//Si usamos un array, la cosa cambia		
		int[] referenciaArr = {12, 1}; 
		salida.incrementaVariableArray(referenciaArr);
		System.out.println("fuera de la función el valor de la primera posición del array referencia es " + referenciaArr[0]);
		
		salida.incrementaVariableArray(referenciaArr);
		System.out.println("Segundo uso: el valor de la primera posición del array referencia es " + referenciaArr[0]);
		
		/*
		 * En Java todos los parámetros de los métodos se pasan por valor. Cuando se
		 * realiza la llamada a un método, los parámetros formales (parámetros indicados
		 * en la declaración) reservan un espacio en memoria independiente y reciben los
		 * valores de los parámetros reales (parámetros indicados en la llamada al
		 * método). ¿Qué consecuencias tiene el paso por valor de los parámetros?
		 * 
		 * Cuando el argumento es de tipo primitivo, el paso por valor significa que
		 * durante la ejecución del método se reserva un nuevo espacio para el parámetro
		 * formal y no se puede modificar el parámetro real durante la ejecución del
		 * método. Cuando el argumento es de tipo referencia (por ejemplo, un array, un
		 * objeto,...) el paso por valor significa que no puede modificarse la
		 * referencia pero se pueden realizar llamadas a los métodos del objeto y
		 * modificar el valor asignado a las variables miembro accesibles del objeto
		 * durante la ejecución del método.
		 * 
		 * Por ejemplo, en el siguiente programa el método cambiar utiliza un parámetro
		 * de tipo primitivo (a, un valor numérico entero) y un parámetro de tipo
		 * referencia (b, un array de valores enteros):
		 */
		
		
//		System.out.println();
//		System.out.println();
//		System.out.println();
//		
//		// Para el siguiente punto los alumnos tienen que saber manejar arrays y
//		// Métodos estáticos
//		// Paso por valor y paso por referencia
//
//		int n;
//		int[] v = new int[2];
//		n = 10;
//		v[0] = 20;
//		v[1] = 30;
//
//		System.out.println("Antes:   " + n + " " + v[0] + " " + v[1]);
//		cambiar(n, v);
//		System.out.println("Después: " + n + " " + v[0] + " " + v[1]);
//
//		System.out.println();
//		System.out.println();
//		System.out.println();

	}
}

