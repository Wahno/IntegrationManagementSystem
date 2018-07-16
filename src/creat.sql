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
CREATE TABLE `integrationdb`.`User_info`(
	`Uid`		INT				NOT NULL,												-- �ͻ�ID
	`Uname`		VARCHAR(45) 	NULL,													-- �ͻ�����
	`Usex`		INT 			NULL,													-- �ͻ��Ա�
	`Ubirth`	DATE			NULL,													-- �ͻ�����
	`Utel`		VARCHAR(45) 	NULL,													-- �ͻ��绰
	`UphoNum`	VARCHAR(45) 	NULL,													-- �ͻ��ֻ�
	`Uaddr`		VARCHAR(50)		NULL,													-- �ͻ���ַ
	`UregDate`	DATE			NULL,													-- �ͻ�ע������
	`Uremark`	VARCHAR(100)	NULL,													-- �ͻ���ע
	primary key(`Uid`)
);

INSERT INTO `integrationdb`.`User_info` VALUES(1,'Lizongru', 0, '1997-09-27','8879748', '15180450316', '�Ͼ���·235��', '2018-07-10','��ͻ�');


--Ա����
CREATE TABLE `integrationdb`.`Staff_info`(
	`Sid`		INT				NOT NULL,												-- Ա��ID
	`Sname`		VARCHAR(45) 	NULL,													-- Ա������
	`Smark`		VARCHAR(5)		NULL,													-- Ա�����Ƿ�
	`Ssex`      INT 			NULL,													-- Ա���Ա�
	`Stel`		INT				NULL,													-- Ա���绰
	`SphoNum`	INT				NULL,													-- Ա���ֻ�
	`Saddr`		VARCHAR(50)		NULL,													-- Ա����ַ
	`SregDate`	DATE			NULL,													-- Ա��ע������
	`Sremark`	VARCHAR(100)	NULL,													-- Ա����ע
	primary key(`Sid`)
);

INSERT INTO `integrationdb`.`Staff_info` VALUES(1,'Fangzhiqiang', 'fzq',0, '8860995', '18748980084', '�Ͼ���·235��', '2018-07-13','�ʱ�������߹�');
INSERT INTO `integrationdb`.`Staff_info` VALUES(2,'Denghaocheng', 'dhc',0, '8883995', '18079411231', '�Ͼ���·235��', '2018-07-15','���ɵ�����');

-- ��Ʒ��
CREATE TABLE `integrationdb`.`Goods_info`(
	`Gid`			INT				NOT NULL,											-- ��ƷID
	`Gname`			VARCHAR(45)		NULL,												-- ��Ʒ����
	`Gnum`			INT				NULL,												-- ��Ʒ����
	`Gcost`      	FLOAT			NULL,												-- ��Ʒ�ɱ�
	`Gprice`		FLOAT			NULL,												-- ��Ʒ�ۼ�
	`Gexchange`		INT				NULL,												-- ��Ʒ�һ��������
	`Gremark`		VARCHAR(100)	NULL,												-- ��Ʒ��ע
	primary key(`Gid`)
);

-- �������ͱ�(���ѹ��򣬷����ֽ����ѽ���ֵ)
CREATE TABLE `integrationdb`.`Operation_Type`(
	`OTid`			INT				NOT NULL,											-- ��������ID
	`OTName`		VARCHAR(10)		CHECK(OTName='���ѹ���' OR OTName='�����ֽ�' OR OTName='���ѽ���ֵ'),--������������
	primary key(`OTid`)
);

-- �������ͱ�(�Լ����򣬱��˽���)
CREATE TABLE `integrationdb`.`Buy_Type`(
	`BTid`			INT				NOT NULL,											-- ��������ID
	`BTname`		VARCHAR(20)		NULL,												-- ��������
	`BTCredit`		INT				NULL,												-- ��Ӧ1Ԫ�Ļ���
	primary key(`BTid`)
);

-- �ܻ��ֱ�
CREATE TABLE `integrationdb`.`All_Credits`(
	`Uid`			INT				NOT NULL,											-- �û�ID
	`Acredits`		INT				NULL,												-- �û���ǰ�ܻ���
	primary key(`Uid`)
);

-- ������ϸ��
CREATE TABLE `integrationdb`.`Consume_info`(
	`Uid`			INT				NOT NULL,							-- �û�ID
	`Cdate`			DATE			NULL,								-- ��������
	`Ctime`			TIME			NULL,								-- ����ʱ��
	`Gid`			INT				NOT NULL,							-- ��ƷID
	`Cnum`			INT				NULL,								-- ��������������ͳ�Ƴɱ���ӯ��
	`OTid`			INT				NOT NULL,							-- ��������ID
	`BTid`			INT				NOT NULL,							-- ��������ID
	`Credits`		INT				NULL,								-- ��û���
	`Cremark`		VARCHAR(100)	NULL,								-- ���ѱ�ע
	`Sid`			INT				NOT NULL,							-- Ա��ID
	primary key(`Uid`)
);

-- ���ֶһ���
CREATE TABLE `integrationdb`.`Exchange_info`(
	`Uid`			INT				NOT NULL,							-- �û�ID
	`Exdate`		DATE			NULL,								-- �һ�����
	`Extime`		TIME			NULL,								-- �һ�ʱ��
	`Gid`			INT				NOT NULL,							-- ��ƷID
	`ExNum`			INT				NULL,								-- �һ�����
	`Credits`		INT				NULL,								-- ��ǰ��û���	
	`Sid`			INT				NOT NULL,							-- Ա��ID	
	primary key(`Uid`)	
);

