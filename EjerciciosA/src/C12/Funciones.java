package C12;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import validar.Validaciones;

import utilidades.*;


public class Funciones {
	static int salir = -1, correcto = 0;
	
	static String msj="", msjPrime = "", msjEco= "", titPrime = "", titEco = "", plural="s";
	
	static Reservar miReserva = new Reservar();
	
	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	/*
	 * Ej C12_1 METODOS
		Vamos a crear una serie de métodos reutilizables en un futuro en otros proyectos. Y los usaremos para comprobar los datos insertados en un sencillo formulario. 
		Pediremos al usuario que inserte su DNI, su nombre y su número de teléfono. 
		
		El sistema tendrá que validar las 3 entradas y devolver una confirmación final si todo es correcto. 
		
		Si los datos han sido correctamente registrados, los registrarás en un array de tipo String. 
		El DNI tendrá que ser un DNI verdadero. 
		El nombre tendrá que estar compuesto por, por lo menos, 2 letras. 
		El teléfono tendrá que ser un móvil (empezando por 6) con 9 dígitos. 
		Para comprobar cada entrada, tendrás que crear un método público de tipo booleano. 
		
		Ejemplo de nombre para los 3 métodos: comprobarNombre, comprobarTelefono y ComprobarDni.  
		Para facilitarte el trabajo de programación, necesitarás documentarte acerca de las expresiones regulares en Java.
	 */
	public void C12_1() {
		salir = -1;
		correcto = 0;
		while (salir !=1) {
			try {
				String Tdni = "", nombre = "", telefono = "";
				
				do {
					Tdni = JOptionPane.showInputDialog(null,
							"INTRODUCE TU DNI VÁLIDO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarDni(Tdni)==false){
						JOptionPane.showMessageDialog(null,
							"¡¡ El DNI "+Tdni+" NO ES VÁLIDO !!","¡¡ ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {	
						correcto = 1;
					}	
				
				}while(correcto==0);
				
				correcto = 0;
				do {
					nombre = JOptionPane.showInputDialog(null,
						"INTRODUCE TU NOMBRE : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarNombre(nombre)==false){
						JOptionPane.showMessageDialog(null,
							"El Nombre no tiene como mínimo 2 letras","¡¡ ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {		
						correcto = 1;
					}
				
				}while(correcto==0);
				
				correcto = 0;
				do {
					telefono = JOptionPane.showInputDialog(null,
							"INTRODUCE TU nº TELEFONO MÓVIL : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarTelefono(telefono)==false){
						JOptionPane.showMessageDialog(null,
							"El número de móvil no comienza por 6 o no tiene 9 dígitos","¡¡ ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {	
						correcto = 1;	
					}
				
				}while(correcto==0);
				
				
				
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
	 * C12_2 Reserva de plazas de avión
		Una muy pequeña compañía de aviación con un solo avión de 10 asientos desea poner en marcha su propio sistema de reservas.
		El programa permite a un usuario, a partir de un estado de reserva del avión cualquiera, reservar uno o varios asientos para el próximo vuelo.
		El avión tiene dos clases, primera y económica. 
		5 asientos están asignados a la clase económica y los otros 5 a la primera clase.
		Dependiendo de la elección del usuario, un asiento se asigna en primera clase o en clase económica. 
		
		Sin embargo, si la clase económica está completa, el sistema pregunta al usuario si desea un asiento en primera clase. 
		A la inversa, si la primera clase está completa. En caso negativo, el sistema muestra el mensaje "próximo vuelo en 3 horas".
		A la finalización del sistema se mostrará el estado de la reserva.
		Escribir el programa correspondiente.
	 */
	public void C12_2() {
		
		salir = -1;
		int Seleccion = 0;
		Object[] options = new Object[] {"SALIR",
				"Clase Económica\n["+miReserva.consultaPlazasEco()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasEco())+"]",
				"Primera Clase\n["+miReserva.consultaPlazasPrime()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasPrime())+"]"};
		
		while (salir !=1) {
			
			options[1]="Clase Económica\n["+miReserva.consultaPlazasEco()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasEco())+"]";
			options[2]="Primera Clase\n["+miReserva.consultaPlazasPrime()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasPrime())+"]";
			
			
			
			Seleccion = JOptionPane.showOptionDialog(null,
			                 "Selecciona en que Clase quieres Viajar",
			                 "RESERVAR PLAZAS DE VUELO",
			                 JOptionPane.YES_NO_CANCEL_OPTION,
			                 JOptionPane.PLAIN_MESSAGE,
			                 null,
			                 options,
			                 null);
			
			
			switch (Seleccion) {
			case 0:
				break;
			case 1:
				Funciones.reservaEco();
				break;
			case 2:
				Funciones.reservaPrime();
				break;
			}

			
			if (miReserva.consultaReservasPrime()>1 || miReserva.consultaReservasEco()>1) {
				JOptionPane.showMessageDialog(null, msjPrime + "\n" + msjEco, titPrime +"\n"+titEco, JOptionPane.PLAIN_MESSAGE);
			}
			
			
			//volver a ejecutar
			salir = JOptionPane.showConfirmDialog(null, "¿Quieres hacer más Reservas?", "Alerta!", JOptionPane.YES_NO_OPTION);
		}	
		
		
	}	
		
		
	public static void reservaPrime() { 	
		
			correcto = 0;
	
			
			/*msj = "";
			msj = msj + "Número de Plazas Prime = " + miReserva.consultaPlazasPrime()+"\n";
			msj = msj + "Número de Plazas Eco = " + miReserva.consultaPlazasEco()+"\n";
			
			JOptionPane.showMessageDialog(null,
					msj,"NUMERO DE PLAZAS DE MI AVION", JOptionPane.PLAIN_MESSAGE);
			*/
			try {
				String TrPri = "";
				
				
				do {
					if (miReserva.consultaPlazasPrime()==0 && miReserva.consultaPlazasEco()==0) {
						JOptionPane.showMessageDialog(null,
								"NO TENEMOS MÁS PLAZAS, EL SIGUIENTE VUELO SALE EN 3 HORAS. GRACIAS",
								"¡¡ VUELO COMPLETO !!", JOptionPane.PLAIN_MESSAGE);
						correcto = 1;
					}else {	
						TrPri = JOptionPane.showInputDialog(null,
								"Número de Plazas a Reservar en Primera Clase : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
						byte rPri = Byte.parseByte(TrPri);
						
						if(rPri > miReserva.consultaPlazasPrime()){
							plural = Funciones.EnPlural(miReserva.consultaPlazasPrime());
							JOptionPane.showMessageDialog(null,
								"Sólo tenemos "+miReserva.consultaPlazasPrime()+" Plaza"+plural,
								"¡¡ Número de plazas PRIME, INSUFICIENTES !!", JOptionPane.PLAIN_MESSAGE);
							
							if (JOptionPane.showConfirmDialog(null, "¿ Quieres Reservar Plazas en Clase Económica ?", 
									"Alerta Opción!", JOptionPane.YES_NO_OPTION)!=1) {
									Funciones.reservaEco();
							}else {
								correcto = 1;
							}
							
						} else {	
							
							miReserva.reservarPlazaPrime(rPri);
							plural = Funciones.EnPlural(rPri);
							
							
							msjPrime = "Tu reserva se ha realizado correctamente\n" + miReserva.consultaReservasPrime()+
									" Plaza"+plural+ " RESERVADA"+plural.toUpperCase()+" en PRIME";
							
							titPrime = "¡¡ PLAZA"+plural.toUpperCase()+" PRIME, RESERVADA"+plural.toUpperCase()+" !!";						
							correcto = 1;				
						}
					}	
				
				}while(correcto==0);
				
				
				
				
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
			
			
		
	}

	public static String EnPlural(int reservas) {
		if (reservas>1) {
			return "s";
		}else {
			return "";
		}
	}
		
	
	
	public static void reservaEco() {
	
		correcto = 0;
	
			
			/*msj = "";
			msj = msj + "Número de Plazas Prime = " + miReserva.consultaPlazasPrime()+"\n";
			msj = msj + "Número de Plazas Eco = " + miReserva.consultaPlazasEco()+"\n";
			
			JOptionPane.showMessageDialog(null,
					msj,"NUMERO DE PLAZAS DE MI AVION", JOptionPane.PLAIN_MESSAGE);
			*/
			try {
				String TrEco = "";
				
				
				do {
					if (miReserva.consultaPlazasPrime()==0 && miReserva.consultaPlazasEco()==0) {
						JOptionPane.showMessageDialog(null,
								"NO TENEMOS MÁS PLAZAS, EL SIGUIENTE VUELO SALE EN 3 HORAS. GRACIAS",
								"¡¡ VUELO COMPLETO !!", JOptionPane.PLAIN_MESSAGE);
						correcto = 1;
					}else{	
						TrEco = JOptionPane.showInputDialog(null,
								"Número de Plazas a Reservar ECONOMIC : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
						byte rEco = Byte.parseByte(TrEco);
					
						if(rEco > miReserva.consultaPlazasEco()){
							plural = Funciones.EnPlural(miReserva.consultaPlazasEco());
							JOptionPane.showMessageDialog(null,
								"Sólo tenemos "+miReserva.consultaPlazasEco()+" Plaza"+plural,
								"¡¡ Número de plazas ECONIMIC, INSUFICIENTES !!", JOptionPane.PLAIN_MESSAGE);
							
							if (JOptionPane.showConfirmDialog(null, "¿ Quieres Reservar Plazas en Clase Prime ?", 
									"Alerta Opción!", JOptionPane.YES_NO_OPTION)!=1) {
									Funciones.reservaPrime();
							}else {
								correcto = 1;
							}
							
						} else {	
							
							miReserva.reservarPlazaEco(rEco);
							plural = Funciones.EnPlural(rEco);
							
							msjEco = "Tu reserva se ha realizado correctamente\n" + miReserva.consultaReservasEco()+
									" Plaza"+plural+ " RESERVADA"+plural.toUpperCase()+" en ECONOMIC";
							titEco = "¡¡ PLAZA"+plural.toUpperCase()+" ECONOMIC, RESERVADA"+plural.toUpperCase()+" !!";
							
							correcto = 1;				
						}
					}	
				
				}while(correcto==0);
				
				
				
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
			
			
				
	}
}
