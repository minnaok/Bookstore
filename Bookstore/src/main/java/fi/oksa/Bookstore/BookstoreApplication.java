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
import fi.oksa.Bookstore.domain.User;
import fi.oksa.Bookstore.domain.UserRepository;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner bookDemo(BookRepository brepository, CategoryRepository crepository, UserRepository urepository) {
		return (args) -> {
			log.info("save a couple of students");
			crepository.save(new Category("Horror"));
			crepository.save(new Category("Fiction"));
			crepository.save(new Category("Children"));
			
		System.out.println("save acouple of books to db");
		brepository.save(new Book("233-344", "Minna Oksa", "Minun maani", 2010, 20.2, crepository.findByName("Horror").get(0)));
		brepository.save(new Book("233-345", "Minna Oksa", "Kukka", 2020, 20.5, crepository.findByName("Horror").get(0)));
		brepository.save(new Book("233-234", "Minna Oksa", "Kukkakedolla", 1999, 20.5, crepository.findByName("Fiction").get(0)));
		
		System.out.println("fetch all books");
		for (Book book : brepository.findAll()) {
			System.out.println(book.toString());
		}
		User user1 = new User("user", "$2a$06$3jYRJrg0ghaaypjZ/.g4SethoeA51ph3UD4kZi9oPkeMTpjKU5uo6", "USER");
		User user2 = new User("admin", "$2a$10$0MMwY.IQqpsVc1jC8u7IJ.2rT8b0Cd3b3sfIBGV2zfgnPGtT4r0.C", "ADMIN");
		urepository.save(user1);
		urepository.save(user2);
		
		
		};
}}
