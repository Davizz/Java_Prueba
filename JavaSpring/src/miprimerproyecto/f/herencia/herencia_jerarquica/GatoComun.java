package miprimerproyecto.f.herencia.herencia_jerarquica;

public class GatoComun extends Gato {
	
	//26

	public GatoComun(int patas, int ojos) {
		super(patas, ojos);
		// TODO Auto-generated constructor stub
	}

	public GatoComun() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Estás viendo a un gato común europeo.\n" + super.toString();
	}

}
