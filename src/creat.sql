CREATE SCHEMA `integrationdb` ;

CREATE TABLE `integrationdb`.`admin_info` (
  `aId` INT NOT NULL,
  `aPassword` VARCHAR(45) default '123456',
  `aName` VARCHAR(45) NULL,
  `aSex` VARCHAR(10) NULL,
  `aTel` VARCHAR(45) NULL,
  `aPhoNum` VARCHAR(45) NULL,
  `aAddr` VARCHAR(45) NULL,
  `aLimit` INT NULL,
  `aDate` DATE NULL,
  PRIMARY KEY (`aId`));

INSERT INTO `integrationdb`.`admin_info` VALUES(1,'123123','wanghao', '男', '15270496554', '15270496554', '南京东路235号', 0, '2018-07-10');