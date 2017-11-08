package com.uvanix.server.service.dubbo.api.account;

import com.alibaba.dubbo.common.utils.CollectionUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.api.account.AccountService;
import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.request.Pageparam;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PageResponse;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.common.dto.util.ReturnCodeEnum;
import com.uvanix.entity.Account;
import com.uvanix.server.service.biz.AccountBizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountBizService accountBizService;

    @Override
    public int insert(Account account) {
        return accountBizService.insert(account);
    }

    @Override
    public List<Account> page(Pageparam result) {
        PageResponse pageResponse=new PageResponse();
        List<Account> page = accountBizService.page(result);
        if (CollectionUtils.isNotEmpty(page)){
            pageResponse.setReturnCode(ReturnCodeEnum.CODE_1000.getCode());
            pageResponse.setMessage(ReturnCodeEnum.CODE_1000.getValue());
            pageResponse.setRecords(page);
        }
        return page;
    }

    @Override
    public int deleteById(Integer id) {
        return accountBizService.deleteById(id);
    }

    @Override
    public int updateById(Account record) {
        return accountBizService.updateById(record);
    }

    @Override
    public Account selectById(Integer id) {
        return accountBizService.selectById(id);
    }

    @Override
    public int getTotal() {
        return accountBizService.getTotal();
    }

    /**
     * 通过id查询名称
     *
     * @param request
     * @return
     */
    @Override
    public Result<String> queryNameById(Request<Integer> request) {
        // TODO 参数校验
        return accountBizService.queryNameById(request);
    }

    /**
     * 分页查询名字
     *
     * @param pagedRequest
     * @return
     */
    @Override
    public PagedResult<String> queryNamesPaging(AccountQueryPageRequest pagedRequest) {
        // TODO 参数校验
        return accountBizService.queryNamesPaging(pagedRequest);
    }


}
