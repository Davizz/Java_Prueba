package miprimerproyecto.f.sobrecarga;

public class Animal {

	// 1 propiedades que podrían compartir animales
	private String raza;
	private String especie;
	private int esperanzaVida; // años
	private String clase;
	private String orden;
	private String familia;

	// 2 Contructores
	public Animal() {
	}

	public Animal(String raza, String especie, int esperanzaVida, String clase, String orden, String familia) {
		this.raza = raza;
		this.especie = especie;
		this.esperanzaVida = esperanzaVida;
		this.clase = clase;
		this.orden = orden;
		this.familia = familia;
	}

	public Animal(String raza, String especie) {
		this.raza = raza;
		this.especie = especie;
	}

	public Animal(String especie, String clase, String orden, String familia) {
		this.especie = especie;
		this.clase = clase;
		this.orden = orden;
		this.familia = familia;
	}

	// 3 No me deja hacer una copia de este constructor
	// Pues los parámetros son todos de String y ya tenemos uno así
//	public Animal(String raza, String especie, String orden, String familia) {
//		this.raza = raza;
//		this.especie = especie;
//		this.orden = orden;
//		this.familia = familia;
//	}

	// 4 Piso el toString de la clase Object
	@Override
	public String toString() {
		return "Información acerca del animal " + getRaza() + ":\nEspecie: " + getEspecie() + ", esperanza de vida: "
				+ getEsperanzaVida() + "\nClase: " + getClase() + ", orden: " + getOrden() + "\nfamilia: "
				+ getFamilia() + "\n\n";
	}

	// 5 Añado los GETTERS/SETTERS
	// Modifico los GETTERS
	public String getRaza() {
		if (raza == null) {
			return "Sin determinar";
		}
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// 6
	// Modifico la salida final y el tipo de dato
	public String getEsperanzaVida() {
		if (esperanzaVida == 0) {
			return "Sin determinar";
		}
		return esperanzaVida + " años";
	}

	public void setEsperanzaVida(int esperanzaVida) {
		this.esperanzaVida = esperanzaVida;
	}

	public String getClase() {
		if (clase == null) {
			return "Sin determinar";
		}
		return clase;
	}

	public void setClase(String clase) {
		this.clase = clase;
	}

	public String getOrden() {
		if (orden == null) {
			return "Sin determinar";
		}
		return orden;
	}

	public void setOrden(String orden) {
		this.orden = orden;
	}

	public String getFamilia() {
		if (familia == null) {
			return "Sin determinar";
		}
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getEspecie() {
		if (especie == null) {
			return "Sin determinar";
		}
		return especie;
	}

	// 7 Los métodos que no son constructores tb pueden aceptan
	// la sobrecarga
	public void setEspecie(String especie, Boolean verif) {
		if (verif)
			this.especie = especie;
	}

	// 8 Se podría hasta crear el mismo método con las mismas propiedades

	public void setEspecie(Boolean verif, String especie) {
		if (verif)
			this.especie = especie;
	}

	public void setEspecie(String especie) {

		this.especie = especie;
	}

}
