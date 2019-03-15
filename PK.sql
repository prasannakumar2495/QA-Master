create table tableOFC100(
	ID_Num int,
	name varchar(500),
	location varchar(500)
);

insert into tableOFC100 (ID_NUM , NAME, LOCATION) values
 (101, 'KUMAR', 'BTM1'),
 (102, 'PRASANNA', 'BTM2'),
 (103, 'KUMAR PRASANNA', 'BTM1'),
 (104, 'PK', 'BTM2');
 
 select *
 from tableOFC100;
 
 create table tableOFC101(
	ID_Num int,
	DEPT varchar(500),
	MGR varchar(500)
);

insert into tableOFC101 (ID_NUM , DEPT, MGR) values
 (101, 'ECE', 'M1'),
 (102, 'CIVIL', 'M2'),
 (103, 'ECE', 'M3'),
 (104, 'CIVIL', 'M1');
 
 CREATE PROCEDURE SelectAllCustomers() 
	SELECT * 
	FROM TABLEOFC100;
    
    call SelectAllCustomers
	