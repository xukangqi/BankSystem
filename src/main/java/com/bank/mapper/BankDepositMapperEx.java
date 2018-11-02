package com.bank.mapper;

import com.bank.pojo.BankDeposit;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BankDepositMapperEx {

    List<BankDeposit> getByPage(@Param("conditionMap") Map<String, Object> conditionMap, @Param("start") Integer start, @Param("length") Integer length);

    int getCountByPage(@Param("conditionMap") Map<String, Object> conditionMap);

}
