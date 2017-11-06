package com.uvanix.server.service.biz.impl;

import com.uvanix.server.dao.mapper.DatabaseMapper;
import com.uvanix.server.service.biz.DatabaseService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 获取数据源
 */
@Service
public class DatabaseServiceImpl implements DatabaseService {

    @Resource
    private DatabaseMapper databaseMapper;

    /**
     * 获取数据源
     *
     * @return
     */
    @Override
    public String getDatabaseName() {
        return databaseMapper.getDatabaseName();
    }
}
