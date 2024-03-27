package com.yoyo.service.impl;

import com.yoyo.mapper.BookMapper;
import com.yoyo.mapper.BorrowBookMapper;
import com.yoyo.pojo.BorrowBook;
import com.yoyo.service.BorrowBookService;
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
}
