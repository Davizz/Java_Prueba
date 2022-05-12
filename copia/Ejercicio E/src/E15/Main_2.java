package E15;

import javax.swing.JOptionPane;

public class Main_2 {

	public static void main(String[] args) {

		Alumnos alumno1 = new Alumnos();
		try {
			alumno1.setNombre_apellido(JOptionPane.showInputDialog("Introduce el nombre del alumno: "));
			alumno1.setNivel(JOptionPane.showInputDialog("Introduce el nivel del alumno: "));
			alumno1.setNota_lengua(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de lengua: ")));
			alumno1.setNota_mate(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de matemáticas: ")));
			alumno1.setNota_natu(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de ciencias: ")));
			alumno1.setNota_soci(Double.parseDouble(JOptionPane.showInputDialog("Introduce la nota de sociales: ")));

			Alumnos alumno2 = new Alumnos("Jaime", "3", 5.6, 3.9, 8.7, 9.1);
			Alumnos alumno3 = new Alumnos("Jaime", "3", 6.6, 8.9, 0.7, 9.7);
			System.out.println(alumno1);
			System.out.println(alumno2.getMedia());
			
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "Error, no has ingresado números.", "Error", JOptionPane.ERROR_MESSAGE);
			System.exit(-1);
		}
	}

}
