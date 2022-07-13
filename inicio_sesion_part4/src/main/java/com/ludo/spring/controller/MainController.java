package com.ludo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping({"/", "/index"})
	public ModelAndView prepareView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Java Spring con Campus C2B");
		mv.addObject("descripcion", "Pruebas y configuración del inicio de sesión. Tecnología Java Spring MVC, Maven y Bootstrap");
		mv.addObject("menu", "index");
		mv.setViewName("index");
		return mv;
	}
	
	
	@GetMapping("/login")
	public ModelAndView login() {		
		ModelAndView mv = new ModelAndView();	
		mv.addObject("titulo", "Página de login");
		mv.addObject("descripcion", "Presentación de las funciones login usando Java Framework Security");
		
		mv.setViewName("login");
		return mv;
	}
	
	@GetMapping("/admin")
	public ModelAndView admin() {		
		ModelAndView mv = new ModelAndView();	
		mv.addObject("titulo", "Página reservada a los administradores");
		mv.addObject("descripcion", "Presentación de las funciones de control de roles de usuario");
		
		mv.setViewName("admin");
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
