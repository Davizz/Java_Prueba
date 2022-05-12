/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_36_form_fichero;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Imanol Recio
 */
public class Main {

    public static ArrayList<Cuenta> usuarios = new ArrayList<>();
    public static void main(String[] args) {
        
       String nombreArchivo = "usuarios.ser"; //archivo serializable de los usuarios.
        try {
            FileInputStream archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream in = new ObjectInputStream(archivo);
            while(in.readObject()!=null){ //hago un bucle para cargar todas las cuentas y lo corto con la excepción que salta cuando no lee nada nuevo.
             try{   usuarios.add((Cuenta) in.readObject());
            }catch(EOFException e){
                 break;
            }
            }
            archivo.close();
            in.close();     //cierro los flujos.
            System.out.println("Usuarios Cargados");
        } catch (IOException ex) {
            System.out.println("IOException cazada");
        } catch (ClassNotFoundException exc) {
            System.out.println("ClassNotFoundException cazada");
        }
        
        new Frame();

    }
    
}
