create database viewindexstore;
use viewindexstore;
create table products (
    id int auto_increment primary key,
    product_code varchar(10) not null,
    product_name varchar(10) not null,
    product_price decimal(10,2) not null,
    product_amount int not null,
    product_description text,
    product_status varchar(10)
);
create unique index idx_product_code 
on products(product_code);
create index idx_product_name_price 
on products(product_name, product_price);
create view v_products as
select product_code, product_name, product_price, product_status
from products;

delimiter //
create procedure get_all_products()
begin
    select * from products;
end //
delimiter ;
delimiter //

create procedure add_product(
    in p_code varchar(10),
    in p_name varchar(100),
    in p_price decimal(10,2),
    in p_amount int,
    in p_desc text,
     in p_status varchar(20)
)
begin
    insert into products(product_code, product_name, product_price, product_amount, product_description, product_status)
    values (p_code, p_name, p_price, p_amount, p_desc,p_status);
end //
delimiter ;
delimiter //
create procedure update_product_by_id(
    in p_id int,
    in p_name varchar(100),
    in p_price decimal(10,2),
    in p_amount int,
    in p_desc text,
    in p_status varchar(20)
)
begin
    update products
    set product_name = p_name,
        product_price = p_price,
        product_amount = p_amount,
        product_description = p_desc,
        product_status = p_status
    where id = p_id;
end //
delimiter ;
delimiter //

create procedure del_product_id(in p_id int)
begin
    delete from products where id = p_id;
end //
delimiter ;

insert into products (product_code, product_name, product_price, product_amount, product_description, product_status)
values
('a001', 'sam_sung', 1000.00, 10, 'samsunggalaxy', 'available'),
('a002', 'androi', 800.00, 10, 'xiaomi_redmi_5', 'available'),
('a003', 'apple', 20000.00, 8, 'iphone_17_origin', 'available')


