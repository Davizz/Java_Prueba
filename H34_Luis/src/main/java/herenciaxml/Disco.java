package herenciaxml;

public class Disco extends Producto {

	private String year;
	private Criticas nuevaCritica;
	private Discografica discograficaBizkaia; 
	
	public Disco() {
		
	}
	
	
	
	public Disco(String nombre, double precio) {
		super(nombre, precio);
		
	}
	
	public Disco(String nombre, double precio, String year, Criticas nuevaCritica) {
		super(nombre, precio);
		this.year = year;
		this.nuevaCritica = nuevaCritica;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return super.toString() + " </br>AÑO: " + getYear() + " </br>DISCOGRAFICA: " + getDiscograficaBizkaia().getDiscografica()
		+ "<br/>CRITICA: " + getNuevaCritica();
	}

	public Discografica getDiscograficaBizkaia() {
		return discograficaBizkaia;
	}

	public void setDiscograficaBizkaia(Discografica discograficaBizkaia) {
		this.discograficaBizkaia = discograficaBizkaia;
	}

	public Criticas getNuevaCritica() {
		return nuevaCritica;
	}

	public void setNuevaCritica(Criticas nuevaCritica) {
		this.nuevaCritica = nuevaCritica;
	}
	
	
	
	

}
