CREATE DATABASE quanly_hocsinh;

USE	 quanly_hocsinh;

CREATE TABLE classes (
id INT PRIMARY KEY,
NAME VARCHAR(100)
);

USE quanly_hocsinh;

CREATE TABLE teachers (
id INT PRIMARY KEY,
NAME VARCHAR(200),
age INT,
country VARCHAR(20)
);
