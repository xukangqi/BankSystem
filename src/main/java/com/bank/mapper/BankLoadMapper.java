package com.bank.mapper;

import com.bank.pojo.BankLoad;
import com.bank.pojo.BankLoadExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankLoadMapper {
    int countByExample(BankLoadExample example);

    int deleteByExample(BankLoadExample example);

    int deleteByPrimaryKey(Long transId);

    int insert(BankLoad record);

    int insertSelective(BankLoad record);

    List<BankLoad> selectByExample(BankLoadExample example);

    BankLoad selectByPrimaryKey(Long transId);

    int updateByExampleSelective(@Param("record") BankLoad record, @Param("example") BankLoadExample example);

    int updateByExample(@Param("record") BankLoad record, @Param("example") BankLoadExample example);

    int updateByPrimaryKeySelective(BankLoad record);

    int updateByPrimaryKey(BankLoad record);
}