package poo.poo_interfaces;


public class Vendedor implements Tareas {

	private String nombre;
	private double sueldo;

	private Tiendas tienda;

	public void setTienda(TiendaMadrid tienda) {
		this.tienda = tienda;
	}
	
	@Override
	public String getTareas() {
		// pisa el método de la interfaz
		return "Tiene que vender cosas para ganarse la vida.";
	}

	@Override
	public String getTienda() {
		// TODO Auto-generated method stub
		return tienda.getTienda();
	}

	/**
	 * Genera el constructor de la clase (Por defecto)
	 */
	public Vendedor() {

	}

	/**
	 * Genera otro constructor de la clase
	 */
	public Vendedor(String nombre, double sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}

	/**
	 * Genera otro constructor de la clase haciendo 
	 * inyección de dependencias
	 * en el caso de ya tener el objeto creado
	 */
	public Vendedor(TiendaMadrid tienda) {

		this.nombre = "Annie";
		this.sueldo = 3000;
		this.tienda = tienda;
	}
	
	public Vendedor(TiendaBilbao tienda) {

		this.nombre = "Annie";
		this.sueldo = 3000;
		this.tienda = tienda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Ha fichado el Vendedor con nombre " + getNombre() + ", \nsueldo " + getSueldo() + ", \nTareas: "
				+ getTareas() + "\n" + getTienda();
	}



}
