create database quanly_banhang;

use quanly_banhang;

create table customer (
c_ID int primary key,
c_Name varchar(100) not null,
c_Age int check ( 0 < c_Age < 50  )
);

use quanly_banhang;

create table product (
p_ID int primary key,
p_Name varchar(25) not null,
p_Price int check ( 0 < p_Price < 10) not null
);

create table `order`(
o_ID int primary key,
c_ID int  not null,
o_DATE int not null,
o_TOTAL int not null,
foreign key (c_ID) references customer (c_ID)
);

create table order_detail (
o_ID int not null,
p_ID int not null,
od_QTY int not null check (od_QTY > 0) ,
primary key(o_ID, p_ID),
foreign key (o_ID) references `order`(o_ID),
foreign key (p_ID) references product(p_ID) 
);