package Tienda.src;

public class Disco extends Categoria {
	private int id;
	static int idStatic = 0;
	private String titulo;
	private String autor;
	private int stock;
	private int vendidos;
	private double precioneto;
	private final double iva = 21;
	private double precioIVA;
	
	public Disco(String categoria, String titulo, String autor, double precioneto, int stock) {
		super(categoria);
		this.id = idStatic;
		idStatic++;
		this.titulo = titulo;
		this.autor = autor;
		this.stock = stock;
		this.precioneto = precioneto;
		this.precioIVA = precioneto + (precioneto * iva /100);
		
	}
	
	public Disco() {
		
	}

	public Disco(String categoria, String titulo, String autor, int stock, int vendidos) {
		super(categoria);
		this.titulo = "Thriller";
		this.autor = "Michel Jackson";
		this.stock = 2;
		this.vendidos = 2;
	}

	public int getId() {
		return id;
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

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public int getVendidos() {
		return vendidos;
	}

	public void setVendidos(int vendidos) {
		this.vendidos = vendidos;
	}

	public double getPrecioneto() {
		return precioneto;
	}

	public void setPrecioneto(double precioneto) {
		this.precioneto = precioneto;
		this.precioIVA = precioneto + (precioneto * iva /100);
	}

	public double getPrecioIVA() {
		return precioIVA;
	}



	public double getIva() {
		return iva;
	}
	
	
	
	
	

}
