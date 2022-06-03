package miprimerproyecto.c;

import javax.swing.JOptionPane;

public class Hasard {
	public static void main(String[] args) {		

		int elementos = Integer.parseInt(JOptionPane.showInputDialog("Escribir elementos del Array"));
		int numeros_aleatorios[] = new int[elementos];
		// BUCLE FOR
		for (int i = 0; i < numeros_aleatorios.length; i++) {
			numeros_aleatorios[i] = (int) (Math.random() * 100);

		}

		//BUCLE FOREACH
		for (int elem : numeros_aleatorios) {
			System.out.println(elem);
		}
	}
}
