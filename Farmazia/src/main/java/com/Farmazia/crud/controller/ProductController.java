package com.Farmazia.crud.controller;

import java.util.Locale;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Farmazia.crud.model.Product;
import com.Farmazia.crud.service.ProductService;
import com.Farmazia.crud.service.CategoryService;


@Controller
@RequestMapping(value = "/product")
public class ProductController {
@Autowired
private ProductService productService;

@Autowired
private CategoryService categoryService;

@GetMapping("/list")
public String productForm(Locale locale, Model model) {
	model.addAttribute("product", new Product());
	addAttributes(model, "Formulario Productos", "Formulario para añadir/modificar los productos");
	return "productList";
}

@GetMapping("/edit")
public String editProduct(@RequestParam("id") long id, Model model) {
	Product product = productService.getProduct(id);
	model.addAttribute(product);
	addAttributes(model, "Formulario Productos", "Formulario para añadir/modificar los productos");
	return "productList";
}

private void addAttributes(Model model, String ttl, String msj) {
	model.addAttribute("categories", categoryService.listCategories());
	model.addAttribute("products", productService.listProducts());
	model.addAttribute("how_many", productService.numProducts());
	model.addAttribute("titulo", ttl);
	model.addAttribute("descripcion", msj);
	model.addAttribute("menu", "lista_productos");
}

@PostMapping("/save")
public String saveBook(@ModelAttribute("product") @Valid Product product, BindingResult result, Model model) {

	if (result.hasErrors()) {
		model.addAttribute(product);
		addAttributes(model, "Formulario Productos", "Formulario para añadir/modificar los productos");
		// model.addAttribute("books", bookService.listBooks());
		return "productList";
	}

	productService.save(product);

	return "redirect:/product/list";
}

@GetMapping("/delete")
public String deleteProduct(@RequestParam("id") long id) {
	productService.deleteProduct(id);
	return "redirect:/product/list";
}
}
