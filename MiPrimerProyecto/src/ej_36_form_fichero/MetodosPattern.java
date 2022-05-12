/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_36_form_fichero;
import java.util.regex.Pattern;
/**
 *
 * @author Imanol Recio
 */
public class MetodosPattern {
    public boolean comprobarNombre(String s){
        if (s!=null) {
          return Pattern.matches("^([a-zA-Z]+)\\s?([a-zA-Z]+)\\s?([a-zA-Z]+)$", s);
        }
        
        return false;
    }
    public boolean comprobarTlfn(String tlfn){
         if (tlfn!=null) {
          return Pattern.matches("^[6789]{1}[0-9]{8}$", tlfn);
        }
        
        return false;
    }
    public boolean comprobarNIE(String nie){
         if (nie!=null) {
          return Pattern.matches("^[xyzXYZ]-?[0-9]{7}-?[A-Za-z]$", nie);
        }
        
        return false;
    }
    public boolean comprobarFecha(String fecha){
        if (fecha!=null) {
          return Pattern.matches("^\\d{1,2}[/-]\\d{1,2}[/-]\\d{2}(\\d{2})?$", fecha);
        }
        
        return false;
    }
    public boolean comprobarEmail(String email){
         if (email!=null) {
          return Pattern.matches("^(.{2,})@(.{2,})\\.(.{2,})$", email);
        }
        
        return false;
        
    }
    public boolean compobarPasswordCuenta(String password){
        if (password!=null) {
          return Pattern.matches("^.*(?=.{8,})(?=..*[0-9])(?=.*[A-Z]).*$", password);
        }
        
        return false;
    }
}
