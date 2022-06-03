package refundicion;

final public class Director extends Jefe {

	// 10
	public Director(String nombre, double sueldo, double incentivo, double bonificaciones, String seccion) {
		super(nombre, sueldo, incentivo, seccion);
		this.bonificaciones = bonificaciones;
	}

	private double bonificaciones;

	public double getBonificaciones() {
		return bonificaciones;
	}

	public void setBonificaciones(double bonificaciones) {
		this.bonificaciones = bonificaciones;
	}
	
	//11 pisar el método getSueldo
    @Override
    public double getSueldo(){            
        return super.getSueldo() + bonificaciones; 
    }

}
