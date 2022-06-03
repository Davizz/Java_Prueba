package miprimerproyecto;

import java.util.ArrayList;
import java.util.Arrays;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/index")
	public String index2() {
		return "index";
	}

	@RequestMapping("/contacto")
	public String contacto() {
		return "contacto";
	}

	@RequestMapping("/formulario")
	public String formulario() {
		return "formulario";
	}

	@RequestMapping("/saludo")
	public String saludo() {
		return "saludo";
	}

	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String usuario(Model model) {
		Usuario usuario = new Usuario();

		model.addAttribute(usuario);
		// mi vista JSP es usuario
		return "usuario";
	}

	@RequestMapping(value = "/crea_usuario", method = RequestMethod.POST)
	public String crea_usuario(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", usuario.getName());
		model.addAttribute("email", usuario.getEmail());
		return "crea_usuario";
	}

	@RequestMapping("/quienessomos")
	public String pruebasJsp(Model modelo) {
		ArrayList<String> ciudades = new ArrayList<String>(Arrays.asList("Madrid", "Bilbao", "Santander"));
		int edad = 18;
		boolean verif = true;
		int numFloresVendidas = 50;
		modelo.addAttribute("numFloresVendidas", numFloresVendidas);
		modelo.addAttribute("verif", verif);
		modelo.addAttribute("ciudades", ciudades);
		modelo.addAttribute("edad", edad);
		return "quienessomos";
	}

	
}
