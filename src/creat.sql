CREATE SCHEMA `integrationdb` ;

--����Ա��
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

INSERT INTO `integrationdb`.`admin_info` VALUES(0,'123456','wanghao',0, '15270496554', '15270496554', '�Ͼ���·235��', 0, '2018-07-10');
INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123456','wang',1, '123456789', '123456789', '�Ͼ���·235��', 0, '2018-07-10');

---�ͻ���
CREATE TABLE `integrationdb`.`User_info`(
	`Uid`		INT				NOT NULL,												-- �ͻ�ID
	`Uname`		VARCHAR(45) 	NULL,													-- �ͻ�����
	`Usex`		INT NULL,																--- �ͻ��Ա�
	`Ubirth`	DATE			NULL,													-- �ͻ�����
	`Utel`		VARCHAR(45) 	NULL,													-- �ͻ��绰
	`UphoNum`	VARCHAR(45) 	NULL,													-- �ͻ��ֻ�
	`Uaddr`		VARCHAR(50),	NULL,													-- �ͻ���ַ
	`UregDate`	DATE			NULL,													-- �ͻ�ע������
	`Uremark`	VARCHAR(100)	NULL,													-- �ͻ���ע
	primary key(`Uid`)
);

INSERT INTO `integrationdb`.`User_info` VALUES(1,'Lizongru', '��', '1997-09-27','8879748', '15180450316', '�Ͼ���·235��', '2018-07-10','��ͻ�');


--Ա����
CREATE TABLE `integrationdb`.`Staff_info`(
	`Sid`		INT				NOT NULL,												-- Ա��ID
	`Sname`		VARCHAR(45) 	NULL,													-- Ա������
	`Smark`		VARCHAR(5)		NULL,													-- Ա�����Ƿ�
	`Ssex`      INT NULL,																--- Ա���Ա�
	`Stel`		INT,																	-- Ա���绰
	`SphoNum`	INT,																	-- Ա���ֻ�
	`Saddr`		VARCHAR(50),															-- Ա����ַ
	`SregDate`	DATE,																	-- Ա��ע������
	`Sremark`	VARCHAR(100),															-- Ա����ע
	primary key(`Sid`)
);

INSERT INTO `integrationdb`.`Staff_info` VALUES(1,'123456','Lizongru', '��', '1997-09-27','8879748', '15180450316', '�Ͼ���·235��', '2018-07-10','0');


-- ��Ʒ��
CREATE TABLE `integrationdb`.`Goods_info`(
	`Gid`			INT				NOT NULL,											-- ��ƷID
	`Gname`			VARCHAR(45),														-- ��Ʒ����
	`Gnum`			INT,																-- ��Ʒ����
	`Gcost`      	INT,																-- ��Ʒ�ɱ�
	`Gprice`		INT,																-- ��Ʒ�ۼ�
	`Gexchange`		INT,																-- ��Ʒ�һ��������
	`Gremark`		VARCHAR(100),														-- ��Ʒ��ע
	primary key(`Gid`)
);

-- �������ͱ�(���ѹ��򣬷����ֽ����ѽ���ֵ)
CREATE TABLE Operation_Type(
	`OTid`			INT				NOT NULL,											-- ��������ID
	`OTName`		VARCHAR(10)		CHECK(OTName='���ѹ���' OR OTName='�����ֽ�' OR OTName='���ѽ���ֵ'),--������������
	primary key(`OTid`)
);

-- �������ͱ�(�Լ����򣬱��˽���)
CREATE TABLE Buy_Type(
	`BTid`			INT				NOT NULL,											-- ��������ID
	`Btname`		VARCHAR(20),														-- ��������
	`BTCredit`		INT,																-- ��Ӧ1Ԫ�Ļ���
	primary key(`BTid`)
);

-- �ܻ��ֱ�
CREATE TABLE All_Credits(
	`Uid`			INT				NOT NULL,											-- �û�ID
	`Acredits`		INT,																-- �û���ǰ�ܻ���
	primary key(`Uid`)
);

-- ������ϸ��
CREATE TABLE Consume_info(
	`Uid`			INT				NOT NULL,							-- �û�ID
	`Cdate`			DATE,												-- ��������
	`Ctime`			TIME,												-- ����ʱ��
	`Gid`			INT				NOT NULL,							-- ��ƷID
	`Cnum`			INT,												-- ��������������ͳ�Ƴɱ���ӯ��
	`OTid`			INT				NOT NULL,							-- ��������ID
	`BTid`			INT				NOT NULL,							-- ��������ID
	`Credits`		INT,												-- ��û���
	`Cremark`		VARCHAR(100),										-- ���ѱ�ע
	`Sid`			INT				NOT NULL,							-- Ա��ID
	primary key(`Uid`)
);

-- ���ֶһ���
CREATE TABLE exChange_info(
	`Uid`			INT				NOT NULL,							-- �û�ID
	`Exdate`		DATE,												-- �һ�����
	`Extime`		TIME,												-- �һ�ʱ��
	`Gid`			INT				NOT NULL,							-- ��ƷID
	`ExNum`			INT,												-- �һ�����
	`Credits`		INT,												-- ��ǰ��û���	
	`Sid`			INT				NOT NULL,							-- Ա��ID	
	primary key(`Uid`)	
);

