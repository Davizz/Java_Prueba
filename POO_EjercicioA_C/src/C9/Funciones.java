package C9;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Funciones {
	static int salir = -1; 
	static String msj = "";
	static double librasAkilos = 2.2;
	static DecimalFormat formatea = new DecimalFormat("###,###.##");
	
	/*
	 * Instrucciones
		En cuando puedas hacerlo, debes: 
		utilizar un switch (o if/else); 
		capturar errores de inserciÃ³n de datos errÃ³neos usando try/catch y haciendo que el programa se pare. 
		imprimir los resultados en pantalla o en consola.
		Ej 9_01
		Nuestro programa convertirÃ¡ un peso expresado en libras en kilogramos.
		a.	Nuestra entrada es el peso en libras.
		b.	Nuestra salida es el peso en kilogramos
		c.	TambiÃ©n sabemos que Kilogramos = Libras / 2.2
		
		â€¢	Dado que un peso no puede ser un nÃºmero negativo, nuestro programa no debe aceptar un nÃºmero negativo como un peso vÃ¡lido.
		â€¢	Vamos a reescribir el programa para imprimir un mensaje de error si el peso introducido en libras es negativo.
	 */
	public void C9_1() {
		
		msj="";
		salir = -1;
		while (salir !=1) {
			try {
				double pesoL = 0;
				do {
					String TpesoL = JOptionPane.showInputDialog(null,
							"INTRODUCE EL PESO(Libras): \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
					pesoL = Double.parseDouble(TpesoL); 
					if (pesoL<0) {
						JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n El peso debe ser positivo","Error", JOptionPane.ERROR_MESSAGE);
					}
				} while (pesoL<0); 
				JOptionPane.showMessageDialog(null,
						"El peso en Kilogramos es "+formatea.format(pesoL/librasAkilos)+" Kg","Peso en Kilos", JOptionPane.PLAIN_MESSAGE);
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "Â¿Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
				System.out.println(salir);
				
				 
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
	}

	/*
	 * Ej 9_02
		Tienes que crear un programa de Seguro de Auto en el que se va a determinar el costo de una prima de seguro de automÃ³vil, 
		basado en la edad del conductor y el nÃºmero de accidentes que el conductor ha tenido.
		El cargo inicial de seguro bÃ¡sico es de 500 â‚¬.  Hay un recargo de 100 â‚¬ si el conductor es menor de 25 aÃ±os y 
		un recargo adicional por accidentes:	
			
		nÃºmero de accidente      recargo aplicado
		1                           50
		2                          125
		3                          225
		4                          375
		5                          575
		6 o mÃ¡s         No se puede asegurar
	 */
	public void C9_2() {
		salir = -1;
		while (salir !=1) {
			try {
				int edad = 0;
				int accidentes = 0;
				int recargo = 0;
				int impPoliza=500;
				msj="TarÃ­fa BÃ¡sica = "+impPoliza+" â‚¬\n";
				int recargoEdad = 100;
				int recargoAccidente = 0;
			
				String Tedad = JOptionPane.showInputDialog(null,
						"INTRODUCE TU EDAD: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				edad = Integer.parseInt(Tedad); 
				if (edad<18) {
					JOptionPane.showMessageDialog(null, 
							"Â¡Â¡ ERROR !!\n NO ERES MAYOR DE EDAD!!\n NO PUEDES HACER UNA POLIZA","Error", JOptionPane.ERROR_MESSAGE);
					salir = 1;
				}else {
					
					//recargo Edad
					if (edad<25) {impPoliza=impPoliza+recargoEdad; msj=msj+"Recargo por ser Menor de 25 aÃ±os = "+recargoEdad+" â‚¬\n";}
					
					String Taccidentes = (JOptionPane.showInputDialog(null,"Selecciona los accidentes que has tenido: ", "CONTROL DE ACCIDENTES", 
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] {"0","1","2","3","4","5","6 Ã³ mÃ¡s"},"Selecciona")).toString();
					if(Taccidentes=="6 Ã³ mÃ¡s") {Taccidentes="6";}
					accidentes = Integer.parseInt(Taccidentes);
					
					//recargo Accidentes
					int[] TarifaAccidentes = {0,50,125,225,375,575};
					if (accidentes==6) {
						JOptionPane.showMessageDialog(null,
								"Lo siento NO te puedes asegurar con Nosotros","CÃ¡lcula tu Seguro", JOptionPane.PLAIN_MESSAGE);
						impPoliza=0;
					}else{
						
						impPoliza=impPoliza+TarifaAccidentes[accidentes];
						if (accidentes>0) {msj=msj+"Recargo Accidentes, por "+Taccidentes+((Taccidentes=="1")?" Accidente = ":" Accidentes = ")+TarifaAccidentes[accidentes]+" â‚¬\n";}
					}
					
					
					//Import Total de la pÃ³liza
					if(impPoliza>0) {
						msj = msj + "-------------------------------------\n";
						msj = msj + "Importe Total = "+impPoliza+" â‚¬\n";
						JOptionPane.showMessageDialog(null,
								"El Importe de tu PÃ³liza es : \n"+msj,"CÃ¡lcula tu Seguro", JOptionPane.PLAIN_MESSAGE);
					}
				}
				
				//volver a calcular
				salir = JOptionPane.showConfirmDialog(null, "Â¿Volvemos a Calcular?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
				
				 
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}			
		
		
	}

	/*
	 * Ej 9_03
		Pide al usuario un nÃºmero e imprima â€œbienâ€� si el nÃºmero es menor que 5, entre 8 y 10 o mayor que 33. 
		De lo contrario, imprima â€œmalâ€�. Utilice el operador || en su declaraciÃ³n if.
	 */
	public void C9_3() {
		salir = -1;
		while (salir !=1) {
			try {
				int num=0;
				String Tnum = JOptionPane.showInputDialog(null,
						"INTRODUCE UN NUMERO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				num = Integer.parseInt(Tnum); 
				if (num<5 || (num>=8 && num <=10) || num>33) {
					JOptionPane.showMessageDialog(null,
							"Â¡Â¡ BIEN !! \n","Resultado", JOptionPane.PLAIN_MESSAGE);
				}else {
					JOptionPane.showMessageDialog(null,
							"Â¡Â¡ MAL !! \n","Resultado", JOptionPane.PLAIN_MESSAGE);
				}
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "Â¿Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
	}
	
	/*
	 * Ej 9_04
		Pide al usuario dos palabras. Si son las mismas, imprima â€œGenial â€“ son igualesâ€�. Si son las mismas pero que la primera estÃ¡ en mayÃºsculas y la otra en minÃºsculas, 
		imprima â€œBien - casi lo mismoâ€�. Si tienen la misma longitud, imprima â€œAl menos tienen la misma longitudâ€�. NecesitarÃ¡s las siguientes funciones de cadena: 
		compareTo(otherString)  (que devuelve true si coincide)
		compareToIgnoreCase(otherString)  (que devuelve true si coincide independientemente del caso)
		length() (que devuelve la longitud)â€ƒ

	 */
	public void C9_4() {
		salir = -1;
		while (salir !=1) {
			try {
				String a = JOptionPane.showInputDialog(null,
						"INTRODUCE UNA PALABRA: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
			
				String b = JOptionPane.showInputDialog(null,
						"INTRODUCE OTRA PALABRA: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);	
				
				
				if (a.compareTo(b)==0) {
					JOptionPane.showMessageDialog(null,
							"Â¡Â¡ GENIAL !! \nSon Iguales!!\n","Resultado", JOptionPane.PLAIN_MESSAGE);
				}else if(a.compareToIgnoreCase(b)==0){
					JOptionPane.showMessageDialog(null,
							"Â¡Â¡ BIEN !! \nCasi lo mismo!!\n","Resultado", JOptionPane.PLAIN_MESSAGE);	
				}else if(a.length()==b.length()) {
					JOptionPane.showMessageDialog(null,
							"BUENO... \nAl menos tienen la misma longitud\n"+
					"La primera palabra tiene "+a.length()+((a.length()==1)?" carÃ¡cter":" caracteres")+"\n"+
					"La segunda palabra tiene "+b.length()+((b.length()==1)?" carÃ¡cter":" caracteres")+"\n", "Resultado", JOptionPane.PLAIN_MESSAGE);	
				}else {
					
					JOptionPane.showMessageDialog(null,
							"Â¡Â¡ MAL !! \nSon DIFERENTES y NO tienen la misma longitud","Resultado", JOptionPane.PLAIN_MESSAGE);
				}
				
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "Â¿Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}			
	}
	
	/*
	 * Ej 9_05
		Tienes que crear un programa que de recomendaciones sobre la cantidad de calorÃ­as que una persona debe comer cada dÃ­a. 
		Las calorÃ­as son unidades de energÃ­a que se encuentran en todos los alimentos. BasarÃ¡s tu recomendaciÃ³n en el peso de la persona y 
		si la persona tiene un estilo de vida activo o sedentario. Si la persona es sedentaria, el factor de actividad de esa persona es 13. 
		
		Si la persona es activa, el factor de actividad de esa persona es 15. 
		Multiplicando el factor de actividad por el peso de la persona, obtendrÃ¡s el nÃºmero recomendado de calorÃ­as. 
		En tu programa debes: 
		â€¢ hacer que el usuario introduzca su peso, como un nÃºmero de punto flotante; 
		â€¢ hacer que el usuario introduzca si tiene un estilo de vida activo o sedentario, como un personaje, â€˜Aâ€™ para activo o â€˜Sâ€™ sedentario; 

	 */
	public void C9_5() {
		salir = -1;
		while (salir !=1) {
			try {
				
				double peso=0;
				String Tpeso = JOptionPane.showInputDialog(null,
						"INTRODUCE TU PESO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				peso = Double.parseDouble(Tpeso); 
				if(peso<39){
					msj="Tu peso no puede ser inferior a 40 Kg";
					salir=1;
				}else {
				
					String TestiloVida = (JOptionPane.showInputDialog(null,"Selecciona tu estilo de vida: ", "CONTROL DE ACCIDENTES", 
							JOptionPane.PLAIN_MESSAGE, null,
							new Object[] {"Activo","Sedentario"},"Selecciona")).toString();
					
					msj="Â¡Â¡ "+((TestiloVida=="Activo")?"BIEN":"UFF")+", Tu estilo de Vida es "+TestiloVida+" !! \n"+
						    "Tu factor de actividad es "+((TestiloVida=="Activo")?"15":"13")+" y tu Peso es "+Tpeso+" Kg\n"+
						    "\nTe recomendamos una ingesta diaria de "+((TestiloVida=="Activo")?formatea.format(peso*15):formatea.format(peso*13))+" CalorÃ­as"+
						    ((TestiloVida=="Activo")?"":",\n Revisa tu colesterol...");
				}
				
				
				JOptionPane.showMessageDialog(null,
						msj,"Resultado", JOptionPane.PLAIN_MESSAGE);
				
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "Â¿Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}	
		
	}	
}
