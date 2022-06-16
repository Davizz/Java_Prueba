package herenciaxml;

public class Libro extends Producto implements Editorial{

	private String autor;
	

	public Libro() {
	
	}
	public Libro(String nombre, double precio) {
		super(nombre, precio);
	}

	public Libro(String nombre, double precio, String autor) {
		super(nombre, precio);
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return super.toString() + "</br>AUTOR: " + getAutor() + "</br>EDITORIAL: " + getEditorial();
	}
	@Override
	public String getEditorial() {
		return "ANAYA Multimedia";
	}
	
}
