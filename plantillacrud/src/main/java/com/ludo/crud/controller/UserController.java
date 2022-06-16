package com.ludo.crud.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ludo.crud.model.User;
import com.ludo.crud.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	
	@GetMapping("/")
	public String userForm(Locale locale, Model modelo) {
		modelo.addAttribute("user", new User()); 
		
		modelo.addAttribute("users", userService.list());
		
		return "userForm"; 
	}
	
	
	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User user, 
			BindingResult result, Model modelo){
		
		if(result.hasErrors()) {
			modelo.addAttribute("users", userService.list());
			return "userForm";
		}
		
		userService.save(user);
		
		return "redirect:/";
		
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
