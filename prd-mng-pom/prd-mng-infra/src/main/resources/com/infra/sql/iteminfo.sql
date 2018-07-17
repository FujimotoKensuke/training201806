/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Naoto Endo
 * Created: 2018/07/16
 */

CREATE TABLE `iteminfo` (
  `id` varchar(12) NOT NULL,
  `name` varchar(20) NOT NULL,
  `price` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8