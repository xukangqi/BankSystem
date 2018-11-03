package com.bank.mapper;

import com.bank.pojo.BankLoanPaylog;
import com.bank.pojo.BankLoanPaylogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankLoanPaylogMapper {
    int countByExample(BankLoanPaylogExample example);

    int deleteByExample(BankLoanPaylogExample example);

    int deleteByPrimaryKey(String paylogId);

    int insert(BankLoanPaylog record);

    int insertSelective(BankLoanPaylog record);

    List<BankLoanPaylog> selectByExample(BankLoanPaylogExample example);

    BankLoanPaylog selectByPrimaryKey(String paylogId);

    int updateByExampleSelective(@Param("record") BankLoanPaylog record, @Param("example") BankLoanPaylogExample example);

    int updateByExample(@Param("record") BankLoanPaylog record, @Param("example") BankLoanPaylogExample example);

    int updateByPrimaryKeySelective(BankLoanPaylog record);

    int updateByPrimaryKey(BankLoanPaylog record);
}