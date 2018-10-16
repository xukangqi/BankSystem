package com.bank.mapper;

import com.bank.pojo.BankDepositeRate;
import com.bank.pojo.BankDepositeRateExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankDepositeRateMapper {
    int countByExample(BankDepositeRateExample example);

    int deleteByExample(BankDepositeRateExample example);

    int insert(BankDepositeRate record);

    int insertSelective(BankDepositeRate record);

    List<BankDepositeRate> selectByExample(BankDepositeRateExample example);

    int updateByExampleSelective(@Param("record") BankDepositeRate record, @Param("example") BankDepositeRateExample example);

    int updateByExample(@Param("record") BankDepositeRate record, @Param("example") BankDepositeRateExample example);
}