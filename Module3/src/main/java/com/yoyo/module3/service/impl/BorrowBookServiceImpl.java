package com.yoyo.module3.service.impl;

import com.yoyo.module3.mapper.BookMapper;
import com.yoyo.module3.mapper.BorrowBookMapper;
import com.yoyo.module3.pojo.BorrowBook;
import com.yoyo.module3.service.BorrowBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class BorrowBookServiceImpl implements BorrowBookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BorrowBookMapper borrowBookMapper;

    @Override
    public void insertBorrow(BorrowBook borrowBook) {


        Date time = new Date();
        borrowBook.setBorrowDate(time);
        if(bookMapper.checkState(borrowBook.getBookId())){
            return;
        }
        borrowBookMapper.inserBorrow(borrowBook);
        bookMapper.borrowBook(borrowBook.getBookId());


    }

    @Override
    public void insertReturn(Integer bookId) {

        Date time = new Date();
        borrowBookMapper.insertReturn(bookId,time);
        bookMapper.returnBook(bookId);
    }
}
