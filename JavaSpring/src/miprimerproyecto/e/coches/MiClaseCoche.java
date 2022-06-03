package miprimerproyecto.e.coches;

public class MiClaseCoche {

	// 1
//	public String marca; 
//	public String modele; 
//	public int ruedas; //4 o 5
//	public int longitud; // mm
//	public int anchura; // mm
//	public int altura; //mm

	// 2
	public MiClaseCoche(String marque, String modele, int ruedas, int longueur, int largeur, int hauteur) {
		this.marca = marque;
		this.modele = modele;
		this.ruedas = ruedas;
		this.longitud = longueur;
		this.anchura = largeur;
		this.altura = hauteur;
	}

	// 6 PERO QUÉ PASA SI HACEMOS USO DE PRIVATE
	// SE BLOQUEA TODO
	// EL MAIN INFORMA DE ERRORES EN MUCHAS PARTES
	private String marca;
	private String modele;
	private int ruedas; // 4 o 5
	private int longitud; // mm
	private int anchura; // mm
	private int altura; // mm

	// 7
	// PARA SOLUCIONARLO TENEMOS QUE HACER USO DE
	// MÉTODO GETTERS Y SETTERS.
	// EL EQUIVALENTE A LOS MÉTODO QUE EMPIEZAN POR
	// OBTIENEALGO
	// DE NUESTRO EJERCICIO CON LOS BARCOS
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getLongitud() {
		return longitud;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	// 8
	// vamos a ver como gestionar el acceso a variables
	static String ejAcceso = "conectado"; // private, protected, public o (por defecto)
	// Intentare acceder a ejAcceso desde otros paquetes

	//9
//	public String accediendoDesdeMismaClase() {
//		return "Accediendo a variables desde misma clase: " + ejAcceso;
//	}

}
