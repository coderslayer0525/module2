create database csdl_sinhvien_controller;

use csdl_sinhvien_controller;

create table classes (
class_id int auto_increment primary key,
class_name varchar (20),
start_date datetime not null,
status bit
);
create table students (
class_id int not null,
student_id int auto_increment primary key,
student_name varchar(60) not null,
adrress varchar(20),
phone varchar (20),
status bit,
foreign key (class_id) references classes(class_id)
);
create table subjects (
sub_id int auto_increment primary key,
sub_name varchar(20) not null,
credit tinyint  check (credit > 1) not null
);

create table marks (
mark_id int auto_increment primary key,
student_id int not null,
mark float default 0 check ( mark between 0 and 100),
sub_id int not null,
unique(sub_id, student_id),
foreign key(sub_id) references subjects(sub_id),
foreign key(student_id) references students(student_id)
);
insert into students ( student_name, adrress,phone,status,class_id)
values 
('Nghiem','Da Nang','0702731504',1,1 ),
('Sinh','Quang Nam','0702731333',1,1 );
insert into subjects (sub_id, sub_name, credit)
values
(1,'mark',200),
(2,'chemistry',300);
insert into marks (mark_id, student_id, mark, sub_id)
		values (1, 1, 1, 1),
				(2, 2, 2, 2),
				(3, 3, 3, 3);
select * 
from subjects
where credit = (select max(credit) from subjects);
select
    ss.student_id,
    ss.student_name,
    ss.address,
    ss.phone,
    ss.status,
    ss.class_id,
    avg(m.mark) AS avg_mark
from students ss
left join marks m on ss.student_id = m.student_id
group by ss.student_id, ss.student_name, ss.address, ss.phone, ss.status, ss.class_id
order by avg_mark desc;

