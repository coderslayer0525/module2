create database if not exists csdl_sinhvien;

use csdl_sinhvien;

create table classes(
class_id int auto_increment primary key not null,
class_name varchar(50)not null
);
create table students(
student_id int auto_increment primary key not null,
student_name varchar(50)not null,
adrress varchar(20),
phone varchar (20),
status bit,
class_id int not null,
foreign key (class_id) references classes(class_id)
);
create table marks(
mark_id int primary  key not null,
student_id int not null,
unique(student_id),
mark float default 0 check( mark between 0 and 100),
foreign key(student_id) references students(student_id)
);
create table subjects(
sub_id int auto_increment primary key,
sub_name varchar(50) not null,
credit int
);

alter table marks
add sub_id int,
add foreign key (sub_id)  references subjects(sub_id);

alter table classes
add start_date datetime not null;

insert into classes(class_name,start_date)
values
('MARKS', '2025-1-01'),
('CODE', '2025-2-2'),
('CHERMISCHY', '2025-3-3');

INSERT INTO students (student_name, adrress, phone, status, class_id)
VALUES
('NGHIEM', 'DN', '11', 1, 1),
('HUNG', 'HN', '22', 1, 2),
('HOA', 'HCM', '33', 1, 3);

insert into classes(class_name,start_date)
values
('MARKS', '2025-12-01');

select*
from students
where student_name like 'H%';
select*
from classes
where month(start_date) = 12;

select s.student_name,
       sub.sub_name,
       m.mark
from students s
join marks m on s.student_id = m.student_id
join subjects sub on m.sub_id = sub.sub_id
order by m.mark desc, s.student_name asc;

select 
s.student_name,
s.adrress,
s.phone,
c.class_name
from students s
join classes c on s.class_id = c.class_id;

