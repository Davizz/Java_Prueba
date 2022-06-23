package F18_Rafa;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Cuenta vocales", "2. MI Librería"};
		
		while(select != 0){
		
			try{
				Funciones misMetodos = new Funciones();
				select = menu.miMenu(opcionesMenu);
		
				
				switch(select){
				case 1: 	
					misMetodos.F18_1();
					break;
				case 2: 
					misMetodos.F18_2();
					break;
				case 0: 
					JOptionPane.showMessageDialog(null,"Hasta Luego, vuelve pronto!","Saludo", JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido","Algo no ha ido bien...", JOptionPane.PLAIN_MESSAGE);
					break;
				}
							
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}		
		
	}

}
