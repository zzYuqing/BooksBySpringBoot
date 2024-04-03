package com.yoyo.module5.service;

import com.yoyo.module5.pojo.BorrowBook;

public interface BorrowBookService {
    public boolean insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
