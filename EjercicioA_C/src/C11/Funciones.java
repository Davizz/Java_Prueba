package C11;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Funciones {
	static int salir = -1; 
	static String msj = "";
	static String Titulo = "";
	static String item = "";
	

	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	
	/*
	 * Ej C11_1
		Crear un arreglo con las distintas mesas de alumnos de la clase e 
		imprimirlas usando un bucle for con el m�todo printf en una frase que pone: 
		�La mesa n�mero NUMERO est� compuesta por NOMBRE Y NOMBRE.\n� y 
		d�nde los NOMBRES son los valores del arreglo y el N�MERO sus �ndices. 

	 */
	
	/*
	 * String Tabla[][]= {{"a","b","c"},
							   {"d","e","f"}};
			System.out.println("N�mero de L�neas "+Tabla.length);
			System.out.println("N�mero de Columnas "+Tabla[0].length);
			for (int lin=0;lin<Tabla.length;lin++) {
				for (int col=0;col<Tabla[lin].length;col++) {
					System.out.println(Tabla[lin][col]);
				}
			}
	 */
	public void C11_1() {
		salir = -1;
		String MiClase[][] = {{"F1a1","F1a2","F1a3","F1a4"},
							{"F2a1","F2a2","F2a3","F2a4"},
							{"F3a1","F3a2","F3a3","F3a4"},
							{"F4a1","F4a2","F4a3","F4a4"},
							{"F5a1","F5a2","F5a3","F5a4"}};
		while (salir !=1) {
			
				for(int fila=0; fila<MiClase.length; fila++) {
					msj = msj + "La mesa n�mero "+(fila+1)+" est� compuesta por los alumnos :\n";
					for (int col=0; col<MiClase[0].length; col++) {
						msj = msj + MiClase[fila][col]+", ";
						//Con Printf
						//System.out.printf("Alumno %s", MiClase[fila][col]+"\n");
					}
					msj=msj.substring(0, msj.length()-2);
					msj=msj+"\n";
				}
				
				
				JOptionPane.showMessageDialog(null,
						msj,"Alumnos del Curso de Java en C2B", JOptionPane.PLAIN_MESSAGE);
				
				//volver a ejecutar
				salir = JOptionPane.showConfirmDialog(null, "�Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
		}			
		
	}
	/*
	 * Ej C11_2
		Pedir al usuario que escoja un mes e imprimir en pantalla (con Swing) una frase que pone �en MES hay TANTOS d�as�.

	 */
	public void C11_2() {
		salir = -1;
		
		int DiasMes[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		String TMeses[] = {"ENERO","FEBRERO","MARZO","ABRIL","MAYO","JUNIO",
			      "JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
		while (salir !=1) {
			msj="";	
			String Meses = (JOptionPane.showInputDialog(null,"Selecciona un Mes: ", "Meses del A�o", 
					JOptionPane.PLAIN_MESSAGE, null,
					TMeses ,"Selecciona")).toString();
			for (int i=0; i<TMeses.length;i++) {
				if (Meses==TMeses[i]) {
					msj = msj + Meses + " tiene "+DiasMes[i]+" d�as.";
				}
			}
			
				
			JOptionPane.showMessageDialog(null,
					msj,"Meses del A�o", JOptionPane.PLAIN_MESSAGE);
			
			//volver a ejecutar
			salir = JOptionPane.showConfirmDialog(null, "�Otra vez?", "Alerta!", JOptionPane.YES_NO_OPTION);
		}			
				
	}
	/*
	 * Ej C11_3 
		Listar unos cuantos lenguajes de programaci�n de POO conocidos y, a continuaci�n, 
		realizar una serie de acciones sobre la lista:  
		Insertar el elemento � Pascal � en primera posici�n en el ArrayList.
		Imprimir en pantalla el tercer elemento de la lista. 
		Reemplazar el 3 elemento por Cobol. 
		Buscar el elemento Java en la lista. Si existe, imprimir su posici�n. 
		Buscar el elemento Html en la lista. Si no existe, indicarlo en pantalla. 

	 */
	public void C11_3() {
		msj="";
		List<String> LenguajesPOO = new ArrayList<String>();
		
		LenguajesPOO.add("JAVA");
		LenguajesPOO.add("PYTHON");
		LenguajesPOO.add("VB .NET");
		LenguajesPOO.add("C#");
		LenguajesPOO.add("PHP");
		LenguajesPOO.add("RUBY");
		LenguajesPOO.add("KOTLIN");
		LenguajesPOO.add("SCALA");
		
		LenguajesPOO.forEach(Lenguajes -> msj = msj + Lenguajes+", \n");
		Titulo = "Lenguajes de Programaci�n POO";
		MensajePantalla(msj,Titulo, true);
		
		msj = "Insertar el elemento � Pascal � en primera posici�n del ArrayList";
		Titulo = "EJERCICIO - 1 -";
		MensajePantalla(msj,Titulo, false);		
		
		msj="";
		LenguajesPOO.add(0, "PASCAL");
		LenguajesPOO.forEach(Lenguajes -> msj = msj + Lenguajes+", \n");
		
		MensajePantalla(msj,Titulo, true);
		
		msj="";
		msj = "Imprimir en pantalla el 3er. Elemento de la lista.";
		Titulo = "EJERCICIO - 2 -";
		MensajePantalla(msj,Titulo, false);
		
		msj="3er. Elemento de la Lista es = "+LenguajesPOO.get(2)+"\n";
		LenguajesPOO.forEach(Lenguajes -> msj = msj + Lenguajes+", \n");
		
		MensajePantalla(msj,Titulo, true);
		
		msj="";
		msj="Reemplazar el 3er. Elemento por � Cobol �";
		Titulo = "EJERCICIO - 3 -";
		MensajePantalla(msj,Titulo, false);
		
		msj="";
		LenguajesPOO.remove(2);
		LenguajesPOO.add(2, "COBOL");
		msj="Modificado 3er. Elemento por = "+LenguajesPOO.get(2)+"\n";
		LenguajesPOO.forEach(Lenguajes -> msj = msj + Lenguajes+", \n");
		
		MensajePantalla(msj,Titulo, true);
		
		msj=""; item="JAVA";
		msj="Buscar el elemento "+item+" en la lista. Si existe, imprimir su posici�n.";
		Titulo = "EJERCICIO - 4 -";
		MensajePantalla(msj,Titulo, false);
		
		msj="";
		msj="Buscamos el elemento "+item+" en la lista\n";
		msj=msj + (LenguajesPOO.contains(item)?"El elemento "+item+" EXISTE en la posici�n "+LenguajesPOO.indexOf(item):"El elemento "+item+" NO EXISTE");
		
		MensajePantalla(msj,Titulo, false);	
		
		msj=""; item="HTML";
		msj="Buscar el elemento "+item+" en la lista. Si existe, imprimir su posici�n.";
		Titulo = "EJERCICIO - 5 -";
		MensajePantalla(msj,Titulo, false);
		
		msj="";
		msj="Buscamos el elemento "+item+" en la lista\n";
		msj=msj + (LenguajesPOO.contains(item)?"El elemento "+item+" EXISTE en la posici�n "+LenguajesPOO.indexOf(item):"El elemento "+item+" NO EXISTE");
		
		MensajePantalla(msj,Titulo, false);	
	}
	public void MensajePantalla(String Mensaje, String Tit, boolean quitarComa) {
		if (quitarComa) {
			//Quitar la coma del �ltimo elemento
			msj=msj.substring(0, msj.length()-3);
		}		
		JOptionPane.showMessageDialog(null,
			msj,Tit, JOptionPane.PLAIN_MESSAGE);
	}
	
	/*
	 * Ej C11_4
		Corregir el c�digo siguiente para que pueda compilar: 
		import java.util.List;
		import java.util.Arraylist;
		
		public class Main
		{
		    public static void main(String[] args)
		    {
		        List<String> persons = new ArrayList<String>();
				
		        String[] employee = {"Alex", "Thomas", "Bob", "Yohan"};
				
		        for (int i = 0; i <= employee.length; i++)
	        {
	            persons.add(employee[i]);
	        }
			
	        System.out.println(persons);
	    }		

	 */
	public void C11_4() {
		msj="";
		List<String> persons = new ArrayList<String>();
		String[] employee = {"Alex", "Thomas", "Bob", "Yohan"};
			
		for (int i = 0; i < employee.length; i++) {
			persons.add(employee[i]);
			msj = msj + persons.get(i)+", ";
        }
		
		//Quitar la coma del �ltimo elemento
		msj=msj.substring(0, msj.length()-2);
		
	    JOptionPane.showMessageDialog(null,
	        		msj,"List de Empleados", JOptionPane.PLAIN_MESSAGE);
        
	    //System.out.println(persons);
	}

	
}
