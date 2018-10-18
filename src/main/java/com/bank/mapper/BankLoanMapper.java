package com.bank.mapper;

import com.bank.pojo.BankLoan;
import com.bank.pojo.BankLoanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankLoanMapper {
    int countByExample(BankLoanExample example);

    int deleteByExample(BankLoanExample example);

    int deleteByPrimaryKey(Long transId);

    int insert(BankLoan record);

    int insertSelective(BankLoan record);

    List<BankLoan> selectByExample(BankLoanExample example);

    BankLoan selectByPrimaryKey(Long transId);

    int updateByExampleSelective(@Param("record") BankLoan record, @Param("example") BankLoanExample example);

    int updateByExample(@Param("record") BankLoan record, @Param("example") BankLoanExample example);

    int updateByPrimaryKeySelective(BankLoan record);

    int updateByPrimaryKey(BankLoan record);
}