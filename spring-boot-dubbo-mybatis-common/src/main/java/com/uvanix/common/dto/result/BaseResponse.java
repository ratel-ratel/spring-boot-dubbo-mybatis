package com.uvanix.common.dto.result;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 接口返回基类
 *
 * Created by admin on 2016/3/10.
 */
@Getter
@Setter
@ToString
public class BaseResponse<T> implements Serializable {
    /**
     * 请求结果
     */
    protected Integer returnCode;

    /**
     * 错误信息
     */
    protected String message;

    /**
     * 操作数据信息(请求结果成功返回)
     */
    protected T dataInfo;

    /**
     * Default Constructor
     */
    public BaseResponse() {
        super();
    }
}
