package refundicion_complejo;

public class Jefe extends Empleado {

    public Jefe(String nombre, double sueldo, int anio, int mes, int dia) {

        super(nombre, sueldo, anio, mes, dia);
        // llamar al constructor de la clase padre con sus parámetros. 
    }

    private double incentivo;

    public double getIncentivo() {
        return this.incentivo;
    }

    public void setIncentivo(double incentivo) {
        this.incentivo = incentivo; 

    }    

    @Override
    public double getSueldo(){
        double sueldoJefe = super.getSueldo(); 
        
        return sueldoJefe + incentivo; 
    }

}
