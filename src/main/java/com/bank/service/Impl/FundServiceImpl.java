package com.bank.service.Impl;

import com.bank.mapper.*;
import com.bank.pojo.*;
import com.bank.service.FundService;
import com.bank.utils.BankResult;
import com.bank.utils.MD5;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class FundServiceImpl implements FundService {

    @Autowired
    private BankFundProductMapper bankFundProductMapper;
    @Autowired
    private BankFundLogMapper bankFundLogMapper;
    @Autowired
    private BankCustomerMapper bankCustomerMapper;
    @Autowired
    private BankAccountMapper bankAccountMapper;
    @Autowired
    private BankFundHoldMapper bankFundHoldMapper;

    private long datacenterId = 6L;  //数据中心
    private long machineId ;     //机器标识

    @Override
    public BankResult createFundProduct(String type, double purchaseRate, double netAssetValue, double redemptionRate) {
        machineId = 1L;
        SnowFlake snowFlake = new SnowFlake(datacenterId,machineId);
        String snowFlakeId = String.valueOf(snowFlake.nextId());
        String fundId = snowFlakeId.substring(snowFlakeId.length() - 9, snowFlakeId.length() - 1);
        BankFundProduct bankFundProduct = new BankFundProduct();
        bankFundProduct.setFundId(fundId);
        bankFundProduct.setType(type);
        bankFundProduct.setPurchaseRate(purchaseRate);
        bankFundProduct.setNetAssetValue(netAssetValue);
        bankFundProduct.setRedemptionRate(redemptionRate);
        bankFundProduct.setPurchaseDate(String.valueOf(System.currentTimeMillis()));
        bankFundProductMapper.insert(bankFundProduct);
        return BankResult.ok(fundId);
    }

    @Override
    public BankResult createFundPurchaseTx(String name, String phone, String account, String fundId, double amount, String passowrd, String reviewerId) {
        machineId = 2L;

        BankAccount bankAccount = bankAccountMapper.selectByPrimaryKey(account);
        if (bankAccount == null) return BankResult.build(400, "账户不存在！", "");

        String custId = bankAccount.getCustId();
        BankCustomer bankCustomer = bankCustomerMapper.selectByPrimaryKey(custId);

        String pw = MD5.string2MD5(passowrd);

        if (!bankCustomer.getCustName().equals(name))
            return BankResult.build(400, "用户姓名不匹配！", "");

        if (!bankCustomer.getPhone().equals(phone))
            return BankResult.build(400, "用户电话不匹配！", "");

        if (bankAccount.getBalances() < amount) return BankResult.build(400, "账户余额不足！", "");

        if (!bankAccount.getPassword().equals(pw)) return BankResult.build(400, "密码错误！", "");

        // 找到对应的基金产品
        BankFundProduct bankFundProduct = getUpdatedFundProduct(fundId);
        if (bankFundProduct == null) {
            return BankResult.build(400, "基金产品不存在！", "");
        }

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long fundTxId = snowFlake.nextId();

        // 创建交易记录
        BankFundLog bankFundLog = new BankFundLog();
        bankFundLog.setFundTxId(String.valueOf(fundTxId));
        bankFundLog.setCustId(custId);
        bankFundLog.setAccount(account);
        bankFundLog.setFundId(fundId);
        bankFundLog.setType("0");   // 标记0代表申购/认购
        bankFundLog.setAmount(amount);
        double shareTemp = (amount - amount * bankFundProduct.getPurchaseRate()) / bankFundProduct.getNetAssetValue();
        DecimalFormat df = new DecimalFormat("#.00");
        double share = Double.valueOf(df.format(shareTemp));
        bankFundLog.setShare(share);

        bankFundLog.setTxDate(String.valueOf(System.currentTimeMillis()));
        bankFundLog.setReviewId(reviewerId);
        bankFundLogMapper.insert(bankFundLog);

        // 修改账户余额
        bankAccount.setBalances(bankAccount.getBalances() - amount);
        bankAccountMapper.updateByPrimaryKey(bankAccount);

        // 修改持有份额
        BankFundHoldKey bankFundHoldKey = new BankFundHoldKey();
        bankFundHoldKey.setAccount(account);
        bankFundHoldKey.setFundId(fundId);
        BankFundHold bankFundHold = bankFundHoldMapper.selectByPrimaryKey(bankFundHoldKey);
        if (bankFundHold != null) {
            bankFundHold.setShare(bankFundHold.getShare() + share);
            bankFundHoldMapper.updateByPrimaryKey(bankFundHold);
        } else {
            bankFundHold = new BankFundHold();
            bankFundHold.setCustId(custId);
            bankFundHold.setAccount(account);
            bankFundHold.setShare(share);
            bankFundHold.setFundId(fundId);
            bankFundHoldMapper.insert(bankFundHold);
        }

        return BankResult.ok(bankFundLog.getFundTxId());
    }

    @Override
    public BankResult createFundRedemptionTx(String account, String fundId, double share, String password, String reviewerId) {
        machineId = 2L;

        BankAccount bankAccount = bankAccountMapper.selectByPrimaryKey(account);
        BankFundHoldKey bankFundHoldKey = new BankFundHoldKey();
        bankFundHoldKey.setFundId(fundId);
        bankFundHoldKey.setAccount(account);
        BankFundHold bankFundHold = bankFundHoldMapper.selectByPrimaryKey(bankFundHoldKey);

        String pw = MD5.string2MD5(password);

        DecimalFormat df = new DecimalFormat("#.00");
        share = Double.valueOf(df.format(share));

        if (bankFundHold.getShare() < share) return BankResult.build(400, "份额不足！", "");

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long fundTxId = snowFlake.nextId();

        // 找到对应的基金产品
        BankFundProduct bankFundProduct = getUpdatedFundProduct(fundId);
        if (bankFundProduct == null) {
            return BankResult.build(400, "基金产品不存在！", "");
        }

        if (!bankAccount.getPassword().equals(pw))
            return BankResult.build(400, "密码错误！", "");

        double amount = share * bankFundProduct.getNetAssetValue();

        // 创建交易记录
        BankFundLog bankFundLog = new BankFundLog();
        bankFundLog.setFundTxId(String.valueOf(fundTxId));
        bankFundLog.setCustId(bankAccount.getCustId());
        bankFundLog.setAccount(account);
        bankFundLog.setFundId(fundId);
        bankFundLog.setType("1");   // 标记1代表赎回
        bankFundLog.setAmount(amount);
        bankFundLog.setShare(share);
        bankFundLog.setTxDate(String.valueOf(System.currentTimeMillis()));
        bankFundLog.setReviewId(reviewerId);

        bankFundHold.setShare(bankFundHold.getShare() - share);
        bankAccount.setBalances(bankAccount.getBalances() + amount  * (1 - bankFundProduct.getRedemptionRate()));

        bankFundLogMapper.insert(bankFundLog);
        bankFundHoldMapper.updateByPrimaryKey(bankFundHold);
        bankAccountMapper.updateByPrimaryKey(bankAccount);

        return BankResult.ok(bankFundLog.getFundTxId());
    }

    @Override
    public BankResult getFundProducts() {
        BankFundProductExample bankFundProductExample = new BankFundProductExample();
        BankFundProductExample.Criteria criteria = bankFundProductExample.createCriteria();
        criteria.andFundIdIsNotNull();
        List<BankFundProduct> bankFundProductList = bankFundProductMapper.selectByExample(bankFundProductExample);
        return BankResult.ok(bankFundProductList);
    }

    @Override
    public BankResult getOneFundProduct(String fundId) {
        BankFundProductExample bankFundProductExample = new BankFundProductExample();
        BankFundProductExample.Criteria criteria = bankFundProductExample.createCriteria();
        criteria.andFundIdEqualTo(fundId);
        List<BankFundProduct> bankFundProductList = bankFundProductMapper.selectByExample(bankFundProductExample);
        return BankResult.ok(bankFundProductList);
    }

    @Override
    public BankResult getFundLogs() {
        BankFundLogExample bankFundLogExample = new BankFundLogExample();
        BankFundLogExample.Criteria criteria = bankFundLogExample.createCriteria();
        criteria.andFundTxIdIsNotNull();
        List<BankFundLog> bankFundLogList = bankFundLogMapper.selectByExample(bankFundLogExample);
        return BankResult.ok(bankFundLogList);
    }

    @Override
    public BankResult getOneFundLog(String fundTxId) {
        BankFundLog bankFundLog = bankFundLogMapper.selectByPrimaryKey(fundTxId);
        return BankResult.ok(bankFundLog);
    }

    @Override
    public BankResult getFundHolds() {
        BankFundHoldExample bankFundHoldExample = new BankFundHoldExample();
        BankFundHoldExample.Criteria criteria = bankFundHoldExample.createCriteria();
        criteria.andAccountIsNotNull();
        List<BankFundHold> bankFundHoldList = bankFundHoldMapper.selectByExample(bankFundHoldExample);
        return BankResult.ok(bankFundHoldList);
    }

    @Override
    public BankResult getOneFundHold(String account, String fundId) {
        BankFundHoldKey bankFundHoldKey = new BankFundHoldKey();
        bankFundHoldKey.setAccount(account);
        bankFundHoldKey.setFundId(fundId);
        BankFundHold bankFundHold = bankFundHoldMapper.selectByPrimaryKey(bankFundHoldKey);
        return BankResult.ok(bankFundHold);
    }

    private BankFundProduct getUpdatedFundProduct(String fundId) {
        BankFundProductExample bankFundProductExample = new BankFundProductExample();
        BankFundProductExample.Criteria criteria = bankFundProductExample.createCriteria();
        criteria.andFundIdEqualTo(fundId);
        List<BankFundProduct> bankFundProductList = bankFundProductMapper.selectByExample(bankFundProductExample);
        // 找到该基金产品最新的产品记录
        BankFundProduct bankFundProduct;
        if (!bankFundProductList.isEmpty()) {
            bankFundProduct = bankFundProductList.get(0);
            for (BankFundProduct bfp : bankFundProductList) {
                if (Long.parseLong(bfp.getPurchaseDate()) >  Long.parseLong(bankFundProduct.getPurchaseDate())) {
                    bankFundProduct = bfp;
                }
            }
        }
        else {
            return null;
        }
        return bankFundProduct;
    }
}
