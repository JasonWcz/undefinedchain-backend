DROP DATABASE undefinedchain;
CREATE DATABASE undefinedchain;
USE undefinedchain;

-- 用户表
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`(
  `uid` INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `uname` VARCHAR(64) NOT NULL COMMENT '用户名/登录名/企业管理员名',
  `upass` VARCHAR(64) NOT NULL COMMENT '密码',
  `utype` INT NOT NULL COMMENT '用户角色',
  `phone` VARCHAR(64) NOT NULL COMMENT '电话号码',
  `eid` INT NOT NULL COMMENT '企业id',
  `account_state` INT DEFAULT 0 COMMENT '账户认证状态', /* 0 待认证; 1认证通过; 2认证不通过 */
  PRIMARY KEY (`uid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO USER VALUES(1,'Lwimp','123',1,'123',1,0);

-- 企业信息表
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise`(
  `eid` INT NOT NULL AUTO_INCREMENT COMMENT '企业id',
  `ename` VARCHAR(128) NOT NULL COMMENT '企业名',
  `etype`INT NOT NULL COMMENT '企业角色', /*1表示建设方 2表示施工方 3表示保理商*/
  `uname` VARCHAR(64) NOT NULL COMMENT '企业管理员',
  `uidnumber` VARCHAR(64) NOT NULL COMMENT '企业管理员身份证号',
  `lname` VARCHAR(64) NOT NULL  COMMENT '企业法人',
  `lidnumber` VARCHAR(64)  NOT NULL COMMENT '企业法人身份证号',
  `address` VARCHAR(128) NOT NULL COMMENT '地址',
  `adminphone` VARCHAR(64) NOT NULL COMMENT '管理员手机',

  `cocertificate_type` INT    DEFAULT 0 COMMENT '证件类型',/*0：统一社会信用代码 1：组织机构代码*/
  `certificate_code` VARCHAR(64)   DEFAULT 'default' COMMENT '证件码',
  `bankaccount_name` VARCHAR(64)  DEFAULT 'default'  '123' COMMENT '银行卡账户名',
  `bankaccount_id` VARCHAR(64)   DEFAULT 'default' COMMENT '银行账户',
  `bankname` VARCHAR(32)   DEFAULT 'default' COMMENT '开户银行',
  `subbank` VARCHAR(32)    DEFAULT 'default' COMMENT '所属支行',
  `estate` INT  DEFAULT 0  DEFAULT 0 COMMENT '企业审核状态',/* 0 ：待审核 1：审核成功 2：审核失败 */
  PRIMARY KEY (`eid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO enterprise  VALUES(1,'test建筑公司','1','Lwimp','123','test','123','testaddress','123', 0 ,'','','','','', 0)

-- 金票表
DROP TABLE IF EXISTS `financebill`;
CREATE TABLE `financebill`(
  `fid` INT NOT NULL AUTO_INCREMENT COMMENT '金票id',
  `ename` VARCHAR(64) NOT NULL COMMENT 'fcode',
  `oid` INT NOT NULL COMMENT '原票id',
  `sid` INT NOT NULL COMMENT '子票id',
  `uid`INT NOT NULL COMMENT '开票用户id',
  `now_id`INT NOT NULL COMMENT '当前持有人id',
  `cid`INT NOT NULL COMMENT '认证材料.pdf id',
  `eid` INT NOT NULL COMMENT '开票企业id',
  `hid` INT NOT NULL COMMENT '持票企业id',
  `ftid` INT NOT NULL COMMENT '保理商id',
  `ticketing_date` DATETIME NOT NULL COMMENT '开票时间',
  `expire_date` DATETIME  NOT NULL  COMMENT '到期时间',
  `amount` DECIMAL(9,5)   NOT NULL COMMENT '金额',
  `financial_quota` DECIMAL(9,5)   NOT NULL  COMMENT '额度',
  `bill_process` INT  NOT NULL  COMMENT '金票流程阶段',/*  0 金票申请; 1 金票融资; 2  金票转让  */
  `bill_state` INT  NOT NULL  COMMENT '金票状态',/* 参考 financebill_state_dim */
  PRIMARY KEY (`fid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


-- 认证表
DROP TABLE IF EXISTS `certificationinfo`;
CREATE TABLE `certificationinfo`(
  `cid` INT NOT NULL AUTO_INCREMENT COMMENT '认证id',
  `uid` INT NOT NULL COMMENT '用户id',
  `eid` INT NOT NULL COMMENT '企业id',
  `certification_info` VARCHAR(128) NOT NULL COMMENT '认证材料前缀名称',
  `certificate_type` INT NOT NULL COMMENT '认证状态',
  PRIMARY KEY (`cid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

-- 反馈表
DROP TABLE IF EXISTS `feedback_info`;
CREATE TABLE `feedback_info`(
  `fbid` INT NOT NULL AUTO_INCREMENT COMMENT '反馈id',
  `cid` INT NOT NULL COMMENT '认证材料id',
  `uid` INT NOT NULL COMMENT '驳回人id',
  `feed_info` TEXT NOT NULL COMMENT '驳回原因',
  PRIMARY KEY (`fdid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;


CREATE TABLE `financebill_state_dim`(
  `fstateid` INT NOT NULL AUTO_INCREMENT COMMENT '金票状态id',
  `fstate_info` VARCHAR(64) NOT NULL COMMENT '金票状态信息',
  PRIMARY KEY (`fstateid`)
) ENGINE=INNODB DEFAULT CHARSET=utf8;

INSERT INTO `financebill_state_dim` VALUES(1,'申请待初审');
INSERT INTO `financebill_state_dim` VALUES(2,'申请待复审');
INSERT INTO `financebill_state_dim` VALUES(3,'金票待接收');
INSERT INTO `financebill_state_dim` VALUES(4,'申请已驳回');
INSERT INTO `financebill_state_dim` VALUES(5,'申请成功');
INSERT INTO `financebill_state_dim` VALUES(6,'融资待受理');
INSERT INTO `financebill_state_dim` VALUES(7,'融资已受理');
INSERT INTO `financebill_state_dim` VALUES(8,'融资已驳回');
INSERT INTO `financebill_state_dim` VALUES(9,'放款待签收');
INSERT INTO `financebill_state_dim` VALUES(10,'放款已驳回');
INSERT INTO `financebill_state_dim` VALUES(11,'融资成功');
INSERT INTO `financebill_state_dim` VALUES(12,'转让待签收');
INSERT INTO `financebill_state_dim` VALUES(13,'转让已驳回');
INSERT INTO `financebill_state_dim` VALUES(14,'转让已签收');
INSERT INTO `financebill_state_dim` VALUES(15,'系统收回');




