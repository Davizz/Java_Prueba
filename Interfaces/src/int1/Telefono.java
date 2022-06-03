package int1;

//1
public class Telefono implements InterfazCalculadora, InterfazInternet {

	//2
	public int numero;
	public String nombrePropietario;
	
	//3
	public Telefono(int numero, String nombrePropietario) {
		this.numero = numero;
		this.nombrePropietario = nombrePropietario;
	}

	//4
	//Métodos propios
	public String encenderTelefono(boolean encendido) {
		if (encendido) {
			return "Teléfono encendido";
		}
		return "teléfono apagado";
	}

	public String pasarLlamadas(int otroNumero) {
		return "Con este teléfono, estás pasando una llamada al número " + otroNumero;
	}
	
	//5
	//Getters / Setters
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}	

	//6
	@Override
	public String toString() {
		return "Este teléfono pertenece a " + getNombrePropietario() 
		+ " y tiene el número " + getNumero();
	}
	
	//7
	//Métodos sobreescritos de la interfaz
	@Override
	public String tieneInternet(boolean opcion) {
		if (opcion) {
			return "Este aparato tiene internet";
		}
		return "No tiene internet";
	}

	@Override
	public String tieneCalculadora(boolean opcion) {
		if (opcion) {
			return "Este aparato tiene integrado una calculadora";
		}
		return "No tiene ni siquiera una calculadora";
	}


}
