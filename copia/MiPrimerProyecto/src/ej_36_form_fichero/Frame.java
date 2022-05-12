/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_36_form_fichero;

import javax.swing.JFrame;

/**
 *
 * @author Imanol Recio
 */
public class Frame extends JFrame {
    public Frame(){
        setBounds(100,100,550,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Nuevo usuario");
        Panel panel=new Panel();
        add(panel);
        setVisible(true);
    }
}
