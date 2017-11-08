package com.uvanix.consumer.web;

import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.request.Pageparam;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PageResponse;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.consumer.service.biz.AccountBizService;
import com.uvanix.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * 服务状态
 */
@Controller
public class ServerStatusHandler implements HttpRequestHandler {
    @Autowired
    private AccountBizService accountBizService;
    @Override
    @RequestMapping("/state")
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("success");
    }
    @RequestMapping(value = "/queryNameById", method = RequestMethod.POST)
    @ResponseBody
    public Result<String> queryNameById(@RequestBody Request<Integer> request) {
        Result<String> stringResult = accountBizService.queryNameById(request);
        return stringResult;
    }
    @RequestMapping(value = "/queryNamesPaging", method = RequestMethod.POST)
    @ResponseBody
    public  PagedResult<String> queryNamesPaging(@RequestBody  AccountQueryPageRequest pagedRequest){
        PagedResult<String> pagedResult = accountBizService.queryNamesPaging(pagedRequest);
        return pagedResult;
    }
    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    @ResponseBody
    public int insert(@RequestBody Account account) {
        return accountBizService.insert(account);
    }
    @RequestMapping(value = "/page", method = RequestMethod.POST)
    @ResponseBody
    public List<Account> page(@RequestBody Pageparam pageparam) {
        return accountBizService.page(pageparam);
    }
    @RequestMapping(value = "/deleteById", method = RequestMethod.POST)
    @ResponseBody
    public int deleteById(@RequestBody Account account) {
        return accountBizService.deleteById(account.getId());
    }
    @RequestMapping(value = "/updateById", method = RequestMethod.POST)
    @ResponseBody
    public int updateById(@RequestBody Account record) {
        return accountBizService.updateById(record);
    }
    @RequestMapping(value = "/selectById", method = RequestMethod.POST)
    @ResponseBody
    public Account selectById(@RequestBody Account account) {
        return accountBizService.selectById(account.getId());
    }
    @RequestMapping(value = "/getTotal", method = RequestMethod.GET)
    @ResponseBody
    public int getTotal() {
        return accountBizService.getTotal();
    }
}
