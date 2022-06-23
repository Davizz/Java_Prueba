package F19;

import javax.swing.JOptionPane;

public class Tiempo {
	
	/* Diseña una clase Tiempo con las siguientes propiedades:
		
		     horas: 0 a 23;
		     minutos: 0 a 59;
		     segundos: de 0 a 59.
		
		La clase Tiempo debe tener los siguientes constructores:
		
		     Tiempo ();
		     Tiempo (horas);
		     Tiempo (horas, minutos);
		     Tiempo (horas, minutos, segundos);
	 */

	private int hora;
	private int minutos;
	private int segundos;
	
	public Tiempo() {
		super();
	}

	public Tiempo(int hora) {
		super();
		this.hora = hora;
	}

	public Tiempo(int hora, int minutos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
	}

	public Tiempo(int hora, int minutos, int segundos) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.segundos = segundos;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		if(hora<0) {
			JOptionPane.showMessageDialog(null, "No se pueden incluir horas negativas", "Error!!", JOptionPane.PLAIN_MESSAGE);
			this.hora = -1;
		}else {
			this.hora = hora;
		}
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
	
	
	
}
