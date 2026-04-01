create database Store;
use Store;
create table Product(pdtId int primary key, pName varchar(50), Price int, Quantity int);
CALL insertproduct(101, 'Laptop', 50000, 10);
CALL insertproduct(102, 'Smart Phone', 30000, 15);
CALL insertproduct(103, 'Headphone', 1500, 10);
 