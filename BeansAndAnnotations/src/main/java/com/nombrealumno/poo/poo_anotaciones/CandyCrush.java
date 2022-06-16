package com.nombrealumno.poo.poo_anotaciones;

import org.springframework.stereotype.Component;

/*
 * Para estas 4 anotaciones, podemos pasar el nombre del bean 
 * por parámetro. Por defecto, Spring coge el nombre sencillo 
 * de la clase poniendo la inicial en minuscula.
 * 
 * */
@Component("candyCrush")
public class CandyCrush implements Juegos {

	@Override
	public String tieneJuegosInstalados() {
		// TODO Auto-generated method stub
		return "Y hace poco se ha instalado el CandyCrush!!!";
	}

}
