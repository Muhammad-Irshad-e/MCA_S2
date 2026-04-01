create database company_db;
use company_db;

create table regions(
	region_id int primary key,
    region_name varchar(40)
);

create table countries (
	country_id char(2) primary key,
    country_name varchar(50),
    region_id int,
    foreign key (region_id) references regions(region_id)
);

create table locations (
	location_id int primary key,
    street_address varchar(100),
    postal_code varchar(20),
    city varchar(40),
    state_province varchar(50),
    country_id char(2),
    foreign key (country_id) references countries(country_id)
);

create table departments(
	department_id int primary key,
    department_name varchar(50),
    location_id int,
    foreign key (location_id) references locations(location_id)
);

create table jobs(
	job_id varchar(10) primary key,
    job_title varchar(50),
    min_salary int,
    max_salary int
);

create table employees(
	employee_id int primary key,
    first_name varchar(40),
    last_name varchar(40),
    email varchar(50),
    phone_number varchar(20),
    hire_date date,
    job_id varchar(10),
    salary int,
    manager_id int,
    department_id int,
    foreign key (job_id) references jobs(job_id),
    foreign key (department_id) references departments(department_id)
);

create table dependents(
	dependent_id int primary key,
    first_name varchar(30),
    last_name varchar(30),
    relationship varchar(30),
    employee_id int,
    foreign key (employee_id) references employees(employee_id)
);

rename table departments to dept;

alter table employees modify salary smallint;

insert into regions(region_id, region_name) values(1,'Europe');
insert into regions(region_id, region_name) values(2,'America');
insert into regions(region_id, region_name) values(3,'Asia');
insert into regions(region_id, region_name) values(4,'Middle East and Africa');


insert into countries(country_id, country_name, region_id) values('AR','Argentina',2);
insert into countries(country_id, country_name, region_id) values('AU','Australia',3);
insert into countries(country_id, country_name, region_id) values('BE','Belgium',1);
insert into countries(country_id, country_name, region_id) values('BR','Brazil',2);
insert into countries(country_id, country_name, region_id) values('CA','Canada',2);
insert into countries(country_id, country_name, region_id) values('CH','Switzerland',1);
insert into countries(country_id, country_name, region_id) values('CN','China',3);
insert into countries(country_id, country_name, region_id) values('DE','Germany',1);
insert into countries(country_id, country_name, region_id) values('DK','Denmark',1);
insert into countries(country_id, country_name,region_id) values ('EG','Egypt',4);
insert into countries(country_id, country_name, region_id) values('FR','France',1);
insert into countries(country_id, country_name, region_id) values('HK','HongKong',3);
insert into countries(country_id, country_name, region_id) values('IL','Israel',4);
insert into countries(country_id, country_name, region_id) values('IN','India',3);
insert into countries(country_id, country_name, region_id) values('IT','Italy',1);
insert into countries(country_id, country_name, region_id) values('JP','Japan',3);
insert into countries(country_id, country_name, region_id) values('US','United States of America',2);
insert into countries(country_id, country_name, region_id) values('MX','Mexico',2);
insert into countries(country_id, country_name, region_id) values('UK','United Kingdom',1);

insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(1400,'2014 Jabberwocky Rd','26192','Southlake','Texas','US');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(1500,'2011 Interiors Blvd','99236','South San Francisco','California','US');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(1700,'2004 Charade Rd','98199','Seattle','Washington','US');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(1800,'147 Spadina Ave','M5V 2L7','Toronto','Ontario','CA');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(2400,'8204 Arthur St',NULL,'London',NULL,'UK');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(2500,'Magdalen Centre, The Oxford Science Park','OX9 9ZB','Oxford','Oxford','UK');
insert into locations(location_id, street_address, postal_code,city, state_province, country_id) values(2700,'Schwanthalerstr. 7031','80925','Munich','Bavaria','DE');


insert into jobs(job_id, job_title,min_salary, max_salary) values(1,'Public Accountant',4200.00,9000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(2,'Accounting Manager',8200.00,16000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(3,'Administration Assistant',3000.00,6000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(4,'President',20000.00,40000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(5,'Administration Vice President',15000.00,30000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(6,'Accountant',4200.00,9000.00);
insert into jobs(job_id, job_title,min_salary, max_salary) values(7,'Finance Manager',8200.00,16000.00);


insert into dept(department_id, department_name, location_id) values(1,'Administration',1700);
insert into dept(department_id, department_name, location_id) values(2,'Marketing',1800);
insert into dept(department_id, department_name, location_id) values(3,'Purchasing',1700);
insert into dept(department_id, department_name, location_id) values(4,'Human Resources',2400);
insert into dept(department_id, department_name, location_id) values(5,'Shipping',1500);
insert into dept(department_id, department_name, location_id) values(6,'IT',1400);
insert into dept(department_id, department_name, location_id) values(7,'Public Relations',2700);
insert into dept(department_id, department_name, location_id) values(8,'Sales',2500);
insert into dept(department_id, department_name, location_id) values(9,'Executive',1700);
insert into dept(department_id, department_name, location_id) values(10,'Finance',1700);
insert into dept(department_id, department_name, location_id) values(11,'Accounting',1700);


insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(100,'Steven','King','steven.king@sqltutorial.org','515.123.4567','1987-06-17',4,24000.00,NULL,9);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(101,'Neena','Kochhar','neena.kochhar@sqltutorial.org','515.123.4568','1989-09-21',5,17000.00,100,9);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(102,'Lex','De Haan','lex.de haan@sqltutorial.org','515.123.4569','1993-01-13',5,17000.00,100,9);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(103,'Alexander','Hunold','alexander.hunold@sqltutorial.org','590.423.4567','1990-01-03',6,9000.00,102,6);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(104,'Bruce','Ernst','bruce.ernst@sqltutorial.org','590.423.4568','1991-05-21',5,6000.00,103,6);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(105,'David','Austin','david.austin@sqltutorial.org','590.423.4569','1997-06-25',4,4800.00,103,6);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(106,'Valli','Pataballa','valli.pataballa@sqltutorial.org','590.423.4560','1998-02-05',3,4800.00,103,6);
insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(107,'Diana','Lorentz','diana.lorentz@sqltutorial.org','590.423.5567','1999-02-07',6,4200.00,103,6);



insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(4,'Jennifer','King','Child',100);
insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(5,'Johnny','Kochhar','Child',101);
insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(6,'Bette','De Haan','Child',102);
insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(14,'Vivien','Hunold','Child',103);
insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(15,'Cuba','Ernst','Child',104);
insert into dependents(dependent_id,first_name,last_name,relationship,employee_id) values(16,'Fred','Austin','Child',105);