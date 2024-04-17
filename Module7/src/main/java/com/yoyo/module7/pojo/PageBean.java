package com.yoyo.module7.pojo;

import lombok.Data;

import java.util.List;

@Data
public class PageBean {
    private long total;
    private List rows;

    public PageBean() {
    }

    public PageBean(long total, List rows) {
        this.total = total;
        this.rows = rows;
    }

    public List getRows() {
        return rows;
    }
}
