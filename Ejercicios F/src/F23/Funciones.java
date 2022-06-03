package F23;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;



public class Funciones {
	
	/* Tarea F23
		Un centro de ocio está proponiendo a sus socios que participen a 3 actividades: Judo, Fútbol y Música. 
		Tienes que crear: 
		la superclase Persona dotadas de las propiedades nombre y edad. 
		la clase Socio con las propiedades email y teléfono que hereda de Persona.  
		Y a continuación, 3 subclases finales que heredan de la clase Socio. 
		Judoca con la propiedad color del cinturón.
		Futbolista con la propiedad puesto. 
		Y Musico con la propiedad especialidad.   
		
		crear una lista con 3 personas. 1 de cada una de las actividades propuestas por el centro de ocio. 
		Haz un casting con los socios para poder acceder a la propiedad de la subclase que corresponde a su actividad y imprímelo en pantalla. 
	 */
	public void F23_1() {
		String msj = "";
		
		Persona JoseMari = new Judoca("José María", 25, 600300400, "JoseMari@Gmail.com", "Rojo"); 
		Persona Roberto = new Futbolista("Roberto", 30, 655332211, "Roberto@Gmail.com", "Delantero"); 
		Persona Gorka = new Musico("Gorka", 27, 633224466, "Gorka@Gmail.com", "Trompetista"); 
		
		ArrayList<Persona> personas = new ArrayList<Persona>(Arrays.asList(JoseMari, Roberto, Gorka));
		
		for (Persona per : personas) {
			msj = msj + per +"\n\n";
		}
		
		
		JOptionPane.showMessageDialog(null, msj, "CENTRO DE OCIO - LISTADO DE SOCIOS", JOptionPane.PLAIN_MESSAGE);
		
		
		
	}
	
}
