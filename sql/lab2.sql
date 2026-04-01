use company_db;

select country_name from countries;

select email, Phone_number from employees;

select * from employees where last_name='King';

select first_name,last_name,hire_date from employees where last_name in('King','Ernst');

select first_name,last_name from employees join dept on employees.department_id = dept.department_id where department_name='IT';

select first_name,last_name from employees join dept on employees.department_id = dept.department_id where dept.department_id='6';

select * from dept  order by department_id desc;

select * from employees where last_name like 'K%';

select first_name,last_name from employees where year(hire_date) between '1991' and '1997';

select first_name,last_name,max_salary from employees join jobs on employees.job_id = jobs.job_id  where jobs.max_salary < 15000; 

select first_name,last_name,lcase(email),email from employees;

select first_name,last_name,hire_date from employees where year(hire_date) = 1997;

insert into employees(employee_id,first_name,last_name,email,phone_number,hire_date,job_id,salary,manager_id,department_id) values(112,'Paul','Newton','Paul.newton@sqltutorial.org','520.423.5567','1998-02-07',6,5200.00,103,11);

delete from dept where department_name='Shipping';
select * from dept;