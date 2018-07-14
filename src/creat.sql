CREATE SCHEMA `integrationdb` ;

--管理员表
CREATE TABLE `integrationdb`.`admin_info` (
  `aId` INT NOT NULL,
  `aPassword` VARCHAR(45) default '123456',
  `aName` VARCHAR(45) NULL,
  `aSex` INT NULL,
  `aTel` VARCHAR(45) NULL,
  `aPhoNum` VARCHAR(45) NULL,
  `aAddr` VARCHAR(45) NULL,
  `aLimit` INT NULL,
  `aDate` DATE NULL,
  PRIMARY KEY (`aId`)
  
 );	

INSERT INTO `integrationdb`.`admin_info` VALUES(0,'123456','wanghao',0, '15270496554', '15270496554', '南京东路235号', 0, '2018-07-10');
INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123456','wang',1, '123456789', '123456789', '南京东路235号', 0, '2018-07-10');

---客户表
CREATE TABLE `integrationdb`.`User_info`(
	`Uid`		INT				NOT NULL,												-- 客户ID
	`Uname`		VARCHAR(45) 	NULL,													-- 客户姓名
	`Usex`		INT NULL,																--- 客户性别
	`Ubirth`	DATE			NULL,													-- 客户生日
	`Utel`		VARCHAR(45) 	NULL,													-- 客户电话
	`UphoNum`	VARCHAR(45) 	NULL,													-- 客户手机
	`Uaddr`		VARCHAR(50),	NULL,													-- 客户地址
	`UregDate`	DATE			NULL,													-- 客户注册日期
	`Uremark`	VARCHAR(100)	NULL,													-- 客户备注
	primary key(`Uid`)
);

INSERT INTO `integrationdb`.`User_info` VALUES(1,'Lizongru', '男', '1997-09-27','8879748', '15180450316', '南京东路235号', '2018-07-10','大客户');


--员工表
CREATE TABLE `integrationdb`.`Staff_info`(
	`Sid`		INT				NOT NULL,												-- 员工ID
	`Sname`		VARCHAR(45) 	NULL,													-- 员工姓名
	`Smark`		VARCHAR(5)		NULL,													-- 员工助记符
	`Ssex`      INT NULL,																--- 员工性别
	`Stel`		INT,																	-- 员工电话
	`SphoNum`	INT,																	-- 员工手机
	`Saddr`		VARCHAR(50),															-- 员工地址
	`SregDate`	DATE,																	-- 员工注册日期
	`Sremark`	VARCHAR(100),															-- 员工备注
	primary key(`Sid`)
);

INSERT INTO `integrationdb`.`Staff_info` VALUES(1,'123456','Lizongru', '男', '1997-09-27','8879748', '15180450316', '南京东路235号', '2018-07-10','0');


-- 商品表
CREATE TABLE `integrationdb`.`Goods_info`(
	`Gid`			INT				NOT NULL,											-- 商品ID
	`Gname`			VARCHAR(45),														-- 商品名称
	`Gnum`			INT,																-- 商品数量
	`Gcost`      	INT,																-- 商品成本
	`Gprice`		INT,																-- 商品售价
	`Gexchange`		INT,																-- 商品兑换所需积分
	`Gremark`		VARCHAR(100),														-- 商品备注
	primary key(`Gid`)
);

-- 操作类型表(消费购买，返还现金，消费金额充值)
CREATE TABLE Operation_Type(
	`OTid`			INT				NOT NULL,											-- 操作类型ID
	`OTName`		VARCHAR(10)		CHECK(OTName='消费购买' OR OTName='返还现金' OR OTName='消费金额充值'),--操作类型名称
	primary key(`OTid`)
);

-- 购买类型表(自己购买，别人介绍)
CREATE TABLE Buy_Type(
	`BTid`			INT				NOT NULL,											-- 购买类型ID
	`Btname`		VARCHAR(20),														-- 类型名称
	`BTCredit`		INT,																-- 对应1元的积分
	primary key(`BTid`)
);

-- 总积分表
CREATE TABLE All_Credits(
	`Uid`			INT				NOT NULL,											-- 用户ID
	`Acredits`		INT,																-- 用户当前总积分
	primary key(`Uid`)
);

-- 消费明细表
CREATE TABLE Consume_info(
	`Uid`			INT				NOT NULL,							-- 用户ID
	`Cdate`			DATE,												-- 消费日期
	`Ctime`			TIME,												-- 消费时间
	`Gid`			INT				NOT NULL,							-- 商品ID
	`Cnum`			INT,												-- 消费数量，用于统计成本和盈利
	`OTid`			INT				NOT NULL,							-- 操作类型ID
	`BTid`			INT				NOT NULL,							-- 购买类型ID
	`Credits`		INT,												-- 获得积分
	`Cremark`		VARCHAR(100),										-- 消费备注
	`Sid`			INT				NOT NULL,							-- 员工ID
	primary key(`Uid`)
);

-- 积分兑换表
CREATE TABLE exChange_info(
	`Uid`			INT				NOT NULL,							-- 用户ID
	`Exdate`		DATE,												-- 兑换日期
	`Extime`		TIME,												-- 兑换时间
	`Gid`			INT				NOT NULL,							-- 商品ID
	`ExNum`			INT,												-- 兑换数量
	`Credits`		INT,												-- 当前获得积分	
	`Sid`			INT				NOT NULL,							-- 员工ID	
	primary key(`Uid`)	
);

