package F19;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Validar Datos", "2. Trabajar con el Tiempo"};
		
		while(select != 0){
		
			try{
				select = menu.miMenu(opcionesMenu);
		
				
				switch(select){
				case 1: 		
					misMetodos.F19_1();
					break;
				case 2: 
					misMetodos.F19_2();
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
