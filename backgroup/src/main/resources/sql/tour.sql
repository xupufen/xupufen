/*
 Navicat Premium Data Transfer

 Source Server         : MySQL8.0
 Source Server Type    : MySQL
 Source Server Version : 80012
 Source Host           : localhost:3306
 Source Schema         : tour

 Target Server Type    : MySQL
 Target Server Version : 80012
 File Encoding         : 65001

 Date: 08/11/2024 18:40:46
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for address
-- ----------------------------
DROP TABLE IF EXISTS `address`;
CREATE TABLE `address`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '地址(省份)',
  `code` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '邮政编码',
  `info` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '旅游景点',
  `city` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '市区',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '旅游地址表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of address
-- ----------------------------
INSERT INTO `address` VALUES (1, '北京市', NULL, NULL, '[{\"cityName\":\"北京市\",\"cityType\":\"直辖市\"}]');
INSERT INTO `address` VALUES (2, '天津市', NULL, NULL, '[{\"cityName\":\"天津市\",\"cityType\":\"直辖市\"}]');
INSERT INTO `address` VALUES (3, '上海市', NULL, NULL, '[{\"cityName\":\"上海市\",\"cityType\":\"直辖市\"}]');
INSERT INTO `address` VALUES (4, '重庆市', NULL, NULL, '[{\"cityName\":\"重庆市\",\"cityType\":\"直辖市\"}]');
INSERT INTO `address` VALUES (5, '香港特别行政区', NULL, NULL, '[{\"cityName\":\"香港特别行政区\",\"cityType\":\"特别行政区\"}]');
INSERT INTO `address` VALUES (6, '澳门特别行政区', NULL, NULL, '[{\"cityName\":\"澳门特别行政区\",\"cityType\":\"特别行政区\"}]');
INSERT INTO `address` VALUES (7, '河北省', NULL, NULL, '[{\"cityName\":\"石家庄市\",\"cityType\":\"地级市\"},{\"cityName\":\"唐山市\",\"cityType\":\"地级市\"},{\"cityName\":\"秦皇岛市\",\"cityType\":\"地级市\"},{\"cityName\":\"邯郸市\",\"cityType\":\"地级市\"},{\"cityName\":\"邢台市\",\"cityType\":\"地级市\"},{\"cityName\":\"保定市\",\"cityType\":\"地级市\"},{\"cityName\":\"张家口市\",\"cityType\":\"地级市\"}');
INSERT INTO `address` VALUES (8, '山西省', NULL, NULL, '[{\"cityName\":\"太原市\",\"cityType\":\"地级市\"},{\"cityName\":\"大同市\",\"cityType\":\"地级市\"},{\"cityName\":\"阳泉市\",\"cityType\":\"地级市\"},{\"cityName\":\"长治市\",\"cityType\":\"地级市\"},{\"cityName\":\"晋城市\",\"cityType\":\"地级市\"},{\"cityName\":\"朔州市\",\"cityType\":\"地级市\"},{\"cityName\":\"晋中市\",\"cityType\":\"地级市\"},{\"');
INSERT INTO `address` VALUES (9, '内蒙古自治区', NULL, NULL, '[{\"cityName\":\"呼和浩特市\",\"cityType\":\"地级市\"},{\"cityName\":\"包头市\",\"cityType\":\"地级市\"},{\"cityName\":\"乌海市\",\"cityType\":\"地级市\"},{\"cityName\":\"赤峰市\",\"cityType\":\"地级市\"},{\"cityName\":\"通辽市\",\"cityType\":\"地级市\"},{\"cityName\":\"鄂尔多斯市\",\"cityType\":\"地级市\"},{\"cityName\":\"呼伦贝尔市\",\"cityType\":\"地级');
INSERT INTO `address` VALUES (10, '辽宁省', NULL, NULL, '[{\"cityName\":\"沈阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"大连市\",\"cityType\":\"地级市\"},{\"cityName\":\"鞍山市\",\"cityType\":\"县级市\"},{\"cityName\":\"抚顺市\",\"cityType\":\"县级市\"},{\"cityName\":\"本溪市\",\"cityType\":\"县级市\"},{\"cityName\":\"丹东市\",\"cityType\":\"县级市\"},{\"cityName\":\"锦州市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (11, '吉林省', NULL, NULL, '[{\"cityName\":\"长春市\",\"cityType\":\"地级市\"},{\"cityName\":\"吉林市\",\"cityType\":\"县级市\"},{\"cityName\":\"四平市\",\"cityType\":\"县级市\"},{\"cityName\":\"辽源市\",\"cityType\":\"县级市\"},{\"cityName\":\"通化市\",\"cityType\":\"县级市\"},{\"cityName\":\"白山市\",\"cityType\":\"县级市\"},{\"cityName\":\"松原市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (12, '黑龙江省', NULL, NULL, '[{\"cityName\":\"哈尔滨市\",\"cityType\":\"地级市\"},{\"cityName\":\"齐齐哈尔市\",\"cityType\":\"县级市\"},{\"cityName\":\"黑河市\",\"cityType\":\"县级市\"},{\"cityName\":\"大庆市\",\"cityType\":\"县级市\"},{\"cityName\":\"伊春市\",\"cityType\":\"县级市\"},{\"cityName\":\"鹤岗市\",\"cityType\":\"县级市\"},{\"cityName\":\"佳木斯市\",\"cityType\":\"县级市\"');
INSERT INTO `address` VALUES (13, '江苏省', NULL, NULL, '[{\"cityName\":\"南京市\",\"cityType\":\"地级市\"},{\"cityName\":\"徐州市\",\"cityType\":\"县级市\"},{\"cityName\":\"连云港市\",\"cityType\":\"县级市\"},{\"cityName\":\"宿迁市\",\"cityType\":\"县级市\"},{\"cityName\":\"淮安市\",\"cityType\":\"县级市\"},{\"cityName\":\"盐城市\",\"cityType\":\"县级市\"},{\"cityName\":\"扬州市\",\"cityType\":\"县级市\"},{');
INSERT INTO `address` VALUES (14, '浙江省', NULL, NULL, '[{\"cityName\":\"杭州市\",\"cityType\":\"地级市\"},{\"cityName\":\"宁波市\",\"cityType\":\"地级市\"},{\"cityName\":\"湖州市\",\"cityType\":\"县级市\"},{\"cityName\":\"嘉兴市\",\"cityType\":\"县级市\"},{\"cityName\":\"舟山市\",\"cityType\":\"县级市\"},{\"cityName\":\"绍兴市\",\"cityType\":\"县级市\"},{\"cityName\":\"衢州市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (15, '安徽省', NULL, NULL, '[{\"cityName\":\"合肥市\",\"cityType\":\"地级市\"},{\"cityName\":\"芜湖市\",\"cityType\":\"地级市\"},{\"cityName\":\"蚌埠市\",\"cityType\":\"地级市\"},{\"cityName\":\"淮南市\",\"cityType\":\"地级市\"},{\"cityName\":\"马鞍山市\",\"cityType\":\"地级市\"},{\"cityName\":\"淮北市\",\"cityType\":\"地级市\"},{\"cityName\":\"铜陵市\",\"cityType\":\"地级市\"},{');
INSERT INTO `address` VALUES (16, '福建省', NULL, NULL, '[{\"cityName\":\"厦门市\",\"cityType\":\"地级市\"},{\"cityName\":\"福州市\",\"cityType\":\"县级市\"},{\"cityName\":\"南平市\",\"cityType\":\"县级市\"},{\"cityName\":\"三明市\",\"cityType\":\"县级市\"},{\"cityName\":\"莆田市\",\"cityType\":\"县级市\"},{\"cityName\":\"泉州市\",\"cityType\":\"县级市\"},{\"cityName\":\"漳州市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (17, '江西省', NULL, NULL, '[{\"cityName\":\"南昌市\",\"cityType\":\"地级市\"},{\"cityName\":\"九江市\",\"cityType\":\"地级市\"},{\"cityName\":\"景德镇市\",\"cityType\":\"地级市\"},{\"cityName\":\"鹰潭市\",\"cityType\":\"地级市\"},{\"cityName\":\"新余市\",\"cityType\":\"地级市\"},{\"cityName\":\"萍乡市\",\"cityType\":\"地级市\"},{\"cityName\":\"赣州市\",\"cityType\":\"地级市\"},{');
INSERT INTO `address` VALUES (18, '山东省', NULL, NULL, '[{\"cityName\":\"济南市\",\"cityType\":\"地级市\"},{\"cityName\":\"青岛市\",\"cityType\":\"地级市\"},{\"cityName\":\"聊城市\",\"cityType\":\"县级市\"},{\"cityName\":\"德州市\",\"cityType\":\"县级市\"},{\"cityName\":\"东营市\",\"cityType\":\"县级市\"},{\"cityName\":\"淄博市\",\"cityType\":\"县级市\"},{\"cityName\":\"潍坊市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (19, '河南省', NULL, NULL, '[{\"cityName\":\"郑州市\",\"cityType\":\"地级市\"},{\"cityName\":\"开封市\",\"cityType\":\"地级市\"},{\"cityName\":\"洛阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"平顶山市\",\"cityType\":\"地级市\"},{\"cityName\":\"安阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"鹤壁市\",\"cityType\":\"地级市\"},{\"cityName\":\"新乡市\",\"cityType\":\"地级市\"},{');
INSERT INTO `address` VALUES (20, '湖北省', NULL, NULL, '[{\"cityName\":\"武汉市\",\"cityType\":\"地级市\"},{\"cityName\":\"十堰市\",\"cityType\":\"县级市\"},{\"cityName\":\"襄阳市\",\"cityType\":\"县级市\"},{\"cityName\":\"荆门市\",\"cityType\":\"县级市\"},{\"cityName\":\"孝感市\",\"cityType\":\"县级市\"},{\"cityName\":\"黄冈市\",\"cityType\":\"县级市\"},{\"cityName\":\"鄂州市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (21, '湖南省', NULL, NULL, '[{\"cityName\":\"长沙市\",\"cityType\":\"地级市\"},{\"cityName\":\"衡阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"张家界市\",\"cityType\":\"地级市\"},{\"cityName\":\"常德市\",\"cityType\":\"地级市\"},{\"cityName\":\"益阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"岳阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"株洲市\",\"cityType\":\"地级市\"},{');
INSERT INTO `address` VALUES (22, '广东省', NULL, NULL, '[{\"cityName\":\"广州市\",\"cityType\":\"地级市\"},{\"cityName\":\"深圳市\",\"cityType\":\"地级市\"},{\"cityName\":\"清远市\",\"cityType\":\"县级市\"},{\"cityName\":\"韶关市\",\"cityType\":\"县级市\"},{\"cityName\":\"河源市\",\"cityType\":\"县级市\"},{\"cityName\":\"梅州市\",\"cityType\":\"县级市\"},{\"cityName\":\"潮州市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (23, '广西壮族自治区', NULL, NULL, '[{\"cityName\":\"南宁市\",\"cityType\":\"地级市\"},{\"cityName\":\"桂林市\",\"cityType\":\"地级市\"},{\"cityName\":\"柳州市\",\"cityType\":\"地级市\"},{\"cityName\":\"梧州市\",\"cityType\":\"地级市\"},{\"cityName\":\"贵港市\",\"cityType\":\"地级市\"},{\"cityName\":\"玉林市\",\"cityType\":\"地级市\"},{\"cityName\":\"钦州市\",\"cityType\":\"地级市\"},{\"');
INSERT INTO `address` VALUES (24, '海南省', NULL, NULL, '[{\"cityName\":\"海口市\",\"cityType\":\"地级市\"},{\"cityName\":\"三亚市\",\"cityType\":\"地级市\"},{\"cityName\":\"三沙市\",\"cityType\":\"地级市\"},{\"cityName\":\"儋州市\",\"cityType\":\"地级市\"},{\"cityName\":\"文昌市\",\"cityType\":\"县级市\"},{\"cityName\":\"琼海市\",\"cityType\":\"县级市\"},{\"cityName\":\"万宁市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (25, '四川省', NULL, NULL, '[{\"cityName\":\"成都市\",\"cityType\":\"地级市\"},{\"cityName\":\"广元市\",\"cityType\":\"县级市\"},{\"cityName\":\"绵阳市\",\"cityType\":\"县级市\"},{\"cityName\":\"德阳市\",\"cityType\":\"县级市\"},{\"cityName\":\"南充市\",\"cityType\":\"县级市\"},{\"cityName\":\"广安市\",\"cityType\":\"县级市\"},{\"cityName\":\"遂宁市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (26, '贵州省', NULL, NULL, '[{\"cityName\":\"贵阳市\",\"cityType\":\"地级市\"},{\"cityName\":\"六盘水市\",\"cityType\":\"地级市\"},{\"cityName\":\"遵义市\",\"cityType\":\"地级市\"},{\"cityName\":\"安顺市\",\"cityType\":\"地级市\"},{\"cityName\":\"毕节市\",\"cityType\":\"地级市\"},{\"cityName\":\"铜仁市\",\"cityType\":\"地级市\"},{\"cityName\":\"清镇市\",\"cityType\":\"县级市\"},{');
INSERT INTO `address` VALUES (27, '云南省', NULL, NULL, '[{\"cityName\":\"昆明市\",\"cityType\":\"地级市\"},{\"cityName\":\"曲靖市\",\"cityType\":\"地级市\"},{\"cityName\":\"玉溪市\",\"cityType\":\"地级市\"},{\"cityName\":\"丽江市\",\"cityType\":\"地级市\"},{\"cityName\":\"昭通市\",\"cityType\":\"地级市\"},{\"cityName\":\"普洱市\",\"cityType\":\"地级市\"},{\"cityName\":\"临沧市\",\"cityType\":\"地级市\"},{\"');
INSERT INTO `address` VALUES (28, '陕西省', NULL, NULL, '[{\"cityName\":\"西安市\",\"cityType\":\"地级市\"},{\"cityName\":\"延安市\",\"cityType\":\"县级市\"},{\"cityName\":\"铜川市\",\"cityType\":\"县级市\"},{\"cityName\":\"渭南市\",\"cityType\":\"县级市\"},{\"cityName\":\"咸阳市\",\"cityType\":\"县级市\"},{\"cityName\":\"宝鸡市\",\"cityType\":\"县级市\"},{\"cityName\":\"汉中市\",\"cityType\":\"县级市\"},{\"');
INSERT INTO `address` VALUES (29, '甘肃省', NULL, NULL, '[{\"cityName\":\"兰州市\",\"cityType\":\"地级市\"},{\"cityName\":\"嘉峪关市\",\"cityType\":\"地级市\"},{\"cityName\":\"金昌市\",\"cityType\":\"地级市\"},{\"cityName\":\"白银市\",\"cityType\":\"地级市\"},{\"cityName\":\"天水市\",\"cityType\":\"地级市\"},{\"cityName\":\"酒泉市\",\"cityType\":\"地级市\"},{\"cityName\":\"张掖市\",\"cityType\":\"地级市\"},{');
INSERT INTO `address` VALUES (30, '青海省', NULL, NULL, '[{\"cityName\":\"西宁市\",\"cityType\":\"地级市\"},{\"cityName\":\"海东市\",\"cityType\":\"地级市\"},{\"cityName\":\"格尔木市\",\"cityType\":\"县级市\"},{\"cityName\":\"德令哈市\",\"cityType\":\"县级市\"},{\"cityName\":\"玉树市\",\"cityType\":\"县级市\"},{\"cityName\":\"茫崖市\",\"cityType\":\"县级市\"}]');
INSERT INTO `address` VALUES (31, '西藏自治区', NULL, NULL, '[{\"cityName\":\"拉萨市\",\"cityType\":\"地级市\"},{\"cityName\":\"日喀则市\",\"cityType\":\"地级市\"},{\"cityName\":\"昌都市\",\"cityType\":\"地级市\"},{\"cityName\":\"林芝市\",\"cityType\":\"地级市\"},{\"cityName\":\"山南市\",\"cityType\":\"地级市\"},{\"cityName\":\"那曲市\",\"cityType\":\"地级市\"}]');
INSERT INTO `address` VALUES (32, '宁夏回族自治区', NULL, NULL, '[{\"cityName\":\"银川市\",\"cityType\":\"地级市\"},{\"cityName\":\"石嘴山市\",\"cityType\":\"地级市\"},{\"cityName\":\"吴忠市\",\"cityType\":\"地级市\"},{\"cityName\":\"中卫市\",\"cityType\":\"地级市\"},{\"cityName\":\"固原市\",\"cityType\":\"地级市\"},{\"cityName\":\"灵武市\",\"cityType\":\"县级市\"},{\"cityName\":\"青铜峡市\",\"cityType\":\"县级市\"}]');
INSERT INTO `address` VALUES (33, '新疆维吾尔自治区', NULL, NULL, '[{\"cityName\":\"乌鲁木齐市\",\"cityType\":\"地级市\"},{\"cityName\":\"克拉玛依市\",\"cityType\":\"地级市\"},{\"cityName\":\"吐鲁番市\",\"cityType\":\"地级市\"},{\"cityName\":\"哈密市\",\"cityType\":\"地级市\"},{\"cityName\":\"喀什市\",\"cityType\":\"县级市\"},{\"cityName\":\"阿克苏市\",\"cityType\":\"县级市\"},{\"cityName\":\"库车市\",\"cityType\":\"县级');
INSERT INTO `address` VALUES (34, '台湾', NULL, NULL, '[{\"cityName\":\"台北市\",\"cityType\":\"地级市\"},{\"cityName\":\"新北市\",\"cityType\":\"地级市\"},{\"cityName\":\"桃园市\",\"cityType\":\"地级市\"},{\"cityName\":\"台中市\",\"cityType\":\"地级市\"},{\"cityName\":\"台南市\",\"cityType\":\"地级市\"},{\"cityName\":\"高雄市\",\"cityType\":\"地级市\"},{\"cityName\":\"基隆市\",\"cityType\":\"县级市\"},{\"');

-- ----------------------------
-- Table structure for wx_user
-- ----------------------------
DROP TABLE IF EXISTS `wx_user`;
CREATE TABLE `wx_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `user` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '账号',
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '密码',
  `sex` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '性别',
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '邮箱',
  `create_time` datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `avatar` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '头像地址',
  `role` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '角色',
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci NULL DEFAULT NULL COMMENT '姓名',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = MyISAM AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_unicode_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of wx_user
-- ----------------------------
INSERT INTO `wx_user` VALUES (1, '1', '1', '1', '1', '2024-11-08 17:10:50', '1', '1', '1');

SET FOREIGN_KEY_CHECKS = 1;
