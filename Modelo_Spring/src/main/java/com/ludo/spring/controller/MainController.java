package com.ludo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView prepareView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("descripcion", "Pruebas de acceso a BDD en C2B. Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "index");
		mv.setViewName("hola_mundo");
		return mv;
	}
}
