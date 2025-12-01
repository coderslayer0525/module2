create database quanly_hocsinh;

use	 quanly_hocsinh;

create table Class (
id int primary key,
name varchar(100)
);

use quanly_hocsinh;

create table Teacher (
id int primary key,
name varchar(200),
age int,
country varchar(20)
);
