package com.yoyo.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowBook {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Date borrowDate;

    public BorrowBook(Integer userId, Integer bookId, Date borrowDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Integer getBookId() {
        return bookId;
    }
}
