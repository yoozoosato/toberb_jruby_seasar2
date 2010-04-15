DROP TABLE IF EXISTS `purchase`;
CREATE TABLE `purchase` (
  `ID` int(11) NOT NULL auto_increment,
  `BUSINESS_DATE` datetime default NULL,
  `TRANSACTION_CODE` varchar(4) default NULL,
  `ITEM_NAME` varchar(64) default NULL,
  `PRICE` decimal(10,2) default NULL,
  `CREATED_AT` datetime default NULL,
  `UPDATED_AT` datetime default NULL,
  PRIMARY KEY  (`ID`)
) 

