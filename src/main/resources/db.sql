CREATE TABLE PRODUCT_CATEGORY(ID INT PRIMARY KEY, NAME VARCHAR(30))
ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO PRODUCT_CATEGORY VALUES(1, 'Regular Cakes');
INSERT INTO PRODUCT_CATEGORY VALUES(2, 'Eggless Cakes');
INSERT INTO PRODUCT_CATEGORY VALUES(3, 'Fruit Cakes');
INSERT INTO PRODUCT_CATEGORY VALUES(4, 'Pastries');
INSERT INTO PRODUCT_CATEGORY VALUES(5, 'Brownies');
INSERT INTO PRODUCT_CATEGORY VALUES(6, 'Party Cakes');
INSERT INTO PRODUCT_CATEGORY VALUES(7, 'Choclates');


CREATE TABLE `deal` (
  `ID` bigint(10) NOT NULL,
  `ITEM_CODE` varchar(10) NOT NULL,
  `ITEM_NAME` varchar(45) NOT NULL,
  `DESCRIPTION` varchar(500) DEFAULT NULL,
  `COST` decimal(10,0) NOT NULL,
  `DISCOUNT` int(11) NOT NULL,
  `RATING` int(11) DEFAULT NULL,
  `IMAGE_URL` varchar(300) DEFAULT NULL,
  UNIQUE KEY `ITEM_CODE_UNIQUE` (`ITEM_CODE`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;



INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(1,
'1111',
'Chocolate Truffle Cake',
'Delishious Chocolate Truffle Cake',
179.00,
40,
4,
'images/chocolate_truffle_cake_700_400.png');


INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(2,
'1112',
'Strawberry Heart shaped Cake',
'Delishious Strawberry Heart shaped Cake',
149.00,
70,
3,
'images/strawberry_heart_shape_cake_700_400.png');

INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(3,
'1113',
'Mixed Fruit Cake',
'Delishious Mixed Fruit Cake',
149.00,
33,
4,
'images/Mixed_Fruit_Cake_700_400.png');

INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(4,
'1114',
'Original Brownie Cake',
'Delishious Brownie Cake',
59.00,
10,
5,
'images/cake3_700_400.png');

INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(5,
'1115',
'Black Forest Cake',
'Delishious Black Forest Cake',
99.00,
20,
5,
'images/black_forest_700_400.png');

INSERT INTO `myshop`.`deal`
(`ID`,
`ITEM_CODE`,
`ITEM_NAME`,
`DESCRIPTION`,
`COST`,
`DISCOUNT`,
`RATING`,
`IMAGE_URL`)
VALUES
(6,
'1116',
'"DJ Cake',
'Delishious "DJ Cake',
59.00,
28,
4,
'images/djCake_700_400.png');