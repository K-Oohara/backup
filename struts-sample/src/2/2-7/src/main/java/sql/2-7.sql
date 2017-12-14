create table IF NOT EXISTS catalog (id MEDIUMINT PRIMARY KEY AUTO_INCREMENT ,name varchar(128),price int,detail text,pictureurl varchar(255),index(id) ) type=INNODB;
create table IF NOT EXISTS shopping (id varchar(32) primary key,userid varchar(32),shoppingdate date,index(id))  type=INNODB;
create table IF NOT EXISTS shoppingdetail (shoppingid varchar(32),no int,productid MEDIUMINT,counts int,primary key(shoppingid,no),index(shoppingid),index(productid),foreign key(shoppingid) references shopping(id),foreign key(productid) references catalog(id)) type=INNODB;
