package com.ProyectoMaven.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public ModelAndView prepareViewPrincipal() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus 2B");
		mv.addObject("descripcion", "Pruebas de formulario con Spring");
		mv.setViewName("null");
		return mv;
	}

}
