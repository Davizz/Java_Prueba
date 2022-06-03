package miprimerproyecto.b;

import javax.swing.*;

//import java.awt.event.*;

/**
 * 
 * @author Ludovic Laisnez
 *
 */
public class JOptionPaneEjemplos {

	/**
	 * En aplicaciones basadas en Windows, Java Swing hace que sea muy fácil de
	 * desarrollar y es una API muy potente. JOptionPane es solo una parte de ella.
	 * Simplifica la creación de cuadros de diálogo. Proporciona cuadros de diálogo
	 * estándar, como el cuadro de diálogo de entrada, el cuadro de diálogo de
	 * confirmación y el cuadro de diálogo de mensaje. También podemos crear
	 * nuestros propios cuadros de diálogo personalizados. Dado que JOptionPane
	 * proporciona cuadros de diálogo estándar, es muy útil. *
	 */
	public static void main(String[] args) {
//		//EJEMPLO 1
//		//String pregunta = JOptionPane.showInputDialog("Aquí va la pregunta");
//		 String nombre = JOptionPane.showInputDialog("Nombre: ");
//		String entradaNombre = "Nombre: ";
//		// Un nombre de usuario
//		 nombre = JOptionPane.showInputDialog(entradaNombre);
//		 String entradaEdad = "Edad: ";
//		// La edad del usuario
//		 String edad = JOptionPane.showInputDialog(entradaEdad);
//		// Si declaramos todo como String, obtenemos un resultado sorprendente
//		 System.out.println("Hola "+ nombre +" . El año que viene tendrás "+ (edad+1)
//		 +" años.");
//		// Necesitamos hacer una conversión
//		// Necesitaré importar un paquete estático
//		 int edadUser = Integer.parseInt(edad);
//		 
//		 //o
//		 //int edad = Integer.parseInt(JOptionPane.showInputDialog(entradaEdad));
//		 System.out.println("Hola " + nombre + " . El año que viene tendrás " +
//		 (edadUser + 1) + " años.");

		// EJEMPLO 2
		// forma de uso 1
		// USOS DE showMessageDialog()
		// El método acepta 2 parámetros. El primero es un objeto JFrame.
//		 JFrame f =new JFrame();
//		 JOptionPane.showMessageDialog(f,"Hola y bienvenido al Campus de C2B.");
		// forma de uso 2
		// otra forma de proceder
//		 JFrame f;
//		 f=new JFrame();
//		 JOptionPane.showMessageDialog(f,"Hola y bienvenido al Campus de C2B.");
		// forma de uso 3
		// También puedo usar la mención null
//		 JOptionPane.showMessageDialog(null,"Hola y bienvenido al Campus de C2B.");
		// formas de uso 4 CON 4 PARÁMETROS
//		 JOptionPane.showMessageDialog(null, "Algo ha ido mal...", "Error en el título", JOptionPane.ERROR_MESSAGE);
//		 JOptionPane.showMessageDialog(null, "Algo ha ido mal...", "Error en el título", 0);
		// INFORMATION_MESSAGE
//		JOptionPane.showMessageDialog(null, "Información acerca de NOSEKE.", "Información", JOptionPane.INFORMATION_MESSAGE);	
//		 JOptionPane.showMessageDialog(null, "Información acerca de NOSEKE.",
//		 "Información", 1);
		// WARNING_MESSAGE
//		JOptionPane.showMessageDialog(null, "Operación realizada con éxito.", "Alerta", 2);
//		 JOptionPane.showMessageDialog(null, "Operación realizada con éxito.",
//		 "Alerta", JOptionPane.WARNING_MESSAGE);
//		 QUESTION_MESSAGE
//		 JOptionPane.showMessageDialog(null, "Tenemos una pregunta.", "Pregunta", 3);
//		JOptionPane.showMessageDialog(null, "Tenemos una pregunta.", "Información", JOptionPane.QUESTION_MESSAGE);	

		// EJEMPLO 3
		// showInputDialog()
//		String name = JOptionPane.showInputDialog( "Insertar su nombre:" );
//		JOptionPane.showMessageDialog(null, "Hola " + name);

		// EJEMPLO4
//		showConfirmDialog()
//		int input = JOptionPane.showConfirmDialog(null, "¿Confirmar ejecución?");
		// 0=yes, 1=no, 2=cancel
//		System.out.println(input);	
		
//		JOptionPane.showMessageDialog(null, "Muchas gracias por su compra", "Pedido cobrado",
//				JOptionPane.WARNING_MESSAGE);
//		int decision = JOptionPane.showConfirmDialog(null, "Algún mensaje", "Confirmar compra", JOptionPane.YES_NO_OPTION);
		
		
//		// ejemplo5
//		Object[] colores = { "rojo", "negro", "amarillo", "azul", "majenta" };
//		// JOptionPane.showInputDialog(padre, mensaje, titulo, tipo de seleccion, tipo
//		// de mensaje, icono, opciones, valor inicial);
//		String salida = JOptionPane.showInputDialog(null, "Selecciona un color", 
//				"Elegir", JOptionPane.QUESTION_MESSAGE,
//				null, colores, colores[3]).toString();
//		JOptionPane.showMessageDialog(null, salida);
		
	}

}
