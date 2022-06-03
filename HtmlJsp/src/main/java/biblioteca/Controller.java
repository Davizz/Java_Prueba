package biblioteca;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {
	


	@RequestMapping("/")	
	public String index() {
		return "index";
	}	
	
	@RequestMapping("/html")	
	public String html() {
		return "html";
	}	
	
	@RequestMapping("/index")
	public String indexAlternativo() {
		return "index";
	}
	
	@RequestMapping("/contacto")
	public String contacto() {
		return "contacto";
	}
	
	@RequestMapping("/otro")
	public String otro() {
		return "otro";
	}
	
	
	


	

}
