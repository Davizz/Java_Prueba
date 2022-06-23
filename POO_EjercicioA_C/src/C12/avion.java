package C12;

public class avion {
	private byte plazasPrime = 5;
	private byte plazasEco = 5;
	
	private byte reservasPrime;
	private byte reservasEco;
	
	public avion(byte plazasPrime, byte plazasEco, byte reservasPrime, byte reservasEco) {
		super();
		this.plazasPrime = plazasPrime;
		this.plazasEco = plazasEco;
		this.reservasPrime = reservasPrime;
		this.reservasEco = reservasEco;
	}

	public avion() {
		super();
	}

	public byte getPlazasPrime() {
		return plazasPrime;
	}

	public void setPlazasPrime(byte plazasPrime) {
		this.plazasPrime = plazasPrime;
	}

	public byte getPlazasEco() {
		return plazasEco;
	}

	public void setPlazasEco(byte plazasEco) {
		this.plazasEco = plazasEco;
	}

	public byte getReservasPrime() {
		return reservasPrime;
	}

	public void setReservasPrime(byte reservasPrime) {
		this.reservasPrime = reservasPrime;
	}

	public byte getReservasEco() {
		return reservasEco;
	}

	public void setReservasEco(byte reservasEco) {
		this.reservasEco = reservasEco;
	}

	
	
}
