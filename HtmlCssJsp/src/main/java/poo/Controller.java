package poo;

import java.util.HashMap;
import java.util.Map;



import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

import poo.poo_herencia.Persona;
import poo.poo_interfaces.Tareas;


@org.springframework.stereotype.Controller
public class Controller {

	ClassPathXmlApplicationContext context;
	ModelAndView mv;

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/html")
	public String html() {
		return "html";
	}
	
	@RequestMapping("/css")
	public String css() {
		return "viendo_css";
	}



	@RequestMapping("/jsptags")
	public String jsptags() {
		return "jsptags";
	}

	@RequestMapping("/index")
	public String indexAlternativo() {
		return "index";
	}

	@RequestMapping("/contacto")
	public String contacto() {
		return "contacto";
	}	
	
	@RequestMapping("imagenes")
	public String imagenes() {
		return "imagenes";
	}
	
	@RequestMapping("/box")
	public String box() {
		return "prueba_con_box";
	}
	
	@RequestMapping("/ej261")
	public String ej261() {
		return "ej261";
	}
	
	@RequestMapping("/ej262")
	public String ej262() {
		return "ej262";
	}
	
	@RequestMapping("/ej27")
	public String ej27() {
		return "ej27";
	}	
	
	
	@RequestMapping("/bootstrap_pruebas")
	public String bootstrapPruebas() {
		return "bootstrap_pruebas";
	}
	

	/**
	 * Propone el formulario
	 * 
	 * @return String para apuntar a un fichero JSP
	 */
	@RequestMapping("/primer_formulario")
	public String primerFormulario() {
		return "primerFormulario";

	}

	/**
	 * Recibe y trata el formulario
	 * 
	 * @return String para apuntar a un fichero JSP
	 */
	@RequestMapping("/procesar_primer_formulario")
	public String procesarPrimerFormulario() {
		return "procesarPrimerFormulario";

	}

	/**
	 * Recibe y trata el formulario
	 * 
	 * @return String para apuntar a un fichero JSP
	 */
	@RequestMapping(value = "/usuario", method = RequestMethod.GET)
	public String showForm(Model modelo) {
		Usuario usuario = new Usuario();
		// Añadimos información al modelo
		modelo.addAttribute("usuario", usuario);
		return "usuario";		
    }

	@RequestMapping(value = "/crea_usuario", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("usuario") Usuario usuario, BindingResult result, ModelMap model) {
		if (result.hasErrors()) {
			return "error";
		}
		model.addAttribute("name", usuario.getName());
		model.addAttribute("email", usuario.getEmail());

		return "crea_usuario";
	}

	@RequestMapping("/poo")
	public ModelAndView poo(ClassPathXmlApplicationContext context, ModelAndView mv) {
		context = new ClassPathXmlApplicationContext("poo.xml");
		Coche miCoche = context.getBean("miCoche", Coche.class);
		System.out.println(miCoche);
		System.out.println(miCoche.getDescripcion());
		context.close();

		mv = new ModelAndView();
		mv.addObject("coche", miCoche);
		mv.addObject("descripcion", miCoche.getDescripcion());
		mv.addObject("valid_poo", "ok");
		mv.setViewName("poo");

		return mv;
	}

	// De aquí sale la ruta en la URL
	@RequestMapping("/poo_con_herencia")
	public ModelAndView poo_con_herencia(ClassPathXmlApplicationContext context, ModelAndView mv) {
		context = new ClassPathXmlApplicationContext("/poo.xml");

		Persona pascal = context.getBean("pascal", Persona.class);
		System.out.println(pascal);
		Persona eric = context.getBean("eric", Persona.class);
		System.out.println(eric);

		context.close();

		Map<String, Persona> model = new HashMap<>();
		model.put("eric", eric);
		model.put("pascal", pascal);
		mv = new ModelAndView("poo", model);
		mv.addObject("valid_poo_herencia", "ok");

		return mv;
	}

	// De aquí sale la ruta en la URL
	@RequestMapping("/poo_con_interfaces")
	public String poo_con_interfaces(ClassPathXmlApplicationContext context, Model model) {
		context = new ClassPathXmlApplicationContext("poo.xml");
		Tareas michel = context.getBean("michel", Tareas.class);
		System.out.println(michel);
		System.out.println(michel.getTienda());

		Tareas annie = context.getBean("annie", Tareas.class);
		System.out.println(annie);
		System.out.println(annie.getTienda());
		context.close();

		model.addAttribute("michel", michel);
		model.addAttribute("annie", annie);
		model.addAttribute("valid_poo_interfaces", "ok");

		return "poo";
	}

}
