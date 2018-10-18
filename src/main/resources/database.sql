CREATE DATABASE bank DEFAULT CHARACTER SET utf8;

USE bank;

DROP TABLE IF EXISTS `bank_user`;

CREATE TABLE `bank_user` (
  `user_id` varchar(16) NOT NULL,
  `user_name` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `user_type` varchar(16) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(256) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank_customer`;
CREATE TABLE `bank_customer` (
  `cust_id` varchar(16) NOT NULL,
  `cust_name` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `identity_card` varchar(64) DEFAULT NULL,
  `cust_type` varchar(16) DEFAULT NULL,
  `sex`   tinyint(1) DEFAULT '0',
  `phone` varchar(32) DEFAULT NULL,
  `address` varchar(256) DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `credit` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_account`;

CREATE TABLE `bank_account` (
  `account` varchar(20) NOT NULL,
  `cust_id` varchar(16) DEFAULT NULL,
  `deposit_bank` varchar(256) DEFAULT NULL,
  `balances` double DEFAULT '0',
  `blocked_balances` double DEFAULT '0',
  `open_date` varchar(20) DEFAULT NULL,
  `cancel_date` varchar(20) DEFAULT NULL,
  `account_kind` varchar(16) DEFAULT NULL,
  `account_type` varchar(16) DEFAULT NULL,
  `account_status` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`account`),
  FOREIGN KEY (`cust_id`) REFERENCES bank_customer (cust_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank_deposit`;
CREATE TABLE `bank_deposit` (
  `deposit_id` bigint(20) NOT NULL,
  `cust_id` varchar(16) DEFAULT NULL,
  `account` varchar(20) DEFAULT NULL,
  `deposit_type` varchar(20) DEFAULT NULL,
  `deposit_money` double DEFAULT NULL,
  `deposit_rate` double DEFAULT NULL,
  `deposit_date` varchar(20) DEFAULT NULL,
  `deposit_duration` varchar(20) DEFAULT NULL,
  `transfer_way` varchar(20) DEFAULT NULL,
  `reviewer_id` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`deposit_id`),
  FOREIGN KEY (`cust_id`) REFERENCES  `bank_customer`(`cust_id`),
  FOREIGN KEY (`account`) REFERENCES  `bank_account`(`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank_deposit_rate`;
CREATE TABLE `bank_deposite_rate` (
  `update_date` varchar(20) NOT NULL,
  `current_rate` double DEFAULT NULL,
  `zczq_tm_rate` double DEFAULT NULL,
  `zczq_hy_rate` double DEFAULT NULL,
  `zczq_oy_rate` double DEFAULT NULL,
  `zczq_twy_rate` double DEFAULT NULL,
  `zczq_ty_rate` double DEFAULT NULL,
  `zczq_fy_rate` double DEFAULT NULL,
  `other_oy_rate` double DEFAULT NULL,
  `other_ty_rate` double DEFAULT NULL,
  `other_fy_rate` double DEFAULT NULL,
   primary key (`update_date`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank_withdraw`;

CREATE TABLE `bank_withdraw` (
  `withdraw_id` bigint(20) NOT NULL,
  `cust_id` varchar(16) DEFAULT NULL,
  `account` varchar(20) NOT NULL,
  `withdraw_money` double DEFAULT NULL,
  `wirhdraw_date` varchar(20) DEFAULT NULL,
  `arrive_time` varchar(20) DEFAULT NULL,
  `reviewer_id` varchar(16) DEFAULT NULL,
  PRIMARY KEY (`withdraw_id`),
  FOREIGN KEY (`cust_id`) REFERENCES  `bank_customer`(`cust_id`),
  FOREIGN KEY (`account`) REFERENCES  `bank_account`(`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `bank_loan_type`;
CREATE TABLE `bank_loan_type` (
  `loan_type_name` varchar(255) NOT NULL,
  `period_one` double DEFAULT NULL,
  `period_two` double DEFAULT NULL,
  `period_three` double DEFAULT NULL,
  PRIMARY KEY (`loan_type_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_loan`;
CREATE TABLE `bank_loan` (
  `trans_id` bigint(20) NOT NULL,
  `cust_id` varchar(16) NOT NULL,
  `account` varchar(20) NOT NULL,
  `trans_date` varchar(20) DEFAULT NULL,
  `loan_amount` double DEFAULT NULL,
  `ins_count` smallint(6) DEFAULT NULL,
  `loan_interest` double DEFAULT NULL,
  `loan_amount_sum` double DEFAULT NULL,
  `expiration_date` varchar(20) DEFAULT NULL,
  `recovered_amount` double DEFAULT NULL,
  `loan_status` varchar(16) DEFAULT NULL,
  `reviewer_id` varchar(16) DEFAULT NULL,
  `loan_type_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`trans_id`),
  FOREIGN KEY (`loan_type_name`) REFERENCES `bank_loan_type` (`loan_type_name`),
  FOREIGN KEY (`cust_id`) REFERENCES  `bank_customer`(`cust_id`),
  FOREIGN KEY (`account`) REFERENCES  `bank_account`(`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_loan_payment`;
CREATE TABLE `bank_loan_payment` (
  `payment_id` bigint(20) NOT NULL,
  `trans_id` bigint(20) DEFAULT NULL,
  `ins_num` smallint(6) DEFAULT NULL,
  `payment_amount` double DEFAULT NULL,
  `payment_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`payment_id`),
  FOREIGN KEY (`trans_id`) REFERENCES `bank_loan` (`trans_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_fund_product`;
CREATE TABLE `bank_fund_product` (
  `fund_id` varchar(16) NOT NULL,
  `type` varchar(16) DEFAULT NULL,
  `purchase_rate` double DEFAULT NULL,
  `net_asset_value` double DEFAULT NULL,
  `redemption_rate` double DEFAULT NULL,
  `purchase_date` varchar(20) NOT NULL,
  PRIMARY KEY (`purchase_date`,`fund_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_fund_hold`;
CREATE TABLE `bank_fund_hold` (
  `cust_id` varchar(16) NOT NULL,
  `account` varchar(20) NOT NULL,
  `fund_id` varchar(16) NOT NULL,
  `share` double NOT NULL,
  PRIMARY KEY (`account`,`fund_id`),
  FOREIGN KEY (`cust_id`) REFERENCES  `bank_customer`(`cust_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `bank_fund_log`;
CREATE TABLE `bank_fund_log` (
  `fund_tx_id` bigint(20) NOT NULL,
  `cust_id` varchar(16) DEFAULT NULL,
  `account` varchar(20) DEFAULT NULL,
  `fund_id` varchar(16) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `share` double DEFAULT NULL,
  `tx_date` varchar(20) DEFAULT NULL,
  `review_id` varchar(16) DEFAULT NULL,
  primary  key (`fund_tx_id`),
  FOREIGN KEY (`cust_id`) REFERENCES  `bank_customer`(`cust_id`),
  FOREIGN KEY (`account`) REFERENCES  `bank_account`(`account`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 汇票
DROP TABLE IF EXISTS `bank_remit_log`;
CREATE TABLE `bank_remit_log` (
  `remit_id` bigint(20) NOT NULL,
  `remit_out_account` varchar(20) DEFAULT NULL,
  `remit_in_account` varchar(20) DEFAULT NULL,
  `amount` DOUBLE DEFAULT NULL,
  `remit_generate_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`remit_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 转账记录
DROP TABLE IF EXISTS `bank_transfer_log`;
CREATE TABLE `bank_transfer_log` (
  `transfer_id` bigint(20) NOT NULL,
  `transfer_out_account`varchar(20) DEFAULT NULL,
  `transfer_in_account` varchar(20) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `transfer_date` varchar(20) DEFAULT NULL,
  `receive_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`transfer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


