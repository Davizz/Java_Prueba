package miprimerproyecto.f.herencia.herencia_jerarquica;

public class Siames extends Gato {
	/*
	 * 25
	 * EJEMPLO DE HERENCIA ÚNICA 
	 * */

	public Siames() {
		// TODO Auto-generated constructor stub
	}
	

	public Siames(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Estás viendo a un siamés.\n" + super.toString() + "]";
	}
	
	

}
