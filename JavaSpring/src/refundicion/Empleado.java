package refundicion;

//1 crear la clase
public class Empleado {

    private String nombre;  
    private double sueldo;
    private String seccion; 
 
    public Empleado(String nombre, double sueldo, String seccion) {
        this.nombre = nombre;   
        this.sueldo = sueldo;   
        this.seccion = seccion; 
    }        
    
    public String getNombre() {
        return this.nombre;
    } 
    
    public double getSueldo() {
		return sueldo;
	}
    
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

	public String getSeccion() {
		return seccion;
	}

	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}

	//2 crear el tostring
	@Override
    public String toString(){
          return "El empleado " + getNombre() + " gana " + getSueldo() + " al mes.";
    }
	
	//3 cambiar el método setSueldo para usarlo después
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
    }

   

}


