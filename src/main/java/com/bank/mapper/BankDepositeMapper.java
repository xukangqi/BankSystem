package com.bank.mapper;

import com.bank.pojo.BankDeposite;
import com.bank.pojo.BankDepositeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankDepositeMapper {
    int countByExample(BankDepositeExample example);

    int deleteByExample(BankDepositeExample example);

    int deleteByPrimaryKey(Long depositeId);

    int insert(BankDeposite record);

    int insertSelective(BankDeposite record);

    List<BankDeposite> selectByExample(BankDepositeExample example);

    BankDeposite selectByPrimaryKey(Long depositeId);

    int updateByExampleSelective(@Param("record") BankDeposite record, @Param("example") BankDepositeExample example);

    int updateByExample(@Param("record") BankDeposite record, @Param("example") BankDepositeExample example);

    int updateByPrimaryKeySelective(BankDeposite record);

    int updateByPrimaryKey(BankDeposite record);
}