package com.yoyo.mapper;


import com.yoyo.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BooksMapper {

    @Select("select * from book")
    public List<Book> findALlBooks();
}
