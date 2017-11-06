package com.uvanix.consumer.service.biz.impl;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.consumer.service.biz.AccountBizService;
import com.uvanix.consumer.service.dubbo.DubboSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountBizServiceImpl implements AccountBizService {

    @Autowired
    private DubboSupport dubboSupport;

    @Override
    public Result<String> queryNameById(Request<Integer> request) {
        return dubboSupport.accountService.queryNameById(request);
    }

    @Override
    public PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest) {
        return dubboSupport.accountService.queryNamesPaging(pagedRequest);
    }
}
