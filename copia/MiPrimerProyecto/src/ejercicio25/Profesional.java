/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author SISTEMAS
 */
public class Profesional extends Contacto implements Serializable {
    private String empresa;
    private final int TIPO=2;

    public Profesional(int ID,String NOMBRE, String APELLIDOS, String tlfn, String direccion, String email, String empresa) {
        super(ID,NOMBRE, APELLIDOS, tlfn, direccion, email);
        this.empresa=empresa;
        
        
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Profesional() {
        super();
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Cuál es la empresa de tu contacto profesional?");
        this.empresa=entrada.nextLine();
    }
    @Override
    public String getDatos(){
        
        return getID()+ "+++"+getNOMBRE()+ "+++"+getAPELLIDOS()+"+++" +getTlfn()+"+++"+getEmail()+"+++"+getDireccion()+ "+++"+getEmpresa()+"+++"+getTIPO()+"\r";
        
    }
    @Override
    public void imprimeDatos(){
       System.out.printf("%d\t\t %s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\n",getID(),getNOMBRE(),getAPELLIDOS(),getTlfn(),getEmail(),getDireccion(),getEmpresa());
    }

    public int getTIPO() {
        return TIPO;
    }
}
