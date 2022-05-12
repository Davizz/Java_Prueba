package E15;

//Diseñar una clase Alumno con las propiedades nombre_apellido (String), 
//nivel (String), nota_lengua (double), nota_matematicas (double), 
//nota_natu (double), nota_soci (double).
//El nivel (String) corresponde a uno de los cursos de primaria listados 
//en un tipo enumerado. Este tipo va desde primero hasta sexto. 
//Hay que realizar la creación de la clase Alumno con sus métodos GETTERS y SETTERS, 
//crear un método getMedia que devuelve la media de las 4 notas del perfil y pisar 
//el método toString de la clase Object para poder imprimir en pantalla con un println 
//los métodos GETTERS del alumno y el método getMedia().   
//Desde el main, crearás 4 instancias de la clase y las imprimirás con JOptionPane. 
//La cuarta tiene que ser un objeto creado desde las entradas de usuario capturadas. 
//Por supuesto tienes que controlar que las entradas usuario se hagan correctamente. 
//A continuación, imprimirás los métodos toString de cada objeto instanciado. 

public class Alumnos {

	public String nombre_apellido;
	public String nivel;
	public double nota_lengua;
	public double nota_mate;
	public double nota_natu;
	public double nota_soci;
		
	public Alumnos(String nombre_apellido, String nivel, double nota_lengua, double nota_mate, double nota_natu,
			double nota_soci) {
		super();
		this.nombre_apellido = nombre_apellido;
		this.nivel = nivel;
		this.nota_lengua = nota_lengua;
		this.nota_mate = nota_mate;
		this.nota_natu = nota_natu;
		this.nota_soci = nota_soci;
	}

	public Alumnos() {

}

	@Override
	public String toString() {
		return "Alumnos [nombre_apellido=" + nombre_apellido + ", nivel=" + nivel + ", nota_lengua=" + nota_lengua
				+ ", nota_mate=" + nota_mate + ", nota_natu=" + nota_natu + ", nota_soci=" + nota_soci + "]";
	}

	public String getNombre_apellido() {
		return nombre_apellido;
	}

	public void setNombre_apellido(String nombre_apellido) {
		this.nombre_apellido = nombre_apellido;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public double getNota_lengua() {
		return nota_lengua;
	}

	public void setNota_lengua(double nota_lengua) {
		this.nota_lengua = nota_lengua;
	}

	public double getNota_mate() {
		return nota_mate;
	}

	public void setNota_mate(double nota_mate) {
		this.nota_mate = nota_mate;
	}

	public double getNota_natu() {
		return nota_natu;
	}

	public void setNota_natu(double nota_natu) {
		this.nota_natu = nota_natu;
	}

	public double getNota_soci() {
		return nota_soci;
	}
	
	public double getMedia() {
		
		return (nota_mate + nota_lengua + nota_soci + nota_natu)/4;
	}
	

	public void setNota_soci(double nota_soci) {
		this.nota_soci = nota_soci;
	}}