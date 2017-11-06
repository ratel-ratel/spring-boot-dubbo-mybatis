package com.uvanix.consumer.service.dubbo;

import com.alibaba.dubbo.config.annotation.Reference;
import com.uvanix.api.account.AccountService;
import org.springframework.stereotype.Component;

/**
 * dubbo 消费者调用支持
 */
@Component
public class DubboSupport {

    @Reference(interfaceName = "com.uvanix.api.account.AccountService")
    public AccountService accountService;
}
