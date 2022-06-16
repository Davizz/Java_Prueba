package herenciaxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Controlador {

	
	@RequestMapping("/")
	public ModelAndView poo () {
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("poo.xml");
		Producto miDisco = contexto.getBean("miDisco", Producto.class);
		Producto miLibro = contexto.getBean("miLibro", Producto.class);
		contexto.close();
		ModelAndView mv = new ModelAndView();
		mv.addObject("producto", miDisco);
		mv.addObject("producto2", miLibro);
		mv.addObject("titulo", "POO");
		mv.addObject("mensaje", "POO con XML");
		mv.setViewName("poo");
		return mv;
	}
	
}
