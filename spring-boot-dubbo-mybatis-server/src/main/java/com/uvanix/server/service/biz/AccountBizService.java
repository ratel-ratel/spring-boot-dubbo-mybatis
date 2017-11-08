package com.uvanix.server.service.biz;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.request.Pageparam;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.entity.Account;

import java.util.List;

/**
 * 服务接口业务逻辑
 */
public interface AccountBizService {


    Result<String> queryNameById(Request<Integer> request);

    PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest);

    int insert(Account account);

    List<Account> page(Pageparam result);

    int deleteById(Integer id);

    int updateById(Account record);

    Account selectById(Integer id);
    int getTotal();
}
