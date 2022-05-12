package B5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funciones {
	
	private static final float PI = 3.1416f;
	
	public void ejercicio_B5_1() {
		/*
		 * Ej B5_1
			Pedir 2 números al usuario. Determinar si el primero es múltiplo del segundo usando el operador ternario "?"
			variable = algo? "si":"no";
		 */
		try {
				String seguir = "S";
				
				while (seguir.equals("S")) {
		            
		         
					//Aquí "Hacer un CLS" de la consola de Eclipse ?¿?
					System.clearProperty("CLS");
					
					System.out.println("************************");
					System.out.println("**** EJERCICIO B5_1 ****");
					System.out.println("************************\n");
					
					int n1,n2;
					
					System.out.println ("Número 1 : ");
			        String entTec = "";
			        Scanner entEscaner = new Scanner (System.in); 
			        entTec = entEscaner.nextLine (); 
			        n1 = Integer.parseInt(entTec);
			        
			        System.out.println ("Número 2 : ");
			        entTec = entEscaner.nextLine (); 
			        n2 = Integer.parseInt(entTec);
			        
			        
			        System.out.println((((n1%n2)==0)?
			        		"El número "+n1+" es Múltiplo del número "+n2+"\n\n":
			        		"El número "+n1+" NO es Múltiplo del número "+n2+"\n\n"));
			        
			        System.out.println("Ok, Hemos terminado..., ¿Otra vez? (Si o No (cualquier tecla))");
			        entTec = entEscaner.nextLine (); 
			        seguir = entTec.toUpperCase();	        
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	public void ejercicio_B5_2() {
		/*
		 * Ej B5_2
			Diseñar un programa que lee por teclado el valor del radio de una circunferencia 
			y calcula y muestra por pantalla la longitud y el área de la circunferencia.
		 */
		System.out.println("************************");
		System.out.println("**** EJERCICIO B5_2 ****");
		System.out.println("************************\n");
		
		double radio=0;
		
		System.out.println ("Radio de la circunferencia? : ");
		String entTec = "";
		Scanner entEscaner = new Scanner (System.in);
		entTec = entEscaner.nextLine (); 
        radio = Double.parseDouble(entTec);
        
        double longitud=0;
        longitud = (2 * PI) * radio;
        System.out.println("La longitud es: " + longitud);
        
        double area;
        area = PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area+"\n\n");		
	}
	
	public void ejercicio_B5_3() {
		/*
		 * Ej B5_3
		Usando Scanner, escribir un programa que lee el nombre y el apellido de un estudiante. 
		A continuación, convertir el apellido en mayúsculas, la primera letra del nombre en mayúsculas y el resto en minúsculas.
		 */
        System.out.println("************************");
		System.out.println("**** EJERCICIO B5_3 ****");
		System.out.println("************************\n");
		
		Scanner entEscaner = new Scanner (System.in);
		String nombre="", apellido="";
		System.out.println ("Nombre? : ");
		nombre = entEscaner.nextLine (); 
		nombre = nombre.toLowerCase();
		char[] nom = nombre.toCharArray();
	    nom[0] = Character.toUpperCase(nom[0]);
	    
		System.out.println ("Apellido? : ");
		apellido = entEscaner.nextLine ();
		apellido = apellido.toUpperCase();
		char[] ape = apellido.toCharArray();
	    //ape[0] = Character.toUpperCase(ape[0]);
	    
		System.out.println("Tu nombre es "+new String(nom)+" y tu apellido es "+new String(ape)+"\n\n");		
	}
	
	public void ejercicio_B5_4() {
		/*
		 * Ej B5_4 – Clase String
		Usando la clase Scanner, escriba un programa que pida al usuario que introduzca 1 frase.
		A continuación, el programa debe imprimir en consola la cadena (o parte de ella) explotando 10 métodos 
		no estáticos de la clase String. 
		 */		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B5_4 ****");
		System.out.println("************************\n");
		
		Scanner entEscaner = new Scanner (System.in);
		String frase="";
		System.out.println ("Dame tu Frase : ");
		frase = entEscaner.nextLine ();
		
		System.out.println("Método charAt(1), resultado : "+frase.charAt(1)+"\n");
		
		//seguiré me voy a hacer el 8
		System.out.println("HASTA AQUI, PENDIENTE DE TERMINAR ...\n\n");
		
	}
	
	public void ejercicio_B5_5() {
		/*
		 * Ej B5_5 – Clase Math
		Usando la clase Scanner, escriba un programa que pida al usuario que introduzca 2 números siendo el primero 1 decimal 
		y el otro 1 entero.
		A continuación, el programa debe imprimir en consola cálculos realizados sobre las 2 entradas explotando 
		10 métodos estáticos de la clase Math.
		Se puede usar el uno y el otro de los números. O los dos. Se pueden intentar manejar también operadores lógicos.  
		 */
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B5_5 ****");
		System.out.println("************************\n");
		
		System.out.println("PENDIENTE DE HACER\n\n");
	}
}
