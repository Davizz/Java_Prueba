package com.nombrealumno.poo.poo_anotaciones;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class Anotaciones {
	/** __Fase_000__
	 * Puesta en marcha de las anotaciones
	 * 
	 * Las anotaciones dan información sobre las entidades. Una anotación se utiliza
	 * con el caracter @ seguido del nombre de la anotación. Pueden utilizarse sobre
	 * paquetes, clases, interfaces, métodos, constructores, parámetros de métodos y
	 * propiedades de clases Una anotación puede tener uno o varios atributos Hay
	 * que usarlo de la forma siguiente:
	 * 
	 * @SuppressWarnings(value = "unchecked") 
	 * void maMethode() { }
	 * 
	 * Cuando una anotación solo tiene un atributo, podemos omitir su nombre
	 * 
	 * @SuppressWarnings("unchecked")
	 *	void maMethode() { }
	 * 
	 * Un atributo puede ser un array. En este caso, los distintos valores 
	 * están escritos entre comillas sobles y separados por una coma
	 * 
	 * @SuppressWarnings(value={"unchecked", "deprecation"})
	 * 
	 * El array puede contener anotaciones
	 * 
	 * @TODOItems({
  	 * @Todo(importance = Importance.MAJEUR, 
     *  description = "Ajouter le traitement des erreurs", 
     * assigneA = "JMD", 
     * dateAssignation = "07-11-2007"),
  	 * @Todo(importance = Importance.MINEURE, 
     * description = "Changer la couleur de fond", 
     * assigneA = "JMD", 
     * dateAssignation = "13-12-2007")
     * })
     * 
     * Se puede utilizar anotaciones en los comentarios del
     * javadoc para aportar más información acerca de ellas
     * @return {@link Samsung}
     * En el ejemplo anterior hacemos un link hacia la clase 
     * Samsung
     * Si las tenemos en los comentarios del javadoc, su color
     * cambia y entonces podemos acceder a más documentación
     * pulsando CTL + clic izquierdo  
     * 
     * 
     * Ya hemos tenido que utilizar ciertas anotaciones. 
     * Como por ejemplo: 
     * @Deprecated: Se utiliza para indicar que un elemento es obsoleto
     * y que no deberiamos utilizarla más
     * Se puede utilizar sobre una clase, una interfaz, un método o una propiedad
     * Las entidades obsoletas deberían de estar documentadas para 
     * explicar el motivo por el qué es así y para indicar cual es 
     * la entidad a utilizar ahora
     * 
     * @Override: indica que estamos pisando el valor de la entidad original 
     * Es muy útil para evitar errores de escritura en los nombres 
     * de los métodos a redefinir. 
     * 
     * @SuppressWarning: permite pedir al compilador que omita ciertos 
     * avisos que están detectados por defecto. 
     * Se puede omitir los avisos siguientes: 
     * deprecation, unchecked, fallthrough (comprueba que 
     * se haga uso de los breaks en los switch), 
     * path (comprueba las rutas que escribimos), 
     * serial (verifica la definición de la variable serialVersionUID), 
     * finally (verifica la ausencia de un return en la clausula finally)
	 * 
	 * Los podemos pasar por parametros
	 * @SuppressWarnings(value={"unchecked", "fallthrough"})
	 * 
	 * El ejemplo siguiente daría un aviso más si no 
	 * tuvieramos el suppresswarning activado en la 
	 * declaración de esta clase y del método
	 * 
	 * No es recomendado utilizarlo.
	 */ 
	
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
	    List datos = new ArrayList();
	    datos.add("valeur1");
	  }
	  
	  /**
	   * Existen un montón de anotaciones. Y no voy a listarlas aquí
	   * Lo que sí veremos son las anotaciones personnalisées
	   * en las clases Libro, Imprimible y MainLibro
	   * 
	   */
	  
	  
	  
	  
	  


}
