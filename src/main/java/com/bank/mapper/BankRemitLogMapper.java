package com.bank.mapper;

import com.bank.pojo.BankRemitLog;
import com.bank.pojo.BankRemitLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BankRemitLogMapper {
    int countByExample(BankRemitLogExample example);

    int deleteByExample(BankRemitLogExample example);

    int deleteByPrimaryKey(Long remitId);

    int insert(BankRemitLog record);

    int insertSelective(BankRemitLog record);

    List<BankRemitLog> selectByExample(BankRemitLogExample example);

    BankRemitLog selectByPrimaryKey(Long remitId);

    int updateByExampleSelective(@Param("record") BankRemitLog record, @Param("example") BankRemitLogExample example);

    int updateByExample(@Param("record") BankRemitLog record, @Param("example") BankRemitLogExample example);

    int updateByPrimaryKeySelective(BankRemitLog record);

    int updateByPrimaryKey(BankRemitLog record);
}