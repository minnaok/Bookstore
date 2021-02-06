package fi.oksa.Bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import fi.oksa.Bookstore.domain.Book;
import fi.oksa.Bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository) {
		return (args) -> {
			
		System.out.println("save acouple of books to db");
		repository.save(new Book("233-344", "Minna Oksa", "Minun maani", 2010, 20.2));
		repository.save(new Book("233-345", "Minna Oksa", "Kukka", 2020, 20.5));
		
		System.out.println("fetch all books from db");
		for (Book book : repository.findAll()) {
			System.out.println(book.toString());
		}
	
		};
}}
