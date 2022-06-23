package F23;

public class Musico extends Socio {

	private String especialidad;

	public Musico(String nombre, int edad, int telefono, String email, String especialidad) {
		super(nombre, edad, telefono, email);
		this.especialidad = especialidad;
	}

	public Musico(String nombre, int edad, int telefono, String email) {
		super(nombre, edad, telefono, email);
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return super.toString() + "Especialidad en Música: " + getEspecialidad() + "\n";
	}
	
}
