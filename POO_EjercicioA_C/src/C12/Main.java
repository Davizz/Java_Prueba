package C12;


import javax.swing.JOptionPane;

public class Main {
	static String pedir;
	
	static int select = -1; 
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		while(select != 0){
		
			try{
				String lectura = JOptionPane.showInputDialog(null,
						"=========================================\n"+
						"   ELIGE OPCION:\n"+	
						"=========================================\n"+	
						"   1. Validaciones con Expresiones Regulares\n" +
						"   2. Reservas de Vuelo\n" +
						//"   3. Opción 3\n" +
						//"   4. Opción 4\n" +
						//"   5. Opción 5\n" +
						//"   6. Opción 6\n" +
						"\n   0. Salir \n" +
						"__________________________________________\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
				
				select = Integer.parseInt(lectura); 
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opción 1, próximamente!!");		
					misMetodos.C12_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opción 2, próximamente!!");
					misMetodos.C12_2();
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
