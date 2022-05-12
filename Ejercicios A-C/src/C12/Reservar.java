package C12;

//import model.avion;

public class Reservar {
	avion miAvion = new avion();
	
	public byte consultaPlazasPrime() {
	
		return miAvion.getPlazasPrime();
	}

	public byte consultaReservasPrime() {
		return miAvion.getReservasPrime();
	}
	
	public byte consultaPlazasEco() {
		return miAvion.getPlazasEco();
	}
	public byte consultaReservasEco() {
		return miAvion.getReservasEco();
	}
	
	public byte reservarPlazaPrime(byte rPri) {
		
		miAvion.setPlazasPrime((byte) (miAvion.getPlazasPrime() - rPri));
		miAvion.setReservasPrime((byte) (miAvion.getReservasPrime() + rPri));
		
		return miAvion.getPlazasPrime();
	}
	public byte reservarPlazaEco(byte rEco) {
		
		miAvion.setPlazasEco((byte) (miAvion.getPlazasEco() - rEco));
		miAvion.setReservasEco((byte) (miAvion.getReservasEco() + rEco));
		
		return miAvion.getPlazasEco();
	}
}
