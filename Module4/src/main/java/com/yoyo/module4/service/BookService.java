package com.yoyo.module4.service;

import com.yoyo.module4.pojo.Book;
import com.yoyo.module4.pojo.PageBean;

import java.util.List;


public interface BookService {

    public PageBean findAllBooks(Integer page, Integer pageSize);

    public Book findById(Integer id);

    public void deleteBook(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);
}
