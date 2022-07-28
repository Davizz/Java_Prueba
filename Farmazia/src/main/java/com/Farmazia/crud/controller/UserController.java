package com.Farmazia.crud.controller;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

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

import com.Farmazia.crud.model.Role;
import com.Farmazia.crud.model.User;
import com.Farmazia.crud.service.ProductService;
import com.Farmazia.crud.service.RoleService;
import com.Farmazia.crud.service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	@Qualifier("servicesImpl")
	private UserService userService;

	@Autowired
	@Qualifier("servicesImpl")
	private ProductService productService;
	@Autowired
	@Qualifier("servicesImpl")
	private RoleService roleService;

	@GetMapping("/list")
	public String userForm(Locale locale, Model model) {

		model.addAttribute("user", new User());
		addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
		return "userForm";
	}

	@GetMapping("/edit")
	public String editUser(@RequestParam("username") String username, Model model) {
		User user = userService.getUser(username);
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
		userService.save(user);
		model.addAttribute("existe", existe);
		return "redirect:/user/list";
	}

	@GetMapping("/delete")
	public String deleteUser(@RequestParam("username") String username) {
		userService.deleteUser(username);
		return "redirect:/user/list";
	}

	@GetMapping("/loan_books")
	public String loanBooksUser(@RequestParam("username") String username, Model model) {
		User user = userService.getUser(username);
		model.addAttribute(user);
		model.addAttribute("booklist", productService.listProducts());
		model.addAttribute("titulo", "Listado de libros prestados a " + user.getName());
		model.addAttribute("descripcion", "Formulario para añadir/modificar libros prestados por " + user.getName());
		return "loanBooks";
	}

	@PostMapping("/confirm_loan")
	public String confirmLoan(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {
		Boolean existe = false;
		if (result.hasErrors()) {
			// System.out.println("Pasando por la sección errores");
			model.addAttribute(user);
			addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
			return "userForm";
		}

		userService.loanProducts(user);
		model.addAttribute(user);
		addAttributes(model, "Formulario Usuarios", "Formulario para añadir/modificar los usuarios");
		model.addAttribute("existe", existe);
		return "redirect:/user/list";
	}

	@GetMapping("/ver")
	public String ver(@RequestParam("username") String username, Model model) {
		User user = userService.getUser(username);
		model.addAttribute(user);
		model.addAttribute("titulo", "Ver Detalle Usuario " + user.getName());
		model.addAttribute("descripcion", "Tabla que muestra los detalles de usuario " + user.getName());
		return "ver";
	}

	@GetMapping("/role")
	public String userRole(@RequestParam("username") String username, Model model) {
		User user = userService.getUser(username);
		ArrayList<String> roles = new ArrayList<>(Arrays.asList("ROLE_OWNER", "ROLE_USER", "ROLE_ADMIN"));
		model.addAttribute("roles", roles);
		model.addAttribute("role", new Role());
		model.addAttribute(user);
		model.addAttribute("users", userService.listUsers());
		model.addAttribute("titulo", "Gestionar los permisos de " + user.getName());
		model.addAttribute("descripcion", "Formulario para gestionar los permisos " + user.getName());
		return "userRole";
	}

	@PostMapping("/add_role")
	public String addRole(@ModelAttribute("role") @Valid Role role, BindingResult result, Model model) {

		if (result.hasErrors()) {

			return "redirect:/user/role";
		}
		roleService.save(role);
		return "redirect:/user/list";
	}

}
