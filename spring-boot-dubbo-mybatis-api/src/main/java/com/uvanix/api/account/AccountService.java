package com.uvanix.api.account;

import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;

/**
 * 服务接口演示
 */
public interface AccountService {

    /**
     * 通过id查询名称
     *
     * @param request
     * @return
     */
    Result<String> queryNameById(Request<Integer> request);

    /**
     * 分页查询名字
     *
     * @param pagedRequest
     * @return
     */
    PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest);
}
