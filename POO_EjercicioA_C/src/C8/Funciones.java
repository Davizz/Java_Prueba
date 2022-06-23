package C8;

import javax.swing.*;
import java.text.DecimalFormat;
import java.util.*;

public class Funciones {
	static String Tconversor; 
	static int salir = -1; 
	static String msj = "";
	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	/*
	 * Ej C8_1
		Utilizando SWITCH, realizar un conversor monetario que pida al usuario introducir por teclado 
		el tipo de conversi�n que desea realizar (Nos limitaremos a conversiones 
		de Euros a Dolares, Yen y Libras) y la cantidad de dinero que desea cambiar.  
		Al finalizar las peticiones, el programa realiza las conversiones adecuadas.
	 * 
	 */
	public void C8_1() {
		salir = -1;
		while (salir !=1){
			try {
				 DecimalFormat formatea = new DecimalFormat("###,###.##");
				 Tconversor = (JOptionPane.showInputDialog(null,"Selecciona la Conversi�n que quieres hacer: ", "CONVERSOR DE MONEDAS", 
						JOptionPane.PLAIN_MESSAGE, null,
						new Object[] {"DOLARES","YEN","LIBRAS"},"Selecciona")).toString();
				 
					double imp = 0;
					String Timp = JOptionPane.showInputDialog(null,
							"CUANTOS EUROS QUIERES CAMBIAR: \n","Solicitud de Importe en EUROS", JOptionPane.PLAIN_MESSAGE);
					
					imp = Double.parseDouble(Timp); 
					
					switch(Tconversor){
					case "DOLARES": 
						imp = imp * 1.08;
						salir=0;
						break;
					case "YEN":
						imp = imp * 138.78;
						salir=0;
						//JOptionPane.showMessageDialog(null,"YEN");
						break;
					case "LIBRAS":
						imp = imp * 0.84;
						salir=0;
						//JOptionPane.showMessageDialog(null,"LIBRAS");
						break;
					}				 
					
					JOptionPane.showMessageDialog(null,"Tu cambio son "+formatea.format(imp)+" "+Tconversor,"Conversi�n a "+Tconversor, JOptionPane.PLAIN_MESSAGE);
					
					//volver a calcular
					salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			//catch(Exception e){
			//	JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� NO has Seleccionado Conversor ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			//}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}		
	}
	/*
	 * Ej C8_2 IFELSEIF:
		El programa siguiente tiene que determinar si un a�o es bisiesto o no.
		Un a�o es bisiesto si cumple los siguientes criterios:
		Es divisible entre 4.
		Si termina en 00, debe ser divisible entre 400 (2000 y 2400 son bisiestos)
		(2100, 2200 y 2300 no lo son).
		Desde un enfoque algor�tmico, se consideran las proposiciones o enunciados l�gicos siguientes:
		    p: Es divisible entre 4
		    q: Es divisible entre 100
		    r: Es divisible entre 400
	 */
	public void C8_2() {
		
		Calendar fecha = new GregorianCalendar();
		int year = fecha.get(Calendar.YEAR);   
			
		msj="";
		String TiempoVerbal="";
		salir = -1;
		while (salir !=1) {
			try {
				double AA = 0;
				String TAA = JOptionPane.showInputDialog(null,
						"INTRODUCE EL A�O: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				AA = Double.parseDouble(TAA); 
				if (AA>year) {
					TiempoVerbal ="ser�";
				}else {
					TiempoVerbal ="fue";
				}
					
				msj = "El a�o "+TAA+" NO "+TiempoVerbal+" Bisiesto";
				salir = 0;

				if ((TAA.substring(TAA.length() - 2)) == "00"){
					if((AA%4 == 0) && (AA%400 == 00) && (AA%100 == 0)) {
							msj="El a�o "+TAA+" "+TiempoVerbal+" Bisiesto";
							salir = 0;
						}
					}	
				

				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);	
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}
	}

	/*
	 * 
		Ej C8_3 IFELSEIF
		 Recuperamos los datos del usuario y los manipulamos: Dise�a un programa que
		 solicite un n�mero entero de 5 d�gitos, separe el n�mero en sus d�gitos individuales
		 y los muestre por pantalla

	 */
	public void C8_3() {
		msj="";
		salir = -1;
		while (salir !=1) {
			try {
				//int num = 0;
				String Tnum = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				char[] Tnum1 = Tnum.toCharArray();
				for(int i=0;i<Tnum.length();i++) {
					msj = msj + Tnum1[i]+"\n";
				}
				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
	}
	/*
	 * Ej C8_4 IFELSEIF
		El programa tiene que determinar el grado conseguido bas�ndonos sobre el resultado obtenido. 
		El resultado est� le�do por teclado y el grado calculado seg�n las condiciones siguientes:
		
		Resultado 				Grado
		90-100					A
		80-89					B
		70-79					C
		50-69					D
		0-49					E

	 */
	public void C8_4() {
		
		salir = -1;
		while (salir !=1) {
			try {
				//int num = 0;
				String Tnum = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int num = Integer.parseInt(Tnum);
				/* CON IF / ELSE IF / ELSE ******************************
				if (num>=90 && num<=100) {
					msj = "Grado << A >>, conseguido!!";
				}else if(num>=80 && num<=89) {
					msj = "Grado << B >>, conseguido!!";
				}else if(num>=70 && num<=79) {
					msj = "Grado << C >>, conseguido!!";
				}else if(num>=50 && num<=69) {
					msj = "Grado << D >>, conseguido!!";
				}else if(num>=0 && num<=49) {
					msj = "Grado << E >>, conseguido!!";
				}else {
					msj = "El n�mero que has introducido es mayor que 100 o es negativo";
				}
				CON IF / ELSE IF / ELSE *******************************/
				/* CON CASE */
				switch ((num>=90 && num<=100)?"A":
					    (num>=80 && num<=89)?"B":
					    (num>=70 && num<=79)?"C":
					    (num>=50 && num<=69)?"D":
					    (num>=0 && num<=49)?"E":"F") {
				case "A":msj = "Grado << A >>, conseguido!!";break;
				case "B":msj = "Grado << B >>, conseguido!!";break;
				case "C":msj = "Grado << C >>, conseguido!!";break;
				case "D":msj = "Grado << D >>, conseguido!!";break;
				case "E":msj = "Grado << E >>, conseguido!!";break;
				case "F":msj = "El n�mero que has introducido es mayor que 100 o es negativo";break;
				}
		
				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
			
		
	}
	/*
	 * Ej C8_5 IFELSEIF
		El programa tiene que devolver el inverso de un entero insertado por teclado por el usuario 
		Si el usuario inserta 5 (A=5), el sistema devuelve 0.20 (--> 1/A)
		si es igual a 0, imprimir un mensaje que diga numero nulo.   

	 */
	public void C8_5() {
		salir = -1;
		while (salir !=1) {
			try {
				//int num = 0;
				
				String Tnum = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				double num = Double.parseDouble(Tnum);
				if (num>0) {
					msj = "El n�mero Inverso de "+Tnum+" es = "+formateaDecimales.format(1/num);
				}else {
					msj = "El n�mero que has introducido tiene que ser mayor de CERO o es NEGATIVO";
				}
		
				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
		
	}
	
	/*
	 * Ej C8_6 IFELSEIF
		El programa tiene que devolver el valor absoluto de un entero insertado por teclado por el usuario 
		Si el usuario inserta 5, el sistema devuelve 5
		Si el usuario inserta -5, el sistema devuelve 5
		si es igual a 0, imprimir un mensaje que diga numero nulo.  

	 */
	public void C8_6() {
		salir = -1;
		while (salir !=1) {
			try {
				//int num = 0;
				
				String Tnum = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int num = Integer.parseInt(Tnum);
				if (num<0) {
					msj = "El valor absoluto de "+Tnum+" es = "+(num*(-1));
				}else {
					msj = "El valor absoluto de "+Tnum+" es = "+(num);
				}
		
				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
		
	}
	/*
	 * Ej C8_7 IFELSEIF
		Realizar un programa que pida al usuario que inserte 2 enteros X e Y por teclado y 
		que analice su entrada por teclado. El anal�sis tiene que indicar al usuario 
		si los dos n�meros son iguales o distintos. 
		Y en caso de ser distintos, si X es m�s grande o m�s peque�o que Y.

	 */
	public void C8_7() {
		salir = -1;
		while (salir !=1) {
			try {
				String Tx = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int x = Integer.parseInt(Tx);
				
				String Ty = JOptionPane.showInputDialog(null,
						"INTRODUCE OTRO NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int y = Integer.parseInt(Ty);

				if (x==y) {
					msj = "El n�mero "+Tx+" es IGUAL que el n�mero "+Ty;
				}else if(x>y) {
					msj = "El n�mero "+Tx+" es MAYOR que el n�mero "+Ty;
				}else {
					msj = "El n�mero "+Tx+" es MENOR que el n�mero "+Ty;
				}
		
				JOptionPane.showMessageDialog(null,msj,"Mensaje",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
		
	}
	/*
	 * Ej C8_8 IFELSEIF
		Realizar un programa que pida al usuario que inserte 2 enteros X e Y por teclado  
		y realice las operaciones siguientes: 
		Manteniendo el valor original de X y Y, tienes que sacar el valor de las 2 variables en pantalla realizando 
		la suma combinada de X y de Y. (X+=Y)
		la resta combinada de X y de Y. (X-=Y)
		el producto combinado de X y de Y: (x *= y)  
		la divisi�n combinada de X y de Y: (x /= y)  
		la resta combinada de X y de Y: (x %= y)  

	 */
	public void C8_8() {
		salir = -1;
		while (salir !=1) {
			try {
	
				String Tx = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int x = Integer.parseInt(Tx);
				int X=x;
				String Ty = JOptionPane.showInputDialog(null,
						"INTRODUCE OTRO NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int y = Integer.parseInt(Ty);
				int Y=y;
				
				if (x>0 && y>0) {
					msj ="La suma combinada de X="+Tx+" y de Y="+Ty+" (X+=Y) Es = "+(x+=y)+"\n";
					x=X;y=Y;
					msj = msj + "La resta combinada de X="+Tx+" y de Y="+Ty+" (X-=Y) Es = "+(x-=y)+"\n";
					x=X;y=Y;
					msj = msj + "El producto combinado de X="+Tx+" y de Y="+Ty+" (X*=Y) Es = "+(x *= y)+"\n";
					x=X;y=Y;
					
					double resultado = (double)x/y;
					msj = msj + "La divisi�n combinada de X="+Tx+" y de Y="+Ty+" (X/=Y) Es = "+formateaDecimales.format(resultado)+"\n";  
					x=X;y=Y;
					msj = msj + "La resta combinada de X="+Tx+" y de Y="+Ty+" (X%=Y) Es = "+(x %= y)+"\n";  
				}else {
					JOptionPane.showMessageDialog(null,
							"Error, Los n�meros tienen que ser mayores que CERO","Error",JOptionPane.PLAIN_MESSAGE);
					salir = 1;
				}
				JOptionPane.showMessageDialog(null,msj,"Resultado",JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
			
	}
	/*
	 * Ej C8_9 IFELSEIF
		Dise�a un programa que solicite un n�mero entero de 5 d�gitos, 
		y que diga si el n�mero es capicua.

	 */
	public void C8_9() {
		salir = -1;
		while (salir !=1) {
			try {
	
				String Tx = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int x = Integer.parseInt(Tx);
				
				String TxInverso="";

				if (Tx.length()!=5) {
					JOptionPane.showMessageDialog(null,
							"Error, Tienes que introducir un n�mero de 5 d�gitos","Error",JOptionPane.PLAIN_MESSAGE);
					salir = 1;
				}else {
					for (int i=Tx.length();i>=1;i--) {
						TxInverso = TxInverso + Tx.substring(i-1, i);
					}
					if(Tx.equals(TxInverso)) {
						msj="El n�mero "+Tx+" ES CAPICUA";
					}else {
						msj="El n�mero "+Tx+" NO!! ES CAPICUA";
					}
					JOptionPane.showMessageDialog(null,msj,"Resultado",JOptionPane.PLAIN_MESSAGE);
				}
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "�Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
		
	}
	/*
	 * Ej C8_10 IFELSEIF
		Realizar un convertisor monetario que pida al usuario introducir por teclado 
		el tipo de conversi�n que desea realizar (Nos limitaremos a conversiones 
		de Euros a Dolares, Yen y Libras) y la cantidad de dinero que desea cambiar.  
		Al finalizar las peticiones, el programa realiza las conversiones adecuadas.

	 */
	public void C8_10() {
			String Tabla[][]= {{"a","b","c"},
							   {"d","e","f"}};
			System.out.println("N�mero de L�neas "+Tabla.length);
			System.out.println("N�mero de Columnas "+Tabla[0].length);
			for (int lin=0;lin<Tabla.length;lin++) {
				for (int col=0;col<Tabla[lin].length;col++) {
					System.out.println(Tabla[lin][col]);
				}
			}
		/*
		 * ESTE NO ES EL EJERCICIO C8_1 ???
		 */
	}
}
