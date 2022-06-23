package com.ludo.bdd.crud.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.Locale;

import javax.validation.ConstraintViolationException;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ludo.bdd.crud.model.User;
import com.ludo.bdd.crud.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	@Qualifier("servicesImpl")
	private UserService userService;

	@GetMapping("/list")
	public String userForm(Locale locale, Model model) {

		model.addAttribute("user", new User());
		addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
		return "userForm";
	}

	@GetMapping("/edit")
	public String editUser(@RequestParam("id") long id, Model model) {
		User user = userService.getUser(id);
		model.addAttribute(user);
		addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
		return "userForm";
	}

	private void addAttributes(Model model, String ttl, String msj) {
		model.addAttribute("users", userService.listUsers());
		model.addAttribute("how_many", userService.numUsers());
		model.addAttribute("titulo", ttl);
		model.addAttribute("descripcion", msj);
		model.addAttribute("menu", "lista_usuarios");
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model)
			throws SQLIntegrityConstraintViolationException {
		Boolean existe = false;
		if (result.hasErrors()) {
			model.addAttribute(user);
			addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
			return "userForm";
		}
		try {
			userService.save(user);
		} catch (Exception e) {
//		    if(e.getCause() != null && e.getCause().getCause() instanceof SQLIntegrityConstraintViolationException) {
			if (e.getCause() != null && e.getCause().getCause() instanceof ConstraintViolationException) {
//		        SQLIntegrityConstraintViolationException sql_violation_exception = (SQLIntegrityConstraintViolationException) e.getCause().getCause() ;
				ConstraintViolationException violation_exception = (ConstraintViolationException) e.getCause()
						.getCause();
				// System.out.println("Hola");
				// log.error("SQLIntegrityConstraintViolationException has accured. " +
				// sql_violation_exception.getMessage());
				e.printStackTrace();
				existe = false;
			} else {
				// log.error(e.getMessage());
				// System.out.println("Hola");
//		    	e.printStackTrace();
				existe = true;
			}
			model.addAttribute(user);
			addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");

			model.addAttribute("existe", existe);
			return "userForm";
		}
		model.addAttribute("existe", existe);
		return "redirect:/user/list";
	}

//	@PostMapping("/save")
//	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
//
//		String existe = "no";
//
//		if (result.hasErrors()) {
//			model.addAttribute("users", userService.listUsers());
//			return "userForm";
//		}
//		try {
//			userService.save(user);
//		} catch (Exception e) {
//			
//			existe = "yes";
//		} finally {
//			System.out.println(existe);
//			model.addAttribute("existe", existe);
//		}
//		return "redirect:/user/list";
//	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("id") long id) {
		userService.deleteUser(id);
		return "redirect:/user/list";
	}

}
