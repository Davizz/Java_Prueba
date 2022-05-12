/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author SISTEMAS
 */
class ComprobacionesDatos {

    public String dni;

    public ComprobacionesDatos(String dni) {
        this.dni = dni;

    }

    public boolean comprobarDNI(String dni) {

        String letraMayuscula = ""; //Guardaremos la letra introducida en formato mayúscula

        // Aquí excluimos cadenas distintas a 9 caracteres que debe tener un dni y también si el último caracter no es una letra
        if (dni.length() != 9 || Character.isLetter(this.dni.charAt(8)) == false) {
            return false;
        }

        // Al superar la primera restricción, la letra la pasamos a mayúscula
        letraMayuscula = (this.dni.substring(8)).toUpperCase();

        // Por último validamos que sólo tengo 8 dígitos entre los 8 primeros caracteres y que la letra introducida es igual a la de la ecuación
        // Llamamos a los métodos privados de la clase soloNumeros() y letraDNI()
        if (soloNumeros() == true && letraDNI().equals(letraMayuscula)) {
            return true;
        } else {
            return false;
        }
    }

    private boolean soloNumeros() {

        int i, j = 0;
        String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
        String miDNI = ""; // Guardamos en una cadena los números para después calcular la letra
        String[] unoNueve = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (i = 0; i < this.dni.length() - 1; i++) {
            numero = this.dni.substring(i, i + 1);

            for (j = 0; j < unoNueve.length; j++) {
                if (numero.equals(unoNueve[j])) {
                    miDNI += unoNueve[j];
                }
            }
        }

        if (miDNI.length() != 8) {
            return false;
        } else {
            return true;
        }
    }

    private String letraDNI() {
        // El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

        // pasar miNumero a integer
        int miDNI = Integer.parseInt(this.dni.substring(0, 8));
        int resto = 0;
        String miLetra = "";
        String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

        resto = miDNI % 23;

        miLetra = asignacionLetra[resto];

        return miLetra;
    }

    public boolean comprobarNombre(String name) {
        Pattern patron = Pattern.compile("[^A-Za-z ]");
        Matcher encaja = patron.matcher(name);

        if (!encaja.find() && name.length() > 2) {
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarApellido(String apellido) {
        Pattern patron = Pattern.compile("[^A-Za-z ]");
        Matcher encaja = patron.matcher(apellido);

        if (!encaja.find() && apellido.length() > 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean comprobarDireccion(String direccion) {

        Pattern patron = Pattern.compile("[^A-Za-z0-9 ]");
        Matcher encaja = patron.matcher(direccion);

        if (!encaja.find() && direccion.length() > 3) {
            return true;
        } else {
            return false;
        }

    }

    public boolean comprobarTlfn(String tlfn) {
        char[] telef = tlfn.toCharArray();

        if (telef.length == 9 && telef[0] == '6') {
            return true;
        }

        return false;
    }

    public static boolean comprobarCCC(String ccc) {

        Pattern cuentaPattern = Pattern.compile("\\d{20}");
        Matcher m = cuentaPattern.matcher(ccc);
        if (m.matches()) {

            String banco = "00" + ccc.substring(0, 8);

            int suma = Integer.parseInt(banco.substring(0, 1)) * 1
                    + Integer.parseInt(banco.substring(1, 2)) * 2
                    + Integer.parseInt(banco.substring(2, 3)) * 4
                    + Integer.parseInt(banco.substring(3, 4)) * 8
                    + Integer.parseInt(banco.substring(4, 5)) * 5
                    + Integer.parseInt(banco.substring(5, 6)) * 10
                    + Integer.parseInt(banco.substring(6, 7)) * 9
                    + Integer.parseInt(banco.substring(7, 8)) * 7
                    + Integer.parseInt(banco.substring(8, 9)) * 3
                    + Integer.parseInt(banco.substring(9, 10)) * 6;

            int control = 11 - (suma % 11);

            if (control == 10) {
                control = 1;
            } else if (control == 11) {
                control = 0;
            }

            int controlBanco = Integer.parseInt(ccc.substring(8, 9));
            if (controlBanco != control) {
                return false;
            }

            suma = Integer.parseInt(ccc.substring(10, 11)) * 1
                    + Integer.parseInt(ccc.substring(11, 12)) * 2
                    + Integer.parseInt(ccc.substring(12, 13)) * 4
                    + Integer.parseInt(ccc.substring(13, 14)) * 8
                    + Integer.parseInt(ccc.substring(14, 15)) * 5
                    + Integer.parseInt(ccc.substring(15, 16)) * 10
                    + Integer.parseInt(ccc.substring(16, 17)) * 9
                    + Integer.parseInt(ccc.substring(17, 18)) * 7
                    + Integer.parseInt(ccc.substring(18, 19)) * 3
                    + Integer.parseInt(ccc.substring(19, 20)) * 6;

            control = 11 - (suma % 11);

            if (control == 10) {
                control = 1;
            } else if (control == 11) {
                control = 0;
            }

            int controlcuenta = Integer.parseInt(ccc.substring(9, 10));
            if (controlcuenta != control) {
                return false;
            } else {
                return true;
            }

        } else {
            return false;
        }
    }

    public boolean checkEdad(int edad) {

        if (edad >= 0) {

            return true;

        }
        return false;
 
    }
    public boolean checkEmail(String email){
        int arroba = 0;
        boolean punto = false;
        int prearroba = 0;
        int entrecosas = 0;
        int postpunto = 0;
        boolean condicionfinal = false;
        
        
            prearroba = 0;
            arroba = 0;
            entrecosas = 0;
            postpunto = 0;
            punto = false;
            condicionfinal = false;
            
            for (int i = 0; i < email.length(); i++) {
                if (arroba == 0) {
                    prearroba++;
                }
                if (email.charAt(i) == '@') {
                    arroba++;
                }
                if (arroba == 1 && punto == false) {
                    entrecosas++;
                }
                if (arroba == 1 && email.charAt(i) == '.') {
                    punto = true;
                }

                if (arroba == 1 && punto == true) {
                    postpunto++;
                }
            }
            if (arroba == 1 && prearroba > 1 && entrecosas > 2 && postpunto > 2) {
                return true;
            } else{
                return false;
            }
    }
    public boolean comprobarNumero(String a) {

        int i, j = 0;
        String numero = ""; // Es el número que se comprueba uno a uno por si hay alguna letra entre los 8 primeros dígitos
        boolean checknumber=false;
        String[] unoNueve = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};

        for (i = 0; i < a.length() ; i++) {
            numero = a.substring(i, i + 1);

            for (j = 0; j < unoNueve.length; j++) {
                if (numero.equals(unoNueve[j])) {
                    checknumber=true;
                }
                
            }
        }

        if (checknumber) {
            return true;
        } else {
            return false;
        }
    }
}
          
       
    
