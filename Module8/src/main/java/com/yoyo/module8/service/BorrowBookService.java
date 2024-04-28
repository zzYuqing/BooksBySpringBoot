package com.yoyo.module8.service;

import com.yoyo.module8.pojo.BorrowBook;

public interface BorrowBookService {
    public boolean insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
