package com.ludo.bdd.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({ "/index", "/" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("descripcion",
				"Finalización CRUD libros Fantastico C2B(funciona TODOOOOOO!!!!). Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "index");
		mv.setViewName("index");

		return mv;
	}

	@RequestMapping("/contacto")
	public String contacto(Model model) {
		model.addAttribute("menu", "contacto");
		return "contacto";
	}

	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Página de login");
		mv.addObject("descripcion", "Presentación de las funciones login usando Java Framework Security");

		mv.setViewName("login");
		return mv;
	}

	@GetMapping("/forbidden")
	public ModelAndView forbidden() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Contenidos restringidos");
		mv.addObject("descripcion", "Ups! Por lo que parece, no puedes acceder a estos contenidos");

		mv.setViewName("forbidden");
		return mv;
	}

}
