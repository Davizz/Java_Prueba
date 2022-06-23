package com.ludo.bdd.crud.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ludo.bdd.crud.model.User;
import com.ludo.bdd.crud.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/")
	public String userForm(Locale locale, Model model) {

		model.addAttribute("user", new User());
		model.addAttribute("users", userService.list());

		return "userForm";
	}
	
	/* @GetMapping("/getRule")
    public Rule getRule(){
        Rule rule=new Rule(" @GetMapping","404");
        return rule;
    }
 
    @RequestMapping(method = RequestMethod.GET  ,value = "/getRule2")
    public Rule getRule2(){
        Rule rule=new Rule("@RequestMapping(method = RequestMethod.GET ","404");
        return rule;
    }*/

	@PostMapping("/saveUser")
	public String saveUser(@ModelAttribute("user") @Valid User user, BindingResult result, Model model) {

		if (result.hasErrors()) {
			model.addAttribute("users", userService.list());
			return "userForm";
		}
		userService.save(user);
		return "redirect:/";
	}

	@GetMapping("/deleteUser")
	public String deleteUser(@RequestParam("id") long id) {		
		userService.delete(id);
		return "redirect:/";
	}
	
	@GetMapping("/editUser")
	public String editUser(@RequestParam("id") int id, Model model) {	
		User user = userService.get(id); 			
		model.addAttribute(user);
		model.addAttribute("users", userService.list());
		return "userForm";
	}

}
