package utilidades;

import javax.swing.JOptionPane;

public class Menu {
	
	static byte select; 
	
	public byte miMenu(String [] opciones) {
		String msj = "";
		for (int i=0;i<opciones.length;i++) {
			msj = msj +"   "+opciones[i]+"\n";
		}
		
		String lectura = JOptionPane.showInputDialog(null,
				"=========================================\n"+
				"   ELIGE OPCION:\n"+	
				"=========================================\n"+	
				msj +
				"\n   0. Salir \n" +
				"__________________________________________\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
		
		select = Byte.parseByte(lectura); 
		
		
		//System.out.println(select);		
		//System.out.println((byte)select);
		
		return select;		
		
	}
}
