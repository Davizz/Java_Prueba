/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio25;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 *
 * @author SISTEMAS
 */
public class MenuAgenda {

    // creo el objeto entrada de Scanner para que esté accesible en todos los métodos de la clase.
    static Scanner entrada = new Scanner(System.in);
    static boolean agendaCargada = false;

    public static void menu() {
        while (agendaCargada == false) { // realizo el bucle para que sólo se cargue la agenda una vez y no cada vez que vuelvo al menú.
            cargarAgenda(); // en primer lugar cargo la agenda y arranco el menú
            agendaCargada = true;
        }

        String ax;
        int op = 0;
        do {
            ax = JOptionPane.showInputDialog(null, "1. añadir contacto\n2. ver contactos\n3. eliminar contacto\n4. guardar agenda\n5. salir");
            if (ax != null || Character.isDigit(ax.charAt(0)) == false) {//validacion para el menu
                op = Integer.parseInt(ax);
                switch (op) {
                    case 1:
                        anyadirContacto();
                        break;
                    case 2:
                        verAgenda();
                        break;
                    case 3:
                        eliminarContacto();
                        break;
                    case 4:
                        guardarAgenda();
                        break;
                    case 5:
                        salir();
                        break;

                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite una opcion valida....");
            }
        } while (op > 0 && op < 5);//cuando se digita 5 se finaliza la aplicacion        
    }

    public static void anyadirContacto() { //primero creo menu para elegir el tipo de contacto
        String ax;
        int op = 0;
        do {
            ax = JOptionPane.showInputDialog(null, "1. Amigo\n2. contacto profesional\n3. volver al menú\n4. salir");
            if (ax != null || Character.isDigit(ax.charAt(0)) == false) {//validacion para el menu
                op = Integer.parseInt(ax);
                switch (op) {
                    case 1:     //creo el contacto y lo añado al array agenda.
                        Contacto nuevoAmigo = new Amigo();
                        Ej_25_Agenda_Imanol.agenda.add(nuevoAmigo);
                        break;
                    case 2:
                        Contacto nuevoProf = new Profesional();
                        Ej_25_Agenda_Imanol.agenda.add(nuevoProf);
                        break;
                    case 3: //salgo al menú principal.
                        menu();
                        break;
                    case 4: // salgo de la aplicación.
                        salir();
                        break;

                }
            } else {
                JOptionPane.showMessageDialog(null, "Digite una opcion valida....");
            }
        } while (op > 0 && op < 4);//cuando se digita 4 se finaliza la aplicacion
    }

    public static void verAgenda() {
        for (Contacto contacto : Ej_25_Agenda_Imanol.agenda) {

            contacto.imprimeDatos();
        }
    }

    public static void eliminarContacto() {
        int i = 0;          //busco nombre y apellidos, si coincide, borro el contacto.

        System.out.println("Introduce el nombre del contacto a eliminar");
        String nombre = entrada.nextLine();

        System.out.println("Introduce los apellidos del contacto a eliminar");
        String apellido = entrada.nextLine();
        for (Contacto contacto : Ej_25_Agenda_Imanol.agenda) {
            if (contacto.getNOMBRE().equalsIgnoreCase(nombre) && contacto.getAPELLIDOS().equalsIgnoreCase(apellido)) {
                i++;
                Ej_25_Agenda_Imanol.agenda.remove(contacto);

            }
        }
        if (i == 0) {
            System.out.println("Contacto no encontrado.");
        } else {
            System.out.println("Contacto borrado.");
        }
    }

    public static void guardarAgenda() {
        /*try {
            FileWriter escritor = new FileWriter("C:/Users/usuario/Documents/NetBeansProjects/POO/src/ejercicio_25/Agenda.txt");
            for (Contacto contacto : Ej_25_Agenda_Imanol.agenda) {
                String input = contacto.getDatos();
                escritor.write(input+"\r");
                
            }

            escritor.close();
        } catch (IOException ex) {
            System.out.println("El archivo agenda no se encuentra");
        }*/
        String nombreArchivo = "agenda.ser"; //archivo de agenda serializable
        try {
            FileOutputStream archivo = new FileOutputStream(nombreArchivo);
            ObjectOutputStream out = new ObjectOutputStream(archivo);
            for (Object contacto : Ej_25_Agenda_Imanol.agenda) { //bucle para guardar contactos
                out.writeObject(contacto);
            }
            out.close();
            archivo.close(); // cierro los flujos
            System.out.println("La agenda se ha guardado correctamente.");
        } catch (IOException ex) {
            System.out.println("IOException cazada");
        }
    }

    public static void salir() { //confirmo con el usuario si quiere salir y si no le devuelvo al menú.
        String si = "si";
        String no = "no";
        String input = "";
        do {
            System.out.println("¿Está seguro que desea salir?\nSi sale sin guardar la agenda puede perder todos sus contactos.");
            input = entrada.nextLine();
        } while (!si.equalsIgnoreCase(input) && !no.equalsIgnoreCase(input));
        if (si.equalsIgnoreCase(input)) {
            System.exit(0);
        } else {
            menu();
        }
    }

    public static void cargarAgenda() {
        /*String amigo="1";
    String prof="2";
    FileReader lectura = null;
        try {
            lectura = new FileReader("C:/Users/usuario/Documents/NetBeansProjects/POO/src/ejercicio_25/Agenda.txt");
        } catch (FileNotFoundException ex) {
            System.err.println("El fichero agenda no se ha encontrado.");
        }
        BufferedReader buffer = new BufferedReader(lectura);
        String linea="";
        while(linea!=null){
        try {
            linea= buffer.readLine();
             String[] fila=linea.split("+++");
               if (prof.equalsIgnoreCase(fila[7])){
                   Contacto nuevoProf= new Profesional(Integer.parseInt(fila[0]), fila[1], fila[2], fila[3], fila[5], fila[4], fila[6]);
                   Ej_25_Agenda_Imanol.agenda.add(nuevoProf);
               }
               if (amigo.equalsIgnoreCase(fila[7])) {
                Contacto nuevoAmigo= new Amigo(Integer.parseInt(fila[0]), fila[1] , fila[2], fila[3], fila[5],fila[4], Integer.parseInt(fila[6].substring(6, 10)), Integer.parseInt(fila[6].substring(3, 5)), Integer.parseInt(fila[6].substring(0, 2))) ;
                   Ej_25_Agenda_Imanol.agenda.add(nuevoAmigo);
            }
        } catch (IOException ex) {
             System.err.println("El fichero agenda no se ha encontrado.");
        } catch (NullPointerException exc) {
             System.err.println("");
        }
              
            }
        try {
            lectura.close();
        } catch (IOException ex) {
            System.out.println("El fichero agenda no se encuentra.");
        }*/
        String nombreArchivo = "agenda.ser"; //archivo serializable de la agenda.
        try {
            FileInputStream archivo = new FileInputStream(nombreArchivo);
            ObjectInputStream in = new ObjectInputStream(archivo);
            while(in.readObject()!=null){ //hago un bucle para cargar todos los contactos y lo corto con la excepción que salta cuando no lee nada nuevo.
             try{   Ej_25_Agenda_Imanol.agenda.add((Contacto) in.readObject());
            }catch(EOFException e){
                 break;
            }
            }
            archivo.close();
            in.close();     //cierro los flujos.
            System.out.println("Agenda cargada");
        } catch (IOException ex) {
            System.out.println("IOException cazada");
        } catch (ClassNotFoundException exc) {
            System.out.println("ClassNotFoundException cazada");
        }

    }
}
