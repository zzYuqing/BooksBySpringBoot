package com.yoyo.service.impl;

import com.yoyo.mapper.BooksMapper;
import com.yoyo.pojo.Book;
import com.yoyo.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksServiceImpl implements BooksService {
    @Autowired
    private BooksMapper booksMapper;

    @Override
    public List<Book> findAllBooks() {
        return booksMapper.findALlBooks();
    }
}
