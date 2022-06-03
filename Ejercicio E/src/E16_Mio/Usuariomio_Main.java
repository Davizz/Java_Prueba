package E16_Mio;

import javax.swing.JOptionPane;

//import java.awt.Menu;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//import javax.swing.JOptionPane;
//
//import F17.Producto;

//import F17.Productos;

//Crear un programa que realice las funciones de un cajero automático:  
//Para poder acceder a los datos de su cuenta el usuario tiene que poner 
//su DNI y la contraseña “admin”. El DNI tiene que tener un formato válido.  
//En caso de intentar acceder a su cuenta sin éxito 
//2 veces seguidas, el programa tiene que avisar que se va 
//a detener al tercer intento.  
//3 veces seguidas, el programa se tiene que detener. 
//Una vez en capacidad de consultar la cuenta el usuario podrá acceder
//a un menú que le dará la posibilidad de: 
//consultar saldo, 
//consultar informaciones de cuenta (número de cuenta, saldo, transacciones del día), 
//sacar dinero, 
//ingresar dinero, 
//consultar información acerca del titular de la cuenta 
//(nombre, apellidos, email, teléfonos, DNI…).
//Salir de la aplicación.
//El programa tiene que utilizar la concepción 
//“orientada a objetos” y no contener duplicación de código.

public class Usuariomio_Main {

	public static void main(String[] args) {

		// Creo 2 usuarios
		Usuariomio usuario1 = new Usuariomio("72314962H", "Jose Lopez", "admin", 4875.56, 484);
//		Usuariomio usuario2 = new Usuariomio("72283332J", "Ludovic Laisnez", "admin", 1875.56, 484);
//		
//		//Los introduzco en una lista
//		List<Usuariomio> lista = Arrays.asList(usuario1, usuario2);

		// Pido al usuario que introduzca el dni (sin límite)
		
		try {
		boolean salir = false;
		do {
			String a = JOptionPane.showInputDialog("Introduce el DNI: ");

			if (a.equals(usuario1.dni)) {
				JOptionPane.showMessageDialog(null, "DNI correcto");
				salir = true;
			} else
				JOptionPane.showMessageDialog(null, "DNI incorrecto. Vuelva a intentarlo:");

		} while (!salir);

		boolean bien = false;
		int veces = 0;
		do {
			String b = JOptionPane.showInputDialog("Introduce la contraseña: ");

			veces = veces + 1;
			String cadena = "";

			if (!b.equals(usuario1.contrasena)) {
				switch (veces) {
				case 1:
					cadena = "Contraseña incorrecta, Vuelve a intentarlo";
					break;
				case 2:
					cadena = "Contraseña incorrecta, Tienes un intento mas";
					break;
				case 3:
					cadena = "Contraseña incorrecta, TARJETA BLOQUEADA";
					break;
				}
			} else {
				bien = true;
				break;
			}
			JOptionPane.showMessageDialog(null, cadena, "Banco PEPE", JOptionPane.ERROR_MESSAGE, null);

			if (veces == 3) {
				System.exit(-1);
			}
		} while (veces < 3 || bien == true);
	
		
			
			do {
		String opcionesMenu = JOptionPane.showInputDialog("1. Consultar Saldo\" \r\n"
			+ 									"2. Consulta Información de Cuenta\"\r\n"
			+ 								 "3. Realizar Ingreso\"\r\n"
			+ 									 "4. Consultar Información del Titular\" ");

	
	 
		switch (opcionesMenu) {
		case "1":
			JOptionPane.showMessageDialog(null, usuario1.getSaldo()); 
			break;
		case "2":
			JOptionPane.showMessageDialog(null, usuario1.num_cuenta); 
			break;
			case "3":
			JOptionPane.showMessageDialog(null, usuario1.ingresarDinero()); 
			break;
		case "4":
			JOptionPane.showMessageDialog(null, usuario1.toString()); 
			break;
		}
		
		}while (salir == true);
		}catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Acabas de salir de la aplicación.", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);}}}
	
		


//	// Creo un BUCLE
////		boolean salir = false;
////		do {
////			String a = JOptionPane.showInputDialog("Introduce el DNI: ");
////			String b = JOptionPane.showInputDialog("Introduce tu contraseña: ");
////			if (a.equals(usuario.dni) && b.equals(usuario.contrasena))
////				{JOptionPane.showMessageDialog(null, "Contraseña correcta");
////					salir = true;}
////			else 
////				JOptionPane.showMessageDialog(null, "Contraseña incorrecta. Vuelva a intentarlo:");
////			
////				}while (!salir);
//
//
////////

/// Ejercicio Rafa

/////
//					
//		public static void Consultas() {
//			byte select = -1;
//			
//			Menu menu = new Menu();
//			String[] opcionesMenu = {"1. Consultar Saldo", 
//									 "2. Consulta Información de Cuenta",
//									 "3. Realizar Reintegro",
//									 "4. Realizar Ingreso",
//									 "5. Consultar Información del Titular"};
//			
//			while(select != 0){
//			
//				try{
//					select = menu.miMenu(opcionesMenu);
//					
//					switch(select){
//					case 1: 
//						JOptionPane.showMessageDialog(null,"Saldo de la Cuenta = " + 
//															formateaDecimales.format(qConsulto.consultarSaldo()) + " " + qConsulto.consultarDivisa(), 
//														   "Usuario Verificado DNI: " + Tdni, JOptionPane.PLAIN_MESSAGE);		
//						break;
//					case 2: 
//						
//						JOptionPane.showMessageDialog(null,"INFORMACION CUENTA DEL CLIENTE\n" +
//															raya.repeat(30)+"\n\n" + 
//															qConsulto.consultarInfoCuenta(), 
//															"Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
//						break;
//					case 3: 
//						Funciones.Reintegro();
//						//JOptionPane.showMessageDialog(null,"REALIZAR REINTEGRO DESDE CUENTA", 
//						//									 "Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
//						break;
//					case 4:
//						Funciones.Ingreso();
//						//JOptionPane.showMessageDialog(null,"REALIZAR INGRESO EN CUENTA", 
//						//									 "Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
//						break;
//					case 5: 
//						JOptionPane.showMessageDialog(null,"INFORMACION DATOS DEL CLIENTE\n" +
//								raya.repeat(30)+"\n\n" + 
//								qConsulto.consultarInfoCliente(), 
//								"Usuario Verificado DNI: " + Tdni , JOptionPane.PLAIN_MESSAGE);
//						break;	
//					case 0: 
//						JOptionPane.showMessageDialog(null, "Hasta Luego, vuelve pronto!", "Saludo", JOptionPane.PLAIN_MESSAGE);
//						break;
//					default:
//						JOptionPane.showMessageDialog(null, "Número no reconocido", "Algo no ha ido bien...", JOptionPane.PLAIN_MESSAGE);
//						break;
//					}
//								
//				}catch(Exception e){
//					JOptionPane.showMessageDialog(null,"Uoop! Error!");
//				}
//			}		
//		}
//		
//		
//	
//	}}