package com.yoyo.module3.service;

import com.yoyo.module3.pojo.BorrowBook;

public interface BorrowBookService {
    public void insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
