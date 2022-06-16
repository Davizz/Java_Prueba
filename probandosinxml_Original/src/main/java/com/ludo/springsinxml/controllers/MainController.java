package com.ludo.springsinxml.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Un controlador spring es una clase Java simple anotada con @MainController en la
 * declaración de la clase. * El controlador y/o sus métodos se asignan para
 * solicitar URI usando @RequestMapping. Con los métodos del controlador, "damos
 * de alta" rutas para manejar ficheros JSP. Puede haber múltiples clases de
 * controladores en una aplicación: * Un controlador está registrado como un
 * BEAN. Eso significa que podemos inyectar cualquier otro BEAN allí. * El
 * alcance predeterminado de un controlador es SINGLETON. Una clase de
 * controlador típica se ve así:
 */
@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView prepareViewPrincipal() {
		ModelAndView mv = new ModelAndView(); 
		
		mv.addObject("titulo", "Campus 2B");
		mv.addObject("descripcion", "Pruebas de formulario con Spring");
		//mejora el posicionamiento de la web a nivel de Google
		mv.addObject("claves", "Pruebas con formularios, Campus 2B, Java Spring 2022");
		
		mv.setViewName("index");
		
		return mv; 
	}
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView(); 
		
		mv.addObject("titulo", "Campus 2B");
		mv.addObject("descripcion", "Pruebas de formulario con Spring");
		//mejora el posicionamiento de la web a nivel de Google
		mv.addObject("claves", "Pruebas con formularios, Campus 2B, Java Spring 2022");
		
		mv.setViewName("index");
		
		return mv; 

}}
