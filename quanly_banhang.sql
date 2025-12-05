create database quanly_banhang;

use quanly_banhang;

create table customers (
c_id int primary key,
c_name varchar(100) not null,
c_age int check ( 0 < c_age < 50  )
);

use quanly_banhang;

create table products (
p_id int primary key,
p_name varchar(25) not null,
p_price int check ( 0 < p_price < 10) 
);

create table  orders(
o_id int primary key,
c_id int  not null,
o_date int not null,
o_total int not null,
foreign key (c_id) references customers (c_id)
);

create table order_details (
o_id int not null,
p_id int not null,
od_qty int not null check (od_qty > 0) ,
primary key(o_id, p_id),
foreign key (o_id) references orders (o_id),
foreign key (p_id) references products (p_id) 
);