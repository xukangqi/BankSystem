package com.bank.service.Impl;

import com.bank.exception.BizException;
import com.bank.mapper.BankAccountMapper;
import com.bank.mapper.BankDepositMapper;
import com.bank.pojo.BankAccount;
import com.bank.pojo.BankAccountExample;
import com.bank.pojo.BankDeposit;
import com.bank.pojo.BankDepositExample;
import com.bank.service.BankDepositService;
import com.bank.utils.BankResult;
import com.bank.utils.MD5;
import com.bank.utils.SnowFlake;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: BankSystem
 * @description: deposit
 * @author: i_know_i
 * @create: 2018-10-17 20:31
 **/
@Service
public class BankDepositServiceImpl implements BankDepositService {

    private static SnowFlake snowFlake;

    @Autowired
    private BankDepositMapper bankDepositMapper;

/*    @Autowired
    private BankDepositMapperEx bankDepositMapperEx;*/

    @Autowired
    private BankAccountMapper bankAccountMapper;

    @Override
    public BankResult insert(BankDeposit bankDeposit, String password) {

        if(bankDeposit == null){
            return BankResult.build(400, "参数错误");
        }

        if(snowFlake == null){
            snowFlake = new SnowFlake(1, 1);
        }

        BankAccountExample bankAccountExample = new BankAccountExample();
        if(bankDeposit.getAccount() == null)
            return BankResult.build(400, "参数错误");
        bankAccountExample.createCriteria().andAccountEqualTo(bankDeposit.getAccount());
        List<BankAccount> bankAccounts = bankAccountMapper.selectByExample(bankAccountExample);
        if (bankAccounts == null || bankAccounts.size()>1)
            return BankResult.build(400, "数据有误");
        BankAccount bankAccount = bankAccounts.get(0);
        if(!bankAccount.getPassword().equals(MD5.string2MD5(password))){
            return BankResult.build(400, "密码错误");
        }
        bankDeposit.setDepositDate(Long.toString(System.currentTimeMillis()));
        bankDeposit.setCustId(bankAccount.getCustId());
        bankDeposit.setDepositId(Long.toString(snowFlake.nextId()));
        bankDeposit.setDepositFlag("0");
        bankDepositMapper.insert(bankDeposit);

        double balances = bankAccount.getBalances();
        double blockedBalances = bankAccount.getBlockedBalances();
        if(!bankDeposit.getDepositType().equals("活期存款"))
            bankAccount.setBlockedBalances(blockedBalances+bankDeposit.getDepositMoney());
        bankAccount.setBalances(balances + bankDeposit.getDepositMoney());
        bankAccountMapper.updateByPrimaryKeySelective(bankAccount);

        return BankResult.build(200, "存款成功");
    }

    @Override
    public BankResult update(BankDeposit bankDeposit) {

        if(bankDeposit == null){
            return BankResult.build(400, "参数错误");
        }
        bankDepositMapper.updateByPrimaryKeySelective(bankDeposit);
        return BankResult.build(200, "更新成功");
    }

    @Override
    public BankResult delete(List<String> depositIds) {
        if(depositIds == null || depositIds.size() == 0){
            return BankResult.build(400, "参数错误");
        }

        BankDepositExample bankDepositExample = new BankDepositExample();
        bankDepositExample.createCriteria().andDepositIdIn(depositIds);
        bankDepositMapper.deleteByExample(bankDepositExample);
        return BankResult.build(200, "删除成功");
    }

    /*@Override
    public Map<String, Object> getByPage(String keys, Integer pageStart, Integer pageSize) {
        Map<String, Object> conditionMap = this.getCriteria(keys);
        conditionMap.put("start", pageStart);
        conditionMap.put("length", pageSize);
        List<BankDeposit> bankDeposits = bankDepositMapperEx.getByPage(conditionMap, pageStart, pageSize);
        int num = bankDepositMapperEx.getCountByPage(conditionMap);

        Map<String, Object> map = new HashMap<>();
        try{
            map.put("data", JSONArray.fromObject(bankDeposits));
        } catch(Exception e){
            e.printStackTrace();
        }
        map.put("num", num);

        return map;
    }*/

    @Override
    public BankResult getBankDepositFromAccount(String account) {
        if(account == null || account.equals("")){
            return BankResult.build(400, "参数错误");
        }
        BankDepositExample bankDepositExample = new BankDepositExample();
        bankDepositExample.createCriteria().andAccountEqualTo(account);
        bankDepositExample.setOrderByClause("deposit_id desc");
        List<BankDeposit> bankDeposits = bankDepositMapper.selectByExample(bankDepositExample);
        return new BankResult(200,"查询成功",bankDeposits);
    }

    private Map<String, Object> getCriteria(String keys){
        if (keys == null || "{}".equals(keys))
            return null;
        Map<String, Object> conditionMap = new HashMap<>();
        JSONObject jKeys = JSONObject.fromObject(keys);
        if(jKeys.containsKey("custId") && !StringUtils.isBlank(jKeys.getString("custId"))){
            conditionMap.put("custId", jKeys.getString("custId"));
        }
        if(jKeys.containsKey("account") && !StringUtils.isBlank(jKeys.getString("account"))){
            conditionMap.put("account", jKeys.getString("account"));
        }
        if(jKeys.containsKey("depositType") && !StringUtils.isBlank(jKeys.getString("depositType"))){
            conditionMap.put("depositType", jKeys.getString("depositType"));
        }
        if(jKeys.containsKey("reviewerId") && !StringUtils.isBlank(jKeys.getString("reviewerId"))){
            conditionMap.put("reviewerId", jKeys.getString("reviewerId"));
        }
        return conditionMap;
    }

    private Date addDate(Date date, long day) {
        long time = date.getTime(); // 得到指定日期的毫秒数
        day = day * 24 * 60 * 60 * 1000; // 要加上的天数转换成毫秒数
        time += day; // 相加得到新的毫秒数
        return new Date(time); // 将毫秒数转换成日期
    }

    /*private long getNumOfDay(String duration){
        long days;
        switch (duration){
            case "活期":
                days = -1; break;
            case "三个月":
                days = 90; break;
            case "半年":
                days = 180; break;
            case "一年":
                days = 360; break;
            case "二年":
                days = 720; break;
            case "三年":
                days = 1080; break;
            case "五年":
                days = 1800; break;
            default:
                throw new BizException("存款年限有误");
        }
        return days;
    }*/
}
