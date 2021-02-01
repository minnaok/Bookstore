package fi.oksa.Bookstore.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import fi.oksa.Bookstore.domain.Book;

@Controller
@ResponseBody
public class BookController {

	@GetMapping("/index")
	public String newBook(Model model) {
	model.addAttribute("book", new Book());
	return "book";
}
	
}