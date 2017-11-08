package com.uvanix.common.dto.request;

import lombok.*;

import java.io.Serializable;

/**
 * Created by nice on 2017/11/7.
 */

public class Pageparam implements Serializable {
    private Integer pageSize;
    private Integer pageNumber;
    private Integer startRow;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setStartRow(Integer startRow) {
        this.startRow = startRow;
    }
}
