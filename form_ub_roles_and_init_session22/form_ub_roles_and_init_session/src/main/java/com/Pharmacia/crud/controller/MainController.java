package com.Pharmacia.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({ "/", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "BBDD FARMACIA");
		String msj = "Este proyecto consiste en la elaboración de una base de datos  "
				+ "de medicamentos farmaceúticos se integrarán en la misma que serán integrados en la misma"
				+ "	a partir de su categoría correspondiente.<br/<br/>"
				+ "Asimismo, habrá la opción de asignar 3 tipos de accesos a la misma"
				+ "en función del nivel de responsabilidad del usario (ADMIN, OWNER y USER). <br/><br/>"
				+ "Todos los datos serán exportados a una base de datos en formato SQL.<br/>"
				+ "Asimismo se podrán llevar a cabo las modificaciones correspondientes desde esta misma o desde la propia consola."
				+ "Nos dará la ocasión de ver que le encriptación es una herramienta potente.<br/>"
				+ "Aquí lo importante es: modificar el limite varchar en el modelo User para Password. Puesto inicialmente a 50.<br/>"
				+ "También pensar en poner las dependencias de Spring Security en el POM<br/>"
				+ "Tener una validation comparando dos contraseñas<br/>"
				+ "Modificar el ServicesImpl para encriptar la contraseña...<br/><br/>"
				+ "En la versión 2.2, me encargaré de cambiar la columna principal ID en USERNAME.<br/>"
				+ "Probaré la inserción de nuevos usuarios con este criterio.<br/>" + "Añadiré la tabla role<br/>"
				+ "En la versión 2.3, me encargaré de configurar la relación entre User y Role.<br/>"
				+ "cambiaré los formularios para poder recibir este nuevo elemento.<br/>"
				+ "Si todo va como previsto, seguiré activando el inicio de session en la parte config con Spring Security.";
		mv.addObject("descripcion", "Proyecto SPRING con JAVA para gestionar una Base de Datos farmaceútica.");
		mv.addObject("descripcion_larga", msj);
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
