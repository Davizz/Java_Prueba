package miprimerproyecto.f.ej17;

public class ProductoDisponible {

	/*
	 * La información disponible acerca de los productos de la clase
	 * ProductoDisponible se limitará a: - su nombre ej: pantalón verde, camisa
	 * roja... - su precio sin IVA. - Su IVA double y final,
	 */
	private String nombre;
	private double precioSinIva;
	final public double IVA;
	private int id; 
	static int staticId = 0; 

	public ProductoDisponible(String nombre, double precioSinIva, double iVA) {
		this.nombre = nombre;
		this.precioSinIva = precioSinIva;
		IVA = iVA;
		this.id = staticId;
		staticId++;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecioSinIva() {
		return precioSinIva;
	}

	public void setPrecioSinIva(double precioSinIva) {
		this.precioSinIva = precioSinIva;
	}

	public double getIVA() {
		return IVA;
	}
	
	

	public int getId() {
		return id+1;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return getId()+ "----------" + getNombre() + "---------->" + getPrecioSinIva() + "€ (+ " + getIVA() + " € de IVA)\n";
	}

}
