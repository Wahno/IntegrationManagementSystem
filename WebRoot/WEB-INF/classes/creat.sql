CREATE SCHEMA `integrationdb`;

-- 管理员表
CREATE TABLE `integrationdb`.`admin_info` (
  `aId` 		INT 			NOT NULL,												-- 管理员ID
  `aPassword` 	VARCHAR(45) 	default '123456',										-- 管理员密码
  `aName` 		VARCHAR(45) 	NULL,													-- 管理员姓名
  `aSex` 		INT 			NULL,													-- 管理员性别
  `aTel` 		VARCHAR(45)		NULL,													-- 管理员电话
  `aPhoNum`		VARCHAR(45) 	NULL,													-- 管理员手机
  `aAddr` 		VARCHAR(45) 	NULL,													-- 管理员地址
  `aLimit` 		INT 			NULL,													-- 管理员权限
  `aDate`		 DATE 			NULL,													-- 管理员注册日期
  PRIMARY KEY (`aId`)
  
 );	

INSERT INTO `integrationdb`.`admin_info` VALUES(0,'123456','wanghao',0, '15270496554', '15270496554', '南京东路235号', 0, '2018-07-10');
INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123456','wang',1, '123456789', '123456789', '南京东路235号', 0, '2018-07-10');

-- 客户表
CREATE TABLE `integrationdb`.`user_info`(
	`uId`		INT				NOT NULL,												-- 客户ID
	`uName`		VARCHAR(45) 	NULL,													-- 客户姓名
	`uSex`		INT 			NULL,													-- 客户性别
	`uBirth`	DATE			NULL,													-- 客户生日
	`uTel`		VARCHAR(45) 	NULL,													-- 客户电话
	`uPhoNum`	VARCHAR(45) 	NULL,													-- 客户手机
	`uAddr`		VARCHAR(50)		NULL,													-- 客户地址
	`uRegDate`	DATE			NULL,													-- 客户注册日期
	`uRemark`	VARCHAR(100)	NULL,													-- 客户备注
	primary key(`uId`)
);

INSERT INTO `integrationdb`.`user_info` VALUES(1,'Lizongru', 0, '1997-09-27','8879748', '15180450316', '南京东路235号', '2018-07-10','大客户');


-- 员工表
CREATE TABLE `integrationdb`.`staff_info`(
	`sId`		INT				NOT NULL,												-- 员工ID
	`sName`		VARCHAR(45) 	NULL,													-- 员工姓名
	`sMark`		VARCHAR(5)		NULL,													-- 员工助记符
	`sSex`      INT 			NULL,													-- 员工性别
	`sTel`		VARCHAR(45)		NULL,													-- 员工电话
	`sPhoNum`	VARCHAR(45)		NULL,													-- 员工手机
	`sAddr`		VARCHAR(50)		NULL,													-- 员工地址
	`sRegDate`	DATE			NULL,													-- 员工注册日期
	`sRemark`	VARCHAR(100)	NULL,													-- 员工备注
	primary key(`sId`)
);

INSERT INTO `integrationdb`.`staff_info` VALUES(1,'Fangzhiqiang', 'fzq',0, '8860995', '18748980084', '南京东路235号', '2018-07-13','资本主义的走狗');
INSERT INTO `integrationdb`.`staff_info` VALUES(2,'Denghaocheng', 'dhc',0, '8883995', '18079411231', '南京东路235号', '2018-07-15','自由的男人');

-- 商品表
CREATE TABLE `integrationdb`.`goods_info`(
	`gId`			INT				NOT NULL,											-- 商品ID
	`gName`			VARCHAR(45)		NULL,												-- 商品名称
	`gNum`			INT				NULL,												-- 商品数量
	`gCost`      	INT				NULL,												-- 商品成本
	`gPrice`		INT				NULL,												-- 商品售价
	`gExchange`		INT				NULL,												-- 商品兑换所需积分
	`gRemark`		VARCHAR(100)	NULL,												-- 商品备注
	primary key(`gId`)
);

INSERT INTO `integrationdb`.`goods_info` VALUES(1,'aj32黑水泥',30,800,1098,10980000,'乔丹32代黑水泥');

-- 操作类型表(消费购买，返还现金，消费金额充值)
CREATE TABLE `integrationdb`.`operation_Type`(
	`oTid`			INT				NOT NULL,											-- 操作类型ID
	`oTName`		VARCHAR(10)		CHECK(oTName='消费购买' OR oTName='返还现金' OR oTName='消费金额充值'),-- 操作类型名称
	primary key(`oTid`)
);

INSERT INTO `integrationdb`.`operation_Type` VALUES(1,'消费购买');

-- 购买类型表(自己购买，别人介绍)
CREATE TABLE `integrationdb`.`buy_Type`(
	`bTid`			INT				NOT NULL,											-- 购买类型ID
	`bTname`		VARCHAR(20)		NULL,												-- 类型名称
	`bTCredit`		INT				NULL,												-- 对应1元的积分
	primary key(`bTid`)
);

-- 总积分表
CREATE TABLE `integrationdb`.`all_Credits`(
	`uId`			INT				NOT NULL,											-- 用户ID
	`aCredits`		INT				NULL,												-- 用户当前总积分
	primary key(`uId`)
);

-- 消费明细表
CREATE TABLE `integrationdb`.`consume_info`(
	`uId`			INT				NOT NULL,							-- 用户ID
	`cDate`			DATE			NULL,								-- 消费日期
	`cTime`			TIME			NULL,								-- 消费时间
	`gId`			INT				NOT NULL,							-- 商品ID
	`cNum`			INT				NULL,								-- 消费数量，用于统计成本和盈利
	`oTid`			INT				NOT NULL,							-- 操作类型ID
	`bTid`			INT				NOT NULL,							-- 购买类型ID
	`cRedits`		INT				NULL,								-- 获得积分
	`cRemark`		VARCHAR(100)	NULL,								-- 消费备注
	`sId`			INT				NOT NULL,							-- 员工ID
	primary key(`uid`)
);

-- 积分兑换表
CREATE TABLE `integrationdb`.`exchange_info`(
	`uId`			INT				NOT NULL,							-- 用户ID
	`exDate`		DATE			NULL,								-- 兑换日期
	`exTime`		TIME			NULL,								-- 兑换时间
	`gId`			INT				NOT NULL,							-- 商品ID
	`exNum`			INT				NULL,								-- 兑换数量
	`cRedits`		INT				NULL,								-- 当前获得积分	
	`sId`			INT				NOT NULL,							-- 员工ID	
	primary key(`uid`)	
);

