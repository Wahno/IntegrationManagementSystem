CREATE SCHEMA `integrationdb`;

--����Ա��
CREATE TABLE `integrationdb`.`admin_info` (
  `aId` 		INT 			NOT NULL,												--����ԱID
  `aPassword` 	VARCHAR(45) 	default '123456',										--����Ա����
  `aName` 		VARCHAR(45) 	NULL,													--����Ա����
  `aSex` 		INT 			NULL,													--����Ա�Ա�
  `aTel` 		VARCHAR(45)		NULL,													--����Ա�绰
  `aPhoNum`		VARCHAR(45) 	NULL,													--����Ա�ֻ�
  `aAddr` 		VARCHAR(45) 	NULL,													--����Ա��ַ
  `aLimit` 		INT 			NULL,													--����ԱȨ��
  `aDate`		 DATE 			NULL,													--����Աע������
  PRIMARY KEY (`aId`)
  
 );	

INSERT INTO `integrationdb`.`admin_info` VALUES(0,'123456','wanghao',0, '15270496554', '15270496554', '�Ͼ���·235��', 0, '2018-07-10');
INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123456','wang',1, '123456789', '123456789', '�Ͼ���·235��', 0, '2018-07-10');

---�ͻ���
CREATE TABLE `integrationdb`.`user_info`(
	`uId`		INT				NOT NULL,												-- �ͻ�ID
	`uName`		VARCHAR(45) 	NULL,													-- �ͻ�����
	`uSex`		INT 			NULL,													-- �ͻ��Ա�
	`uBirth`	DATE			NULL,													-- �ͻ�����
	`uTel`		VARCHAR(45) 	NULL,													-- �ͻ��绰
	`uPhoNum`	VARCHAR(45) 	NULL,													-- �ͻ��ֻ�
	`uAddr`		VARCHAR(50)		NULL,													-- �ͻ���ַ
	`uRegDate`	DATE			NULL,													-- �ͻ�ע������
	`uRemark`	VARCHAR(100)	NULL,													-- �ͻ���ע
	primary key(`uId`)
);

INSERT INTO `integrationdb`.`user_info` VALUES(1,'Lizongru', 0, '1997-09-27','8879748', '15180450316', '�Ͼ���·235��', '2018-07-10','��ͻ�');


--Ա����
CREATE TABLE `integrationdb`.`staff_info`(
	`sId`		INT				NOT NULL,												-- Ա��ID
	`sName`		VARCHAR(45) 	NULL,													-- Ա������
	`sMark`		VARCHAR(5)		NULL,													-- Ա�����Ƿ�
	`sSex`      INT 			NULL,													-- Ա���Ա�
	`sTel`		INT				NULL,													-- Ա���绰
	`sPhoNum`	INT				NULL,													-- Ա���ֻ�
	`sAddr`		VARCHAR(50)		NULL,													-- Ա����ַ
	`sRegDate`	DATE			NULL,													-- Ա��ע������
	`sRemark`	VARCHAR(100)	NULL,													-- Ա����ע
	primary key(`sId`)
);

INSERT INTO `integrationdb`.`staff_info` VALUES(1,'Fangzhiqiang', 'fzq',0, '8860995', '18748980084', '�Ͼ���·235��', '2018-07-13','�ʱ�������߹�');
INSERT INTO `integrationdb`.`staff_info` VALUES(2,'Denghaocheng', 'dhc',0, '8883995', '18079411231', '�Ͼ���·235��', '2018-07-15','���ɵ�����');

-- ��Ʒ��
CREATE TABLE `integrationdb`.`goods_info`(
	`gId`			INT				NOT NULL,											-- ��ƷID
	`gName`			VARCHAR(45)		NULL,												-- ��Ʒ����
	`gNum`			INT				NULL,												-- ��Ʒ����
	`gCost`      	FLOAT			NULL,												-- ��Ʒ�ɱ�
	`gPrice`		FLOAT			NULL,												-- ��Ʒ�ۼ�
	`gExchange`		INT				NULL,												-- ��Ʒ�һ��������
	`gRemark`		VARCHAR(100)	NULL,												-- ��Ʒ��ע
	primary key(`gId`)
);

-- �������ͱ�(���ѹ��򣬷����ֽ����ѽ���ֵ)
CREATE TABLE `integrationdb`.`operation_Type`(
	`oTid`			INT				NOT NULL,											-- ��������ID
	`oTName`		VARCHAR(10)		CHECK(oTName='���ѹ���' OR oTName='�����ֽ�' OR oTName='���ѽ���ֵ'),--������������
	primary key(`oTid`)
);

-- �������ͱ�(�Լ����򣬱��˽���)
CREATE TABLE `integrationdb`.`buy_Type`(
	`bTid`			INT				NOT NULL,											-- ��������ID
	`bTname`		VARCHAR(20)		NULL,												-- ��������
	`bTCredit`		INT				NULL,												-- ��Ӧ1Ԫ�Ļ���
	primary key(`bTid`)
);

-- �ܻ��ֱ�
CREATE TABLE `integrationdb`.`all_Credits`(
	`uId`			INT				NOT NULL,											-- �û�ID
	`aCredits`		INT				NULL,												-- �û���ǰ�ܻ���
	primary key(`uId`)
);

-- ������ϸ��
CREATE TABLE `integrationdb`.`Consume_info`(
	`uId`			INT				NOT NULL,							-- �û�ID
	`cdate`			DATE			NULL,								-- ��������
	`ctime`			TIME			NULL,								-- ����ʱ��
	`gid`			INT				NOT NULL,							-- ��ƷID
	`Cnum`			INT				NULL,								-- ��������������ͳ�Ƴɱ���ӯ��
	`OTid`			INT				NOT NULL,							-- ��������ID
	`BTid`			INT				NOT NULL,							-- ��������ID
	`Credits`		INT				NULL,								-- ��û���
	`Cremark`		VARCHAR(100)	NULL,								-- ���ѱ�ע
	`sid`			INT				NOT NULL,							-- Ա��ID
	primary key(`uid`)
);

-- ���ֶһ���
CREATE TABLE `integrationdb`.`Exchange_info`(
	`uid`			INT				NOT NULL,							-- �û�ID
	`Exdate`		DATE			NULL,								-- �һ�����
	`Extime`		TIME			NULL,								-- �һ�ʱ��
	`gid`			INT				NOT NULL,							-- ��ƷID
	`ExNum`			INT				NULL,								-- �һ�����
	`Credits`		INT				NULL,								-- ��ǰ��û���	
	`sid`			INT				NOT NULL,							-- Ա��ID	
	primary key(`uid`)	
);

