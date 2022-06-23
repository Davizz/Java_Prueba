package F23;

public class Socio extends Persona {

	private int telefono;
	private String email;
	
	public Socio(String nombre, int edad, int telefono, String email) {
		super(nombre, edad);
		this.telefono = telefono;
		this.email = email;
	}

	public Socio(String nombre, int edad) {
		super(nombre, edad);
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return super.toString() + "Teféfono del Socio: " + getTelefono() + ", Email Socio: " + getEmail() + "\n";
	}

	

}
