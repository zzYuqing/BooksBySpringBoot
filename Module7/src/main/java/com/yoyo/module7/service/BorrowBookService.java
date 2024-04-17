package com.yoyo.module7.service;

import com.yoyo.module7.pojo.BorrowBook;

public interface BorrowBookService {
    public boolean insertBorrow(BorrowBook borrowBook);

    public void insertReturn(Integer bookId);
}
