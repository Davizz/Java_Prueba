package F18;

//Diseñar una clase Libro con las propiedades título, id, autor, año de publicación, 
//prestado a, fecha de préstamo y estado. Es necesario definir los atributos de cada 
//propiedad (finales y/o estáticas o no) para poder diseñar la clase y realizar la 
//creación de los métodos GETTERS/ SETTERS adecuados. 
//Instancia 10 ejemplares de la clase y haz uso del método toString para 
//imprimir en pantalla cada una de las propiedades de los objetos. 
//Ten en cuenta que, por cada instanciación, la salida del método toString 
//tiene que devolver una id única por cada libro y una fecha en formato dd/MM/yyyy. 


public class Producto {

	public String Titulo;
	public int id;
	public String Autor; 
	public int año_publicación;
	public String prestado;
	public String fecha_préstamo;
	public String estado;
	
	//Creo el Id
	static int contador = 1;
	public Producto(String titulo, String autor, int año_publicación, String prestado, String fecha_préstamo,
			String estado) {


		id = contador;
		contador ++;
		
		Titulo = titulo;
		this.id = id;
		Autor = autor;
		this.año_publicación = año_publicación;
		this.prestado = prestado;
		this.fecha_préstamo = fecha_préstamo;
		this.estado = estado;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAño_publicación() {
		return año_publicación;
	}

	public void setAño_publicación(int año_publicación) {
		this.año_publicación = año_publicación;
	}

	public String getPrestado() {
		return prestado;
	}

	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}

	public String getFecha_préstamo() {
		return fecha_préstamo;
	}

	public void setFecha_préstamo(String fecha_préstamo) {
		this.fecha_préstamo = fecha_préstamo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [Titulo=" + Titulo + ", id=" + id + ", Autor=" + Autor + ", año_publicación=" + año_publicación
				+ ", prestado=" + prestado + ", fecha_préstamo=" + fecha_préstamo + ", estado=" + estado
				+ ", getTitulo()=" + getTitulo() + ", getId()=" + getId() + "]";
	}
	
}
