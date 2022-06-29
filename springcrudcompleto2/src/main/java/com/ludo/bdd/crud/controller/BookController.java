//mio
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ludo.bdd.crud.model.Book;
import com.ludo.bdd.crud.service.BookService;
import com.ludo.bdd.crud.service.CategoryService;

@Controller
@RequestMapping(value = "/book")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/list")
	public String bookForm(Locale locale, Model model) {

		model.addAttribute("book", new Book());		
		addAttributes(model, "Formulario Libros", "Formulario para añadir/modificar los libros");
		//return "bookForm";
		return "bookList";
	}
	
	@GetMapping("/edit")
	public String editBook(@RequestParam("id") long id, Model model) {	
		Book book = bookService.getBook(id); 			
		model.addAttribute(book);
		addAttributes(model, "Formulario Libros", "Formulario para añadir/modificar los libros");
		//return "bookForm";
		return "bookList";
	}
	
	private void addAttributes(Model model, String ttl, String msj) {
		model.addAttribute("categories", categoryService.listCategories());
		model.addAttribute("books", bookService.listBooks());
		model.addAttribute("how_many", bookService.numBooks());
		model.addAttribute("titulo", ttl);
		model.addAttribute("descripcion", msj);
		model.addAttribute("menu", "lista_libros");
	}
	
	@PostMapping("/save")
	   public String saveBook(@ModelAttribute("book") @Valid Book book,
	         BindingResult result, Model model) {

	      if (result.hasErrors()) {
	    	  addAttributes(model, "Formulario Libros", "Formulario para añadir/modificar los libros");
	         //model.addAttribute("books", bookService.listBooks());
	         //return "bookForm";
	         return "bookList";
	      }

	      bookService.save(book);

	      return "redirect:/book/list";
	   }
	
	@GetMapping("/delete")
	public String deleteBook(@RequestParam("id") long id) {		
		bookService.deleteBook(id);
		return "redirect:/book/list";
	}
}
