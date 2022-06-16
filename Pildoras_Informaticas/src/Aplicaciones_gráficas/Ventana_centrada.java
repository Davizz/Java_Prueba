package Aplicaciones_gráficas;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ventana_centrada {

	public static void main(String[] args) {
	
		Ventanacentrada marco = new Ventanacentrada();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);
		
	}

}
 class Ventanacentrada extends JFrame {
	 public Ventanacentrada () {
		 
		 Toolkit mipantalla = Toolkit.getDefaultToolkit();
		 //Metemos en la variable el ancho y el alto de la pantalla
		 Dimension tamanoPantalla = mipantalla.getScreenSize();
		 
		 int alturaPantalla = tamanoPantalla.height;
		 int anchoPantalla = tamanoPantalla.width;
		 
		 setSize(anchoPantalla/2, alturaPantalla/2);
		 
		 setLocation(anchoPantalla/4, alturaPantalla/4);
		 
		 setTitle("Mi ventana centrada del Athletic");

		 //Cambiar imagen de Java
		 Image miIcono=mipantalla.getImage("athletic.gif");
		 
		 setIconImage(miIcono);
		 
		  
		 
	 }
 }