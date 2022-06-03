package F23;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Centro de Ocio"};
		
		while(select != 0){
		
			try{
				select = menu.miMenu(opcionesMenu);
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opción 1, próximamente!!");		
					misMetodos.F23_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opción 2, próximamente!!");
					//misMetodos.F23_2();
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
