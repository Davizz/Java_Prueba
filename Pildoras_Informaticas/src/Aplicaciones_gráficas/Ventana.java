package Aplicaciones_gráficas;

import java.awt.Frame;

import javax.swing.*;

public class Ventana {

	public static void main(String[] args) {

		miMarco marco1 = new miMarco();

		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame {
	public miMarco() {
		
		//Métodos heredados de JFrame
		//Dar medidas
		setSize(500, 300);
		//Dar localización
		setLocation(100,200);
		//Dar medidas y localización
		//setBounds(500,300,100,200);
		//Impedir aumentar tamaño
		//setResizable(true);
		//Aumentar ventana a ancho de página completo
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//Dar título a la ventana
		setTitle("Mi ventana");
		
		
		
		
		
	}
}
