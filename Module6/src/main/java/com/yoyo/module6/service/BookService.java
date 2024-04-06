package com.yoyo.module6.service;

import com.yoyo.module6.pojo.Book;
import com.yoyo.module6.pojo.PageBean;


public interface BookService {

    public PageBean findAllBooks(Integer page, Integer pageSize);

    public Book findById(Integer id);

    public void deleteBook(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);
}
