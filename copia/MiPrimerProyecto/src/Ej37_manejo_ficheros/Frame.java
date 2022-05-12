/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej37_manejo_ficheros;

import javax.swing.JFrame;

/**
 *
 * @author Imanol Recio
 */
public class Frame extends JFrame {
    public Frame(){
        setBounds(50,50,550,500);
        setTitle("Manejo de Archivos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new Panel());
        setVisible(true);
    }
}
