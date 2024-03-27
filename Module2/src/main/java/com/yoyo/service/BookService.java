package com.yoyo.service;

import com.yoyo.mapper.BookMapper;
import com.yoyo.pojo.Book;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


public interface BookService {

    public List<Book> findAllBooks();

    public Book findById(Integer id);

    public void deleteBook(Integer id);

    public void insertBook(Book book);

    public void updateBook(Book book);
}
