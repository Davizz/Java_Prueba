package miprimerproyecto.c;

public class Coche {
	
	String color; 
	String marca; 
	int codigo;
	static int id = 1; 

	public Coche(String color, String marca) {
		this.color = color; 
		this.marca = marca;
		this.codigo = id++; 
		
	}

	@Override
	public String toString() {
		return "El coche nº " + codigo + " es " + 
	color + " y de marca " + marca;
	}	
	
	public String devolverDescripcion() {
		return "El coche nº " + codigo + " es " + 
	color + " y de marca " + marca;
	}
	


}
