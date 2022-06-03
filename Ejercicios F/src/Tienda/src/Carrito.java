package Tienda.src;

public class Carrito extends Categoria {
	private int idcarrito;
	static int idestatico = 0;
	private int idDisco;
	private String titDisco;
	private String autDisco;
	private double precioDisco;
	private double ivaDisco;
	private double ImpivaDisco;
	private int cantidad;
	private double importe;
	
	public Carrito() {
		super();
	}
	
	
	public Carrito(String categoria, int idDisco, String titDisco, String autDisco, double precioDisco, int cantidad, double ivaDisco) {
		super(categoria);
		this.idDisco = idDisco;
		this.titDisco = titDisco;
		this.autDisco = autDisco;
		this.precioDisco = precioDisco;
		this.cantidad = cantidad;
		this.ivaDisco = ivaDisco;
		this.ImpivaDisco = (precioDisco * cantidad * ivaDisco / 100);
		this.importe = (precioDisco * cantidad) + ImpivaDisco;
		this.idcarrito = idestatico;
		idestatico++;
	}
	

	public int getIdDisco() {
		return idDisco;
	}


	public void setIdDisco(int idDisco) {
		this.idDisco = idDisco;
	}


	public String getTitDisco() {
		return titDisco;
	}
	public void setTitDisco(String titDisco) {
		this.titDisco = titDisco;
	}
	public String getAutDisco() {
		return autDisco;
	}
	public void setAutDisco(String autDisco) {
		this.autDisco = autDisco;
	}
	public double getPrecioDisco() {
		return precioDisco;
	}
	public void setPrecioDisco(double precioDisco) {
		this.precioDisco = precioDisco;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}


	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
		this.ImpivaDisco = (precioDisco * cantidad * ivaDisco / 100);
		this.importe = (precioDisco * cantidad) + ImpivaDisco;
	}


	public int getIdcarrito() {
		return idcarrito;
	}


	public void setIdcarrito(int idcarrito) {
		this.idcarrito = idcarrito;
	}


	public double getIvaDisco() {
		return ivaDisco;
	}


	public void setIvaDisco(double ivaDisco) {
		this.ivaDisco = ivaDisco;
	}


	public double getImpivaDisco() {
		return ImpivaDisco;
	}


	public void setImpivaDisco(double impivaDisco) {
		ImpivaDisco = impivaDisco;
	}
	
	

}
