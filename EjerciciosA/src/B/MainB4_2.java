package B;

import javax.swing.JOptionPane;

public class MainB4_2 {

	public static void main(String[] args) {
		/*
		 * Ej B4_2 
			Usando la clase JOption Pane, pedir al usuario que inserte por teclado 3 números enteros. 
			A continuación, resolver la ecuación de primer grado aX+b=c sacando el valor de X 
			y sabiendo que a, b y c son las entradas por teclado.

		 */
		
		JOptionPane.showMessageDialog(null, "************************\n**   EJERCICIO B4_2   **\n************************\n");

		String ta = JOptionPane.showInputDialog("Número a: ");
		int a = Integer.parseInt(ta);
		String tb = JOptionPane.showInputDialog("Número b: ");
		int b = Integer.parseInt(tb);
		String tc = JOptionPane.showInputDialog("Número c: ");
		int c = Integer.parseInt(tc);
		
		double x = (c-b)/a;
		
		JOptionPane.showMessageDialog(null, "El valor de X es " + x);
	}

}
