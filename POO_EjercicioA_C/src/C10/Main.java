package C10;


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
						"   1. Tabla de Multiplicar\n" +
						"   2. Factorial de un n�mero positivo\n" +
						"   3. N�meros del 1 al 100\n" +
						"   4. PAR � IMPAR\n" +
						"   5. N�meros Primos del 1 al 1.000\n" +
						"   6. Tabla de Millas a Kilometros\n" +
						"\n   0. Salir \n" +
						"__________________________________________\n","MENU DE OPCIONES", JOptionPane.PLAIN_MESSAGE);
				
				select = Integer.parseInt(lectura); 
		
				
				switch(select){
				case 1: 
					//JOptionPane.showMessageDialog(null,"Opci�n 1, pr�ximamente!!");		
					misMetodos.C10_1();
					break;
				case 2: 
					//JOptionPane.showMessageDialog(null,"Opci�n 2, pr�ximamente!!");
					misMetodos.C10_2();
					break;
				case 3: 
					//JOptionPane.showMessageDialog(null,"Opci�n 3, pr�ximamente!!");
					misMetodos.C10_3();
					break;
				case 4: 
					//JOptionPane.showMessageDialog(null,"Opci�n 4, pr�ximamente!!");
					misMetodos.C10_4();
					break;
				case 5: 
					//JOptionPane.showMessageDialog(null,"Opci�n 5, pr�ximamente!!");
					misMetodos.C10_5();
					break;	
				case 6: 
					//JOptionPane.showMessageDialog(null,"Opci�n 6, pr�ximamente!!");
					misMetodos.C10_6();
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
