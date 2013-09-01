DROP DATABASE IF EXISTS registrar;

CREATE DATABASE registrar;

USE registrar;


DROP TABLE IF EXISTS `student`;
SET @saved_cs_client     = @@character_set_client;
SET character_set_client = utf8;
CREATE TABLE `student` (
  `studentID` int(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  `firstName` varchar(20) NOT NULL,
  `lastName` varchar(20) NOT NULL,
  `gpa` float(4) NOT NULL,
  `status` varchar(15) NOT NULL,
  `mentor` varchar(20),
  `level` varchar(10),
  `thesisTitle` varchar(60),
  `thesisAdvisor` varchar(20),
  `company` varchar(20)
);

ALTER TABLE `student` ADD UNIQUE KEY `uk_student_name` (firstname, lastname);





