package com.bank.service.Impl;

import com.bank.mapper.*;
import com.bank.pojo.*;
import com.bank.pojo.loan.BankLoanApplyInfo;
import com.bank.pojo.loan.BankLoanPaymentInfo;
import com.bank.utils.DateControlForLoan;
import com.bank.service.LoanService;
import com.bank.utils.BankResult;
import com.bank.utils.MD5;
import com.bank.utils.SnowFlake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ZJ
 */
@Service
public class LoanServiceImpl implements LoanService {
    @Autowired
    private BankLoanMapper bankLoanMapper;
    @Autowired
    private BankAccountMapper bankAccountMapper;
    @Autowired
    private BankCustomerMapper bankCustomerMapper;
    @Autowired
    private BankLoanPaymentMapper bankLoanPaymentMapper;
    @Autowired
    private BankLoanTypeMapper bankLoanTypeMapper;
    @Autowired
    private BankLoanPaylogMapper bankLoanPaylogMapper;

    private long datacenterId = 3L;  //数据中心
    private long machineId ;     //机器标识

    private double amountInAccount = 0.0;

    /**
     * 贷款申请
     * @param bankLoanApplyInfo
     * @return
     */
    @Override
    public BankResult dealApplyment(BankLoanApplyInfo bankLoanApplyInfo) {

        machineId = 1L;

        //判断用法合理性
        String account = bankLoanApplyInfo.getAccount();
        BankResult isLegalInfo = isLegalInfo(account,bankLoanApplyInfo.getName(),bankLoanApplyInfo.getIdCard(),
                bankLoanApplyInfo.getPassword(),bankLoanApplyInfo.getAmount(),false);
        if( isLegalInfo.getMsg().equals("Request failed") ) {
            return isLegalInfo;
        }
        String custId = isLegalInfo.getData().toString();
        isLegalInfo = null;

        //利用雪花算法算出 transId
        SnowFlake snowFlake = new SnowFlake(datacenterId,machineId);
        long transId = snowFlake.nextId();

        //还款总额度 以"月"为单位，利息是年息
        double tempSum = DateControlForLoan.toCriterionD( bankLoanApplyInfo.getAmount() ) *
                (1 + DateControlForLoan.toCriterionD(bankLoanApplyInfo.getInterestRate())*0.01*
                        Short.valueOf( bankLoanApplyInfo.getTime())/12  );

        //住房类型
        String loanType = null;
        switch (bankLoanApplyInfo.getLoanType()) {
            case ("1") : loanType = "住房贷款"; break;
            case ("2") : loanType = "小微贷款"; break;
            case ("3") : loanType = "消费贷款"; break;
//            case ("4") : loanType = "信用贷款"; break;
            default: return BankResult.build(400,"贷款类型不存在！");
        }

        //交易时间戳
        String transDate = String.valueOf( System.currentTimeMillis() );

        //插入数据
        BankLoan bankLoan = new BankLoan();
        bankLoan.setTransId( transId );
        bankLoan.setCustId( custId );
        bankLoan.setAccount( account );
        bankLoan.setTransDate( transDate );
        bankLoan.setLoanAmount( DateControlForLoan.toCriterionD( bankLoanApplyInfo.getAmount() ));
        bankLoan.setInsCount(Short.valueOf( bankLoanApplyInfo.getTime() ));
        bankLoan.setLoanInterest( DateControlForLoan.toCriterionD(bankLoanApplyInfo.getInterestRate() ));
        bankLoan.setLoanAmountSum( DateControlForLoan.toCriterionD(  tempSum  ) );
        bankLoan.setExpirationDate( DateControlForLoan.getExpirationDate(1 + Short.valueOf( bankLoanApplyInfo.getTime() )) );
        bankLoan.setRecoveredAmount( 0.00 );
        bankLoan.setLoanTypeName( loanType );
        bankLoan.setLoanStatus( "未到期" );
        //TODO 审核员ID 待插入
        try {
            bankLoanMapper.insert(bankLoan);
        } catch (Exception e) {
            return BankResult.build(400,"数据表插入异常");
        }

        //生成用户 payment 表，里面包括了用户在 n 期内每期的操作
        machineId = 2L;
        SnowFlake snowFlake1 = new SnowFlake(datacenterId,machineId);
        double fineRate = bankLoanTypeMapper.selectByPrimaryKey(loanType).getFineRate();
        double payMoney = DateControlForLoan.toCriterionD( tempSum /
                Short.valueOf(bankLoanApplyInfo.getTime()) );
        double payMoney1 = payMoney + DateControlForLoan.toCriterionD(tempSum) -
                payMoney * Short.valueOf(bankLoanApplyInfo.getTime());
        payMoney1 = DateControlForLoan.toCriterionD(payMoney1 );
        for (int i = 0; i < Short.valueOf( bankLoanApplyInfo.getTime() ); i++) {
            long paymentId = snowFlake.nextId();
            BankLoanPayment bankLoanPayment = new BankLoanPayment();
            //将 payment_date 设置为到期日
            bankLoanPayment.setPaymentId(paymentId);
            bankLoanPayment.setTransId(transId);
            bankLoanPayment.setInsNum( Short.valueOf(i+1+"") ) ;
            if(i == 0) {
                bankLoanPayment.setPaymentAmount( payMoney1 );
                bankLoanPayment.setAllPaymentAmount(payMoney1);
            } else {
                bankLoanPayment.setPaymentAmount( payMoney );
                bankLoanPayment.setAllPaymentAmount( payMoney );
            }
            bankLoanPayment.setPaymentDate( DateControlForLoan.getExpirationDate(i+2) );
            bankLoanPayment.setIsFinished("false");
            bankLoanPayment.setFineRate(fineRate);
            bankLoanPayment.setReimbursement(0.00);
            try {
                bankLoanPaymentMapper.insert(bankLoanPayment);
            } catch (Exception e) {
                return BankResult.build(400,"数据表插入异常");
            }
        }

        return BankResult.build(200,"交易成功！");
    }


    /**
     * 还款
     * @param bankLoanPaymentInfo
     * @return
     */
    @Override
    public BankResult payForLoan(BankLoanPaymentInfo bankLoanPaymentInfo) {
        machineId = 2L;
        // 查询信息是否异常
        BankResult isLegalInfo = isLegalInfo(bankLoanPaymentInfo.getAccount(),
                bankLoanPaymentInfo.getName(),bankLoanPaymentInfo.getIdCard(),bankLoanPaymentInfo.getPassword(),
                bankLoanPaymentInfo.getAmount(),true);
        if( isLegalInfo.getMsg().equals("Request failed") ) {
            return isLegalInfo;
        }

        //利用雪花算法算出 transId
        SnowFlake snowFlake = new SnowFlake(datacenterId,machineId);
        long payLogId = snowFlake.nextId();

        //交易时间戳
        String transTime = String.valueOf( System.currentTimeMillis() );

        BankLoanPaylog bankLoanPaylog = new BankLoanPaylog();
        bankLoanPaylog.setPaylogId(payLogId);
        bankLoanPaylog.setPayDate(transTime);
        bankLoanPaylog.setAccount(bankLoanPaymentInfo.getAccount());
        bankLoanPaylog.setTransId( Long.valueOf(bankLoanPaymentInfo.getTransId()) );
        bankLoanPaylog.setPayAmount( DateControlForLoan.toCriterionD(bankLoanPaymentInfo.getAmount()) );

        //插入
        try {
            bankLoanPaylogMapper.insert(bankLoanPaylog);
        } catch (Exception e) {
            return BankResult.build(400,"数据表插入异常");
        }

        //判断 transId 是否是属于account的一个合法 贷款号，并进行计算
        try {
            String transId = bankLoanPaymentInfo.getTransId();
            BankLoan bankLoan = bankLoanMapper.selectByPrimaryKey( Long.valueOf(transId) );
            String accountTemp = bankLoan.getAccount();
            if( !accountTemp.equals( bankLoanPaymentInfo.getAccount() ) ) {
                return BankResult.build(400,"账户号有误");
            }
            //查询 transId 的贷款记录
            BankLoanPaymentExample bankLoanPaymentExample = new BankLoanPaymentExample();
            bankLoanPaymentExample.setOrderByClause("ins_num ASC");
            BankLoanPaymentExample.Criteria criteria = bankLoanPaymentExample.createCriteria();
            criteria.andTransIdEqualTo(Long.valueOf(transId));
            criteria.andIsFinishedEqualTo("false");
            List<BankLoanPayment> bankLoanPaymentList = bankLoanPaymentMapper.selectByExample(bankLoanPaymentExample);
            //现在时间戳
            long nowTime = System.currentTimeMillis();  //时间戳
            double amount = Long.valueOf( bankLoanPaymentInfo.getAmount() );    //还款额，可能会有剩余
            boolean overDueFlag = false;    //是否有逾期行为
            boolean overDueNotPay = false;  //有逾期账单
            boolean allPayed = true;
            double fineAll = 0.0;   //罚金总数，用于表 bank_loan 的更新
            double recoveredMoney ; //本次还了多少
            for (int i = 0; i < bankLoanPaymentList.size(); i++) {
                BankLoanPayment bankLoanPayment = bankLoanPaymentList.get(i);
                //超期  所有超期的都应该算罚金，无论 amount 是否为 0
                if(nowTime > Long.valueOf(bankLoanPaymentList.get(i).getPaymentDate()) ) {
                    overDueFlag = true;
                    //计算之前的罚金 罚息按照天算 neededMoney = 总共需要还的钱 - 已经还的钱
                    double neededMoney = bankLoanPayment.getAllPaymentAmount() - bankLoanPayment.getReimbursement();
                    //迭代
                    for (long j = Long.valueOf(bankLoanPayment.getPaymentDate()); j < nowTime ; j += 86400000L) {
                        neededMoney += neededMoney * bankLoanPayment.getFineRate() / 100;
                    }
                    //上次时间戳改变到今天的 23:59:59
                    double fineMoney = neededMoney - ( bankLoanPayment.getAllPaymentAmount() 
                            - bankLoanPayment.getReimbursement() );
                    fineAll += fineMoney;   //罚金加钱
                    BankLoanPayment bankLoanPayment1 = new BankLoanPayment();
                    bankLoanPayment1.setPaymentId(bankLoanPayment.getPaymentId());
                    bankLoanPayment1.setPaymentDate(DateControlForLoan.
                            getTimestampAboutEndOfDay());   //获取该天的23:59:59的时间戳 ，防止罚金被重复算
                    bankLoanPayment1.setAllPaymentAmount(DateControlForLoan.toCriterionD
                            (bankLoanPayment.getAllPaymentAmount() + fineMoney));
                    // 钱够还这期
                    if(amount >= neededMoney) { 
                        amount -= neededMoney;
                        bankLoanPayment1.setReimbursement(DateControlForLoan.toCriterionD
                                (bankLoanPayment.getReimbursement() + neededMoney) );    //默认这一期先还
                        bankLoanPayment1.setIsFinished("true");     //已还清
                    }
                    else {
                        //还没还清
                        overDueNotPay = true;
                        allPayed = false;
                        bankLoanPayment1.setReimbursement(DateControlForLoan.toCriterionD
                                (bankLoanPayment.getReimbursement() + amount));
                        amount = 0;
                    }
                    try {
                        bankLoanPaymentMapper.updateByPrimaryKeySelective(bankLoanPayment1);
                    }catch (Exception e) {
                        return BankResult.build(400,"数据表插入异常");
                    }
                }
                else {  //不需要算罚金
                    double neededMoney = bankLoanPayment.getAllPaymentAmount() - bankLoanPayment.getReimbursement();
                    BankLoanPayment bankLoanPayment2 = new BankLoanPayment();
                    bankLoanPayment2.setPaymentId(bankLoanPayment.getPaymentId());
                    // 钱够还这期
                    if(amount >= neededMoney) {
                        amount -= neededMoney;
                        bankLoanPayment2.setReimbursement(DateControlForLoan.toCriterionD
                                (bankLoanPayment.getReimbursement() + neededMoney ));
                        bankLoanPayment2.setIsFinished("true");     //已还清
                    }
                    else {
                        //还没还清
                        bankLoanPayment2.setReimbursement(DateControlForLoan.toCriterionD
                                (bankLoanPayment.getReimbursement() + amount));
                        amount = 0.0;
                        allPayed = false;
                    }
                    try {
                        bankLoanPaymentMapper.updateByPrimaryKeySelective(bankLoanPayment2);
                    }catch (Exception e) {
                        return BankResult.build(400,"数据表更新异常");
                    }
                }
            }

            // 向原账户扣钱
            BankAccount bankAccount = new BankAccount();
            bankAccount.setAccount(bankLoanPaymentInfo.getAccount());
            // 账户扣款金额 = 账户原有额 - 预还款金额 + 还款后还多的金额
            bankAccount.setBalances(DateControlForLoan.toCriterionD
                    (amountInAccount- Double.valueOf(bankLoanPaymentInfo.getAmount()) + amount));
            if(overDueFlag) {
                bankAccount.setAccountStatus("2");
            }
            try {
                bankAccountMapper.updateByPrimaryKeySelective(bankAccount);
            } catch (Exception e) {
                return BankResult.build(400,"数据表更新异常");
            }


            //bankLoan 的修改
            recoveredMoney = Double.valueOf(bankLoanPaymentInfo.getAmount()) - amount;
            BankLoan bankLoan1 = new BankLoan();
            bankLoan1.setTransId(bankLoan.getTransId());
            bankLoan1.setRecoveredAmount(DateControlForLoan.toCriterionD
                    (bankLoan.getRecoveredAmount() + recoveredMoney));
            bankLoan1.setLoanAmountSum(DateControlForLoan.toCriterionD
                    (bankLoan.getLoanAmountSum() + fineAll));
            //时间到了 并已经还清
            if(allPayed) {
                bankLoan1.setLoanStatus("已还清");
            }
            if(overDueNotPay) {
                bankLoan1.setLoanStatus("逾期");
            }
            try {
                bankLoanMapper.updateByPrimaryKeySelective(bankLoan1);
            }catch (Exception e) {
                return BankResult.build(400,"数据表更新异常");
            }

        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }

        return BankResult.build(200,"还款成功！");
    }

    /**
     * 获取所有的贷款信息
     * @return
     */
    @Override
    public BankResult sentAllRecords() {
        BankLoanExample bankLoanExample = new BankLoanExample();
        try {
            List<BankLoan> bankLoanList = bankLoanMapper.selectByExample(bankLoanExample);
            return BankResult.ok(bankLoanList);
        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }
    }

    /**
     * 获取单个贷款信息
     * @param transId 交易号
     * @return
     */
    @Override
    public BankResult sentOneRecord(long transId) {
        try {
            BankLoan bankLoan = bankLoanMapper.selectByPrimaryKey(transId);
            if(bankLoan == null)
                return BankResult.build(400,"贷款交易号不存在，请检查输入正确性");
            return BankResult.ok(bankLoan);
        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }
    }

    @Override
    public BankResult getInterestRate() {
        BankLoanTypeExample bankLoanTypeExample = new BankLoanTypeExample();
        try {
            List<BankLoanType> bankLoanTypeList = bankLoanTypeMapper.selectByExample(bankLoanTypeExample);
            return BankResult.ok(bankLoanTypeList);
        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }
    }

    @Override
    public BankResult getInterestOneRate(int value) {
        String text = null;
        switch (value) {
            case 1: text = "住房贷款";break;
            case 2: text = "小微贷款";break;
            case 3: text = "消费贷款";break;
            default: return BankResult.build(400,"请求错误");
        }

        try {
            BankLoanType bankLoanType = bankLoanTypeMapper.selectByPrimaryKey(text);
            return BankResult.ok(bankLoanType);
        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }
    }

    @Override
    public BankResult getPaylog(long value) {
        BankLoanPaylogExample bankLoanPaylogExample = new BankLoanPaylogExample();
        BankLoanPaylogExample.Criteria criteria = bankLoanPaylogExample.createCriteria();
        criteria.andTransIdEqualTo(value);
        try {
            List<BankLoanPaylog> bankLoanPaylogs = bankLoanPaylogMapper.selectByExample(bankLoanPaylogExample);
            return BankResult.ok(bankLoanPaylogs);
        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }
    }

    @Override
    public  BankResult getPaymentOneInfo(long value) {
        BankLoanPaymentExample bankLoanPaymentExample = new BankLoanPaymentExample();
        BankLoanPaymentExample.Criteria criteria = bankLoanPaymentExample.createCriteria();
        criteria.andTransIdEqualTo(value);
        try {
            List<BankLoanPayment> bankLoanPaymentList = bankLoanPaymentMapper.selectByExample(bankLoanPaymentExample);
            return BankResult.ok(bankLoanPaymentList);
        } catch (Exception e) {
        return BankResult.build(400,"数据表查询异常");
        }
    }
    /**
     * 判断账户合法性
     * @param account    账户号
     * @param custName   客户号
     * @param IdCard     IdCard
     * @param password   账户密码
     * @param amount     钱
     * @param flag       是否要进行卡内余额和金额的对比，true 表示要
     * @return           不合法，返回不合法原因；合法给出 custId，降低外界再次获得 custId 的开销
     */
    public BankResult isLegalInfo(String account, String custName,String IdCard,String password,
                                  String amount,boolean flag) {
        try {
            //判断 还钱数 是否是一个 double 数
            try {
                Double.valueOf(amount);
            }catch (NumberFormatException e) {
                return BankResult.build(400,"还款金额是不合法");
            }

            // 判断账户是否存在
            BankAccount bankAccount = bankAccountMapper.selectByPrimaryKey(account);
            if(bankAccount == null) { return BankResult.build(400,"账户名不存在！"); }

            //判断密码是否匹配
            if(!MD5.string2MD5(password).equals(bankAccount.getPassword())) {

                return BankResult.build(400,"密码错误！");
            }

            // 判断姓名与账户是否匹配
            String custId = bankAccount.getCustId();
            BankCustomer bankCustomer = bankCustomerMapper.selectByPrimaryKey(custId);
            if(bankCustomer == null) { return BankResult.build(400,"用户名不存在！"); }

            // 判断姓名账户
            if(!custName.equals(bankCustomer.getCustName()) ) {
                return BankResult.build(400,"姓名与账户不匹配！");
            }

            // 判断身份证号是否正确
            if(!IdCard.equals(bankCustomer.getIdentityCard())) {
                return BankResult.build(400,"身份证号不正确！");
            }

            //判断用户是否具有还款能里，银行卡里有没有还款的
            if(flag) {
                if( Double.valueOf(amount) > Double.valueOf(bankAccount.getBalances()) ) {
                    return BankResult.build(400,"还款金额超过账户余额");
                }
                amountInAccount = Double.valueOf(bankAccount.getBalances());
            }
            return BankResult.build(200,"OK",custId); //这个和你没关系

        } catch (Exception e) {
            return BankResult.build(400,"数据表查询异常");
        }

    }


}
