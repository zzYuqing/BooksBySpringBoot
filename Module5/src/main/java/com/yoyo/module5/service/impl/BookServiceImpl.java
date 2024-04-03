package com.yoyo.module5.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.yoyo.module5.mapper.BookMapper;
import com.yoyo.module5.mapper.BorrowBookMapper;
import com.yoyo.module5.pojo.Book;
import com.yoyo.module5.pojo.PageBean;
import com.yoyo.module5.service.BookService;
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
    public PageBean findAllBooks(Integer page,Integer pageSize) {
        PageHelper.startPage(page,pageSize);
        List<Book> bookList=bookMapper.findAllBooks();
        Page<Book> bookPage=(Page<Book>) bookList;
        PageBean pageBean=new PageBean(bookPage.getTotal(),bookPage.getResult());

        return pageBean;

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
