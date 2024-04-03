package com.yoyo.module5.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class BorrowBook {
    private Integer id;
    private Integer userId;
    private Integer bookId;
    private Date borrowDate;
    private Date returnDate;

    public BorrowBook() {
    }

    public BorrowBook(Integer userId, Integer bookId, Date borrowDate) {
        this.userId = userId;
        this.bookId = bookId;
        this.borrowDate = borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }


    public Integer getBookId() {
        return bookId;
    }


}
