package com.uvanix.consumer.service.biz.impl;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PageResponse;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.consumer.service.biz.AccountBizService;
import com.uvanix.consumer.service.dubbo.DubboSupport;
import com.uvanix.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    @Override
    public int insert(Account account) {
        return dubboSupport.accountService.insert(account);
    }
    @Override
    public PageResponse page(PagedRequest result) {
        return dubboSupport.accountService.page(result);
    }

    @Override
    public int deleteById(Integer id) {
        return dubboSupport.accountService.deleteById(id);
    }

    @Override
    public int updateById(Account record) {
        return dubboSupport.accountService.updateById(record);
    }

    @Override
    public Account selectById(Integer id) {
        return dubboSupport.accountService.selectById(id);
    }
}
