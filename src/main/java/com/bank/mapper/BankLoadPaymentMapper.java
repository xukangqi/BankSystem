package com.bank.mapper;

import com.bank.pojo.BankLoadPayment;
import com.bank.pojo.BankLoadPaymentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankLoadPaymentMapper {
    int countByExample(BankLoadPaymentExample example);

    int deleteByExample(BankLoadPaymentExample example);

    int deleteByPrimaryKey(Long paymentId);

    int insert(BankLoadPayment record);

    int insertSelective(BankLoadPayment record);

    List<BankLoadPayment> selectByExample(BankLoadPaymentExample example);

    BankLoadPayment selectByPrimaryKey(Long paymentId);

    int updateByExampleSelective(@Param("record") BankLoadPayment record, @Param("example") BankLoadPaymentExample example);

    int updateByExample(@Param("record") BankLoadPayment record, @Param("example") BankLoadPaymentExample example);

    int updateByPrimaryKeySelective(BankLoadPayment record);

    int updateByPrimaryKey(BankLoadPayment record);
}