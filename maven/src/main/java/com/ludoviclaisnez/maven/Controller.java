package com.ludoviclaisnez.maven;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	//RUTA por la que 
	
	//Hemos dado de alta la ruta /poo
	@RequestMapping("/poo")
	public ModelAndView poo() {
		//Crear un contexto entre el XML y una de nuestras clases
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("poo.xml");
		//Crear una instancia de la clase coche según el BEAN del XML
		Coche miCoche = context.getBean("miCoche", Coche.class);
		//Impresiones de prueba
		System.out.println(miCoche);
		System.out.println(miCoche.getDescription());
		//Liberando espacio en memoría
		context.close();
		//Creando vista
		ModelAndView mv = new ModelAndView(); 
		//Asignado valores a la vista
		mv.addObject("coche", miCoche); 
		mv.addObject("titulo", "Programación orientada a objetos con XML"); 		
		mv.addObject("mensaje", "Manejo de beans en un contexto de POO básica."); 
		
		//Asignar nombre del JSP
		mv.setViewName("poo");
		//devolvemos vista
		return mv; 
	}
	
	
	
	//Hemos dado de alta la ruta /poo
		@RequestMapping("/poo_con_herencia")
		public ModelAndView poo_con_herencia() {
			//Crear un contexto entre el XML y una de nuestras clases
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("poo.xml");
			//Crear una instancia de la clase coche según el BEAN del XML
			Vehiculo miCoche = context.getBean("miCoche", Vehiculo.class);
			Vehiculo miCamion = context.getBean("miCamion", Vehiculo.class);
			//Impresiones de prueba
			System.out.println(miCoche);
			System.out.println(((Coche) miCoche).getDescription());
			//Liberando espacio en memoría
			context.close();
			//Creando vista
			ModelAndView mv = new ModelAndView(); 
			//Asignado valores a la vista
			mv.addObject("coche", miCoche); 
			mv.addObject("camion", miCamion); 
			mv.addObject("titulo", "Programación orientada a objetos con XML"); 		
			mv.addObject("mensaje", "Manejo de beans en un contexto de POO básica."); 
			
			//Asignar nombre del JSP
			mv.setViewName("poo_con_herencia");
			//devolvemos vista
			return mv; 
		}

}
