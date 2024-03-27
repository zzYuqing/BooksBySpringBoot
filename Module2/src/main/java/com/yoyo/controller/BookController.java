package com.yoyo.controller;


import com.yoyo.pojo.Book;
import com.yoyo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/list")
    public List<Book> findAllBooks(){
        return bookService.findAllBooks();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable Integer id){
        return bookService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Integer id){
        bookService.deleteBook(id);
    }

    @PostMapping
    public void insertBook(@RequestBody Book book){
        bookService.insertBook(book);
    }

    @PutMapping
    public void updateBook(@RequestBody Book book){
        bookService.updateBook(book);
    }

}
