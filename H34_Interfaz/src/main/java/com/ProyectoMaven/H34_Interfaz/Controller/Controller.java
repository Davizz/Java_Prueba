package com.ProyectoMaven.H34_Interfaz.Controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ProyectoMaven.H34_Interfaz.Producto.Producto;

@org.springframework.stereotype.Controller
public class Controller {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	@RequestMapping("/poo_H34")
	public ModelAndView poo() {
		// Crear un contexto entre el XML y una de nuestras clases
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("poo_vacio.xml");
		// Crear una instancia de la clase coche según el BEAN del XML
		Producto disco1 = context.getBean("disco1", Producto.class);
		// Impresiones de prueba
		System.out.println(disco1);

	// Liberando espacio en memoría
	context.close();
	// Creando vista
	ModelAndView mv = new ModelAndView();
	// Asignado valores a la vista
	mv.addObject("nombre", "Fairy");
	mv.addObject("precio", "200");
	

	// Asignar nombre del JSP
	mv.setViewName("poo");
	// devolvemos vista
	return mv;
	}
	}

