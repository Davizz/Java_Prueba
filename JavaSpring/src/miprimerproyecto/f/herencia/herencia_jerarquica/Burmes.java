package miprimerproyecto.f.herencia.herencia_jerarquica;

public class Burmes extends Gato {
	
	//27

	public Burmes(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}

	public Burmes() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Estás viendo a un gato burmés.\n" + super.toString();
	}

}
