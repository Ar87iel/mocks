package com.example.common;

import java.io.Serializable;

/**
 * Created by DHbol on 5/9/2017.
 */
public class BaseList implements Serializable{
    private Integer totalPages;
    private Integer sizeElements;
    private Integer page;
    private Integer pageSize;

    private Object data;

    public BaseList(){
        this.totalPages = 0;
        this.sizeElements = 0;
        this.page = 0;
        this.pageSize = 0;
        data = null;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getSizeElements() {
        return sizeElements;
    }

    public void setSizeElements(Integer sizeElements) {
        this.sizeElements = sizeElements;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }
}
