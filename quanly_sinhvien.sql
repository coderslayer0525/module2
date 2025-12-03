create database if not exists  quanly_sinhvien;

use quanly_sinhvien;

create table classes (
id int primary key,
class_name varchar (50)
);

use quanly_sinhvien;

create table teachers (
teachers_id int primary key,
teachers_major varchar(50)
 );
 
 use quanly_sinhvien;
 
 create table teachers_profile(
 profile_id int primary key,
 teachers_id int unique,
 foreign key(teachers_id)  references teachers(teachers_id),
 degree varchar(10)
 );

use quanly_sinhvien;

create table teacher_class (
teacher_id int,
class_id int,
primary key (teacher_id ,class_id),
foreign key(teacher_id) references teachers(teachers_id),
foreign key(class_id) references classes(id)
);

use quanly_sinhvien;

create table students (
student_id int primary key,
student_name varchar(100),
foreign key(student_id) references classes(id)
);
