/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.49-0ubuntu0.14.04.1 : Database - capsui
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`capsui` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

/*Table structure for table `m_temp` */

CREATE TABLE `m_temp` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `title` varchar(16) COLLATE utf8_bin DEFAULT '',
  `primary_industry` varchar(16) COLLATE utf8_bin DEFAULT '',
  `deputy_industry` varchar(16) COLLATE utf8_bin DEFAULT '',
  `content` varchar(512) COLLATE utf8_bin DEFAULT '',
  `example` varchar(1024) COLLATE utf8_bin DEFAULT '',
  `remark` varchar(256) COLLATE utf8_bin DEFAULT '',
  `createTime` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0:初始,1测试能过',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;


CREATE TABLE `sec_user` (
  `userId` bigint(20) NOT NULL AUTO_INCREMENT,
  `password` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `sec_user` */

/*Table structure for table `u_temp_as` */

CREATE TABLE `u_temp_as` (
  `userId` bigint(20) DEFAULT NULL COMMENT 'userid',
  `template_id` bigint(20) DEFAULT NULL,
  `temp_id` bigint(20) DEFAULT NULL,
  `status` int(11) DEFAULT NULL COMMENT '0:old,1:active'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `u_temp_as` */

/*Table structure for table `u_temp_flow` */

CREATE TABLE `u_temp_flow` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `userId` bigint(20) DEFAULT NULL,
  `template_id` varchar(128) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '模板ID',
  `title` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '标题',
  `primary_industry` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '主行业',
  `deputy_industry` varchar(16) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '细分行业',
  `content` varchar(512) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '模板内容',
  `example` varchar(1024) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '测试模板',
  `access_token` varchar(512) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '用户accessToken',
  `status` int(11) DEFAULT '0' COMMENT '0:初始,1:测试成功',
  `createTime` datetime DEFAULT NULL COMMENT '创建时间',
  `remark` varchar(256) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL COMMENT '备注',
  `as_temp_id` bigint(20) DEFAULT NULL COMMENT '关联模板表',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;

/*Data for the table `u_temp_flow` */


CREATE TABLE `u_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `openid` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `headimgurl` varchar(256) COLLATE utf8_bin DEFAULT NULL,
  `nickname` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `groupid` int(11) DEFAULT NULL,
  `sex` int(11) DEFAULT NULL,
  `country` varchar(16) COLLATE utf8_bin DEFAULT NULL,
  `city` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `email` varchar(64) COLLATE utf8_bin DEFAULT NULL,
  `language` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `province` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `subscribe` int(11) DEFAULT NULL,
  `subscribe_time` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `u_user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
