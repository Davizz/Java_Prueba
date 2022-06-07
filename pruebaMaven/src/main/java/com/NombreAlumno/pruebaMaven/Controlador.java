package com.NombreAlumno.pruebaMaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
@RequestMapping("/")
	public String index( ) {
		return "index";
	}
}
