/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author SISTEMAS
 */
public class Amigo extends Contacto implements Serializable {

    final private Date fechanacimiento;
    final private int TIPO=1;

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public Amigo(int ID, String NOMBRE, String APELLIDOS, String tlfn, String direccion, String email, int anno, int mes, int dia) {
        super(ID,NOMBRE, APELLIDOS, tlfn, direccion, email);
       GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
        this.fechanacimiento = fecha.getTime();
        
    }

    public Amigo() {
        super();
        Scanner entrada = new Scanner(System.in);
        boolean checkint = false;
        String anio;
        String mess;
        String diaa;
        do {
            System.out.println("Año de nacimiento del Contacto");
            anio = entrada.nextLine();
            ComprobacionesDatos check = new ComprobacionesDatos(anio);
            if (check.comprobarNumero(anio) == true) {
                checkint = true;
            } else {
                checkint = false;
            }

        } while (!checkint);
        int anno = Integer.parseInt(anio);
        checkint=false;
        do {
            System.out.println("Mes de nacimiento del Contacto");
            mess = entrada.nextLine();
            ComprobacionesDatos check = new ComprobacionesDatos(mess);
            if (check.comprobarNumero(mess) == true) {
                checkint = true;
            } 

        } while (!checkint);
        int mes = Integer.parseInt(mess);
        checkint=false;
        do {
            System.out.println("día de nacimiento del Contacto");
            diaa = entrada.nextLine();
            ComprobacionesDatos check = new ComprobacionesDatos(diaa);
            if (check.comprobarNumero(diaa) == true) {
                checkint = true;
            } 

        } while (!checkint);
        int dia = Integer.parseInt(diaa);
        checkint=false;

        GregorianCalendar fecha = new GregorianCalendar(anno, mes - 1, dia);
        this.fechanacimiento = fecha.getTime();
    }
    @Override
    public String getDatos(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        return getID()+ "+++"+getNOMBRE()+ "+++"+getAPELLIDOS()+"+++" +getTlfn()+"+++"+getEmail()+ "+++"+getDireccion()+"+++"+ format.format(getFechanacimiento()) +"+++"+getTIPO()+"\r";
        
    }
@Override
    public void imprimeDatos(){
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
       System.out.printf("%d\t\t %s\t\t%s\t\t%s\t\t%s\t\t%s\t\t%s\r",getID(),getNOMBRE(),getAPELLIDOS(),getTlfn(),getEmail(),getDireccion(),format.format(getFechanacimiento()));
    }

    public int getTIPO() {
        return TIPO;
    }
}
