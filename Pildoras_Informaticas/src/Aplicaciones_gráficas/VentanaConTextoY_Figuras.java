package Aplicaciones_gráficas;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class VentanaConTextoY_Figuras {

	public static void main(String[] args) {
		
		Ventana_conTexto mimarco = new Ventana_conTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
class Ventana_conTexto extends JFrame {
	public Ventana_conTexto() {
		setVisible(true);
		setSize(600, 450);
		setLocation(400,200);
		setTitle("Ventana con texto");
		Lamina milamina = new Lamina();
		add(milamina);
	}
}
class Lamina extends JPanel {
	public void paintComponent (Graphics g) {
		
		//Si quiero escribir contenido en la ventana
		super.paintComponent(g);
		
		
		//Si quiero dibujar formas en la ventana
		//g.drawString("Estamos aprendiendo Swing", 100, 100);
		//g.drawRect(50, 50, 200, 200);
		//g.drawLine(100, 100, 300, 200);
		//g.drawArc(50,100, 100, 200, 120, 150); circulo.setFrameFromCenter()
		
		//Si quiero dibujar figuras
		Graphics2D g2 =(Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,150,200);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		g2.draw(new Line2D.Double(100,100,300,250));
		double CentroenX = rectangulo.getCenterX();
		double CentroenY = rectangulo.getCenterY();
		
		double radio=150;
		Ellipse2D circulo=new Ellipse2D.Double(CentroenX, CentroenY, CentroenX + radio, CentroenY + radio);
		g2.draw(circulo);
		;
		
		
	}
}