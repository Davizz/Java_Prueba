package F18;

//Dise�ar una clase Libro con las propiedades t�tulo, id, autor, a�o de publicaci�n, 
//prestado a, fecha de pr�stamo y estado. Es necesario definir los atributos de cada 
//propiedad (finales y/o est�ticas o no) para poder dise�ar la clase y realizar la 
//creaci�n de los m�todos GETTERS/ SETTERS adecuados. 
//Instancia 10 ejemplares de la clase y haz uso del m�todo toString para 
//imprimir en pantalla cada una de las propiedades de los objetos. 
//Ten en cuenta que, por cada instanciaci�n, la salida del m�todo toString 
//tiene que devolver una id �nica por cada libro y una fecha en formato dd/MM/yyyy. 


public class Producto {

	public String Titulo;
	public int id;
	public String Autor; 
	public int a�o_publicaci�n;
	public String prestado;
	public String fecha_pr�stamo;
	public String estado;
	
	//Creo el Id
	static int contador = 1;
	public Producto(String titulo, String autor, int a�o_publicaci�n, String prestado, String fecha_pr�stamo,
			String estado) {


		id = contador;
		contador ++;
		
		Titulo = titulo;
		this.id = id;
		Autor = autor;
		this.a�o_publicaci�n = a�o_publicaci�n;
		this.prestado = prestado;
		this.fecha_pr�stamo = fecha_pr�stamo;
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

	public int getA�o_publicaci�n() {
		return a�o_publicaci�n;
	}

	public void setA�o_publicaci�n(int a�o_publicaci�n) {
		this.a�o_publicaci�n = a�o_publicaci�n;
	}

	public String getPrestado() {
		return prestado;
	}

	public void setPrestado(String prestado) {
		this.prestado = prestado;
	}

	public String getFecha_pr�stamo() {
		return fecha_pr�stamo;
	}

	public void setFecha_pr�stamo(String fecha_pr�stamo) {
		this.fecha_pr�stamo = fecha_pr�stamo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [Titulo=" + Titulo + ", id=" + id + ", Autor=" + Autor + ", a�o_publicaci�n=" + a�o_publicaci�n
				+ ", prestado=" + prestado + ", fecha_pr�stamo=" + fecha_pr�stamo + ", estado=" + estado
				+ ", getTitulo()=" + getTitulo() + ", getId()=" + getId() + "]";
	}
	
}
