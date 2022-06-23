package F23;

public class Futbolista extends Socio {

	private String puesto;

	public Futbolista(String nombre, int edad, int telefono, String email, String puesto) {
		super(nombre, edad, telefono, email);
		this.puesto = puesto;
	}

	public Futbolista(String nombre, int edad, int telefono, String email) {
		super(nombre, edad, telefono, email);
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return super.toString() + "Puesto de Futbolista: " + getPuesto() + "\n";
	}
	
}
