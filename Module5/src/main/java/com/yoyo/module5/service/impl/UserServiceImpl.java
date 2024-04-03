package com.yoyo.module5.service.impl;

import com.yoyo.module5.mapper.BookMapper;
import com.yoyo.module5.mapper.BorrowBookMapper;
import com.yoyo.module5.mapper.UserMapper;
import com.yoyo.module5.pojo.BorrowBook;
import com.yoyo.module5.pojo.User;
import com.yoyo.module5.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;
    @Autowired
    private BorrowBookMapper borrowBookMapper;
    @Autowired
    private BookMapper bookMapper;

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        BorrowBook borrowBook=new BorrowBook();
        borrowBook.setUserId(userId);
        LocalDate defaultDate = LocalDate.of(1000, 1, 1);
        Date date=java.sql.Date.valueOf(defaultDate);
        borrowBook.setReturnDate(date);
//        List<Integer> bookIdList=borrowBookMapper.selectByCondition1(borrowBook);
//        bookIdList.forEach(oneBorrow->bookMapper.returnBook(oneBorrow));

        List<Integer> bookIdList=borrowBookMapper.selectByCondition(borrowBook);
        if(!bookIdList.isEmpty()) bookMapper.returnBooks(bookIdList);

        borrowBookMapper.deleteByUserId(userId);
        userMapper.deleteUser(userId);
//        bookIdList.forEach(bookId->bookMapper.returnBook(bookId));
        }
}
