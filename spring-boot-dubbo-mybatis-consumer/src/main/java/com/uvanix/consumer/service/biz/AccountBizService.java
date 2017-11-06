package com.uvanix.consumer.service.biz;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;

public interface AccountBizService {

    Result<String> queryNameById(Request<Integer> request);

    PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest);
}
