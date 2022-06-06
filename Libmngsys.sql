/*
SQLyog Community v13.1.8 (64 bit)
MySQL - 8.0.27 : Database - library_management_system
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`library_management_system` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `library_management_system`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `FirstName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `LastName` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Age` int DEFAULT NULL,
  `Address` varchar(45) DEFAULT NULL,
  `Username` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `admin` */

insert  into `admin`(`FirstName`,`LastName`,`Age`,`Address`,`Username`,`Password`) values 
('kyle ','de leon',20,'zone 14, taal batangas','kyle','kyle03'),
('yuki','hiro',23,'Sta rita karsada, batangas city','yuki','pass'),
('Juan ','Tamad',20,'Taal Batangas','juan','tamad');

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `BookID` int NOT NULL,
  `Title` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Edition` varchar(45) DEFAULT NULL,
  `Author` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `Year` int DEFAULT NULL,
  `Stock` int DEFAULT NULL,
  PRIMARY KEY (`BookID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `book` */

insert  into `book`(`BookID`,`Title`,`Edition`,`Author`,`Year`,`Stock`) values 
(1,'El Filibusterismo','I','Jose P. Rizal',1891,50),
(213,'Java Programming','III','Henry A. Zachavrski',2018,21),
(1574,'Java Develpoment Guide','I','Ryan T. Quentin',2010,15),
(2001,'I Feel Bad About My Neck','I','Nora Ephron',2019,20),
(2002,'The Stranger in the Lifeboat','I','Mitch Albom',2021,5),
(3001,'C++ Guide for Beginners','I','Medina N. Nagaro',2009,10),
(6119,'Java Programming 1','I','Henry A. Zachavrski',2008,19),
(15478,'Alamat ng Saging','VI','Pedro San',2001,5),
(78416,'The Pragmatic Programmer','I','Andy Hunt & Dave Thomas',2021,10),
(90000,'Java Object Oriented Programming','I','Kris Leo',2018,5),
(98416,'Python Crash Course','II','Eric Matthes',2019,12),
(789654,'Python Programming ','II','Manuel P. Dragon',2020,20),
(908112,'Java Guide 3','III','Kristian Leon',2020,5);

/*Table structure for table `record` */

DROP TABLE IF EXISTS `record`;

CREATE TABLE `record` (
  `StudentID` varchar(45) DEFAULT NULL,
  `BookID` int DEFAULT NULL,
  `DateofIssue` varchar(45) DEFAULT NULL,
  `ReturnDate` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `record` */

insert  into `record`(`StudentID`,`BookID`,`DateofIssue`,`ReturnDate`) values 
('20-00507',213,'211122','211123'),
('20-48248',98416,'211122','211122'),
('20-33333',6119,'211123','211123'),
('20-15671',213,'211126','211126'),
('20-78954',789654,'211126','211126'),
('89012',6119,'211210',NULL),
('123456',90000,'211210','211210');

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `StudentID` varchar(45) NOT NULL,
  `Name` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Guardian` varchar(45) DEFAULT NULL,
  `Course` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Campus` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Year` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `Semester` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`StudentID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `student` */

insert  into `student`(`StudentID`,`Name`,`Guardian`,`Course`,`Campus`,`Year`,`Semester`) values 
('123456','Juan Tamad','Jose Tamad','BS Information Technology','BSU Alangilan','2nd Year','1st Semester'),
('20-00123','Ashley Madrigal','Torio Madrigal','BS Customs Administration','BSU Main','3rd Year','1st Semester'),
('20-00507','Kyle De Leon','Fernando De Leon','BS Information Technology','BSU Alangilan','2nd Year','2nd Semester'),
('20-05674','Marie Andal','Janice Andal','BS Education','BSU Main','2nd Year','1st Semester'),
('20-09782','Anabelle Mapulot','Pepe Mapulot','BS Instrumentation Technology','BSU Malvar','3rd Year','2nd Semester'),
('20-12345','Jojo Mendoza','Jaja Mendoza','BS Compputer Science','BSU Alangilan','2nd Year','1st Semester'),
('20-15574','Jomar Maguinoo','Jejomar Maguinoo','BS Civil Engineering','BSU Main','4th Year','2nd Semester'),
('20-15671','Bryan Magiinom','James Magiinom','BS Information Technology','BSU Alangilan','2nd Year','1st Semester'),
('20-25862','Shiro Hokura','Natsumi Hokura','BS Architecture and Design','BSU Main','1st Year','1st Semester'),
('20-33333','George Blue','Gregor Blue','BS Information Technlogy','BSU Alangilan','2nd Year','1st Semester'),
('20-48248','Eren Yeager','Grisha Yeager','BS Titanology ','BSU Alangilan','4th Year','1st Semester'),
('20-65412','Kate Tenorio','Janine Tenorio','BS Customs Administration','BSU Malvar','3rd Year','1st Semester'),
('20-78954','Yukihiro Rubio','Venice Rubio','BS Accountancy','BSU Main','3rd Year','1st Semester'),
('301234','Jepoy Dizon','Jamir Dizon','BS Education','BSU Malvar','3rd Year','1st Semester'),
('89012','Jay Verde','Selo Verde','BS Information Technology','BSU Alangilan','2nd Year','1st Semester');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
