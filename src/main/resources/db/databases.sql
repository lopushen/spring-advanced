CREATE DATABASE  IF NOT EXISTS `springtutorial` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `springtutorial`;
-- MySQL dump 10.13  Distrib 5.6.14, for osx10.7 (x86_64)
--
-- Host: localhost    Database: springtutorial
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(100) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_messages_users1_idx` (`username`),
  CONSTRAINT `fk_messages_users1` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
INSERT INTO `messages` VALUES (1,'Hello','This is a dummy message.','John Purcell','john@caveofprogramming.com','johnwpurcell'),(11,'This is a test message','Some message or other goes here.','John purcell','john@caveofprogramming.com','franzkafka'),(12,'Another test message','Please help me, I have fallen down a well and need assistance.','John Purcell','john@caveofprogramming.com','johnwpurcell'),(13,'Existential Angst','Are you still alive?','Franz Kafka','kafka@caveofprogramming.com','johnwpurcell'),(14,'Hungarian','Hi, interest in learning Hungarian?','H. P. Lovecraft','learnhungarianfast@gmail.com','Lovecraft'),(15,'testing','testing','H. P. Lovecraft','lovecraft@caveofprogramming.com','Lovecraft'),(16,'testing','testing','H. P. Lovecraft','lovecraft@caveofprogramming.com','Lovecraft'),(17,'Hello there','Does this work?','John Purcell','johnwpurcell@gmail.com','Lovecraft'),(18,'hello there','hello there John','John Purcell','johnwpurcell@gmail.com','Lovecraft'),(19,'Hello there','This is a test email','John Purcell','johnwpurcell@gmail.com','Lovecraft'),(20,'hello there','this is a test email','John Purcell','johnwpurcell@gmail.com','Lovecraft'),(21,'hello there','this is a test email','John Purcell','johnwpurcell@gmail.com','Lovecraft'),(22,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(23,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(24,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(25,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(26,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(27,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(28,'test test test','test test test test','test test','john@caveofprogramming.com','Lovecraft'),(29,'test message','test message','H. P. Lovecraft','john@caveofprogramming.com','johnwpurcell');
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offers`
--

DROP TABLE IF EXISTS `offers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` text NOT NULL,
  `username` varchar(60) NOT NULL,
  PRIMARY KEY (`id`,`username`),
  KEY `fk_offers_users_idx` (`username`),
  CONSTRAINT `fk_offers_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offers`
--

LOCK TABLES `offers` WRITE;
/*!40000 ALTER TABLE `offers` DISABLE KEYS */;
INSERT INTO `offers` VALUES (1,'Video tutorials for sale.','johnwpurcell'),(2,'I will write long, strange and slightly depressing books for no reason at all. Do not even want money.','franzkafka'),(3,'Will share dark secrets of the most hideously loathsome abnormality in exchange for new identity.','Lovecraft');
/*!40000 ALTER TABLE `offers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(60) NOT NULL,
  `password` varchar(80) DEFAULT NULL,
  `authority` varchar(45) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `email` varchar(60) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('franzkafka','4d2679d3f0f5480434f2baf4ea25e0fe6acb3f7949b693b4f9306e7aea059cc923fd47c171c7308c','ROLE_USER','Franz Kafka',1,'kafka@caveofprogramming.com'),('johnwpurcell','eca3f2d150dbaa90a6d7ea8249371c0ee0b3e473edf965f55ddc43cc26c4c1774da276afa600b75d','ROLE_USER','John Purcell',1,'john@caveofprogramming.com'),('Lovecraft','45fe82a4f6cfa0f571f4ebfca7ef50a32cb8909ea19012d503914acabae47517f5f117f0bf10d994','ROLE_USER','H. P. Lovecraft',1,'john@caveofprogramming.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-01-15  9:50:11
CREATE DATABASE  IF NOT EXISTS `springtest` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `springtest`;
-- MySQL dump 10.13  Distrib 5.6.14, for osx10.7 (x86_64)
--
-- Host: localhost    Database: springtest
-- ------------------------------------------------------
-- Server version	5.6.14

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
-- Table structure for table `messages`
--

DROP TABLE IF EXISTS `messages`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `messages` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `subject` varchar(100) NOT NULL,
  `content` varchar(1000) NOT NULL,
  `name` varchar(100) NOT NULL,
  `email` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_messages_users1_idx` (`username`),
  CONSTRAINT `fk_messages_users1` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `messages`
--

LOCK TABLES `messages` WRITE;
/*!40000 ALTER TABLE `messages` DISABLE KEYS */;
/*!40000 ALTER TABLE `messages` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `offers`
--

DROP TABLE IF EXISTS `offers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `offers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `text` text NOT NULL,
  `username` varchar(60) NOT NULL,
  PRIMARY KEY (`id`,`username`),
  KEY `fk_offers_users_idx` (`username`),
  CONSTRAINT `fk_offers_users` FOREIGN KEY (`username`) REFERENCES `users` (`username`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `offers`
--

LOCK TABLES `offers` WRITE;
/*!40000 ALTER TABLE `offers` DISABLE KEYS */;
/*!40000 ALTER TABLE `offers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `username` varchar(60) NOT NULL,
  `password` varchar(80) DEFAULT NULL,
  `authority` varchar(45) DEFAULT NULL,
  `name` varchar(100) NOT NULL,
  `enabled` tinyint(1) DEFAULT '1',
  `email` varchar(60) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('johnwpurcell','25925a664cf584aea67eee6c143c8d7aaa3a27f0dc4f1efd7390206dd05dca145045efc28c3332b4','ROLE_USER','John Purcell',1,'john@caveofprogramming.com'),('richardhannay','185b867b4c1d3485004d14630db20ee15e3c49a83cae59d57d9d198803ac5491c0b4ebd7b5a2da37','ROLE_ADMIN','Richard Hannay',1,'richard@caveofprogramming.com'),('suetheviolinist','8a4a20f72d1f3df5dd657d7826e65e97e903a380a5b1951335205903ab787747732fd1cb663b0378','ROLE_USER','Sue Black',1,'sue@caveofprogramming.com');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-01-15  9:50:11
