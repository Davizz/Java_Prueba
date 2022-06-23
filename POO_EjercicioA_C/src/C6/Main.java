package C6;

import javax.swing.JOptionPane;


public class Main {

	public static void main(String[] args) {
		Funciones calcular = new Funciones();
		
		//Ejercicio C6_1
		try {
			double vta=0;
			String Tvta = JOptionPane.showInputDialog("Qué Venta has realizado: ");
			vta = Double.parseDouble(Tvta);
			JOptionPane.showMessageDialog(null,"Importe Total = "+calcular.CalculoDTO(vta));
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Error, No has ingresado Números","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
		
		//Ejercicio C6_2
		try {
			double horas=0;
			String Thoras = JOptionPane.showInputDialog("Qué Horas has trabajado: ");
			horas = Double.parseDouble(Thoras);
			JOptionPane.showMessageDialog(null,"Importe Total = "+calcular.CalculoSalario(horas));
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Error, No has ingresado Números","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
	}

}
