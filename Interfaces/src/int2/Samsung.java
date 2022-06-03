package int2;

public class Samsung extends Telefono implements Juegos {

	private Juegos juegos;  
	
	
	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	public Samsung(String nombre, String marca, int numero, CincoG cincoG, Juegos juegos) {
		super(nombre, marca, numero, cincoG);
		this.setJuegos(juegos); 
	}

	public Samsung(String nombre, String marca, int numero, CincoG cincoG) {
		super(nombre, marca, numero, cincoG);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tieneJuegosInstalados() {
		// TODO Auto-generated method stub
		return "Tiene unos cuantos juegos instalados.\n" + juegos.tieneJuegosInstalados();
	}

	public Juegos getJuegos() {
		return juegos;
	}

	public void setJuegos(Juegos juegos) {
		this.juegos = juegos;
	}

	@Override
	public String toString() {
		return super.toString() + tieneJuegosInstalados();
	}
	
	

}
