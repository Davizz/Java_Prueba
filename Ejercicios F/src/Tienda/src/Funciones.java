package Tienda.src;

import javax.swing.JOptionPane;

import utilidades.Menu;





public class Funciones {
	byte select = -1;
	static Gestion miGestion = new Gestion();
	
	
	
	public void miTienda() {
		miGestion.cargarDiscosIniciales();
		Menu menu = new Menu();
		String[] opcionesMenu = {"1. Listado de Discos", "2. Añadir Discos", "3. Modificar Precio", "4. Comprar Discos", "5. Ver Discos Comprados"};
		
		while(select != 0){
			
			try{
				select = menu.miMenu(opcionesMenu);
				
				
				switch(select){
				case 1: 
					JOptionPane.showMessageDialog(null, 
							miGestion.listarDiscos(), "LISTADO DE DISCOS", JOptionPane.PLAIN_MESSAGE);
					break;
				case 2: 
					miGestion.addDiscos();
					break;
				case 3: 
					miGestion.ModifDiscos();
					break;
				case 4: 
					miGestion.addProductosCarrito();
					break;
				case 5: 
					JOptionPane.showMessageDialog(null,
							miGestion.verCarrito(), "LISTADO DE DISCOS COMPRADOS", JOptionPane.PLAIN_MESSAGE);
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
