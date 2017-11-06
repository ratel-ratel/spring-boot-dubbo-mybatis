package com.uvanix.server.service.biz;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.server.dao.entity.Account;

/**
 * 服务接口业务逻辑
 */
public interface AccountBizService {

    int insert(Account account);

    Result<String> queryNameById(Request<Integer> request);

    PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest);
}
