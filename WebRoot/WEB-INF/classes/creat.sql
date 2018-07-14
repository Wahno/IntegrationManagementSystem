CREATE SCHEMA `integrationdb` ;

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
  PRIMARY KEY (`aId`));

INSERT INTO `integrationdb`.`admin_info` VALUES(0,'123456','wanghao',0, '15270496554', '15270496554', '南京东路235号', 0, '2018-07-10');
INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123456','wang',1, '123456789', '123456789', '南京东路235号', 0, '2018-07-10');