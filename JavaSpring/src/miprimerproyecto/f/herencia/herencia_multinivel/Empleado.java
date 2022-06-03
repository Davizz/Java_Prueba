package miprimerproyecto.f.herencia.herencia_multinivel;

public class Empleado extends Persona {
	//21
	
	private String emailEmpresa; 
	private int telEmpresa;	

	public Empleado(String nombre, int edad, String emailEmpresa, int telEmpresa) {
		super(nombre, edad);
		this.emailEmpresa = emailEmpresa;
		this.telEmpresa = telEmpresa;
	}
	
	

	@Override
	public String toString() {
		return super.toString() +"Actualmente está trabajando. .\nSi quieres contactarle le puedes llamar ahora a la oficina al " + getTelEmpresa() + " o enviarle un email a " + getEmailEmpresa() + ".\n";
	}



	public String getEmailEmpresa() {
		return emailEmpresa;
	}

	public void setEmailEmpresa(String emailEmpresa) {
		this.emailEmpresa = emailEmpresa;
	}

	public int getTelEmpresa() {
		return telEmpresa;
	}

	public void setTelEmpresa(int telEmpresa) {
		this.telEmpresa = telEmpresa;
	}
	
	
	
	

}
