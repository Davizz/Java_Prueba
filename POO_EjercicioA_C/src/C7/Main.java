 package C7;
 //import java.util.InputMismatchException;
 
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Funciones calcular = new Funciones();
		
		
		try {
			//Ejercicio C7_1
			int d1=0, d2=0, d3=0;
			String Td1 = (JOptionPane.showInputDialog(null,"Lanza el Dado 1: ", "Salón de Juego", 
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Selecciona","1","2","3","4","5","6"},"Selecciona")).toString();
			d1 = Integer.parseInt(Td1);
			
			String Td2 = (JOptionPane.showInputDialog(null,"Lanza el Dado 2: ", "Salón de Juego", 
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Selecciona","1","2","3","4","5","6"},"Selecciona")).toString();
			d2 = Integer.parseInt(Td2);
			
			String Td3 = (JOptionPane.showInputDialog(null,"Lanza el Dado 3: ", "Salón de Juego", 
					JOptionPane.PLAIN_MESSAGE, null,
					new Object[] {"Selecciona","1","2","3","4","5","6"},"Selecciona")).toString();
			d3 = Integer.parseInt(Td3);
			
			
			JOptionPane.showMessageDialog(null,"Resultado de tu jugada ha sido\n\n"+calcular.juegoDados(d1,d2,d3), 
					"Salón de Juego", JOptionPane.PLAIN_MESSAGE);
				
		}
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No has Seleccionado Ningún Dado ??","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
		try {
			//Ejercicio C7_2
			String numero = JOptionPane.showInputDialog(null,"Dame un número ", "El Adivino...", JOptionPane.PLAIN_MESSAGE);
			
			JOptionPane.showMessageDialog(null,"Has introducido un número de "+calcular.numeroCifras(numero)+" cifras", 
					"El Adivino...", JOptionPane.PLAIN_MESSAGE);
		
		}
		//catch(InputMismatchException e) {
		catch(NullPointerException e){
			JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n No puedes dejar la celda vacía","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
		catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "¡¡ ERROR !!\n ¿¿ No me has Dado ningún número ??","Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
		
		
		

	}

}
