package com.uvanix.api.account;

import com.uvanix.common.dto.request.PagedRequest;

/**
 * 分页查询请求
 */
public class AccountQueryPageRequest extends PagedRequest<String> {

    private static final long serialVersionUID = 4537425979744209342L;

    /**
     * id
     */
    private Integer id;

    public AccountQueryPageRequest() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
