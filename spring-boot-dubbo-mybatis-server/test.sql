/*
Navicat MySQL Data Transfer

Source Server         : localMySQL
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-11-06 10:27:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `account`
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
INSERT INTO `account` VALUES ('1', '77821e85-eb42-420e-bc29-c30505580080');
INSERT INTO `account` VALUES ('2', '悟空');
INSERT INTO `account` VALUES ('3', '猪八戒');
INSERT INTO `account` VALUES ('4', '沙和尚');
INSERT INTO `account` VALUES ('5', '沙僧');
INSERT INTO `account` VALUES ('6', '小白龙');
INSERT INTO `account` VALUES ('7', '唐僧');
INSERT INTO `account` VALUES ('8', '白骨精');
INSERT INTO `account` VALUES ('9', '蜘蛛精');
INSERT INTO `account` VALUES ('10', '哪吒');
INSERT INTO `account` VALUES ('11', '二郎神');
INSERT INTO `account` VALUES ('12', '哮天犬');
INSERT INTO `account` VALUES ('13', null);
