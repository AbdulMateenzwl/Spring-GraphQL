package com.graphql.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.graphql.demo.entities.Book;
import com.graphql.demo.services.BookService;

import lombok.Getter;
import lombok.Setter;


@Controller
public class BookController {

    @Autowired
    private BookService bookService;
    
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        return this.bookService.create(book.toBook());
    }

    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return this.bookService.getAll();
    }

    @QueryMapping("getBook")
    public Book getOne(@Argument int bookId){
        return this.bookService.get(bookId);
    }
}

@Getter
@Setter
class BookInput{
    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

    public Book toBook(){
        Book b = new Book();
        b.setTitle(this.title);
        b.setDesc(this.desc);
        b.setAuthor(this.author);
        b.setPrice(this.price);
        b.setPages(this.pages);
        return b;
    }
}