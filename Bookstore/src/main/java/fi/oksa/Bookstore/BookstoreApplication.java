package fi.oksa.Bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import fi.oksa.Bookstore.domain.Book;
import fi.oksa.Bookstore.domain.BookRepository;
import fi.oksa.Bookstore.domain.Category;
import fi.oksa.Bookstore.domain.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository repository, CategoryRepository crepository) {
		return (args) -> {
			log.info("save a couple of students");
			crepository.save(new Category("Horror"));
			crepository.save(new Category("Fiction"));
			crepository.save(new Category("Children"));
			
		System.out.println("save acouple of books to db");
		repository.save(new Book("233-344", "Minna Oksa", "Minun maani", 2010, 20.2, crepository.findByName("Horror").get(0)));
		repository.save(new Book("233-345", "Minna Oksa", "Kukka", 2020, 20.5, crepository.findByName("Horror").get(0)));
		
		System.out.println("fetch all books from db");
		for (Category category : crepository.findAll()) {
			System.out.println(category.getName());
		}
	
		};
}}
