package com.yoyo.module4.controller;


import com.yoyo.module4.pojo.Book;
import com.yoyo.module4.pojo.PageBean;
import com.yoyo.module4.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;


    @GetMapping("/list")
    public List<Book> findAllBooks(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer pageSize){
        PageBean pageBean=bookService.findAllBooks(page,pageSize);
        return pageBean.getRows();

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
