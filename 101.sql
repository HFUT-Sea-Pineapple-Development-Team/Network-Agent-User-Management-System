-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: bookstore
-- ------------------------------------------------------
-- Server version	8.0.26

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer_order` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `cus_id` int NOT NULL COMMENT '用户id',
  `order_no` varchar(40) DEFAULT NULL COMMENT '订单名称',
  `order_date` datetime NOT NULL COMMENT '订单日期',
  `state` char(1) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL DEFAULT '0' COMMENT '订单状态(0正常 1到期)',
  `create_date` datetime DEFAULT NULL COMMENT '创建时间',
  `update_date` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `FK_customer_order_customer` (`cus_id`),
  CONSTRAINT `FK_customer_order_customer` FOREIGN KEY (`cus_id`) REFERENCES `customer` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=63 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='客户订单表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
INSERT INTO `customer_order` VALUES (11,3,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(19,33,'','2021-09-30 00:00:00','0',NULL,NULL),(20,12,'100G流量包','2021-10-08 00:00:00','0',NULL,NULL),(21,13,'10G流量包','2021-10-01 00:00:00','0',NULL,NULL),(22,11,'充值100元','2021-10-01 00:00:00','0',NULL,NULL),(23,11,'100G流量包','2021-10-01 00:00:00','0',NULL,NULL),(24,6,'100G流量包','2021-10-01 00:00:00','0',NULL,NULL),(25,6,'充值100元','2021-10-01 00:00:00','0',NULL,NULL),(26,6,'100G流量包','2021-10-01 00:00:00','0',NULL,NULL),(27,20,'100G流量包','2021-10-02 00:00:00','0',NULL,NULL),(28,7,'500G流量包','2021-10-02 00:00:00','0',NULL,NULL),(29,55,'','2021-10-04 00:00:00','0',NULL,NULL),(30,20,'','2021-10-09 00:00:00','0',NULL,NULL),(31,60,'100G流量包','2021-10-03 00:00:00','0',NULL,NULL),(32,35,'100G流量包','2021-10-04 00:00:00','0',NULL,NULL),(33,24,'充值100元','2021-10-14 00:00:00','0',NULL,NULL),(34,25,'充值100元','2021-10-14 00:00:00','0',NULL,NULL),(35,21,'充值100元','2021-10-15 00:00:00','0',NULL,NULL),(36,51,'100G流量包','2021-10-15 00:00:00','0',NULL,NULL),(37,28,'100G流量包','2021-10-16 00:00:00','0',NULL,NULL),(38,21,'100G流量包','2021-10-10 00:00:00','0',NULL,NULL),(39,56,'100G流量包','2021-10-18 00:00:00','0',NULL,NULL),(40,54,'充值100元','2021-10-18 00:00:00','0',NULL,NULL),(41,54,'100G流量包','2021-10-19 00:00:00','0',NULL,NULL),(42,20,'100G流量包','2021-10-19 00:00:00','0',NULL,NULL),(43,25,'100G流量包','2021-10-18 00:00:00','0',NULL,NULL),(44,32,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(45,36,'100G流量包','2021-10-19 00:00:00','0',NULL,NULL),(46,35,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(47,55,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(48,61,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(49,59,'充值100元','2021-10-20 00:00:00','0',NULL,NULL),(50,58,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(51,41,'充值100元','2021-10-20 00:00:00','0',NULL,NULL),(52,42,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(53,43,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(54,44,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(55,45,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(56,45,'充值100元','2021-10-20 00:00:00','0',NULL,NULL),(57,47,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(58,48,'100G流量包','2021-10-20 00:00:00','0',NULL,NULL),(59,49,'100G流量包','2021-10-21 00:00:00','0',NULL,NULL),(60,49,'充值100元','2021-10-21 00:00:00','0',NULL,NULL),(61,16,'充值10元','2021-10-21 00:00:00','0',NULL,NULL),(62,22,'100G流量包','2021-10-22 00:00:00','0',NULL,NULL);
/*!40000 ALTER TABLE `customer_order` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `customer_order_after_insert2` AFTER INSERT ON `customer_order` FOR EACH ROW BEGIN
DELETE
FROM lost_cus
WHERE lost_id = NEW.cus_id;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `customer_order_after_insert3` AFTER INSERT ON `customer_order` FOR EACH ROW BEGIN
UPDATE customer
SET user_final = NEW.order_date
WHERE id = NEW.cus_id;
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `customer_order_after_insert` AFTER INSERT ON `customer_order` FOR EACH ROW BEGIN
INSERT INTO order_details(order_id,order_date)
VALUES(NEW.id,NEW.order_date);
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-23 20:45:19
