package F18_Rafa;

import java.text.SimpleDateFormat;
import java.util.Date;

//import java.util.Calendar;

public class Libro {
	 
	private int isbn;
	private String titulo;
	private String autor;
	private int AApublicacion;
	private String prestado;
	private Date Fprestamo;
	private String estado;

	public Libro() {
		super();
	}

	public Libro(int isbn, String titulo, String autor, int AApublicacion, Object prestado, Date Fprestamo, Object estado) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.AApublicacion = AApublicacion;
		this.prestado = (String) prestado;
		this.Fprestamo = Fprestamo;
		this.estado = (String) estado;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
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

	public int getAApublicacion() {
		return AApublicacion;
	}

	public void setAApublicacion(int AApublicacion) {
		this.AApublicacion = AApublicacion;
	}

	public String isPrestado() {
		return prestado;
	}

	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}

	public Date getFprestamo() {
		return Fprestamo;
	}

	public void setFprestamo(Date Fprestamo) {
		this.Fprestamo = Fprestamo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Libro con isbn: " + isbn + "\nTítulo: " + titulo + "nAutor: " + autor + 
				"\nAño de Publicación: " + AApublicacion + "\nEstá Prestado: " + prestado + 
				"\nFecha de Préstamo: " + new SimpleDateFormat("dd-MM-yyyy").format(Fprestamo) + "\nEstado: " + estado;
	}
	
	
	
}
