package B;

import javax.swing.JOptionPane;

public class MainB4_2 {

	public static void main(String[] args) {
		/*
		 * Ej B4_2 
			Usando la clase JOption Pane, pedir al usuario que inserte por teclado 3 n�meros enteros. 
			A continuaci�n, resolver la ecuaci�n de primer grado aX+b=c sacando el valor de X 
			y sabiendo que a, b y c son las entradas por teclado.

		 */
		
		JOptionPane.showMessageDialog(null, "************************\n**   EJERCICIO B4_2   **\n************************\n");

		String ta = JOptionPane.showInputDialog("N�mero a: ");
		int a = Integer.parseInt(ta);
		String tb = JOptionPane.showInputDialog("N�mero b: ");
		int b = Integer.parseInt(tb);
		String tc = JOptionPane.showInputDialog("N�mero c: ");
		int c = Integer.parseInt(tc);
		
		double x = (c-b)/a;
		
		JOptionPane.showMessageDialog(null, "El valor de X es " + x);
	}

}
