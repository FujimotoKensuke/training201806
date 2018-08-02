/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  k_fujimoto
 * Created: 2018/04/12
 */

CREATE TABLE `userinfo` (
  `id` varchar(12) NOT NULL,
  `name` varchar(20) NOT NULL,
  `comment` varchar(100) DEFAULT NULL,
  `deletedFlg` int(11) NOT NULL,
  `version` bigint(20) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8