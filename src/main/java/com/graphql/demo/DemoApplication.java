package com.graphql.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.graphql.demo.entities.Book;
import com.graphql.demo.services.BookService;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Book b1 = new Book();
		b1.setTitle("Complete");
		b1.setDesc("for desc");
		b1.setPages(2000);
		b1.setAuthor("null");
		b1.setPrice(3000);

		Book b2 = new Book();
		b2.setTitle("java");
		b2.setDesc("for desc");
		b2.setPages(1000);
		b2.setAuthor("null");
		b2.setPrice(2000);



		Book b3 = new Book();
		b3.setTitle("python");
		b3.setDesc("for desc");
		b3.setPages(5000);
		b3.setAuthor("null");
		b3.setPrice(1000);

		bookService.create(b1);
		bookService.create(b2);
		bookService.create(b3);
	}

}
