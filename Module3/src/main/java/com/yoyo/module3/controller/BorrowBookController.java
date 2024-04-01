package com.yoyo.module3.controller;


import com.yoyo.module3.pojo.BorrowBook;
import com.yoyo.module3.service.BorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{id}")
    public void insertReturn(@PathVariable Integer id){

        borrowBookService.insertReturn(id);
    }

}
