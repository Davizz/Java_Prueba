package com.nombrealumno.poo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nombrealumno.poo.poo_anotaciones.Config;
import com.nombrealumno.poo.poo_anotaciones.Libro;
import com.nombrealumno.poo.poo_anotaciones.Samsung;
import com.nombrealumno.poo.poo_herencia.Persona;
import com.nombrealumno.poo.poo_interfaces.Tareas;

@org.springframework.stereotype.Controller
public class Controller {
	@RequestMapping(value = "/")
	public ModelAndView saluda() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus 2B");
		mv.addObject("mensaje", "Mi Primera Aplicación con Maven y Spring MVC");
		mv.setViewName("index");

		return mv;
	}
	
	@RequestMapping("/index")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("titulo", "Campus C2B");
		mv.addObject("mensaje", "Mi Primera Aplicación con Maven y Spring MVC");
		mv.setViewName("index");

		return mv;
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
	//	mv.addObject("descripcion", miCoche.getDescripcion());
		mv.addObject("valid_poo", "ok");
		mv.addObject("titulo", "Programación orientada a objetos");
		mv.addObject("mensaje", "Manejo de Beans en un contexto de POO básica");
		
		mv.setViewName("poo");

		return mv;
	}

	// De aquí sale la ruta en la URL
	@RequestMapping("/poo_con_herencia")
	public ModelAndView poo_con_herencia(ClassPathXmlApplicationContext context, ModelAndView mv) {
		context = new ClassPathXmlApplicationContext("poo.xml");

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
		mv.addObject("titulo", "Herencia y Beans");
		mv.addObject("mensaje", "Manejo de Beans en un contexto de POO con herencia");
	

		return mv;
	}

	// De aquí sale la ruta en la URL
	@RequestMapping("/poo_con_interfaces")
	public String poo_con_interfaces(ClassPathXmlApplicationContext context, Model model) {
		context = new ClassPathXmlApplicationContext("poo.xml");
		Tareas michel = context.getBean("michel", Tareas.class);
		System.out.println(michel);
		System.out.println(michel.getVentas());

		Tareas annie = context.getBean("annie", Tareas.class);
		System.out.println(annie);
		System.out.println(annie.getVentas());
		context.close();

		model.addAttribute("michel", michel);
		model.addAttribute("annie", annie);
		model.addAttribute("titulo", "Interfaces y Beans");
		model.addAttribute("mensaje", "Manejo de Beans en un contexto de POO con interfaces");
		model.addAttribute("valid_poo_interfaces", "ok");

		return "poo";
	}
	
	@RequestMapping("/poo_con_anotaciones")
	public String poo_con_anotaciones(Model model) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Samsung telefono = context.getBean("samsung", Samsung.class);
		System.out.println(telefono);
		context.close();
		
		model.addAttribute("telefono", telefono);
		
		model.addAttribute("titulo", "Interfaces y anotaciones");
		model.addAttribute("mensaje", "Manejo de Anotaciones en un contexto de POO con interfaces");
		model.addAttribute("valid_poo_anotaciones", "ok");
		
		return "poo";
	}
	
	/* __Fase_027__--> CONTROLLER */
	@RequestMapping("/estadisticas")
	public String estadisticas(Model model) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Libro aventuras1 = context.getBean("libro", Libro.class);	
		context.close();
		
		model.addAttribute("aventuras1", aventuras1);
		
		model.addAttribute("titulo", "Interfaces y anotaciones - parte 2");
		model.addAttribute("mensaje", "Accediendo a los datos de la interfaz");
		model.addAttribute("valid_poo_anotaciones_2", "ok");
		
		return "poo";
	}
	

}
