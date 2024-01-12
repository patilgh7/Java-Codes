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
-- Table structure for table `question_info_master`
--

DROP TABLE IF EXISTS `question_info_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `question_info_master` (
  `q_id` int NOT NULL AUTO_INCREMENT,
  `questions` varchar(255) DEFAULT NULL,
  `option_1` varchar(255) DEFAULT NULL,
  `option_2` varchar(255) DEFAULT NULL,
  `option_3` varchar(255) DEFAULT NULL,
  `option_4` varchar(255) DEFAULT NULL,
  `correct_answer` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`q_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `question_info_master`
--

LOCK TABLES `question_info_master` WRITE;
/*!40000 ALTER TABLE `question_info_master` DISABLE KEYS */;
INSERT INTO `question_info_master` VALUES (1,'Who invented Java Programming?','Guido van Rossum',' James Gosling','Dennis Ritchie','Bjarne Stroustrup','b'),(2,'Which statement is true about Java?',' Java is a sequence-dependent programming language','Java is a code dependent programming language','Java is a platform-dependent programming language','Java is a platform-independent programming language','d'),(3,'Which one of the following is not a Java feature?','Object-oriented',' Use of pointers','Portable','Dynamic and Extensible','b'),(4,'What is the extension of java code files?','.js',' .txt','.class','.java','d'),(5,'Which of the following is not an OOPS concept in Java?','Polymorphism','Inheritance','Compilation','Encapsulation','c'),(6,'What is not the use of “this” keyword in Java?','Referring to the instance variable when a local variable has the same name','Passing itself to the method of the same class','Passing itself to another method','Calling another constructor in constructor chaining','b'),(7,'Which of the following is a type of polymorphism in Java Programming?','Multiple polymorphism','Compile time polymorphism','Multilevel polymorphism','Execution time polymorphism','b'),(8,'Which exception is thrown when java is out of memory?','MemoryError','OutOfMemoryError','MemoryOutOfBoundsException','MemoryFullException','b'),(9,'Which of these are selection statements in Java?','break','continue','for()',' if()','d'),(10,'Which of the following is a superclass of every class in Java?','ArrayList','Abstract class','Object class','String','c');
/*!40000 ALTER TABLE `question_info_master` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-18 20:17:19
