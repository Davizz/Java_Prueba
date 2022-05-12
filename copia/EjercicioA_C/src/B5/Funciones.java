package B5;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Funciones {
	
	private static final float PI = 3.1416f;
	
	public void ejercicio_B5_1() {
		/*
		 * Ej B5_1
			Pedir 2 n�meros al usuario. Determinar si el primero es m�ltiplo del segundo usando el operador ternario "?"
			variable = algo? "si":"no";
		 */
		try {
				String seguir = "S";
				
				while (seguir.equals("S")) {
		            
		         
					//Aqu� "Hacer un CLS" de la consola de Eclipse ?�?
					System.clearProperty("CLS");
					
					System.out.println("************************");
					System.out.println("**** EJERCICIO B5_1 ****");
					System.out.println("************************\n");
					
					int n1,n2;
					
					System.out.println ("N�mero 1 : ");
			        String entTec = "";
			        Scanner entEscaner = new Scanner (System.in); 
			        entTec = entEscaner.nextLine (); 
			        n1 = Integer.parseInt(entTec);
			        
			        System.out.println ("N�mero 2 : ");
			        entTec = entEscaner.nextLine (); 
			        n2 = Integer.parseInt(entTec);
			        
			        
			        System.out.println((((n1%n2)==0)?
			        		"El n�mero "+n1+" es M�ltiplo del n�mero "+n2+"\n\n":
			        		"El n�mero "+n1+" NO es M�ltiplo del n�mero "+n2+"\n\n"));
			        
			        System.out.println("Ok, Hemos terminado..., �Otra vez? (Si o No (cualquier tecla))");
			        entTec = entEscaner.nextLine (); 
			        seguir = entTec.toUpperCase();	        
			}
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}
	
	public void ejercicio_B5_2() {
		/*
		 * Ej B5_2
			Dise�ar un programa que lee por teclado el valor del radio de una circunferencia 
			y calcula y muestra por pantalla la longitud y el �rea de la circunferencia.
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
		A continuaci�n, convertir el apellido en may�sculas, la primera letra del nombre en may�sculas y el resto en min�sculas.
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
		 * Ej B5_4 � Clase String
		Usando la clase Scanner, escriba un programa que pida al usuario que introduzca 1 frase.
		A continuaci�n, el programa debe imprimir en consola la cadena (o parte de ella) explotando 10 m�todos 
		no est�ticos de la clase String. 
		 */		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B5_4 ****");
		System.out.println("************************\n");
		
		Scanner entEscaner = new Scanner (System.in);
		String frase="";
		System.out.println ("Dame tu Frase : ");
		frase = entEscaner.nextLine ();
		
		System.out.println("M�todo charAt(1), resultado : "+frase.charAt(1)+"\n");
		
		//seguir� me voy a hacer el 8
		System.out.println("HASTA AQUI, PENDIENTE DE TERMINAR ...\n\n");
		
	}
	
	public void ejercicio_B5_5() {
		/*
		 * Ej B5_5 � Clase Math
		Usando la clase Scanner, escriba un programa que pida al usuario que introduzca 2 n�meros siendo el primero 1 decimal 
		y el otro 1 entero.
		A continuaci�n, el programa debe imprimir en consola c�lculos realizados sobre las 2 entradas explotando 
		10 m�todos est�ticos de la clase Math.
		Se puede usar el uno y el otro de los n�meros. O los dos. Se pueden intentar manejar tambi�n operadores l�gicos.  
		 */
		
		System.out.println("************************");
		System.out.println("**** EJERCICIO B5_5 ****");
		System.out.println("************************\n");
		
		System.out.println("PENDIENTE DE HACER\n\n");
	}
}
