package com.yoyo.controller;


import com.yoyo.pojo.BorrowBook;
import com.yoyo.service.BorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/borrow")
public class BorrowBookController {

    @Autowired
    private BorrowBookService borrowBookService;


    @PostMapping
    public void insertBorrow(@RequestParam("userId") Integer userId, @RequestParam("BookId") Integer BookId){

        Date time = new Date();
        BorrowBook borrowBook=new BorrowBook(userId,BookId,time);
        borrowBookService.insertBorrow(borrowBook);
    }

}
