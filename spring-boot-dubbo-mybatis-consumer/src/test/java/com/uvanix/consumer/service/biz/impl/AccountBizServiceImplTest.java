package com.uvanix.consumer.service.biz.impl;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.uvanix.api.account.AccountQueryPageRequest;
import com.uvanix.common.dto.request.Request;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.common.dto.result.Result;
import com.uvanix.consumer.ApplicationTests;
import com.uvanix.consumer.service.biz.AccountBizService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;

import static org.junit.Assert.*;

public class AccountBizServiceImplTest extends ApplicationTests {

    @Autowired
    private AccountBizService accountBizService;

    @Test
    public void queryNameById() throws Exception {
        Request<Integer> request = Request.create();
        request.setSsid(UUID.randomUUID().toString());
        request.setData(1);

        logger.info("\nrequest = {}", JSON.toJSONString(request));
        Result<String> result = accountBizService.queryNameById(request);
        assertTrue(result.getDescription(), result.isSuccess());
        logger.info("\nresult = {}", JSON.toJSONString(result, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue));
    }

    @Test
    public void queryNamesPaging() throws Exception {
        AccountQueryPageRequest pagedRequest = new AccountQueryPageRequest();
        pagedRequest.setSsid(UUID.randomUUID().toString());
        pagedRequest.setId(1);

        logger.info("\npagedRequest = {}", JSON.toJSONString(pagedRequest));
        PagedResult<String> pagedResult = accountBizService.queryNamesPaging(pagedRequest);
        assertTrue(pagedResult.getDescription(), pagedResult.isSuccess());
        logger.info("\npagedResult = {}", JSON.toJSONString(pagedResult, SerializerFeature.PrettyFormat, SerializerFeature.WriteMapNullValue));
    }
}