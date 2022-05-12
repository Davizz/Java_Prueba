package excepciones;

import javax.swing.JOptionPane;

public class Intervales {

	public Intervales() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws ExcepcionPropia {

		try {
		int alturaCm = Integer.parseInt(
				JOptionPane.showInputDialog("Introduce tu altura en cm"));
		rango(alturaCm);
		}
		catch (ExcepcionPropia e) {
			JOptionPane.showMessageDialog(null,"Altura no valida");
			System.exit(-1);
		}
		JOptionPane.showMessageDialog(null,"Altura valida");

	}

	static void rango(int num) throws ExcepcionPropia {
		if ((num < 50) || (num > 250)) {
			throw new ExcepcionPropia("Esta altura no es válida");
		}
	}

}
