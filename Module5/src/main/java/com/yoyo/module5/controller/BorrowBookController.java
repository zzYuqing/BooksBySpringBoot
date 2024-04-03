package com.yoyo.module5.controller;


import com.yoyo.module5.pojo.BorrowBook;
import com.yoyo.module5.pojo.Result;
import com.yoyo.module5.service.BorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/borrows")
public class BorrowBookController {

    @Autowired
    private BorrowBookService borrowBookService;


    @PostMapping
    public Result insertBorrow(@RequestParam("userId") Integer userId, @RequestParam("BookId") Integer BookId){

        Date time = new Date();
        BorrowBook borrowBook=new BorrowBook(userId,BookId,time);
        if(borrowBookService.insertBorrow(borrowBook)){
            return Result.success();
        }
        return Result.error();
    }

    @PutMapping("/{id}")
    public Result insertReturn(@PathVariable Integer id){
        borrowBookService.insertReturn(id);
        return Result.success();
    }

}
