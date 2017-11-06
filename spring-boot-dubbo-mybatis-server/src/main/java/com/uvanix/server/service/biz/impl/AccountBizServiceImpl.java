package com.uvanix.server.service.biz.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.common.dto.result.ResultCode;
import com.uvanix.server.dao.entity.Account;
import com.uvanix.server.dao.entity.AccountExample;
import com.uvanix.server.dao.mapper.AccountMapper;
import com.uvanix.server.service.biz.AccountBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 服务接口业务逻辑
 */
@Service
public class AccountBizServiceImpl implements AccountBizService {

    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int insert(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public Result<String> queryNameById(Request<Integer> request) {
        Account account = accountMapper.selectByPrimaryKey(request.getData());
        if (Objects.isNull(account)) {
            return Result.<String>create().ssid(request.getSsid())
                    .fail(ResultCode.DATA_NOT_EXIST.getCode(), ResultCode.DATA_NOT_EXIST.getMessage());
        }

        return Result.<String>create().ssid(request.getSsid()).success(account.getName());
    }

    @Override
    public PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest) {
        if (!pagedRequest.isFetchAll()) {
            PageHelper.startPage(pagedRequest.getCurrentPage(), pagedRequest.getPageSize());
        }

        AccountExample example = new AccountExample();
        example.or().andIdEqualTo(pagedRequest.getId());
        example.setOrderByClause(" id asc ");
        List<Account> accountList = accountMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(accountList)) {
            return PagedResult.Builder.build(pagedRequest).buildForSuccess(0, 0, null);
        }

        PageInfo<String> pageInfo = new PageInfo(accountList);
        List<String> resultList = accountList.stream().map(Account::getName).collect(Collectors.toList());

        return PagedResult.Builder.build(pagedRequest)
                .buildForSuccess(pageInfo.getPages(), pageInfo.getTotal(), resultList);
    }
}
