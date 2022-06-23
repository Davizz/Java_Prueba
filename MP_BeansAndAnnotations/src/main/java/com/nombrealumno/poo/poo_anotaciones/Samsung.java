package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Scope("prototype") 
/* 
 * Existen 5 tipos de scope. 
 * 3 disponibles solo para aplicaciones web. 
 * request, session y globalsession
 * Si en Java creo un objeto A que depende de otro
 * objeto B, durante todo el tiempo en el que estoy utilizando A, 
 * el sistema no se puede deshacer de B. 
 * Pero ¿qué podría occurir si A hace lo mismo con C, D, u E?... 
 * Podría haber un problema de perdida de memoria //En el caso de
 * Spring, ya que por defecto todos los objetos de una clase 
 * apuntan al mismo
 * espacio de memoria, la carga es menor.
 * 
 * Por defecto un bean sale en singleton, lo que nos convienen 
 * muy bien en la mayor parte de los casos. Sobre todo en arquitectura REST.
 */
@Component("samsung")
/*
 * Utilizamos la anotación @Component unicamente para los Beans que no pueden
 * estar clasificados en una de las 3 capas nombradas.
 * 
 * @Controller, @Service, @Repository
 */
public class Samsung extends Telefono implements Juegos {

	/*
	 * __01__ La inyección vía anotación se puede hacer directamente sobre una
	 * propiedad de la clase. Incluso si su visibilidad está configurada a private
	 * La principal anotación es @Autowired. Utiliza un mecanismo de autowiring por
	 * tipo Esto significa que Spring va a buscar un Bean cuyo tipo es compatible
	 * con la propiedad Si varios Beans son elegibles a la inyección, Spring buscará
	 * una correspondencia entre el nombre de la propiedad y el nombre del Bean.
	 */
	@Autowired
	@Qualifier("cincoG")
	private Internet conexionCincoG;

	private Juegos juegos;

	public Samsung() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * __02__
	 * @Autowired 
	 * es una anotación corriente. Pero ya veremos que no es la única y
	 * incluso no es absolutamente necesaria de utilizarla. 	
	 */
	@Autowired
	public Samsung(String nombre, String marca, int numero, Internet cincoG, Juegos juegos) {
		super(nombre, marca, numero, cincoG);
		this.setJuegos(juegos);
	}

	public Samsung(String nombre, String marca, int numero, CincoG cincoG, Juegos juegos) {
		super(nombre, marca, numero, cincoG);
		this.setJuegos(juegos);
	}

	public Samsung(String nombre, String marca, int numero, CincoG cincoG) {
		super(nombre, marca, numero, cincoG);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String tieneJuegosInstalados() {
		// TODO Auto-generated method stub
		return "Tiene unos cuantos juegos instalados.\n" + juegos.tieneJuegosInstalados();
	}

	
	public Juegos getJuegos() {
		return juegos;
	}

	public void setJuegos(Juegos juegos) {
		this.juegos = juegos;
	}

	@Override
	public String toString() {
		return super.toString() + tieneJuegosInstalados();
	}

}
