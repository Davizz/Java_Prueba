package F23;

public class Judoca extends Socio {
	private String ColorCinturon;

	public Judoca(String nombre, int edad, int telefono, String email, String colorCinturon) {
		super(nombre, edad, telefono, email);
		ColorCinturon = colorCinturon;
	}

	public Judoca(String nombre, int edad, int telefono, String email) {
		super(nombre, edad, telefono, email);
	}

	public String getColorCinturon() {
		return ColorCinturon;
	}

	public void setColorCinturon(String colorCinturon) {
		ColorCinturon = colorCinturon;
	}

	@Override
	public String toString() {
		return super.toString() + "Cinturón de Judoca Color: " + getColorCinturon() + "\n";
	}
	
	

}
