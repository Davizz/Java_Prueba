package Aplicaciones_gr�ficas;

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
		
		//M�todos heredados de JFrame
		//Dar medidas
		setSize(500, 300);
		//Dar localizaci�n
		setLocation(100,200);
		//Dar medidas y localizaci�n
		//setBounds(500,300,100,200);
		//Impedir aumentar tama�o
		//setResizable(true);
		//Aumentar ventana a ancho de p�gina completo
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		//Dar t�tulo a la ventana
		setTitle("Mi ventana");
		
		
		
		
		
	}
}
