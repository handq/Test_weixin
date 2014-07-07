-- MySQL dump 10.13  Distrib 5.5.13, for Win32 (x86)
--
-- Host: localhost    Database: weixintest
-- ------------------------------------------------------
-- Server version	5.5.13

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table b_menu
--

DROP TABLE IF EXISTS b_menu;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE b_menu (
  ID varchar(255) NOT NULL,
  M_NAME varchar(64) DEFAULT NULL,
  M_CODE varchar(64) DEFAULT NULL,
  M_DISCRIPTION varchar(255) DEFAULT NULL,
  M_IMG_LINK varchar(64) DEFAULT NULL,
  M_DISCOUNT_DIS varchar(255) DEFAULT NULL,
  M_PRICE double(10,5) DEFAULT NULL,
  M_DICCOUNT_PRICE double(10,5) DEFAULT NULL,
  M_DICOUNT_INFO varchar(255) DEFAULT NULL,
  M_UPDATETIME date DEFAULT NULL,
  M_UPDATEUSER varchar(64) DEFAULT NULL,
  M_SID varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_Reference_5 (M_SID),
  CONSTRAINT FK_Reference_5 FOREIGN KEY (M_SID) REFERENCES t_shop (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table b_menu
--

LOCK TABLES b_menu WRITE;
/*!40000 ALTER TABLE b_menu DISABLE KEYS */;
/*!40000 ALTER TABLE b_menu ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table b_online
--

DROP TABLE IF EXISTS b_online;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE b_online (
  ID varchar(255) NOT NULL,
  O_USERNAME varchar(64) DEFAULT NULL,
  O_PHONE varchar(64) DEFAULT NULL,
  O_PRETIME datetime DEFAULT NULL,
  O_USERNO int(10) DEFAULT NULL,
  O_HORSE_TYPE varchar(64) DEFAULT NULL,
  O_HORSE_NO int(10) DEFAULT NULL,
  O_ARRIVE_DATE date DEFAULT NULL,
  O_LEAVE_DATE date DEFAULT NULL,
  O_DESC varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table b_online
--

LOCK TABLES b_online WRITE;
/*!40000 ALTER TABLE b_online DISABLE KEYS */;
/*!40000 ALTER TABLE b_online ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table b_order
--

DROP TABLE IF EXISTS b_order;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE b_order (
  ID varchar(255) DEFAULT NULL,
  ORDER_CODE varchar(64) DEFAULT NULL,
  ORDER_DATE datetime DEFAULT NULL,
  ORDER_SALES varchar(255) DEFAULT NULL,
  ORDER_PRICE double(10,5) DEFAULT NULL,
  ORDER_STATE int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table b_order
--

LOCK TABLES b_order WRITE;
/*!40000 ALTER TABLE b_order DISABLE KEYS */;
/*!40000 ALTER TABLE b_order ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table b_user
--

DROP TABLE IF EXISTS b_user;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE b_user (
  id varchar(255) NOT NULL DEFAULT '',
  USER_NAME varchar(64) DEFAULT NULL,
  USER_PASS varchar(64) DEFAULT '',
  USER_EMAIL varchar(64) DEFAULT NULL,
  USER_CRATETIME datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table b_user
--

LOCK TABLES b_user WRITE;
/*!40000 ALTER TABLE b_user DISABLE KEYS */;
INSERT INTO b_user VALUES ('111111','admin','21232F297A57A5A743894A0E4A801FC3','12345@163.com','2014-06-29 22:38:05');
/*!40000 ALTER TABLE b_user ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_company
--

DROP TABLE IF EXISTS t_company;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_company (
  ID varchar(255) NOT NULL,
  C_NAME varchar(255) DEFAULT NULL,
  C_DESC varchar(500) DEFAULT NULL,
  C_ADDRESS varchar(255) DEFAULT NULL,
  C_INFOMATION text,
  C_CODE varchar(64) DEFAULT NULL,
  C_LINK varchar(64) DEFAULT NULL,
  C_UPDATIME datetime DEFAULT NULL,
  C_UPDATEUSER varchar(255) DEFAULT NULL,
  C_FAX varchar(64) DEFAULT NULL,
  C_EMAIL varchar(64) DEFAULT NULL,
  C_LOCATION varchar(64) DEFAULT NULL,
  C_BUSLINE varchar(64) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_company
--

LOCK TABLES t_company WRITE;
/*!40000 ALTER TABLE t_company DISABLE KEYS */;
INSERT INTO t_company VALUES ('2035EA306FA34FDD97F00C89E707EAC9','北京实创餐饮管理有限公司','无','北京市西直门内大街118号','公司成立于1992年，距今已有20年的历程，是一家专业大型餐饮企业。公司总资产9000多万元，现有员工500余人，专用餐饮车几十辆。公司总部设在朝阳区望京开发区东北部，占地面积近万平方米，已形成了规模化、规范化的现代快餐加工基地和办公区域。','BJ_2012-0312-XBS','www.baidu.com',NULL,NULL,'010-9823912','hx-jfkl@hx.mail.com','北京市西直门内大街嘉华大厦A座','从外桥向南出发,沿外桥走89米并向东左转到东长安街，公交21路');
/*!40000 ALTER TABLE t_company ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_company_relation
--

DROP TABLE IF EXISTS t_company_relation;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_company_relation (
  ID varchar(255) NOT NULL,
  CR_name varchar(64) DEFAULT NULL,
  CR_CODE varchar(64) DEFAULT NULL,
  CR_VALUE varchar(64) DEFAULT NULL,
  CR_UPDATEDATE datetime DEFAULT NULL,
  fk_C_COMID varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_Reference_1 (fk_C_COMID),
  CONSTRAINT FK_Reference_1 FOREIGN KEY (fk_C_COMID) REFERENCES t_company (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_company_relation
--

LOCK TABLES t_company_relation WRITE;
/*!40000 ALTER TABLE t_company_relation DISABLE KEYS */;
/*!40000 ALTER TABLE t_company_relation ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_effect
--

DROP TABLE IF EXISTS t_effect;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_effect (
  ID varchar(255) NOT NULL,
  E_NAME varchar(64) DEFAULT NULL,
  E_CODE varchar(64) DEFAULT NULL,
  E_LINK varchar(64) DEFAULT NULL,
  E_CONTENT text,
  E_DESC varchar(255) DEFAULT NULL,
  E_USERNAME varchar(64) DEFAULT NULL,
  E_UPDATETIME datetime DEFAULT NULL,
  FK_E_COMID varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_Reference_2 (FK_E_COMID),
  CONSTRAINT FK_Reference_2 FOREIGN KEY (FK_E_COMID) REFERENCES t_company (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_effect
--

LOCK TABLES t_effect WRITE;
/*!40000 ALTER TABLE t_effect DISABLE KEYS */;
/*!40000 ALTER TABLE t_effect ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_message_board
--

DROP TABLE IF EXISTS t_message_board;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_message_board (
  ID varchar(255) NOT NULL,
  M_CONTENT varchar(255) DEFAULT NULL,
  M_DATE datetime DEFAULT NULL,
  M_USERNAME varchar(64) DEFAULT NULL,
  M_OPENID varchar(255) DEFAULT NULL,
  M_TYPE int(10) DEFAULT NULL,
  FK_M_ID varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_message_board
--

LOCK TABLES t_message_board WRITE;
/*!40000 ALTER TABLE t_message_board DISABLE KEYS */;
/*!40000 ALTER TABLE t_message_board ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_notice
--

DROP TABLE IF EXISTS t_notice;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_notice (
  ID varchar(255) NOT NULL,
  S_TITLE varchar(64) DEFAULT NULL,
  S_CODE varchar(64) DEFAULT NULL,
  S_CONTENT varchar(500) DEFAULT NULL,
  S_STATE int(10) DEFAULT NULL,
  S_CREATETIME datetime DEFAULT NULL,
  S_CREATUER varchar(255) DEFAULT NULL,
  S_LINK varchar(64) DEFAULT NULL,
  S_CID varchar(255) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_Reference_4 (S_CID),
  CONSTRAINT FK_Reference_4 FOREIGN KEY (S_CID) REFERENCES t_company (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_notice
--

LOCK TABLES t_notice WRITE;
/*!40000 ALTER TABLE t_notice DISABLE KEYS */;
/*!40000 ALTER TABLE t_notice ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_shop
--

DROP TABLE IF EXISTS t_shop;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_shop (
  ID varchar(255) NOT NULL,
  S_IMGLINK varchar(64) DEFAULT NULL,
  S_NOTICE varchar(500) DEFAULT NULL,
  S_STATE varchar(64) DEFAULT NULL,
  S_TYPE varchar(64) DEFAULT NULL,
  S_OPENINGTIME varchar(64) DEFAULT NULL,
  S_SERVICE_AREA varchar(64) DEFAULT NULL,
  S_DISTRIBUTION_AREA varchar(64) DEFAULT NULL,
  S_PREDATE_RELATION varchar(64) DEFAULT NULL,
  S_LOCATION varchar(64) DEFAULT NULL,
  S_DESC varchar(255) DEFAULT NULL,
  S_CID varchar(255) DEFAULT NULL,
  S_UPDATEDATE datetime DEFAULT NULL,
  S_UPDATEUSER varchar(64) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY FK_Reference_3 (S_CID),
  CONSTRAINT FK_Reference_3 FOREIGN KEY (S_CID) REFERENCES t_company (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_shop
--

LOCK TABLES t_shop WRITE;
/*!40000 ALTER TABLE t_shop DISABLE KEYS */;
/*!40000 ALTER TABLE t_shop ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_tr_user
--

DROP TABLE IF EXISTS t_tr_user;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_tr_user (
  PK_TU_ID varchar(255) NOT NULL,
  TU_USERNAME varchar(32) DEFAULT NULL,
  TU_PASSWORD varchar(32) DEFAULT NULL,
  TU_Email varchar(200) DEFAULT NULL,
  TU_PHONE varchar(200) DEF	AULT NULL,
  TU_IDNO varchar(200) DEFAULT NULL,
  TU_SEX int(11) DEFAULT NULL,
  TU_AREA varchar(10) DEFAULT NULL,
  TU_MAJOR varchar(200) DEFAULT NULL,
  TU_CREATETIME datetime DEFAULT NULL,
  TU_CREATEUSER varchar(32) DEFAULT NULL,
  TU_STATUS int(11) DEFAULT NULL,
  TU_AUDIT int(11) DEFAULT NULL,
  TU_ENABLE int(11) DEFAULT NULL,
  tu_realName varchar(10) DEFAULT NULL,
  tu_registAuthCode int(11) DEFAULT NULL,
  PRIMARY KEY (PK_TU_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_tr_user
--

LOCK TABLES t_tr_user WRITE;
/*!40000 ALTER TABLE t_tr_user DISABLE KEYS */;
/*!40000 ALTER TABLE t_tr_user ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_user
--

DROP TABLE IF EXISTS t_user;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_user (
  ID varchar(255) NOT NULL,
  U_NAME varchar(64) DEFAULT NULL,
  U_OPENID varchar(64) DEFAULT NULL,
  U_WEIXINNO varchar(64) DEFAULT NULL,
  U_phone varchar(64) DEFAULT NULL,
  U_EMAIL varchar(64) DEFAULT NULL,
  U_UPDATETIME datetime DEFAULT NULL,
  PRIMARY KEY (ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_user
--

LOCK TABLES t_user WRITE;
/*!40000 ALTER TABLE t_user DISABLE KEYS */;
/*!40000 ALTER TABLE t_user ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table t_user_menu
--

DROP TABLE IF EXISTS t_user_menu;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE t_user_menu (
  ID varchar(255) NOT NULL,
  USERMENU_NAME varchar(64) DEFAULT NULL,
  USERMENU_CODE varchar(64) DEFAULT NULL,
  USERMENU_LEVE int(10) DEFAULT NULL,
  USERMENU_TYPE varchar(64) DEFAULT NULL,
  USERMENU_NO int(10) DEFAULT NULL,
  USERMENU_LINK varchar(64) DEFAULT NULL,
  FK_UMID varchar(255) DEFAULT NULL,
  type varchar(64) DEFAULT NULL,
  PRIMARY KEY (ID),
  KEY fk_parent_mid (FK_UMID),
  CONSTRAINT fk_parent_mid FOREIGN KEY (FK_UMID) REFERENCES t_user_menu (ID) ON DELETE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table t_user_menu
--

LOCK TABLES t_user_menu WRITE;
/*!40000 ALTER TABLE t_user_menu DISABLE KEYS */;
INSERT INTO t_user_menu VALUES ('1369C992B96E4625AED651715256EAF8','在线业务','zxyw',1,'complex',2,'#','0','自定义菜单'),('194744DAD1264F4E947987ED551B1FCD','公交查询','4',2,'common',3,'#','C36DD3A00E394262BB3A94F8D61FB37F','自定义菜单'),('1DACB61636664DC4BDB33F910635A698','位置服务','2',2,'common',2,'#','C36DD3A00E394262BB3A94F8D61FB37F','自定义菜单'),('2A11E1F2FCC34E35B5C1169895D77F5A','订单查询','ddcx',2,'common',2,'#','1369C992B96E4625AED651715256EAF8','自定义菜单'),('37E3742F594D4B8592F346AB3209466D','天气预报','1',2,'common',1,'#','C36DD3A00E394262BB3A94F8D61FB37F','自定义菜单'),('4FA9710C3A944B3EBDB6B0F4547F0C98','关于我们','gywm',1,'complex',3,'#','0','自定义菜单'),('683CAB23ED0C4C83A086C8E32835714F','微官网','6',2,'view',2,'http://www.baidu.com','4FA9710C3A944B3EBDB6B0F4547F0C98','自定义菜单'),('68FC815C06074416A86BFA9AA3EBEE55','联系方式','lxfs',2,'common',1,'http://www.baidu.com','4FA9710C3A944B3EBDB6B0F4547F0C98','自定义菜单'),('77EEB54FC9A0496596F56E85D3074582','我的知乎','3',2,'common',4,'#','C36DD3A00E394262BB3A94F8D61FB37F','自定义菜单'),('8EEB7B496AF84D0DA43C9CDC7E14643E','在线下单','zxsx',2,'common',3,'#','1369C992B96E4625AED651715256EAF8','自定义菜单'),('C36DD3A00E394262BB3A94F8D61FB37F','我的微站','Mwz',1,'complex',1,'http://www.baidu.com','0','自定义菜单'),('CC161E2B94644DFF8E3F93F148909D8B','预约管理','yygl',2,'view',1,'#','1369C992B96E4625AED651715256EAF8','自定义菜单');
/*!40000 ALTER TABLE t_user_menu ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-06-30  0:27:06
