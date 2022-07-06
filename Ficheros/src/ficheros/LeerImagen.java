/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ficheros;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ludovic Laisnez
 */
public class LeerImagen {

    public static void lee(String ruta) {
        int contador = 0;
        int datos_entrada[] = new int[70746];
        try {
            //no es obligatorio que sea un .txt
            FileInputStream lectura = new FileInputStream(ruta);

            boolean final_ar = false;
            while (!final_ar) {
                int byte_entrada = lectura.read();
                if (byte_entrada != -1) {
                    datos_entrada[contador] = byte_entrada;
                } else {
                    final_ar = true;
                }

                System.out.println(datos_entrada[contador]);
                contador++;
            }
            //Pasamos línea
            System.out.println();
            //Cerramos el flujo
            lectura.close();
            System.out.println(contador);
            copia(datos_entrada);
        } catch (IOException ex) {
            System.err.println("No se ha encontrado el fichero");
        }

    }

    public static void copia(int datosNuevoFichero[]) {
        try {
            FileOutputStream ficheroNuevo = new FileOutputStream("C:/Users/Usuario/Documents/Eclipse/Ficheros/src/ficheros/imagencopia.jpg");

            for (int i = 0; i < datosNuevoFichero.length; i++) {
                ficheroNuevo.write(datosNuevoFichero[i]);
            }
            ficheroNuevo.close();

        } catch (IOException ex) {
            Logger.getLogger(LeerImagen.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
