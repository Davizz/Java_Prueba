package E16_Mio;

import javax.swing.JOptionPane;

public class Usuariomio {

	public String dni;
	public String nombre_apellido;
	public String contrasena;
	public double saldo;
	public int num_cuenta;
	
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNum_cuenta() {
		return num_cuenta;
	}

	public void setNum_cuenta(int num_cuenta) {
		this.num_cuenta = num_cuenta;
	}

	// Source - Generate Constructors using fields
	
	
	// Source - Generate Constructors using fields (sin campos)
	public Usuariomio() {
		
	}
	public Usuariomio(String dni, String nombre_apellido, String contrasena, double saldo, int num_cuenta) {
		
		this.dni = dni;
		this.nombre_apellido = nombre_apellido;
		this.contrasena = contrasena;
		this.saldo = saldo;
		this.num_cuenta = num_cuenta;
	}

	// Source - Generate GETTERS and SETTERS
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	public  double ingresarDinero(){
		
		double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Ingresar un valor:"));
		
		
		return saldo + cantidad;
	
}

	@Override
	public String toString() {
		return "[El cliente con DNI " + dni + ", nombre y apellido" + nombre_apellido + ", tiene un saldo de " + saldo + ", y un numero de cuenta " + num_cuenta + "]";
	}
	
}

	