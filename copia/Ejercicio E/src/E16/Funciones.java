package E16;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import utilidades.Menu;
import validar.Validaciones;


public class Funciones {
	static int salir = -1, correcto = 0;
	
	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	
	/*
	 * Ejercicio 16_1 â€“ Recursividad. 
		En una clase crear dos mÃ©todos llamados conRecursividad y sinRecursividad en los que se calcularÃ¡n la factorial de 10. 
		En el primero tendrÃ¡s que hacer uso de la recursividad. En el otro no. 

	 */
	
	static Factorial factorial= new Factorial();
	
	public void E16_1() {
		salir = -1;
		int Seleccion = 0;
		Object[] options = new Object[] {"SALIR",
				"Factorial SIN RECURSIVIDAD",
				"Factorial CON RECURSIVIDAD"};
		
		while (salir !=1) {
			
			
			Seleccion = JOptionPane.showOptionDialog(null,
			                 "Realizamos el Factorial del nÂº 10 con o sin Recursividad",
			                 "RECURSIVIDAD",
			                 JOptionPane.YES_NO_CANCEL_OPTION,
			                 JOptionPane.PLAIN_MESSAGE,
			                 null,
			                 options,
			                 null);
			
			
			switch (Seleccion) {
			case 0:
				break;
			case 1:
				Funciones.sinRecursividad();
				break;
			case 2:
				Funciones.conRecursividad();
				break;
			}

			
			
			
			//volver a ejecutar
			salir = JOptionPane.showConfirmDialog(null, "Â¿Otra Vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
		}	
				
		
		
	}
	
	
	public static void conRecursividad() {
		
		JOptionPane.showMessageDialog(null, "Factorial con Recursividad del nÂº 10 es = " + formateaSINdecimales.format(factorial.facRecursivo(10)), 
											"Factorial con Recursividad", JOptionPane.PLAIN_MESSAGE);
		
	}
	public static void sinRecursividad() {
		
		JOptionPane.showMessageDialog(null, "Factorial sin Recursividad del nÂº 10 es = " + formateaSINdecimales.format(factorial.facNOrecursivo(10)), 
											"Factorial sin Recursividad", JOptionPane.PLAIN_MESSAGE);
	}
	/*
	 * Ejercicio 16_2 â€“ Cajero automÃ¡tico. 
		Crear un programa que realice las funciones de un cajero automÃ¡tico:  
		Para poder acceder a los datos de su cuenta el usuario tiene que poner su DNI y la contraseÃ±a â€œadminâ€�. 
		El DNI tiene que tener un formato vÃ¡lido.  
		
		En caso de intentar acceder a su cuenta sin Ã©xito 
		2 veces seguidas, el programa tiene que avisar que se va a detener al tercer intento.  
		3 veces seguidas, el programa se tiene que detener. 
		
		Una vez en capacidad de consultar la cuenta el usuario podrÃ¡ acceder a un menÃº que le darÃ¡ la posibilidad de: 
		consultar saldo, 
		consultar informaciones de cuenta (nÃºmero de cuenta, saldo, transacciones del dÃ­a), 
		sacar dinero, 
		ingresar dinero, 
		consultar informaciÃ³n acerca del titular de la cuenta (nombre, apellidos, email, telÃ©fonos, DNIâ€¦).
		Salir de la aplicaciÃ³n.
		El programa tiene que utilizar la concepciÃ³n â€œorientada a objetosâ€� y no contener duplicaciÃ³n de cÃ³digo.

	 */
	
	static String Tdni = "";
	static MisConsultas qConsulto = new MisConsultas();
	static String msj = "";
	static String raya = "=";
	
	public void E16_2() {
		salir = -1;
		correcto = 0;
		while (salir !=1) {
			try {
				String clave = "";
				byte intentos = 0;
				
				do {
					Tdni = JOptionPane.showInputDialog(null,
							"INTRODUCE TU DNI : \n", "Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarDni(Tdni)==false){
						JOptionPane.showMessageDialog(null,
							"Â¡Â¡ El DNI " + Tdni + " NO ES VÃ�LIDO !!", "Â¡Â¡ ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {	
						correcto = 1;
					}	
				
				}while(correcto==0);
				
				correcto = 0;
				do {
					clave = JOptionPane.showInputDialog(null,
						"INTRODUCE CLAVE : \n", "Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				   
					if(Validaciones.comprobarClave(clave)==false){
						intentos++;
						JOptionPane.showMessageDialog(null,
							"LA CLAVE NO ES CORRECTA ", "Â¡Â¡ ERROR !! Intentos ["+intentos+"/3]", JOptionPane.PLAIN_MESSAGE);
							
						if(intentos>=3) {
							JOptionPane.showMessageDialog(null,
								"NÃšMERO DE INTENTOS SUPERADO", "Â¡Â¡ ERROR !!", JOptionPane.ERROR_MESSAGE);
							correcto = 1; salir = 1;
						}
					} else {
						Funciones.Consultas();
						correcto = 1;
					}
				
				}while(correcto==0);
				

				
				
				if(intentos<3) {
					//volver a ejecutar
					salir = JOptionPane.showConfirmDialog(null, "Â¿Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				}	
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}							
	}
	
	public static void Consultas() {
		byte select = -1;
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Consultar Saldo", 
								 "2. Consulta InformaciÃ³n de Cuenta",
								 "3. Realizar Reintegro",
								 "4. Realizar Ingreso",
								 "5. Consultar InformaciÃ³n del Titular"};
		
		while(select != 0){
		
			try{
				select = menu.miMenu(opcionesMenu);
				
				switch(select){
				case 1: 
					JOptionPane.showMessageDialog(null,"Saldo de la Cuenta = " + 
														formateaDecimales.format(qConsulto.consultarSaldo()) + " " + qConsulto.consultarDivisa(), 
													   "Usuario Verificado DNI: " + Tdni, JOptionPane.PLAIN_MESSAGE);		
					break;
				case 2: 
					
					JOptionPane.showMessageDialog(null,"INFORMACION CUENTA DEL CLIENTE\n" +
														raya.repeat(30)+"\n\n" + 
														qConsulto.consultarInfoCuenta(), 
														"Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
					break;
				case 3: 
					Funciones.Reintegro();
					//JOptionPane.showMessageDialog(null,"REALIZAR REINTEGRO DESDE CUENTA", 
					//									 "Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
					break;
				case 4:
					Funciones.Ingreso();
					//JOptionPane.showMessageDialog(null,"REALIZAR INGRESO EN CUENTA", 
					//									 "Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
					break;
				case 5: 
					JOptionPane.showMessageDialog(null,"INFORMACION DATOS DEL CLIENTE\n" +
							raya.repeat(30)+"\n\n" + 
							qConsulto.consultarInfoCliente(), 
							"Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
					break;	
				case 0: 
					JOptionPane.showMessageDialog(null, "Hasta Luego, vuelve pronto!", "Saludo", JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null, "NÃºmero no reconocido", "Algo no ha ido bien...", JOptionPane.PLAIN_MESSAGE);
					break;
				}
							
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}		
	}
	
	public static void Ingreso() {
		try {
					
			String Timp = JOptionPane.showInputDialog(null,
					"INTRODUCE IMPORTE A INGRESAR : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		
			qConsulto.ingresoCuenta(Double.parseDouble(Timp));
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
			//System.exit(-1);
		}
	}
	
	public static void Reintegro() {
		try {
			
			String Timp = JOptionPane.showInputDialog(null,
					"INTRODUCE IMPORTE A INGRESAR : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		
			qConsulto.reintegroCuenta(Double.parseDouble(Timp));
		}
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Â¡Â¡ ERROR !!\n Â¿Â¿ No me has Dado ningÃºn nÃºmero ??","Error", JOptionPane.ERROR_MESSAGE);
			//System.exit(-1);
		}
	}
}
