package fi.oksa.Bookstore.domain;



public class Book {

	private Integer year, isbn, price;
	private String title, author;

	
	public Book() {
		super();
	}

	public Book(Integer year, Integer isbn, Integer price, String title, String author) {
		super();
		this.year = year;
		this.isbn = isbn;
		this.price = price;
		this.title = title;
		this.author = author;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(Integer isbn) {
		this.isbn = isbn;
	}
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [year=" + year + ", isbn=" + isbn + ", price=" + price + ", title=" + title + ", author=" + author + "]";
	}
	
	
}
	

