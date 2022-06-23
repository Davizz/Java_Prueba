package E16;

import java.text.DecimalFormat;



import utilidades.*;

public class MisConsultas {
	Cliente miCliente = new Cliente();
	static DecimalFormat formateaDecimales = new DecimalFormat("###,###.##");
	static DecimalFormat formateaSINdecimales = new DecimalFormat("###,###");
	
	public double consultarSaldo() {
		return miCliente.getSaldo();
	}
	public String consultarDivisa() {
		return miCliente.getDivisa();
	}
	//consultar informaciones de cuenta (número de cuenta, saldo, transacciones del día)
	public String consultarInfoCuenta() {
		
		return  "Nº IBAN : " + miCliente.getIban()+"\n"+
		   	    "Saldo Cuenta = " + formateaDecimales.format(miCliente.getSaldo()) + " " + miCliente.getDivisa() +
				"Hoy ha realizado " + formateaSINdecimales.format(miCliente.getTransacciones()) + "Transaccione" + UtilidadPlural.EnPlural(miCliente.getTransacciones());
	}
	//consultar información acerca del titular de la cuenta (nombre, apellidos, email, teléfonos, DNI…).
	public String consultarInfoCliente() {
		
		return  "DNI : " + miCliente.getIban() + "\n" +
		   	    "NOMBRE : " + miCliente.getNombre() + "\n" +
				"APELLIDOS : " + miCliente.getApellido1() + " " + miCliente.getApellido2() + "\n" + 
				"EMAIL : " + miCliente.getEmail() + "\n" +
				"TELEFONO : " + miCliente.getTfno() + "\n";
	}
	
	public void ingresoCuenta(double importe) {
		miCliente.setSaldo(miCliente.getSaldo() + importe);
	}
	
	public void reintegroCuenta(double importe) {
		miCliente.setSaldo(miCliente.getSaldo() - importe);
	}
	
}
