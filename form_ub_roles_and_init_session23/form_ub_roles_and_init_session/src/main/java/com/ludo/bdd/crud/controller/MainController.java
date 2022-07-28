package com.ludo.bdd.crud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping({ "/", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Formación Java - Campus 2B 2022");
		String msj = "A lo largo de la versión 2.0 del POM, modificaré dicho modelo añadiendo algunas columnas de las que faltan "
				+ "(password, enabled), adaptaré las"
				+ "	tablas y los formularios para poder guardar/editar/leer usuarios.<br/>"
				+ "Probaré las relaciones que existen entre los modelos Book y User.<br/>"
				+ "Aprovecharé de las modificaciones para llevar a cabo unos pocos cambios al nivel de los estilos.<br/><br/>"
				+ "En la versión 2.1, haré una comprobación de las entradas password y incriptaré la contraseña ingresada.<br/>"
				+ "Cargaré la contraseña en una vista para comprobar que la parte desincriptación se está realizando correctamente."
				+ "Nos dará la ocasión de ver que le encriptación es una herramienta potente.<br/>"
				+ "Aquí lo importante es: modificar el limite varchar en el modelo User para Password. Puesto inicialmente a 50.<br/>"
				+ "También pensar en poner las dependencias de Spring Security en el POM<br/>"
				+ "Tener una validation comparando dos contraseñas<br/>"
				+ "Modificar el ServicesImpl para encriptar la contraseña...<br/><br/>"
				+ "En la versión 2.2, me encargaré de cambiar la columna principal ID en USERNAME.<br/>"
				+ "Probaré la inserción de nuevos usuarios con este criterio.<br/>" + "Añadiré la tabla role<br/><br/>"
				+ "En la versión 2.3, me encargaré de configurar la relación entre User y Role.<br/>"
				+ "Cambiaré los formularios para poder recibir este nuevo elemento.<br/>"
				+ "Limitaré los roles a 3 tipos de permisos que son: ROLE_OWNER, ROLE_USER, ROLE_ADMIN<br/><br/>"
				+ "En la versión 2.4, me encargaré de activar el inicio de session en la parte config con Spring Security.";
		mv.addObject("descripcion", "En esta versión, mi objetivo es modificar la estructura del modelo User "
				+ "para integrar el inicio de sesion tal y como lo vimos con el proyecto inicio_sesion_part4.");
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

}
