package com.graphql.demo.services.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graphql.demo.entities.Book;
import com.graphql.demo.repositories.BookRepo;
import com.graphql.demo.services.BookService;

@Service
public class BookServiceImpl  implements BookService {

    private final BookRepo bookRep;

    public BookServiceImpl(BookRepo bookRep){
        this.bookRep = bookRep;
    }

    @Override
    public Book create(Book book) {
        return this.bookRep.save(book);
    }

    @Override
    public List<Book> getAll() {
        return this.bookRep.findAll();
    }

    @Override
    public Book get(int bookId) {
        return this.bookRep.findById(bookId).orElseThrow(()-> new RuntimeException("Book not found!!!"));
    }



    
}
