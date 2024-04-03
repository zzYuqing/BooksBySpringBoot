package com.yoyo.module4.service;

import com.yoyo.module4.pojo.BorrowBook;

public interface BorrowBookService {
    public void insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
