package com.yoyo.module5.mapper;

import com.yoyo.module5.pojo.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {

//    @Select("select * from book")
    public List<Book> findAllBooks();

//    @Select("select * from book where id=#{id}")
    public Book findById(Integer id);

    @Delete("delete from book where id=#{id}")
    public void deleteBook(Integer id);

    @Insert("insert into book(name, author, publish_date, price, update_date) " +
            "values (#{name}, #{author}, #{publishDate}, #{price}, #{updateDate})")
    public void insertBook(Book book);

    @Update("update book set name=#{name},author=#{author},update_date=#{updateDate} where id=#{id}")
    public void updateBook(Book book);

    @Select("select borrowed from book where id=#{id}")
    public boolean checkState(Integer id);

    @Update("update book set borrowed=true where id=#{id}")
    public void borrowBook(Integer id);

    @Update("update book set borrowed=false where id=#{id}")
    public void returnBook(Integer id);


    public void returnBooks(@Param("ids") List<Integer> ids);




}
