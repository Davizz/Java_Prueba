package com.nombrealumno.poo.poo_anotaciones;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
 
//ElementType.FIELD: se puede aplicar a un miembro de la clase.
//ElementType.TYPE: se puede aplicar a cualquier elemento de la clase.
//RetentionPolicy.RUNTIME: Retenida en tiempo de ejecución, sólo se puede acceder a ella en este tiempo
//
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Imprimible {
	/**__Fase_001__
	 * 
	 * Una anotación es una interface durante su declaración
	 * y la instancia de una clase que implementa esta interfaz
	 * durante su uso
	 * Por eso el @interface 
	 * 
	 * Una vez compilado la anotación puede ser utilizada en el código
	 * 
	 * podemos añadir propiedades a la anotación simplemente definiendo 
	 * un método cuyo nombre corresponde al nombre de la propiedad. 
	 * Los tipos permitidos son los String, tipos primitivos, enum, 
	 * annotaciones, el tipo Class. También podemos usar Arrays. 
	 * 
	 * Si lo necesitamos podemos definir un valor por defecto. 
	 * Aquí: false
	 * 
	 * */
 
    boolean mayusculas() default false;
 
}
