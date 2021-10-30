/*
SQLyog Ultimate v10.00 Beta1
MySQL - 8.0.25 : Database - unicorn
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`unicorn` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `unicorn`;

/*Table structure for table `t_course` */

DROP TABLE IF EXISTS `t_course`;

CREATE TABLE `t_course` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '课程主键',
  `course_name` varchar(128) DEFAULT NULL COMMENT '课程名',
  `credit` float DEFAULT NULL COMMENT '课程学分',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_course` */

insert  into `t_course`(`id`,`course_name`,`credit`) values (1,'math',2),(2,'music',3);

/*Table structure for table `t_stud_cour` */

DROP TABLE IF EXISTS `t_stud_cour`;

CREATE TABLE `t_stud_cour` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '学生选择课程主键',
  `stud_id` bigint DEFAULT NULL COMMENT '学生主键',
  `cour_id` bigint DEFAULT NULL COMMENT '课程主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_stud_cour` */

insert  into `t_stud_cour`(`id`,`stud_id`,`cour_id`) values (1,1,2),(2,1,1),(3,1,3),(4,2,3),(5,2,1),(6,2,2),(7,1003,1),(8,NULL,NULL);

/*Table structure for table `t_student` */

DROP TABLE IF EXISTS `t_student`;

CREATE TABLE `t_student` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT COMMENT '学生主键',
  `stud_name` varchar(128) DEFAULT NULL COMMENT '学生姓名',
  `sex` tinyint unsigned DEFAULT NULL COMMENT '学生性别',
  `grade` int DEFAULT NULL COMMENT '学生年级',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `t_student` */

insert  into `t_student`(`id`,`stud_name`,`sex`,`grade`) values (1,'小明',1,3),(2,'小王',1,2),(3,'小赵',0,3);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
