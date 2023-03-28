package com.amit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.amit.entity.Book;

@SpringBootApplication
public class SpringJpaApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringJpaApplication.class, args);
		BookRepo repo = context.getBean(BookRepo.class);

		Book b = new Book();
		b.setBookId(100);
		b.setBookName("Java");
		b.setBookPrice(454.00);
		repo.save(b);
	}
}
