package F19;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Recursividad", "2. Cajero Automático"};
		
		while(select != 0){
		
			try{
				select = menu.miMenu(opcionesMenu);
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opción 1, próximamente!!");		
					misMetodos.F19_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opción 2, próximamente!!");
					misMetodos.F19_2();
					break;
				case 3: 
					//JOptionPane.showMessageDialog(null,"Opción 3, próximamente!!");
					
					break;
				case 4: 
					//JOptionPane.showMessageDialog(null,"Opción 4, próximamente!!");
					
					break;
				case 5: 
					//JOptionPane.showMessageDialog(null,"Opción 5, próximamente!!");
					
					break;	
				case 6: 
					//JOptionPane.showMessageDialog(null,"Opción 6, próximamente!!");
					
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
