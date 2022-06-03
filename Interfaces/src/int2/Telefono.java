package int2;

/*
*7 
*Con los 6 primeros puntos, creamos una clase telefono sin 
*hacer uso de herencia o de interfaces. 
*8
*Voy a asignar ahora una interfaz calculadora
*9
*Al no tener el fichero creado el sistema me propone crear la interfaz
*con el nombre que hemos propuesto. 
*Le damos a crear interfaz Calculadora
*11
*El sistema me informa de que no hemos implementado todos los 
*métodos para la interfaz. 
*12
*Posicionamos el curso sobre el telefono para implementar 
*los métodos
*13 
*por defecto vienen configurados a nulo. Lo cambiamos
*/
public class Telefono implements Calculadora {

	// 1 propiedades
	private String nombre;
	private String marca;
	private int numero;

	// 2 constructor por defecto
	public Telefono() {
		// A PARTIR DE AHORA TENEMOS QUE OBLIGARNOS A SIEMPRE
		// TENER ACTIVADO EL MÉTODO CONSTRUCTOR POR DEFECTO
		// AUNQUE ESTÉ VACIO
	}

	// 3 constructor con parámetros
	public Telefono(String nombre, String marca, int numero) {
		this.nombre = nombre;
		this.marca = marca;
		this.numero = numero;
	}

//	// 4 método propio
//	public String particularidadDeEsteModelo() {
//		return "Este teléfono blanco es muy práctico.\n";
//	}

//	// 6 toString
//	@Override
//	public String toString() {
//		return "Telefono con nombre " + getNombre() + " y marca: " + getMarca()
//				+ ".\nPara llamarme tienes que componer el " + getNumero() + "\n"
//				// 15
//				// actualizamos el toString con este nuevo método
//				+ getCalculadora()//		
//	}

	// 14 sobreescribimos el método
	@Override
	public String getCalculadora() {
		// TODO Auto-generated method stub
		return "Este modelo tiene integrado una calculadora.\n" + "Increible no!!!";
	}

	// 5 GETTERS / SETTERS
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	// 22 nueva propiedad
	private CincoG cincoG;

	// 23 creamos una constructor para integrar esta nueva propiedad
	public Telefono(String nombre, String marca, int numero, CincoG cincoG) {
		this.nombre = nombre;
		this.marca = marca;
		this.numero = numero;
		this.cincoG = cincoG;
	}
	
	// 24 actualizamos el método propio
	public String particularidadDeEsteModelo() {
		return "Este teléfono blanco es muy práctico.\n" + cincoG.getInternet();
	}
	
	// 25 y el toString
	@Override
	public String toString() {
		return "Telefono con nombre " + getNombre() + " y marca: " + getMarca()
				+ ".\nPara llamarme tienes que componer el " + getNumero() + "\n"
				// 15
				// actualizamos el toString con este nuevo método
				+ getCalculadora()
		//26 
		+ particularidadDeEsteModelo();
	}
	
	//27 en el main tendremos que comentar el primer objeto 
	//y crear otro
}
