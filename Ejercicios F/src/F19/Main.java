package F19;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Recursividad", "2. Cajero Autom�tico"};
		
		while(select != 0){
		
			try{
				select = menu.miMenu(opcionesMenu);
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opci�n 1, pr�ximamente!!");		
					misMetodos.F19_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opci�n 2, pr�ximamente!!");
					misMetodos.F19_2();
					break;
				case 3: 
					//JOptionPane.showMessageDialog(null,"Opci�n 3, pr�ximamente!!");
					
					break;
				case 4: 
					//JOptionPane.showMessageDialog(null,"Opci�n 4, pr�ximamente!!");
					
					break;
				case 5: 
					//JOptionPane.showMessageDialog(null,"Opci�n 5, pr�ximamente!!");
					
					break;	
				case 6: 
					//JOptionPane.showMessageDialog(null,"Opci�n 6, pr�ximamente!!");
					
					break;	
				case 0: 
					JOptionPane.showMessageDialog(null,"Hasta Luego, vuelve pronto!","Saludo", JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"N�mero no reconocido","Algo no ha ido bien...", JOptionPane.PLAIN_MESSAGE);
					break;
				}
							
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}		
		
	}

}
