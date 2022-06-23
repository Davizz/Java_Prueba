package model;

public class Barco {
	//públicas (String) nombre, (int) ancho, (int) longitud, (byte) plazas, (double) potencia y (int) altura
	public String nombre;
	public int ancho;
	public int longitud;
	public byte plazas;
	public double potencia;
	public int altura;
	public Barco(String nombre, int ancho, int longitud, byte plazas, double potencia, int altura) {
		super();
		this.nombre = nombre;
		this.ancho = ancho;
		this.longitud = longitud;
		this.plazas = plazas;
		this.potencia = potencia;
		this.altura = altura;
	}
	
	
	public Barco(int ancho, int longitud, int altura) {
		super();
		this.ancho = ancho;
		this.longitud = longitud;
		this.altura = altura;
	}


	public Barco(String nombre, double potencia) {
		super();
		this.nombre = nombre;
		this.potencia = potencia;
	}


	public Barco() {
		super();
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getAncho() {
		return ancho;
	}
	public void setAncho(int ancho) {
		this.ancho = ancho;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public byte getPlazas() {
		return plazas;
	}
	public void setPlazas(byte plazas) {
		this.plazas = plazas;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	
}
