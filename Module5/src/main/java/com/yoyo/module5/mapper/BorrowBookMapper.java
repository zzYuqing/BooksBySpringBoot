package com.yoyo.module5.mapper;

import com.yoyo.module5.pojo.BorrowBook;
import org.apache.ibatis.annotations.*;

import java.util.Date;
import java.util.List;

@Mapper
public interface BorrowBookMapper {

    @Delete("delete from borrow_book where book_id=#{id}")
    public void deleteByBookId(Integer id);

    @Delete("delete from borrow_book where user_id=#{id}")
    public void deleteByUserId(Integer id);

    @Insert("insert into borrow_book(user_id, book_id, borrow_date)" +
            "values (#{userId},#{bookId},#{borrowDate})")
    public void inserBorrow(BorrowBook borrowBook);

    @Update("update borrow_book set return_date=#{time} " +
            "where book_id=#{bookId} and return_date='1000-01-01'")
    public void insertReturn(@Param("bookId") Integer bookId, @Param("time") Date time);

    @Select("select book_id from borrow_book where user_id=#{userId} and return_date=#{returnDate}")
    public List<Integer> selectByCondition1(BorrowBook borrowBook);


    public List<Integer> selectByCondition(BorrowBook borrowBook);

}
