package com.alumno.proyectogrupo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {

	@RequestMapping("/")
	public String index() {
		return "index";
	}


	
	/**
	 * Recibe y trata el formulario.
	 * Aquí se usa ModelMap y en otros métodos usamos Model. 
	 * Dentro de poco veremos también ModelAndView.
	 * Qué diferencia hay entre estas clases:
	 * 
	 * Model es una interfaz que define un soporte para los atributos del
	 * modelo. Solo está diseñado para agregar atributos al modelo.
	 * 
	 * ModelMap es una clase que implementa la interfaz MAP. Entonces contiene
	 * métodos para contar el número de elementos o para acceder a la KEY de un
	 * elemento, modificar el nombre de esta KEY...
	 * Podría resultar muy práctico en caso de manejar formularios. 
	 * Pues si nos da acceso al atributo name (con HTML) 
	 * o path (con JSP tags) del campo de formulario, podriamos condicionar 
	 * el compartamiento de la aplicación al momento de recibir datos de usuario.
	 * 
	 * //if(model.containsKey("email")) {
	 *	//"Haz esto";
	 *	//}
	 * 
	 * ModelAndView mantiene ambos para para hacer posible que un controlador
	 * devuelva tanto el modelo como la vista en un solo valor de retorno.
	 * 
	 * @return String para apuntar a un fichero JSP
	 */
	@RequestMapping("/user_form")
	public String userForm(Model modelo) {
		Usuario usuario = new Usuario();
		modelo.addAttribute(usuario);
		return "user_form";
	}

	@RequestMapping("/user_add")
	public String userAdd(@ModelAttribute("usuario") Usuario usuario, ModelMap model) {

		model.addAttribute("usuario", usuario);
		return "user_add";
	}
}
