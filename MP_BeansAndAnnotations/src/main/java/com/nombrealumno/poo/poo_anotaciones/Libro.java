package com.nombrealumno.poo.poo_anotaciones;

import java.lang.reflect.Field;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * __Fase_007__ -> CONFIGURACIÓN CLASE LIBRO Spring escanea todas las clases.
 * Cuando encuentra una anotación @Component, la registra automaticamente como
 * un BEAN La ID por defecto del BEAN será el nombre de la clase con la primera
 * letra en minuscula salvo si el nombre empieza por varias mayusculas.
 * Ejemplo1: RESTService dará RESTService Ejemplo2: Libro dará libro. Se
 * importará la clase import org.springframework.stereotype.Component;
 * 
 * __Fase_013__ -> ALCANCE Podemos definir el scope (alcance/ámbito) de un BEAN
 * con la anotación @Scope Esta anotación soporta 5 tipos de scope 3 de ellos
 * solo son valables para aplicaciones web request, session y globalsession El
 * scope por defecto es singleton Previene de la perdida de memoría como ya lo
 * he explicado en otras ocasiones: Si en Java creo un objeto A que depende de
 * otro objeto B, durante todo el tiempo en el que estoy utilizando A, el
 * sistema no se puede deshacer de B. Pero ¿qué podría occurir si A hace lo
 * mismo con C, D, u E?... Podría haber un problema de perdida de memoria //En
 * el caso de Spring, ya que por defecto todos los objetos de una clase apuntan
 * al mismo espacio de memoria, la carga es menor. En el caso actual, ya que
 * vamos a utilizar la clase Config, tendriamos que indicar el scope justo
 * después del Bean de Config
 * 
 * @author Ludovic
 */
@Component
public class Libro implements Categoria {
	/*
	 * __Fase_002__ -> CREACIÓN MÉTODO PROCESAR, 
	 * PROPIEDADES, CONSTRUCTORES, GETTERS/SETTERS Y
	 * TO_STRING
	 */
	@Imprimible(mayusculas = false)
	String titulo;
	@Imprimible(mayusculas = true)
	String autor;
	
	public static void procesar(List<Object> lista) {

		try {
			for (Object o : lista) {
				Field[] campos = o.getClass().getDeclaredFields();

				for (Field campo : campos) {

					Imprimible imprimir = campo.getAnnotation(Imprimible.class);
					// System.out.println(imprimir);
					if (imprimir != null) {
						if (imprimir.mayusculas()) {
							System.out.println(campo.get(o).toString().toUpperCase());
						} else {
							System.out.println(campo.get(o).toString());

						}
					}
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/* __Fase_008__ -> DARLE A LIBRO UNA INTERFAZ */
	String categoria;

	@Override
	public String getCategoria() {
		// TODO Auto-generated method stub
		return categoria;
	}

	public Libro() {
	}

	public Libro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	@Autowired
	public Libro(String titulo, String autor, String categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	/* __Fase_010__ -> ACTUALIZAR EL TO_STRING CLASE LIBRO */
	@Override
	public String toString() {
		return "Libro titulado \"" + getTitulo() + "\" escrito por " + getAutor()
		/* + "colocado en la categoría " + getCategoria() */
				+ ".\n";
	}

//	Ciclo de vida de un BEAN
//	El ciclo de vida de un BEAN es bastante sencillo: 
//	Es instanciado, añadido al contenedor cuando tiene que ser utilizado y destruido 
//	un vez el contenedor destruido. 
//	Para ayudar a su configuración, existen 2 métodos que están utilizados a la creación 
//	y a la destrucción del bean
//	El método de inicialización está llamado inmediatamente durante su instanciación
//	y el método de destrucción justo después de que el Bean sea destruido, 

	@PostConstruct
	public void init() {
		System.out.println("Se está realizando el acceso a bases de datos.");
	}

	@PreDestroy
	public void destroy() throws Exception {
		System.out.println("Se está cerrando el acceso a bases de datos.");
	}

	/*
	 * __Fase_019__ AÑADIR LOS ELEMENTOS PARA LA INYECCIÓN DE DEPENDENCIAS SE PUEDEN
	 * PONER EN ATRIBUTOS O EN MÉTODOS QUÉ TIENE UNA RELACIÓN CON LA INTERFAZ
	 * 
	 */
	private Vendible venta;

	@Autowired
	@Qualifier("noDisponible")
	public void setVenta(Vendible v) {
		venta = v;
	}

	/*
	 * __Fase_X022__--> ACTUALIZANDO VALOR @QUALIFIER PARA MOSTRAR EL FALSE
	 */

	public void realizaVenta() {
		if (venta.vender()) {
			System.out.println("venta realizada");
		} else {
			System.out.println("Venta imposible");
		}
	}

	/*
	 * __Fase_025__--> ACTUALIZANDO VALOR @QUALIFIER PARA MOSTRAR EL ACCESO A
	 * MÉTODOS
	 */

	private Estadisticas estadisticas;

	@Autowired
	@Qualifier("estadisticasLibros")
	public void setEstadisticas(Estadisticas e) {
		estadisticas = e;
	}

	public Estadisticas getEstadisticas() {
		return estadisticas;
	}

}
