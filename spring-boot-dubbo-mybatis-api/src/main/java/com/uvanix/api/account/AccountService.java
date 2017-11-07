package com.uvanix.api.account;

import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PageResponse;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.entity.Account;

import java.util.List;

/**
 * 服务接口演示
 */
public interface AccountService {
    int insert(Account account);

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

    /**
     * 分页查询
     * @param result
     * @return
     */
    PageResponse page(PagedRequest result);

    /**
     * 主键删除
     * @param id
     * @return
     */
    int deleteById(Integer id);

    /**
     * 主键修改
     * @param record
     * @return
     */
    int updateById(Account record);

    /**
     * 通过主键查询
     * @param id
     * @return
     */
    Account selectById(Integer id);
}
