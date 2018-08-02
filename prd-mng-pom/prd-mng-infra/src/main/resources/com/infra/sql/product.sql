/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author: a26ishibashi
 * Created: 2018/08/02
 */CREATE TABLE `product` (
  `productId` int(4) NOT NULL AUTO_INCREMENT,
  `productCd` varchar(6) NOT NULL,
  `productName` varchar(20) NOT NULL,
  `price` int(6) NOT NULL,
  `deletedFlg` int(11) NOT NULL,
  `version` bigint(20) NOT NULL,
  PRIMARY KEY (`productId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8