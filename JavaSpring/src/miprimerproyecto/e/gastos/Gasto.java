package miprimerproyecto.e.gastos;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 17 UNA CLASE QUE VA CREAR LOS GASTOS
 * @author Usuario
 *
 */
public class Gasto {

	//18 LAS PROPIEDADES PARA EL GASTO
	private final Categoria categoria;
	private double gasto;
	private ZonedDateTime fecha;

	//19 EL CONSTRUCTOR
	public Gasto(Categoria categoria, double gasto, ZonedDateTime fecha) {
		this.categoria = categoria;
		this.gasto = gasto;
		this.fecha = fecha;
	}

	//20 LOS GETTERS SETTERS
	public double getGasto() {
		return gasto;
	}

	//21 EL SET GASTO PERO QUE NO DEBERIAMOS TENER QUE UTILIZAR EN ESE CASO
	public void setGasto(double gasto) {
		if (gasto < 0) {
			System.err.println("Operación no autorizada");
		} else {
			System.out.println("Operación autorizada");
			this.gasto = gasto;
		}
	}

	//22 LA FECHA CON FORMATO Y QUE DEVOLVERÁ UN STRING
	public String getFecha() {
		DateTimeFormatter esDateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
		return fecha.format(esDateFormat);
	}

	public void setFecha(ZonedDateTime fecha) {
		this.fecha = fecha;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	
	//23 PISAMOS EL TOSTRING
	@Override
	public String toString() {
		return "Gasto de " + categoria.getCategoria() + ": " + gasto + ", realizado el " + getFecha() + "\n";
	}
	
	public static enum Categoria {

		// 1 - HAGO LA LISTA ENUM
		PARKIN("Parking"), 
		RESTAU("Servicio restauración"), 
		COMPRA("Compra material fungible"), 
		GASOIL("Carburante");
		

		/**
		 * 2 HAGO UN MÉTODO PARA QUE SE ME CREA LA ENUMERACIÓN DE CATEGORIAS
		 */
		private Categoria(String nombre) {
			this.categoria = nombre;
		}

		// 3 - HAGO LA ÚNICA PROPIEDAD
		private String categoria;
		//final static private int numCategorias = 4;

		//4 HAGO LOS MÉTODOS GETTER PARA LEER CATEGORIAS
//		public static int getNumCategorias() {
//			return numCategorias;
//		}	

		public String getCategoria() {
			return categoria;
		}

		/**
		 * 5 HAGO EL MÉTODO PARA COMUNICAR AL SISTEMA LA CATEGORIA 
		 * CON LA QUIERO TRABAJAR
		 * 
		 * @param titulo
		 * @return
		 */
		public static Categoria getTitulo(String titulo) {
			switch (titulo) {
			case ("Parking"):
				return Categoria.PARKIN;
			case ("Servicio restauración"):
				return Categoria.RESTAU;
			case ("Compra material fungible"):
				return Categoria.COMPRA;
			case ("Carburante"):
				return Categoria.GASOIL;
			default:
				return Categoria.PARKIN;

			}
		}
		
		

	}


}
