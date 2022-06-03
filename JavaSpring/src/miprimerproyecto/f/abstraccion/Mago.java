package miprimerproyecto.f.abstraccion;

//7
public class Mago extends Hero {

	public Mago(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "tiene una barba larga y blanca. Es un potente hechicero.\n";
	}

	@Override
	public String getHabilidades() {
		// TODO Auto-generated method stub
		return "No es para nada fuerte! Le tumbaría una mosca.\n";
	}

	@Override
	public String getDebilidades() {
		// TODO Auto-generated method stub
		return "Tiene miedo a los perros, los orcos, los trasgos, los... Vamos ! Es un miedoso!\n";
	}
	
	@Override
	public String toString() {
		return getNombre() + " " 
	+ getDescripcion() 
	+ getHabilidades() 
	+ getDebilidades();
	}

}
