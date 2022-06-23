package F21;

import javax.swing.JOptionPane;



public class Funciones {
	
	/* Ejercicio F21_1 – Permutación del contenido de 2 variables
		Operadores y expresiones. 
		Implementar un algoritmo que te permite permutar los valores de 2 variables. 
	 */
	public void F21_1() {
		double inicio = System.nanoTime(); //Tiempo de Ejecución inicio
		
		String elementos[] = new String[4]; //4 elementos
		double a,b;
		a = elementos.length;
		b = 2; // 2 variables
		//formula = aPb = a!/(a-b)! ==> [! = factorial]
		//          4P2 = 4!/(4-2)! ==> 4!/2! ==> (4*3*2*1)/(2*1) = 12
		double aF = factorial(a);
		double abF = factorial(a-b);
		
		double resultado = aF /abF;
		
		double fin = System.nanoTime(); //Tiempo de Ejecución inicio
		double tiempo = (fin-inicio)/1000000; 
		
		//No reconoce la opci�n FORMATOS
//		JOptionPane.showMessageDialog(null, "Permutaciones = " + formatos.Formatos.conDecimales(resultado,2) +
//									        "\n\n Tiempo de Ejecución = " + formatos.Formatos.conDecimales(tiempo,4) + " MiliSegundos.", "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
	public static double factorial(double n) {
		//factorial con recursividad
		return (n==0)?1:n*factorial(n-1);
	}
	
	
	
	/*  Ejercicio F21_2 – Clase Animal
	 * 
		Primera parte: 
		Crear una clase Animal sin el método main con las propiedades privadas nombre, esperanzaDeVidaMax y edad.
		Crear un constructor de la superclase recibiendo todos los parámetros por parámetro.  
		Añadirle los métodos GETTER y SETTER adecuados. 
		Pisar el método toString y hacer que contenga cada uno de los métodos GETTER. 
		
		Segunda parte: 
		A continuación, crear dos clases Mamífero y Ave que hereda de la clase Animales. 
		La clase mamífero tendrá la propiedad booleana tienePelo. 
		La clase Ave tendrá la propiedad booleana puedeVolar. 
		Crear un constructor de la subclase recibiendo todos los parámetros por parámetro.  
		Crear otro constructor de la subclase con la propiedad propia inicializada a true.  
		Añadirle métodos GETTER y SETTER adecuados. 
		Cada clase tiene su método toString propio. Este método debe imprimir la información que tenemos acerca de la superclase. 
		En el toString o en el método getEsperanzaDeVida(), indicar que este animal es muy viejo si su edad es superior 
		a la esperanza de vida. En caso contrario, indicar que el animal puede vivir un número de años igual al cálculo de 
		(esperanzadeVida – edad) años. 
		
		Tercera parte:
		Crear un método main desde dónde crearás 1 delfín salvaje, 1 perro callejero, 1 pingüino de Madagascar y 1 cigüeña de Estrasburgo.  
		Imprimir en pantalla los resultados de cada instancia. 
	 */
	public void F21_2() {
		Mamifero delfin = new Mamifero("Delfín Salvaje", 10, 11);
		JOptionPane.showMessageDialog(null, delfin.toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
		
		Mamifero perro = new Mamifero("Perro Callejero", 5, 2);
		JOptionPane.showMessageDialog(null, perro.toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
		
		Mamifero pinguino = new Mamifero("Pingüino de Madagascar", 10, 6);
		JOptionPane.showMessageDialog(null, pinguino.toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
		
		Ave ciguena = new Ave("Cigüeña de Estrasburgo", 7, 8);
		JOptionPane.showMessageDialog(null, ciguena.toString(), "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
}
