package miprimerproyecto.f.abstraccion;

import java.util.ArrayList;
import java.util.Arrays;

import miprimerproyecto.f.herencia.herencia_jerarquica.Burmes;
import miprimerproyecto.f.herencia.herencia_jerarquica.GatoComun;

public class Main {
	
	//1-3 HERO
	//4-5 BARBARO
	//6 ARQUERO
	//7 MAGO
	//8-11 MAIN

	public static void main(String[] args) {
		/* 8
		 * Las clases declaradas como abstractas no pueden ser instanciadas
		 */
		//Hero heroe = new Hero("Martin el magnifico");
		
		//9
		//normalmente tendriamos tendencia a crear una instancia de 
		//cada clase derivada de Hero
//		Barbaro conan = new Barbaro("Conan el bárbaro");
//		Arquero legolas = new Arquero("Legolas el elfo");
//		Mago balthasar = new Mago("Balthasar el blanco");
//
//		ArrayList<Object> heroes = new ArrayList<Object>(Arrays.asList(conan, legolas, balthasar));
//		for (Object hero : heroes) {
//			System.out.println(hero);
//			System.out.println("***************************************************************");
//		}
		
		
		//10
		//Pero JAVA soporta el polimorfismo y podemos crear 
		//las instancias usando la clase abstracta. 
		//CON UNA CLASE DOTADA DE HERENCIA 
		//(SIN INTERFAZ O SIN ABTRACCIÓN)
		//NO PODEMOS HACER LO SIGUIENTE: 
//		Gato burmes = new Burmes(4, 2);
//		Gato gatocomun = new GatoComun(4, 2);
//		Burmes burmes = new Gato(4, 2);
//		GatoComun gatocomun = new Gato(4, 2);
//		Burmes burmes = new Burmes(4, 2);
//		GatoComun gatocomun = new GatoComun(4, 2);
		
		//11 PERO CON CLASES ABSTRACTAS Y CON INTERFACES SÍ
		Hero conan = new Barbaro("Conan el bárbaro");
		Hero legolas = new Arquero("Legolas el elfo");
		Hero balthasar = new Mago("Balthasar el blanco");

		ArrayList<Hero> heroes = new ArrayList<Hero>(Arrays.asList(conan, legolas, balthasar));
		for (Hero hero : heroes) {
			System.out.println(hero);
			System.out.println("***************************************************************");
		}

	}

}
