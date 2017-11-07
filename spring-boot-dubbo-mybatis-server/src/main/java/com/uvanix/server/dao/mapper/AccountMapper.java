package com.uvanix.server.dao.mapper;

import com.uvanix.common.dto.request.PagedRequest;
import com.uvanix.common.dto.result.PagedResult;
import com.uvanix.entity.Account;
import com.uvanix.server.dao.entity.AccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AccountMapper {
    int countByExample(AccountExample example);

    int deleteByExample(AccountExample example);

    int insert(Account record);
    int deleteById(Integer id);
    int updateById(Account record);
    Account selectById(Integer id);
    List<Account> page(@Param("param") PagedRequest result);

    int insertSelective(Account record);

    List<Account> selectByExample(AccountExample example);

    int updateByExampleSelective(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByExample(@Param("record") Account record, @Param("example") AccountExample example);

    int updateByPrimaryKeySelective(Account record);


}