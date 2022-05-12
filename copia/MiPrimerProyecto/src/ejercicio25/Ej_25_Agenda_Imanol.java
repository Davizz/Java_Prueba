/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.util.ArrayList;

/**
 *
 * @author SISTEMAS
 */
public class Ej_25_Agenda_Imanol {

    /**
     */
    
    //Creo mi arraylist de contactos y le hago public static para que esté accesible en todo el paquete
    public static ArrayList<Contacto> agenda = new ArrayList<>();
    
    
    public static void main(String[] args) {
        // Accedo al menú de mi aplicación.
       MenuAgenda.menu();
    }
    
}
