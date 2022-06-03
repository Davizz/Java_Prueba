package miprimerproyecto.f.estatico;

public class Empleado {

	// 1 creamos un empleado con nombre_apellido y seccion
	// tengo comentado todos puntos que van a partir del 17
	private String seccion;
	private String nombre_apellido;
	// 6 añadimos un campo id normal.
	// En teoría es una propiedad de los objetos de la clase Empleado
//	private int id; 

	// 18 comento el 6, el 9 y el id del constructor
	// porque ya no vamos a poder utilizarlos así
	// añado static al id
	private int idObjeto;
	private static int idClase = 1;

	// 2 el contructor por defecto
	public Empleado() {
		this.nombre_apellido = "Miguel Ángel Marcelo";
		this.seccion = "Seguridad";
		// 7 actualizo la id aquí
		// this.id = 1;
		//19 uso del id estático
		this.idObjeto = idClase;
		idClase++;
	}

	// 3 el constructor con parámetros:
	public Empleado(String nombre_apellido, String seccion) {
		this.nombre_apellido = nombre_apellido;
		this.seccion = seccion;
		// 8 y aquí
		// this.id = id;
		// 20 uso del id estático
		this.idObjeto = idClase;
		idClase++;
	}

	// 21 añado los getters y setters y actualizo el toString
	public int getIdObjeto() {
		return idObjeto;
	}

	public void setIdObjeto(int idObjeto) {
		this.idObjeto = idObjeto;
	}

	// 5 método getDatos toString
	@Override
	public String toString() {
		// 10 y también aquí
		return "El empleado con id " + getIdObjeto() + " de la sección " + getSeccion() + " se llama "
				+ getNombre_apellido() + "\n";
	}
	// 9
	// añado el getter setter del id
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}

	// 4 GETTERS y SETTERS
	public String getNombre_apellido() {
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//26 creo ahora el getter setter de idClase
	//el sistema me hace métodos estáticos 
	//El getter me va a devolver 
	//según parece el id de la próxima instancia de este misma clase
	//El setter me daría la posibilidad de modificar este valor
	public static int getIdClase() {
		return idClase;
	}

	public static void setIdClase(int idClase) {
		Empleado.idClase = idClase;
	}
	
	
	
	

}
