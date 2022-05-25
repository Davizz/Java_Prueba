package disco;

public class Disco {
	public String titulo;
	public String autor;
	public int ejemplares;
	public double precio_sinIva;
	private final double IVA = 0.13;
	static int contador = 1;
	public int id;
	
	public Disco(String titulo, String autor, int ejemplares, double precio_sinIva) {
		id = contador;
		contador ++;
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.ejemplares = ejemplares;
		this.precio_sinIva = precio_sinIva;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		this.ejemplares = ejemplares;
	}

	public double getPrecio_sinIva() {
		return precio_sinIva;
	}

	public void setPrecio_sinIva(double precio_sinIva) {
		this.precio_sinIva = precio_sinIva;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		Disco.contador = contador;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getIVA() {
		return IVA;
	}

	@Override
	public String toString() {
		return "Disco [titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", precio_sinIva="
				+ precio_sinIva + ", IVA=" + IVA + ", id=" + id + ", getTitulo()=" + getTitulo() + ", getAutor()="
				+ getAutor() + ", getEjemplares()=" + getEjemplares() + ", getPrecio_sinIva()=" + getPrecio_sinIva()
				+ ", getId()=" + getId() + ", getIVA()=" + getIVA() + "]";
	}
	
		
	

}
