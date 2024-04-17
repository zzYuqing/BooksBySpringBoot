package com.yoyo.module7.service;

import com.yoyo.module7.pojo.Book;
import com.yoyo.module7.pojo.PageBean;


public interface BookService {

    public PageBean findAllBooks(Integer page, Integer pageSize);

    public Book findById(Integer id);

    public void deleteBook(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);
}
