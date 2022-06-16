package herenciaxml;

public class Criticas implements Comentarios {

	private String nombreUsuario;
	
	public Criticas() {

	}

	public Criticas(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String valoraciones() {
		return "EXCELENTE";
	}

	@Override
	public String toString() {
		return "<br/>NOMBRE USUARIO: " + getNombreUsuario() + "<br/>VALORACIONES: " + valoraciones();
	}

	
}
