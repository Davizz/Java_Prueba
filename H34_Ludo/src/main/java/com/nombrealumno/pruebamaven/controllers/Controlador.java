package com.nombrealumno.pruebamaven.controllers;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nombrealumno.pruebamaven.models.Producto;


@Controller
public class Controlador {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/imprimeProductos")
	public ModelAndView imprimeProductos() {
		ClassPathXmlApplicationContext contexto = 
				new ClassPathXmlApplicationContext("poo.xml");
		Producto don_quijote = contexto.getBean("don_quijote", Producto.class);
		Producto thriller = contexto.getBean("thriller", Producto.class);
		
		System.out.println(don_quijote);
		contexto.close();
		ModelAndView mv = new ModelAndView(); 
		
		mv.addObject("don_quijote", don_quijote); 
		mv.addObject("thriller", thriller); 
		mv.addObject("titulo", "Impresión de un libro");
		mv.addObject("informacion", "Estamos corrigiendo la tarea 34");
		mv.setViewName("imprimeProductos");
		
		return mv; 
	}

}
