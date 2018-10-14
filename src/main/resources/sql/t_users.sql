CREATE DATABASE banksystem DEFAULT CHARACTER SET utf8;

USE banksystem;

DROP TABLE IF EXISTS `bank_users`;

CREATE TABLE `bank_users` (
  `uid` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(32) DEFAULT NULL,
  `password` varchar(64) DEFAULT NULL,
  `status` varchar(16) DEFAULT NULL,
  `usertype` varchar(16) DEFAULT NULL,
  `sex` varchar(16) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `phone` varchar(32) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `photo` varchar(512) DEFAULT NULL,
  `created` int(10) unsigned DEFAULT '0',
  `edited` int(10) unsigned DEFAULT '0' ,
  PRIMARY KEY (`uid`),
  UNIQUE KEY `name` (`username`),
  UNIQUE KEY `mail` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;