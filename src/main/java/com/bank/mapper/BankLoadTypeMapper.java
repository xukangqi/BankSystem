package com.bank.mapper;

import com.bank.pojo.BankLoadType;
import com.bank.pojo.BankLoadTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankLoadTypeMapper {
    int countByExample(BankLoadTypeExample example);

    int deleteByExample(BankLoadTypeExample example);

    int deleteByPrimaryKey(String loadTypeName);

    int insert(BankLoadType record);

    int insertSelective(BankLoadType record);

    List<BankLoadType> selectByExample(BankLoadTypeExample example);

    BankLoadType selectByPrimaryKey(String loadTypeName);

    int updateByExampleSelective(@Param("record") BankLoadType record, @Param("example") BankLoadTypeExample example);

    int updateByExample(@Param("record") BankLoadType record, @Param("example") BankLoadTypeExample example);

    int updateByPrimaryKeySelective(BankLoadType record);

    int updateByPrimaryKey(BankLoadType record);
}