package C8;

import javax.swing.JOptionPane;


public class Main {
	static String pedir;
	static int select = -1; 
	public static void main(String[] args) {
		
		Funciones misMetodos = new Funciones();
		
		while(select != 0){
		
			try{
				String lectura = JOptionPane.showInputDialog(null,
						"======================================\n"+
						"   ELIGE OPCION:\n"+
						"======================================\n\n"+								
						"   1.  Conversor de Moneda\n" +
						"   2.  A�o Bisiesto\n" +
						"   3.  Separador de n�meros\n" +
						"   4.  Grado conseguido\n" +
						"   5.  N�mero Inverso\n" +
						"   6.  Valor absoluto de un n�mero\n" +
						"   7.  Comparar Dos n�meros\n" +
						"   8.  Operaciones Combinadas\n" +
						"   9.  N�mero capicua\n" +
						//"   10. Opci�n 10\n" +

						"\n   0. Salir \n" +
						"======================================\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
				
				select = Integer.parseInt(lectura); 
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opci�n 1");		
					misMetodos.C8_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opci�n 2");
					misMetodos.C8_2();
					break;
				case 3: 
					//JOptionPane.showMessageDialog(null,"Opci�n 3");
					misMetodos.C8_3();
					break;
				case 4: 
					//JOptionPane.showMessageDialog(null,"Opci�n 4");
					misMetodos.C8_4();
					break;
				case 5: 
					//JOptionPane.showMessageDialog(null,"Opci�n 5");
					misMetodos.C8_5();
					break;
				case 6: 
					//JOptionPane.showMessageDialog(null,"Opci�n 6");
					misMetodos.C8_6();
					break;
				case 7: 
					//JOptionPane.showMessageDialog(null,"Opci�n 7");
					misMetodos.C8_7();
					break;
				case 8: 
					//JOptionPane.showMessageDialog(null,"Opci�n 8");
					misMetodos.C8_8();
					break;
				case 9: 
					//JOptionPane.showMessageDialog(null,"Opci�n 9");
					misMetodos.C8_9();
					break;
				case 10: 
					//JOptionPane.showMessageDialog(null,"Opci�n 10");
					misMetodos.C8_10();
					//break;
				case 0: 
					JOptionPane.showMessageDialog(null,"Hasta Luego, vuelve pronto!","Saludo", JOptionPane.PLAIN_MESSAGE);
					break;
				default:
					JOptionPane.showMessageDialog(null,"N�mero no reconocido","Algo no ha ido bien...", JOptionPane.PLAIN_MESSAGE);
					break;
				}
					
				
					
			}
			catch(Exception e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}		

	}

}
