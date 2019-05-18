package com.test.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author ChuanLv
 * @version v1.0
 * @date 2019/3/10 10:15
 * @description TODO
 **/
public class PageResult implements Serializable{
    private Long total;
    private List rows;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List getRows() {
        return rows;
    }

    public void setRows(List rows) {
        this.rows = rows;
    }

    public PageResult() {

    }

    public PageResult(Long total, List rows) {
        this.total = total;
        this.rows = rows;
    }
}
