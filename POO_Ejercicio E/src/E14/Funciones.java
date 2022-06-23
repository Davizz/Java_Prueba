package E14;

import javax.swing.JOptionPane;

import model.Barco;

public class Funciones {
	//obtenerLongitud y obtenerAltura
		
	public int obtenerLongitud() {
		String TLong = JOptionPane.showInputDialog(null,
				"INTRODUCE LA LONGITUD DEL BARCO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		int nlong = Integer.parseInt(TLong);
		return nlong;	
	}
	public int obtenerAltura() {
		String TAlt = JOptionPane.showInputDialog(null,
				"INTRODUCE LA ALTURA DEL BARCO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		int nAlt = Integer.parseInt(TAlt);
		return nAlt;	
	}
	public int obtenerAnchura() {
		String TAnch = JOptionPane.showInputDialog(null,
				"INTRODUCE EL ANCHO DEL BARCO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		int nAnch = Integer.parseInt(TAnch);
		return nAnch;	
	}
	
	public Barco obtenerDatos() {
		Barco barcoDatos = new Barco();
		String nom = JOptionPane.showInputDialog(null,
				"INTRODUCE EL NOMBRE DEL BARCO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		String Tpotencia = JOptionPane.showInputDialog(null,
				"INTRODUCE LA POTENCIA DEL BARCO: \n","Solicitud al Usuario", JOptionPane.PLAIN_MESSAGE);
		double potencia = Double.parseDouble(Tpotencia);
		
		barcoDatos.setNombre(nom);
		barcoDatos.setPotencia(potencia);
		
		return barcoDatos;
	}
	
}
