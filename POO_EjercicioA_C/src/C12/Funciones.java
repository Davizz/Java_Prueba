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
		Vamos a crear una serie de m�todos reutilizables en un futuro en otros proyectos. Y los usaremos para comprobar los datos insertados en un sencillo formulario. 
		Pediremos al usuario que inserte su DNI, su nombre y su n�mero de tel�fono. 
		
		El sistema tendr� que validar las 3 entradas y devolver una confirmaci�n final si todo es correcto. 
		
		Si los datos han sido correctamente registrados, los registrar�s en un array de tipo String. 
		El DNI tendr� que ser un DNI verdadero. 
		El nombre tendr� que estar compuesto por, por lo menos, 2 letras. 
		El tel�fono tendr� que ser un m�vil (empezando por 6) con 9 d�gitos. 
		Para comprobar cada entrada, tendr�s que crear un m�todo p�blico de tipo booleano. 
		
		Ejemplo de nombre para los 3 m�todos: comprobarNombre, comprobarTelefono y ComprobarDni.  
		Para facilitarte el trabajo de programaci�n, necesitar�s documentarte acerca de las expresiones regulares en Java.
	 */
	public void C12_1() {
		salir = -1;
		correcto = 0;
		while (salir !=1) {
			try {
				String Tdni = "", nombre = "", telefono = "";
				
				do {
					Tdni = JOptionPane.showInputDialog(null,
							"INTRODUCE TU DNI V�LIDO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarDni(Tdni)==false){
						JOptionPane.showMessageDialog(null,
							"�� El DNI "+Tdni+" NO ES V�LIDO !!","�� ERROR !!", JOptionPane.PLAIN_MESSAGE);
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
							"El Nombre no tiene como m�nimo 2 letras","�� ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {		
						correcto = 1;
					}
				
				}while(correcto==0);
				
				correcto = 0;
				do {
					telefono = JOptionPane.showInputDialog(null,
							"INTRODUCE TU n� TELEFONO M�VIL : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
				
					if(Validaciones.comprobarTelefono(telefono)==false){
						JOptionPane.showMessageDialog(null,
							"El n�mero de m�vil no comienza por 6 o no tiene 9 d�gitos","�� ERROR !!", JOptionPane.PLAIN_MESSAGE);
					} else {	
						correcto = 1;	
					}
				
				}while(correcto==0);
				
				
				
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "�Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
		}					
	}
	
	/*
	 * C12_2 Reserva de plazas de avi�n
		Una muy peque�a compa��a de aviaci�n con un solo avi�n de 10 asientos desea poner en marcha su propio sistema de reservas.
		El programa permite a un usuario, a partir de un estado de reserva del avi�n cualquiera, reservar uno o varios asientos para el pr�ximo vuelo.
		El avi�n tiene dos clases, primera y econ�mica. 
		5 asientos est�n asignados a la clase econ�mica y los otros 5 a la primera clase.
		Dependiendo de la elecci�n del usuario, un asiento se asigna en primera clase o en clase econ�mica. 
		
		Sin embargo, si la clase econ�mica est� completa, el sistema pregunta al usuario si desea un asiento en primera clase. 
		A la inversa, si la primera clase est� completa. En caso negativo, el sistema muestra el mensaje "pr�ximo vuelo en 3 horas".
		A la finalizaci�n del sistema se mostrar� el estado de la reserva.
		Escribir el programa correspondiente.
	 */
	public void C12_2() {
		
		salir = -1;
		int Seleccion = 0;
		Object[] options = new Object[] {"SALIR",
				"Clase Econ�mica\n["+miReserva.consultaPlazasEco()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasEco())+"]",
				"Primera Clase\n["+miReserva.consultaPlazasPrime()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasPrime())+"]"};
		
		while (salir !=1) {
			
			options[1]="Clase Econ�mica\n["+miReserva.consultaPlazasEco()+" Plaza"+Funciones.EnPlural(miReserva.consultaPlazasEco())+"]";
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
			salir = JOptionPane.showConfirmDialog(null, "�Quieres hacer m�s Reservas?", "Alerta!", JOptionPane.YES_NO_OPTION);
		}	
		
		
	}	
		
		
	public static void reservaPrime() { 	
		
			correcto = 0;
	
			
			/*msj = "";
			msj = msj + "N�mero de Plazas Prime = " + miReserva.consultaPlazasPrime()+"\n";
			msj = msj + "N�mero de Plazas Eco = " + miReserva.consultaPlazasEco()+"\n";
			
			JOptionPane.showMessageDialog(null,
					msj,"NUMERO DE PLAZAS DE MI AVION", JOptionPane.PLAIN_MESSAGE);
			*/
			try {
				String TrPri = "";
				
				
				do {
					if (miReserva.consultaPlazasPrime()==0 && miReserva.consultaPlazasEco()==0) {
						JOptionPane.showMessageDialog(null,
								"NO TENEMOS M�S PLAZAS, EL SIGUIENTE VUELO SALE EN 3 HORAS. GRACIAS",
								"�� VUELO COMPLETO !!", JOptionPane.PLAIN_MESSAGE);
						correcto = 1;
					}else {	
						TrPri = JOptionPane.showInputDialog(null,
								"N�mero de Plazas a Reservar en Primera Clase : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
						byte rPri = Byte.parseByte(TrPri);
						
						if(rPri > miReserva.consultaPlazasPrime()){
							plural = Funciones.EnPlural(miReserva.consultaPlazasPrime());
							JOptionPane.showMessageDialog(null,
								"S�lo tenemos "+miReserva.consultaPlazasPrime()+" Plaza"+plural,
								"�� N�mero de plazas PRIME, INSUFICIENTES !!", JOptionPane.PLAIN_MESSAGE);
							
							if (JOptionPane.showConfirmDialog(null, "� Quieres Reservar Plazas en Clase Econ�mica ?", 
									"Alerta Opci�n!", JOptionPane.YES_NO_OPTION)!=1) {
									Funciones.reservaEco();
							}else {
								correcto = 1;
							}
							
						} else {	
							
							miReserva.reservarPlazaPrime(rPri);
							plural = Funciones.EnPlural(rPri);
							
							
							msjPrime = "Tu reserva se ha realizado correctamente\n" + miReserva.consultaReservasPrime()+
									" Plaza"+plural+ " RESERVADA"+plural.toUpperCase()+" en PRIME";
							
							titPrime = "�� PLAZA"+plural.toUpperCase()+" PRIME, RESERVADA"+plural.toUpperCase()+" !!";						
							correcto = 1;				
						}
					}	
				
				}while(correcto==0);
				
				
				
				
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
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
			msj = msj + "N�mero de Plazas Prime = " + miReserva.consultaPlazasPrime()+"\n";
			msj = msj + "N�mero de Plazas Eco = " + miReserva.consultaPlazasEco()+"\n";
			
			JOptionPane.showMessageDialog(null,
					msj,"NUMERO DE PLAZAS DE MI AVION", JOptionPane.PLAIN_MESSAGE);
			*/
			try {
				String TrEco = "";
				
				
				do {
					if (miReserva.consultaPlazasPrime()==0 && miReserva.consultaPlazasEco()==0) {
						JOptionPane.showMessageDialog(null,
								"NO TENEMOS M�S PLAZAS, EL SIGUIENTE VUELO SALE EN 3 HORAS. GRACIAS",
								"�� VUELO COMPLETO !!", JOptionPane.PLAIN_MESSAGE);
						correcto = 1;
					}else{	
						TrEco = JOptionPane.showInputDialog(null,
								"N�mero de Plazas a Reservar ECONOMIC : \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
						byte rEco = Byte.parseByte(TrEco);
					
						if(rEco > miReserva.consultaPlazasEco()){
							plural = Funciones.EnPlural(miReserva.consultaPlazasEco());
							JOptionPane.showMessageDialog(null,
								"S�lo tenemos "+miReserva.consultaPlazasEco()+" Plaza"+plural,
								"�� N�mero de plazas ECONIMIC, INSUFICIENTES !!", JOptionPane.PLAIN_MESSAGE);
							
							if (JOptionPane.showConfirmDialog(null, "� Quieres Reservar Plazas en Clase Prime ?", 
									"Alerta Opci�n!", JOptionPane.YES_NO_OPTION)!=1) {
									Funciones.reservaPrime();
							}else {
								correcto = 1;
							}
							
						} else {	
							
							miReserva.reservarPlazaEco(rEco);
							plural = Funciones.EnPlural(rEco);
							
							msjEco = "Tu reserva se ha realizado correctamente\n" + miReserva.consultaReservasEco()+
									" Plaza"+plural+ " RESERVADA"+plural.toUpperCase()+" en ECONOMIC";
							titEco = "�� PLAZA"+plural.toUpperCase()+" ECONOMIC, RESERVADA"+plural.toUpperCase()+" !!";
							
							correcto = 1;				
						}
					}	
				
				}while(correcto==0);
				
				
				
				
			}
			catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "�� ERROR !!\n �� No me has Dado ning�n n�mero ??","Error", JOptionPane.ERROR_MESSAGE);
				//System.exit(-1);
			}
			
			
				
	}
}
