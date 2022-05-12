package E16;

public class Cliente {
	public String nombre = "MANUEL";
	public String apellido1 = "GARCIA";
	public String apellido2 = "SANCHEZ";
	public String email = "cliente@gmail.com";
	public int tfno = 600777555;
	public String dni = "30.000.123R";
	public String iban = "ES34-5555-3333-77-1234567890";
	public double saldo = 10500.85;
	public String divisa = "€";
	public int transacciones = 20;
	
	public Cliente() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTfno() {
		return tfno;
	}

	public void setTfno(int tfno) {
		this.tfno = tfno;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getTransacciones() {
		return transacciones;
	}

	public void setTransacciones(int transacciones) {
		this.transacciones = transacciones;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	
	
	
	
	
}
