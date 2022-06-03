package pruebaspring;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;



@org.springframework.stereotype.Controller
public class Controller {

	// La barra "/" corresponde a web.xml que está en servlet
	@RequestMapping("/")
	public String index() {
		return "index";
	}

//hace ruta en la url
	@RequestMapping("/html")
	public String html() {

		// nombre del fichero JSP
		return "html";
	}

	@RequestMapping("/G26")
	public String G26() {
		return "G26";
	}

	@RequestMapping("/css")
	public String css() {
		return "css";
	}

	@RequestMapping("/G27")
	public String G27() {
		return "G27";
	}

	@RequestMapping("/bootstrap_pruebas")
	public String bootstrap_pruebas() {
		return "bootstrap_pruebas";
	}

	@RequestMapping("/G28")
	public String G28() {
		return "G28";
	}

	@RequestMapping("/prueba_jsp")
	public String pruebasJsp(Model modelo) {

		int edad = 12;
		modelo.addAttribute("edad", edad);
		return "prueba_jsp";
	}

	@RequestMapping("/G29")

	public String G29(Model modelo) {
		ArrayList<String> coches = new ArrayList<String>();
		coches.add("BMW");
		coches.add("Ford");
		coches.add("Mazda");
		modelo.addAttribute("coches", coches);

		boolean verif = false;
		modelo.addAttribute("verif", verif);

		int numfloresvendidas = 15;
		modelo.addAttribute("numfloresvendidas", numfloresvendidas);

		return "G29";

	}

	@RequestMapping("/G30")
	public String G30() {
		return "G30";
	}

	@RequestMapping("/G30_Saludo")
	public String G30_Saludo() {
		return "G30_Saludo";

	}

	@RequestMapping("/G31")
	public String G31() {
		return "G31";

	}
	@RequestMapping("/G31_Saludo")
	public String G31_Saludo() {
		return "G31_Saludo";

	}
		
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String usuario(Model model) {
		Coche usuario = new Coche();

		model.addAttribute(usuario);
		// mi vista JSP es usuario
		return "usuario";
	}

	@RequestMapping(value = "/crea_usuario", method = RequestMethod.POST)
	public String crea_usuario(@Valid @ModelAttribute("usuario") Coche usuario, BindingResult result,
			ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", usuario.getName());
		model.addAttribute("email", usuario.getEmail());
		return "crea_usuario";
	}
}