package refundicion;

//4 crear la clase jefe
public class Jefe extends Empleado {

    public Jefe(String nombre, double sueldo, double incentivo, String seccion) {
        super(nombre, sueldo, seccion);  
        this.incentivo = incentivo; 
    }

    private double incentivo;

    public double getIncentivo() {
        return this.incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo; 

    }    

    //5 pisar el método getSueldo
    @Override
    public double getSueldo(){               
        return super.getSueldo() + incentivo; 
    }

}
