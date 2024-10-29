package com.test;

import com.test.config.SpringConfig;
import com.test.domain.Book;
import com.test.service.BookService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Springboot2024102Application {
    public static void main(String[] args) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookService bookService = ctx.getBean(BookService.class);
        String title = "中华上下五千年";
        String auther = "袁堂欣、谢志强";
        String genre = "历史";
        Book book = new Book(1,title,auther,genre);
        bookService.addBook(book);
    }
}
