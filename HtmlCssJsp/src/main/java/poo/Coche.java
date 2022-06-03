package poo;

public class Coche {

	private String color;
	private String marca;
	private String modelo; 
	private int codigo;
	private static int id = 1;

	public Coche() {
		// CONSTRUCTOR POR DEFECTO
		this.color = "amarillo";
		this.marca = "Citroen";
		this.modelo = "DS";
		this.codigo = id++;
	}

	public Coche(String color, String marca, String modelo) {
		this.color = color;
		this.marca = marca;
		this.modelo = modelo;
		this.codigo = id++;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Me he comprado un coche fantástico";
	}
	
	public String getDescripcion() {
		return "Es " + getColor() + " de la marca " 
	+ getMarca() + " y de modelo " + getModelo() ; 
	}
	
	private String descripcion;  
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	

}
