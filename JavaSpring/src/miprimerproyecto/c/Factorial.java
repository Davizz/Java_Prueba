package miprimerproyecto.c;

import javax.swing.JOptionPane;

/**
 *
 * @author Ludovic Laisnez
 */
public class Factorial {
	public static void main(String[] args) {
		boolean verif;
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número..."));
		double salida = 1L;

		do {
			if (numero < 1) {
				JOptionPane.showMessageDialog(null, "No olvides que debes ingresar un entero positivo.", "Alerta",
						JOptionPane.WARNING_MESSAGE);
				verif = false;
				numero = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número..."));
			} else {
				verif = true;
				for (double i = numero; i > 0; i--) {
					salida *= i;
				}
				JOptionPane.showMessageDialog(null, "El factorial de " + numero + " es " + salida);
			
			}

		} while (verif == false);
		JOptionPane.showMessageDialog(null, "Saliendo del programa...");
	
		System.exit(0);
	}

}
