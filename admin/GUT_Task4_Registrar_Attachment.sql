DROP DATABASE IF EXISTS registrar;

CREATE DATABASE registrar;

USE registrar;


DROP TABLE IF EXISTS `student`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `student` (
  `studentID` int(10) NOT NULL PRIMARY KEY,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `gpa` float(4) NOT NULL,
  `status` varchar(15) NOT NULL,
  `mentor` varchar(20) NOT NULL,
  `level` varchar(10) NOT NULL,
  `thesisTitle` varchar(60) NOT NULL,
  `thesisAdvisor` varchar(20) NOT NULL,
  `company` varchar(20) NOT NULL
);





