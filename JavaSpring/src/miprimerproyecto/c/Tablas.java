package miprimerproyecto.c;

import javax.swing.*;

public class Tablas {

	public static void main(String[] args) {
		boolean verif;
		String salida = "";

		int tabla = Integer.parseInt(JOptionPane.showInputDialog("Qué tabla quieres imprimir en pantalla?"));
		do {
			if (tabla < 1 || tabla > 10) {
				JOptionPane.showMessageDialog(null, "No olvides que tienes que escojer un número entre 1 y 10.", "Alerta", JOptionPane.WARNING_MESSAGE);
			
				verif = false;
				tabla = Integer.parseInt(JOptionPane.showInputDialog("Qué tabla quieres imprimir en pantalla?"));
			} else {
				verif = true;

				salida += "TABLA DE " + tabla +".\n";
				for (int i = 0; i < 11; i++) {
					salida += tabla + " x " + i + " = " + (tabla * i) + "\n";

				}
			}
		} while (verif == false);
		JOptionPane.showMessageDialog(null, salida);
		JOptionPane.showMessageDialog(null, "Saliendo del programa...");
		System.exit(0);

	}

}
