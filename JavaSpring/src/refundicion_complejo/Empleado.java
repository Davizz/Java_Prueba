package refundicion_complejo;


import java.text.SimpleDateFormat;
import java.util.*;

public class Empleado {

    final private String NOMBRE;
    private String seccion;
    final private int ID;
    private static int idSiguiente = 1;
    //Para la parte sobrecarga de constructores
    private double sueldo;
    private Date fechaEntrada;

    public Empleado(String nombre) {
        this(nombre, 30000, 2000, 01, 01);
    }

    protected static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    protected static final SimpleDateFormat dateHeureFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");

    public static String formatterDate(Date date) {
        return dateFormat.format(date);
    }

    public static String formatterDateHeure(Date date) {
        return dateHeureFormat.format(date);
    }


    //Para la parte sobrecarga de constructores
    public Empleado(String nombre, double sueldo, int anio, int mes, int dia) {
        this.NOMBRE = nombre;
        this.sueldo = sueldo;
        this.ID = Empleado.idSiguiente;
        Empleado.idSiguiente++;
        GregorianCalendar calendario = new GregorianCalendar(anio, mes - 1, dia);
        this.fechaEntrada = calendario.getTime();

    }    
    

    public void cambiaSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getNombre() {
        return this.NOMBRE;
    }

    public String getSeccion() {
        return this.seccion;
    }

    public int getId() {
        return this.ID;
    }

    public String devuelveDatos() {
        return "El nombre es " + getNombre() + ", el sueldo es de " + getSueldo() + " y la Id es " + getId();
    }
    
    @Override
    public String toString(){
          return "El nombre es " + getNombre() + ", el sueldo es de " + getSueldo() + " y la Id es " + getId();
    }

    public static String devuelveIdFinal() {
        return "El id que se encuentra disponible ahora es el " + idSiguiente;
    }

    //Para la parte sobrecarga de constructores
    public double getSueldo() {
        return this.sueldo;
    }

    public String getFechaEntrada() {
        return formatterDate(this.fechaEntrada);
    }

    public void subeSueldo(double porcentaje) {
        double aumento = sueldo * porcentaje / 100;
        this.sueldo += aumento;
    }

}


