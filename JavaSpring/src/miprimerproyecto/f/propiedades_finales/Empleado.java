package miprimerproyecto.f.propiedades_finales;

public class Empleado {
	
	//1 creamos un empleado con nombre_apellido y seccion
	private String seccion;
	//5 cambio la visibilidad de nombre_apellido a final
	//private final String nombre_apellido; 
	
	
	
	//7 la propiedad NOMBRE se podría dejar 
	// con visibilidad pública. Pues, no se puede cambiar. 
	//y es obligatorio. ESo sí: tenemos que poner 
	//NOMBRE_APELLIDO en mayusculas para ayudarnos 
	//a ver que es una constante
	//comento los punto 3 y 5 y el nombre_apellido del punto 2
	private final String NOMBRE_APELLIDO; 
	

	//2 el contructor por defecto
	public Empleado() {
		//this.nombre_apellido = "Miguel Ángel Marcelo";
		this.seccion = "Seguridad";		
		// 8
		//nos obliga a poner un nombre 
		//Tengo un error si no pongo nada en el constructor
		//Probar a quitar el final del NOMBRE para comprobar la diferencia		
		this.NOMBRE_APELLIDO = "Miguel Ángel Marcelo";
	}
	
	//9 el constructor con parámetros: 
	public Empleado(String NOMBRE_COMPLETO, String seccion) {
		//10 tenemos que asignar un nombre o al no hacerlo nos sale un error
		this.NOMBRE_APELLIDO = NOMBRE_COMPLETO;
		this.seccion = seccion; 
	}

	//12 método getDatos toString
	@Override
	public String toString() {
		return "El empleado de la sección " + getSeccion() + " se llama " + getNOMBRE_APELLIDO() + "\n";
	}	

	//3 GETTERS y SETTERS
//	public String getNombre_apellido() {
//		return nombre_apellido;
//	}


//	public void setNombre_apellido(String nombre_apellido) {
		//6 con final tengo un error en este punto
		//ya no puedo settear nombre_apellido
		//lo comentaré
//		this.nombre_apellido = nombre_apellido;
//	}
	
	
	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//11 nuevo getter
	public String getNOMBRE_APELLIDO() {
		return NOMBRE_APELLIDO;
	}
	
	


	
	
	
	
	
	

}
