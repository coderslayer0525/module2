use quanly_cuahang;

insert into customers (c_id,c_name,c_age )
values
(1,'Nghiem',32),
(2,'Minh' ,23),
(3,'Sinh' ,24),
(4,'Tri'  ,24);

insert into orders (o_id,c_id,o_date,o_total)
values
(1, 1,'2025-12-11',20),
(2,2,'2025-08-08',15),
(3,1,'2023-02-20',11);
insert into products (p_id, p_name,p_price)
values
(1,'xaphong',15),
(2,'dauan',45);

insert into order_details (o_id , p_id, od_qty)
values
(1,1,200),
(2,1,100);

select o_id ,o_date , o_total
from orders
;
select c_name, p_name
from customers c
join orders o on c.c_id=o.c_id
join order_details od on o.o_id=od.o_id
join products p on od.p_id=p.p_id;


