package com.yoyo.mapper;

import com.yoyo.pojo.BorrowBook;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BorrowBookMapper {

    @Delete("delete from borrow_book where book_id=#{id}")
    public void deleteByBookId(Integer id);

    @Delete("delete from borrow_book where user_id=#{id}")
    public void deleteByUserId(Integer id);

    @Insert("insert into borrow_book(user_id, book_id, borrow_date)" +
            "values (#{userId},#{bookId},#{borrowDate})")
    public void inserBorrow(BorrowBook borrowBook);


}
