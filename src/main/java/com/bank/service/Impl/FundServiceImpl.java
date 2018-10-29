package com.bank.service.Impl;

import com.bank.mapper.*;
import com.bank.pojo.*;
import com.bank.service.FundService;
import com.bank.utils.BankResult;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public BankResult createFundProduct(String type, double purchase_rate, double net_asset_value, double redemption_rate) {
        machineId = 1L;
        SnowFlake snowFlake = new SnowFlake(datacenterId,machineId);
        String snowFlakeId = String.valueOf(snowFlake.nextId());
        String fundId = snowFlakeId.substring(snowFlakeId.length() - 9, snowFlakeId.length() - 1);
        BankFundProduct bankFundProduct = new BankFundProduct();
        bankFundProduct.setFundId(fundId);
        bankFundProduct.setType(type);
        bankFundProduct.setPurchaseRate(purchase_rate);
        bankFundProduct.setNetAssetValue(net_asset_value);
        bankFundProduct.setRedemptionRate(redemption_rate);
        bankFundProduct.setPurchaseDate(String.valueOf(System.currentTimeMillis()));
        bankFundProductMapper.insert(bankFundProduct);
        return BankResult.ok(fundId);
    }

    @Override
    public BankResult createFundPurchaseTx(String custId, String account, String fundId, double amount, String passowrd) {
        machineId = 2L;

        BankCustomer bankCustomer = bankCustomerMapper.selectByPrimaryKey(custId);
        if (bankCustomer == null) return BankResult.build(200, "Request Failed", "Customer not exist!");

        BankAccount bankAccount = bankAccountMapper.selectByPrimaryKey(account);
        if (bankAccount == null) return BankResult.build(200, "Request Failed", "Account not exist!");

        if (!bankAccount.getCustId().equals(custId)) return BankResult.build(200, "Request Failed", "Account not correspond to customer!");

        if (bankAccount.getBalances() < amount) return BankResult.build(200, "Request Failed", "Insufficient balance!");

        if (bankCustomer.getPassword().equals(passowrd)) return BankResult.build(200, "Request Failed", "Wrong password!");

        // TODO: 此处有可能会要求修改基金产品表
        // 找到对应的基金产品
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
            return BankResult.build(200, "Request Failed", "Fund product not exist!");
        }

        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long fundTxId = snowFlake.nextId();

        // 创建交易记录
        BankFundLog bankFundLog = new BankFundLog();
        bankFundLog.setFundTxId(fundTxId);
        bankFundLog.setCustId(custId);
        bankFundLog.setAccount(account);
        bankFundLog.setFundId(fundId);
        bankFundLog.setType("purchase");
        bankFundLog.setAmount(amount);
        double share = (amount - amount * bankFundProduct.getPurchaseRate()) / bankFundProduct.getNetAssetValue();
        bankFundLog.setShare(share);
        bankFundLog.setTxDate(String.valueOf(System.currentTimeMillis()));
        bankFundLog.setReviewId("Carrie");
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
    public BankResult createFundRedemptionTx(String account, String fundId, double share) {
        machineId = 2L;

        BankAccount bankAccount = bankAccountMapper.selectByPrimaryKey(account);
        BankFundHoldKey bankFundHoldKey = new BankFundHoldKey();
        bankFundHoldKey.setFundId(fundId);
        bankFundHoldKey.setAccount(account);
        BankFundHold bankFundHold = bankFundHoldMapper.selectByPrimaryKey(bankFundHoldKey);

        // TODO: 添加一些条件判断
        if (bankFundHold.getShare() < share) return BankResult.build(200, "Request Failed", "Insufficient share");


        SnowFlake snowFlake = new SnowFlake(datacenterId, machineId);
        long fundTxId = snowFlake.nextId();

        // TODO: 此处有可能会要求修改基金产品表
        // 找到对应的基金产品
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
            return BankResult.build(200, "Request Failed", "Fund product not exist!");
        }

        double amount = share * bankFundProduct.getNetAssetValue();

        // 创建交易记录
        BankFundLog bankFundLog = new BankFundLog();
        bankFundLog.setFundTxId(fundTxId);
        bankFundLog.setCustId(bankAccount.getCustId());
        bankFundLog.setAccount(account);
        bankFundLog.setFundId(fundId);
        bankFundLog.setType("redemption");
        bankFundLog.setAmount(amount);
        bankFundLog.setShare(share);
        bankFundLog.setTxDate(String.valueOf(System.currentTimeMillis()));
        bankFundLog.setReviewId("Carrie");

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
    public BankResult getFundLogs() {
        BankFundLogExample bankFundLogExample = new BankFundLogExample();
        BankFundLogExample.Criteria criteria = bankFundLogExample.createCriteria();
        criteria.andFundTxIdIsNotNull();
        List<BankFundLog> bankFundLogList = bankFundLogMapper.selectByExample(bankFundLogExample);
        return BankResult.ok(bankFundLogList);
    }

    @Override
    public BankResult getFundHolds() {
        BankFundHoldExample bankFundHoldExample = new BankFundHoldExample();
        BankFundHoldExample.Criteria criteria = bankFundHoldExample.createCriteria();
        criteria.andAccountIsNotNull();
        List<BankFundHold> bankFundHoldList = bankFundHoldMapper.selectByExample(bankFundHoldExample);
        return BankResult.ok(bankFundHoldList);
    }

}
