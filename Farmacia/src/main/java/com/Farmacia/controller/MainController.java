package com.Farmacia.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Gestión Farmacia");
		mv.addObject("descripcion", "BBDD para gestión farmaceútica");
		mv.addObject("menu", "index");
		mv.setViewName("index");

		return mv;
	}

	@RequestMapping("/")
	public ModelAndView prepareView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Gestión Farmacia");
		mv.addObject("descripcion", "BBDD para gestión farmaceútica");
		mv.addObject("menu", "index");
		mv.setViewName("index");
		return mv;
	}
	
	@RequestMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("menu", "contacto");
		return "contacto";
	}	

}
