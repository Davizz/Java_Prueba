package E14;

import javax.swing.JOptionPane;

import model.Barco;


public class Main {
	
	public static void main(String[] args) {
		Barco miBarco = new Barco();
		Funciones misMetodos = new Funciones();
		String msj="";
		
		miBarco = misMetodos.obtenerDatos();
		
		miBarco.setLongitud(misMetodos.obtenerLongitud());
		miBarco.setAltura(misMetodos.obtenerAltura());
		miBarco.setAncho(misMetodos.obtenerAnchura());
		
		msj=msj+"Mi barco se llama "+miBarco.getNombre()+
				" Y tiene una potencia de "+miBarco.getPotencia()+" CV.\n"+
				"Que tiene una Longitud de "+miBarco.getLongitud()+" Metros\n"+
				"Y una altura de "+miBarco.getAltura()+" Metros.";
		
		JOptionPane.showMessageDialog(null,
				msj,"Datos de mi Barco", JOptionPane.PLAIN_MESSAGE);
		
		if(miBarco.getAltura()<=8 && miBarco.getAncho()<=5) {
			msj = "Mi barco mide "+miBarco.getAltura()+ " Metros de Alto y "+miBarco.getAncho()+" Metros de Ancho\n";
			msj = msj +"Mi Barco cabe por los 3 puentes";
		}else if(miBarco.getAltura()<=60 && miBarco.getAncho()<=25) {
			msj = "Mi barco mide "+miBarco.getAltura()+ " Metros de Alto y "+miBarco.getAncho()+" Metros de Ancho\n";
			msj = msj +"Mi Barco cabe por los Puentes 1 y 2";
		}else if(miBarco.getAltura()<=100 && miBarco.getAncho()<=100) {
			msj = "Mi barco mide "+miBarco.getAltura()+ " Metros de Alto y "+miBarco.getAncho()+" Metros de Ancho\n";
			msj = msj +"Mi Barco SOLO cabe por el Puente nº 1";
		}else {
			msj = "Mi barco mide "+miBarco.getAltura()+ " Metros de Alto y "+miBarco.getAncho()+" Metros de Ancho\n";
			msj = msj +"Mi Barco NO cabe por NINGUN Puente, ME HE PASADO COMPRANDO";
		}
		JOptionPane.showMessageDialog(null,
				msj,"PASO POR LOS PUENTES", JOptionPane.PLAIN_MESSAGE);
	}

}
