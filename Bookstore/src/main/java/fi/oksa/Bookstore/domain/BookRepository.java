package fi.oksa.Bookstore.domain;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {

	List<Book> findByAuthor(String author);

	static Object getOne(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
