package com.yoyo.module8.service;

import com.yoyo.module8.pojo.Book;
import com.yoyo.module8.pojo.PageBean;


public interface BookService {

    public PageBean findAllBooks(Integer page, Integer pageSize);

    public Book findById(Integer id);

    public void deleteBook(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);
}
