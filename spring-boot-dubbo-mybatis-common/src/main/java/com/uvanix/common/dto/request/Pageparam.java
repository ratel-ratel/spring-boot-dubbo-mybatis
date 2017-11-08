package com.uvanix.common.dto.request;

import lombok.*;

import java.io.Serializable;

/**
 * Created by nice on 2017/11/7.
 */

@Data
public class Pageparam implements Serializable {
    private Integer pageSize;
    private Integer pageNumber;
}
