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
						//"   3. Opci�n 3\n" +
						//"   4. Opci�n 4\n" +
						//"   5. Opci�n 5\n" +
						//"   6. Opci�n 6\n" +
						"\n   0. Salir \n" +
						"__________________________________________\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
				
				select = Integer.parseInt(lectura); 
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opci�n 1, pr�ximamente!!");		
					misMetodos.C12_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opci�n 2, pr�ximamente!!");
					misMetodos.C12_2();
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
