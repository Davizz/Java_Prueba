package F19;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

import validar.Validaciones;

public class Funciones {
	
	
	
	
	/* Ejercicio F19-1 Clase Funciones
		Tienes que crearte un fichero en el que vas metiendo 3 métodos estáticos 
		que te podrían ser útiles para volver a utilizarlas después y que contienen métodos 
		como compruebaDNI, compruebaNombre, compruebaCCC, compruebaEntradaJOption…
		
		Este fichero te servirá de base para alimentarlo con nuevos métodos en las próximas semanas. 
	 */
	public void F19_1() {
		String dni;
		do {	
			dni = JOptionPane.showInputDialog(null, "DNI: ", "Datos Usuario", JOptionPane.PLAIN_MESSAGE);	
			System.out.println(Validaciones.comprobarDni(dni));
		}while(!Validaciones.comprobarDni(dni));
		
	}
	/* Ejercicio F19-2 – Clase Tiempo
		Diseña una clase Tiempo con las siguientes propiedades:
		
		     horas: 0 a 23;
		     minutos: 0 a 59;
		     segundos: de 0 a 59.
		
		La clase Tiempo debe tener los siguientes constructores:
		
		     Tiempo ();
		     Tiempo (horas);
		     Tiempo (horas, minutos);
		     Tiempo (horas, minutos, segundos);
		    
		La clase Tiempo debe contener los métodos setter / getter para sus propiedades.
		También debe contener los métodos:
		
		     agregarHoras (horas): agrega un determinado número de horas a la hora actual;
		     agregarMinutos (minutos): agrega "minutos" a la hora actual;
		     agregarSegundos (segundos): agrega "segundos" a la hora actual;
		     toString (): da una representación String de la clase Time.
		Pueden ser estáticos o no según el uso que harás de ellos después. 
		
		También tendrás que crear una clase Principal para probar la clase Tiempo. Las pruebas se harán sin hacer uso de entradas usuarios. 
		Clase API propuesta para la realización de esta tarea:
		
		     java.text.DecimalFormat
	 */
	public void F19_2() {
		Calcular miCalculo = new Calcular();
		Date fecha = new Date();
		
		Tiempo miTiempo = new Tiempo();
		do {
			miTiempo.setHora(Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la Hora", 
																				"Datos Usuario", JOptionPane.PLAIN_MESSAGE)));
		}while(miTiempo.getHora()<0);
		
		miCalculo.agregarHoras(miTiempo.getHora());
		
		
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(fecha); // Configuramos la fecha que se recibe

		calendar.add(Calendar.HOUR, miTiempo.getHora());  // numero de horas a añadir, o restar en caso de horas<0
		 // Devuelve el objeto Date con las nuevas horas añadidas
		
		JOptionPane.showMessageDialog(null,"Añadimos " + miTiempo.getHora() + " horas a la fecha actual : " + 
										  new SimpleDateFormat("dd-MM-yyyy HH:mm").format(fecha) + 
										  "\nLa nueva fecha será : " + new SimpleDateFormat("dd-MM-yyyy HH:mm").format(calendar.getTime()), 
										  "Resultado", JOptionPane.PLAIN_MESSAGE);
	}
	
}
