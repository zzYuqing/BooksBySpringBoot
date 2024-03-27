package com.yoyo.pojo;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private Date publishDate;
    private BigDecimal price;
}