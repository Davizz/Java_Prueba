package miprimerproyecto.f.abstraccion;

/*4   Para usar una clase abstracta 
esta debe ser heredada desde otra clase
*/
public class Barbaro extends Hero {

	public Barbaro(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	/*
	 * 5
	 * Para usar una clase abstracta esta debe proveer implementaciones para los
	 * metodos abstractos en ella.
	 */
	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "es muy fuerte! Es moreno y musculoso.\n";
	}

	@Override
	public String getHabilidades() {
		// TODO Auto-generated method stub
		return "Sabe luchar, nadar. Es muy veloz.\n";
	}

	@Override
	public String getDebilidades() {
		// TODO Auto-generated method stub
		return "Tiene miedo a las arañas y no le gusta las armaduras.\n";
	}

	@Override
	public String toString() {
		return getNombre() + " " 
	+ getDescripcion() 
	+ getHabilidades() 
	+ getDebilidades();
	}
	
	

}
