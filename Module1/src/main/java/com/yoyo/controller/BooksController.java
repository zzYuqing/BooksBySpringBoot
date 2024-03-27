package com.yoyo.controller;


import com.yoyo.pojo.Book;
import com.yoyo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping("/list")
    public List<Book> findAllBook(){
        return booksService.findAllBooks();
    }



}
