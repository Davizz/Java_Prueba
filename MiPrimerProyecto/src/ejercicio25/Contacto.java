/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SISTEMAS
 */
public abstract class Contacto implements Serializable {
    private final String NOMBRE;
    private final String APELLIDOS;
    private String tlfn;
    private String direccion;
    private String email;
    private final int ID;
    static private int idSiguiente = 1;

    public Contacto(int ID,String NOMBRE, String APELLIDOS, String tlfn, String direccion, String email) {
        this.NOMBRE = NOMBRE;
        this.APELLIDOS = APELLIDOS;
        this.tlfn = tlfn;
        this.direccion = direccion;
        this.email = email;
        this.ID = ID;
        idSiguiente++;
    }

    public String getTlfn() {
        return tlfn;
    }

    public void setTlfn(String tlfn) {
        this.tlfn = tlfn;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNOMBRE() {
        return NOMBRE;
    }

    public String getAPELLIDOS() {
        return APELLIDOS;
    }

    public int getID() {
        return ID;
    }
    public Contacto(){
        Scanner entrada = new Scanner(System.in);
        boolean checknombre = false;
        boolean checkapellido = false;
        boolean checkdireccion = false;
        boolean checkemail = false;
        boolean checktlfn = false;
        String nombre;
        String apellido;
       
   
        do {
            System.out.println("nombre del contacto");
            nombre = entrada.nextLine();

            ComprobacionesDatos check = new ComprobacionesDatos(nombre);
            if (check.comprobarNombre(nombre) == true) {
                checknombre = true;
                
            }
        } while (checknombre == false);
       this.NOMBRE=nombre;
       
        do {
            System.out.println("apellidos del contacto");
            apellido = entrada.nextLine();

            ComprobacionesDatos check = new ComprobacionesDatos(apellido);
            if (check.comprobarApellido(apellido) == true) {
                checkapellido = true;
            }
        } while (checkapellido == false);
        this.APELLIDOS=apellido;
        
        do {
            System.out.println("dirección del contacto");
            this.direccion = entrada.nextLine();

            ComprobacionesDatos check = new ComprobacionesDatos(direccion);
            if (check.comprobarDireccion(direccion) == true) {
                checkdireccion = true;
            }
        } while (checkdireccion == false);
        do {
            System.out.println("teléfono del contacto");
            this.tlfn = entrada.nextLine();

            ComprobacionesDatos check = new ComprobacionesDatos(tlfn);
            if (check.comprobarTlfn(tlfn) == true) {
                checktlfn = true;
            }
        } while (checktlfn == false);
        do {
            System.out.println("email del contacto");
            this.email = entrada.nextLine();

            ComprobacionesDatos check = new ComprobacionesDatos(email);
            if (check.checkEmail(email) == true) {
                checkemail = true;
            }
        } while (checkemail == false);
        
        this.ID = idSiguiente;
        idSiguiente++;
    }
    public abstract String getDatos();
    public abstract void imprimeDatos();
}
