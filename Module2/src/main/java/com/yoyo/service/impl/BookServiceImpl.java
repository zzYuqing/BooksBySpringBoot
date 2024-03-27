package com.yoyo.service.impl;

import com.yoyo.mapper.BookMapper;
import com.yoyo.mapper.BorrowBookMapper;
import com.yoyo.pojo.Book;
import com.yoyo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private BorrowBookMapper borrowBookMapper;

    @Override
    public List<Book> findAllBooks() {
        return bookMapper.findAllBooks();
    }

    @Override
    public Book findById(Integer id) {
        return bookMapper.findById(id);
    }

    @Override
    public void deleteBook(Integer id) {
        borrowBookMapper.deleteByBookId(id);
        bookMapper.deleteBook(id);
        return;

    }

    @Override
    public void insertBook(Book book) {
        Date time=new Date();
        book.setUpdateDate(time);
        bookMapper.insertBook(book);

    }

    @Override
    public void updateBook(Book book) {
        Date time=new Date();
        book.setUpdateDate(time);
        bookMapper.updateBook(book);

    }
}
