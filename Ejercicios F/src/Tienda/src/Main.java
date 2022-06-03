package Tienda.src;


import javax.swing.JOptionPane;

import utilidades.*;

public class Main {
	static String pedir;
	static byte select = -1;
	public static void main(String[] args) {
		
		
		
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Tienda de Discos"};
		
		while(select != 0){
		
			try{
				Funciones misMetodos = new Funciones();
				select = menu.miMenu(opcionesMenu);
				
				switch(select){
				case 1: 
					misMetodos.miTienda();
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
