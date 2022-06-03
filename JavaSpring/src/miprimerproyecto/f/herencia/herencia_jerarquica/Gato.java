package miprimerproyecto.f.herencia.herencia_jerarquica;

public class Gato {
	
	//24
	private int patas; 
	private int ojos; 
	
	

	public Gato(int patas, int ojos) {
		this.patas = patas;
		this.ojos = ojos;
	}

	public Gato() {
		// TODO Auto-generated constructor stub
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	public int getOjos() {
		return ojos;
	}

	public void setOjos(int ojos) {
		this.ojos = ojos;
	}

	@Override
	public String toString() {
		return "Ese gato tiene " + getPatas() + " patas y " + getOjos() + " ojos";
	}
	
	
	
	

}
