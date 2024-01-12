-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: quiz
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `quiz_user_answers_table`
--

DROP TABLE IF EXISTS `quiz_user_answers_table`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `quiz_user_answers_table` (
  `question_ID` int DEFAULT NULL,
  `answer` varchar(45) DEFAULT NULL,
  `user_ID` int DEFAULT NULL,
  `result_ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`result_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `quiz_user_answers_table`
--

LOCK TABLES `quiz_user_answers_table` WRITE;
/*!40000 ALTER TABLE `quiz_user_answers_table` DISABLE KEYS */;
INSERT INTO `quiz_user_answers_table` VALUES (1,'C',1,1),(2,'C',1,2),(3,'C',1,3),(4,'C',1,4),(5,'C',1,5),(6,'C',1,6),(7,'W',1,7),(8,'C',1,8),(9,'C',1,9),(10,'C',1,10),(1,'C',2,11),(2,'C',2,12),(3,'C',2,13),(4,'C',2,14),(5,'C',2,15),(6,'W',2,16),(7,'C',2,17),(8,'C',2,18),(9,'C',2,19),(10,'C',2,20),(1,'C',3,21),(2,'C',3,22),(3,'C',3,23),(4,'C',3,24),(5,'W',3,25),(6,'C',3,26),(7,'W',3,27),(8,'W',3,28),(9,'C',3,29),(10,'C',3,30),(1,'C',4,31),(2,'C',4,32),(3,'W',4,33),(4,'C',4,34),(5,'C',4,35),(6,'W',4,36),(7,'W',4,37),(8,'C',4,38),(9,'C',4,39),(10,'C',4,40),(1,'C',5,41),(2,'C',5,42),(3,'C',5,43),(4,'C',5,44),(5,'W',5,45),(6,'C',5,46),(7,'W',5,47),(8,'C',5,48),(9,'C',5,49),(10,'C',5,50);
/*!40000 ALTER TABLE `quiz_user_answers_table` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-18 20:17:20
