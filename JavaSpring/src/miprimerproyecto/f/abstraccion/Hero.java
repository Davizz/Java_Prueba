package miprimerproyecto.f.abstraccion;

//1
/*Clases Abstractas
Las clases abstractas se declaran por medio de la palabra 
abstract */

abstract public class Hero {

	private String nombre;	

    public Hero(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    /* 2
    Estas clases pueden o no tener metodos abstractos, 
    Si la clase tiene aunque sea un solo 
    metodo abstracto debe ser declarado como abstracto*/
    public abstract String getDescripcion();    
    public abstract String getHabilidades();
    public abstract String getDebilidades();
    /*
     * 3
     * Hacer uso de clases abstractas es como proponer un molde 
     * de clase para las subclases */
    
}
