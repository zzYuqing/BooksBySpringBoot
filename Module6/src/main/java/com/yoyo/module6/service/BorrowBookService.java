package com.yoyo.module6.service;

import com.yoyo.module6.pojo.BorrowBook;

public interface BorrowBookService {
    public boolean insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
