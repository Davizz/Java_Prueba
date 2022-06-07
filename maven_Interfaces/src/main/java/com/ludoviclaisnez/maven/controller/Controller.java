package com.ludoviclaisnez.maven.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ludoviclaisnez.maven.model.persona.Persona;
import com.ludoviclaisnez.maven.model.vehiculo.Coche;
import com.ludoviclaisnez.maven.model.vehiculo.Vehiculo;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	// Hemos dado de alta la ruta /poo
	@RequestMapping("/poo")
	public ModelAndView poo() {
		// Crear un contexto entre el XML y una de nuestras clases
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
		// Crear una instancia de la clase coche según el BEAN del XML
		Coche miCoche = context.getBean("miCoche", Coche.class);
		// Impresiones de prueba
		System.out.println(miCoche);
		System.out.println(miCoche.getDescription());
		// Liberando espacio en memoría
		context.close();
		// Creando vista
		ModelAndView mv = new ModelAndView();
		// Asignado valores a la vista
		mv.addObject("coche", miCoche);
		mv.addObject("titulo", "Programación orientada a objetos con XML");
		mv.addObject("mensaje", "Manejo de beans en un contexto de POO básica.");
		mv.addObject("valid_poo", "TRUE");

		// Asignar nombre del JSP
		mv.setViewName("poo");
		// devolvemos vista
		return mv;
	}

	// Hemos dado de alta la ruta /poo
	@RequestMapping("/poo_con_herencia")
	public ModelAndView poo_con_herencia() {
		// Crear un contexto entre el XML y una de nuestras clases
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
		// Crear una instancia de la clase coche según el BEAN del XML
		Vehiculo miCoche = context.getBean("miCoche", Vehiculo.class);
		Vehiculo miCamion = context.getBean("miCamion", Vehiculo.class);
		// Impresiones de prueba
		System.out.println(miCoche);
		System.out.println(((Coche) miCoche).getDescription());
		// Liberando espacio en memoría
		context.close();
		// Creando vista
		ModelAndView mv = new ModelAndView();
		// Asignado valores a la vista
		mv.addObject("coche", miCoche);
		mv.addObject("camion", miCamion);
		mv.addObject("titulo", "Programación orientada a objetos con XML");
		mv.addObject("mensaje", "Manejo de beans en un contexto de POO básica.");
		mv.addObject("valid_poo_herencia", "TRUE");
		// Asignar nombre del JSP
		mv.setViewName("poo");
		// devolvemos vista
		return mv;
	}

	// Hemos dado de alta la ruta /poo
	@RequestMapping("/poo_ej33")
	public ModelAndView poo_ej33() {
		// Crear un contexto entre el XML y una de nuestras clases
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
		// Crear una instancia de la clase coche según el BEAN del XML
		Persona miEstudiante = context.getBean("miEstudiante", Persona.class);
		Persona miTrabajador = context.getBean("miTrabajador", Persona.class);
		// Impresiones de prueba
		System.out.println(miEstudiante);
		System.out.println(miTrabajador);
		// System.out.println(((Coche) miCoche).getDescription());
		// Liberando espacio en memoría
		context.close();
		// Creando vista
		ModelAndView mv = new ModelAndView();
		// Asignado valores a la vista
		mv.addObject("estudiante", miEstudiante);
		mv.addObject("trabajador", miTrabajador);
		mv.addObject("titulo", "Tarea 33");
		mv.addObject("mensaje", "Manejo de beans en un contexto de POO con herencia.");
		mv.addObject("valid_poo_ej33", "TRUE");
		// Asignar nombre del JSP
		mv.setViewName("poo");
		// devolvemos vista
		return mv;
	}
	
	// Hemos dado de alta la ruta /poo
		@RequestMapping("/poo_con_interfaces")
		public ModelAndView poo_con_interfaces() {
			// Crear un contexto entre el XML y una de nuestras clases
			ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo.xml");
			// Crear una instancia de la clase coche según el BEAN del XML
			Persona miTrabajador2 = context.getBean("miTrabajador2", Persona.class);
			// Impresiones de prueba
			System.out.println(miTrabajador2);
			// System.out.println(((Coche) miCoche).getDescription());
			// Liberando espacio en memoría
			context.close();
			// Creando vista
			ModelAndView mv = new ModelAndView();
			// Asignado valores a la vista
			mv.addObject("trabajador", miTrabajador2);
			mv.addObject("titulo", "POO con interfaces");
			mv.addObject("mensaje", "Manejo de beans en un contexto de POO con interfaces.");
			mv.addObject("valid_poo_interfaces", "TRUE");
			// Asignar nombre del JSP
			mv.setViewName("poo");
			// devolvemos vista
			return mv;
		}

}
