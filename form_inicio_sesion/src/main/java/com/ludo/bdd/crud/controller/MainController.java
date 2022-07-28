package com.ludo.bdd.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("descripcion", "Pruebas de acceso a BDD en C2B. Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "index");
		mv.setViewName("index");

		return mv;
	}

	@RequestMapping("/")
	public ModelAndView prepareView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("descripcion", "Pruebas de acceso a BDD en C2B. Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "index");
		mv.setViewName("index");
		return mv;
	}

	@RequestMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("menu", "contacto");
		return "contacto";
	}

	@RequestMapping("/admin")
	public ModelAndView admin() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("descripcion", "Pruebas de acceso a BDD en C2B. Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "admin");
		mv.setViewName("admin");
		return mv;
	}
}
