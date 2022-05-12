package C10;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Funciones {
	static int salir = -1; 
	static String msj = "";
	static double librasAkilos = 2.2;
	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	
	/*
	 * Ej C10_1
		Crear las tablas del 1 al 10 y sacar los resultados por pantalla usando Swing (JOptionPane).
		Tienes que controlar que el usuario entre un número comprendido entre 1 y 10. 

	 */
	public void C10_1() {
		
		msj="";
		salir = -1;
		while (salir !=1) {
			try {
				int num = 0;
				String raya = "=";
				String Tnum = JOptionPane.showInputDialog(null,
							"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(Tnum); 
				if (num<=0||num>10) {
					JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n El número debe ser positivo, Mayor que cero ó Menor a 10","Error", JOptionPane.ERROR_MESSAGE);
					salir=1;
				}else {
					msj="TABLA DE MULTIPLICAR DEL "+Tnum+"\n";
					msj=msj+raya.repeat(25)+"\n";
					for(int i=1;i<=10;i++) { 
							msj=msj+Tnum+" X "+i+" = "+(num*i)+"\n";
					}
					JOptionPane.showMessageDialog(null,
							msj,"Tabla de Multiplicar del "+Tnum, JOptionPane.PLAIN_MESSAGE);
				}
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "¿Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
				System.out.println(salir); 
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
	}

	/*
	 * Ej C10_2
		Factorial de un entero positivo. 
		Tienes que crear un programa dónde se calcula la factorial de un entero positivo teniendo en cuenta que: 
		El número está propuesto por el usuario usando Swing.
		Una factorial es el resultado de la multiplicación de un número por todos los enteros que le preceden hasta llegar a 1.

	 */
	public void C10_2() {
		
		msj="";
		salir = -1;
		while (salir !=1) {
			try {
				int num = 0, factorial=1;
				
				String raya = "=";
				
				String Tnum = JOptionPane.showInputDialog(null,
							"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(Tnum); 
				if (num<=0) {
					JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n El número debe ser positivo ó Mayor que cero","Error", JOptionPane.ERROR_MESSAGE);
					salir=1;
				}else {
					msj="FACTORIALES DEL NUMERO "+Tnum+"\n";
					msj=msj+raya.repeat(30)+"\n";
					
					while(num!=0) { 
							factorial=factorial*num;
							num--;
					}
					
					JOptionPane.showMessageDialog(null,
							"El Factorial de "+Tnum+" es "+formateaSINdecimales.format(factorial),"Factorial del número "+Tnum, JOptionPane.PLAIN_MESSAGE);
				}
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "¿Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
				System.out.println(salir); 
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
	}

	/*
	 * Ej C10_3
		Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.

	 */
	public void C10_3() {
		msj="";
		int i=1, lin=0;
		while(i<=100){
			msj=msj+i+((lin<24)?", ":",\n");
			lin++;
			lin=((lin>24)?0:lin);
			i++;
		}
		msj=msj.substring(0, msj.length()-2);
		
		JOptionPane.showMessageDialog(null,
				msj,"Resultado", JOptionPane.PLAIN_MESSAGE);		
	}
	
	/*
	 * Ej C10_4
		Un programa que indica si un número entero positivo insertado por consola es par o impar.
	 */
	public void C10_4() {
		salir = -1;
		while (salir !=1) {
			try {
				String Ta = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				int a = Integer.parseInt(Ta);
				if (a%2==0) {
					JOptionPane.showMessageDialog(null,
							"¡¡ Número PAR!!","Resultado", JOptionPane.PLAIN_MESSAGE);
				}else {					
					JOptionPane.showMessageDialog(null,
							"¡¡ Número IMPAR!!","Resultado", JOptionPane.PLAIN_MESSAGE);
				}
				
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "¿Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}			
	}
	
	/*
	 * Ej C10_5
		Programa Java que muestre los números primos inferiores a 1000 utilizando la instrucción while.
	 */
	public void C10_5() {
			msj="";
			int i=0, lin=0;
			while(i<=1000){
				int count=0, j=1;
				
				while(j<=i){
					if(i%j==0){
						count++;
					}
					j++;
				}
				if(count==2){
					msj=msj+i+((lin<25)?", ":",\n");
					lin++;
					lin=((lin>25)?0:lin);
				}
				i++;
			}
			msj=msj.substring(0, msj.length()-2);
			
			JOptionPane.showMessageDialog(null,
					msj,"Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
	/*
	 * Ej C10_6
		Sabiendo que 1 mile vale 1.609 kms, diseñar un programa que imprima en pantalla una tabla 
		de conversión con los 10 primeros resultados con el bucle while. 
		
		miles 		kms 
		1 		1.609 
		2 		3.218 
		3 		… 
		4 		… 
		… 		… 
		10 		16.09

	 */
	public void C10_6() {
		String Espacio=" ";
		String raya="=";
		
		int miles=1609;
		int i=1;
		msj="Miles"+Espacio.repeat(10)+"Kms\n"+raya.repeat(15)+"\n";
		while(i<11) {
			msj=msj+i+((i==10)?Espacio.repeat(11):Espacio.repeat(13))+formateaSINdecimales.format(miles*i)+"\n";
			i++;
		}
		JOptionPane.showMessageDialog(null,
				msj,"Resultado", JOptionPane.PLAIN_MESSAGE);
	}
}
