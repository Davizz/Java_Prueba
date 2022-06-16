package com.ludo.springsinxml.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ludo.springsinxml.models.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping(value = "/form", method = RequestMethod.GET)
	public String form(Model modelo) {
		User user = new User();
		modelo.addAttribute("user", user);
		modelo.addAttribute("titulo", "Pruebas de validación de formulario");
		modelo.addAttribute("descripcion", "Estamos realizando prubas");
		// para mejorar el posicionamiento de la página web al nivel de Google
		modelo.addAttribute("claves", "Pruebas con formularios, Formulario, Java Spring 2022");

		return "user_form";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String add(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap modelo) {
		if(result.hasErrors()) {
			return "user_form";
		}		
		modelo.addAttribute("user", user);
		modelo.addAttribute("titulo", "Pruebas de validación de formularios");
		modelo.addAttribute("descripcion",
				"Estamos realizando pruebas de validación de formulario de tipo producto con Hibernate. ");
		
		modelo.addAttribute("claves", "Pruebas con formularios, Formulario, Java Spring 2022");

		return "user_add";

	}

}
