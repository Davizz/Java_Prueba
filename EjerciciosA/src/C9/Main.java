package C9;


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
						"   1. Conversor Libras a Kilogramos\n" +
						"   2. P�liza de Seguro\n" +
						"   3. Rangos de N�meros\n" +
						"   4. Comparador de palabras\n" +
						"   5. C�lculo de Calor�as\n" +
						"\n   0. Salir \n" +
						"__________________________________________\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
				
				select = Integer.parseInt(lectura); 
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opci�n 1, pr�ximamente!!");		
					misMetodos.C9_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opci�n 2, pr�ximamente!!");
					misMetodos.C9_2();
					break;
				case 3: 
					//JOptionPane.showMessageDialog(null,"Opci�n 3, pr�ximamente!!");
					misMetodos.C9_3();
					break;
				case 4: 
					//JOptionPane.showMessageDialog(null,"Opci�n 4, pr�ximamente!!");
					misMetodos.C9_4();
					break;
				case 5: 
					//JOptionPane.showMessageDialog(null,"Opci�n 5, pr�ximamente!!");
					misMetodos.C9_5();
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
