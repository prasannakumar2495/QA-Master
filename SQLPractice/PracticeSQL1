CREATE TABLE prasannaTable1 (
    PersonID int,
    LastName varchar(255),
);

INSERT INTO prasannaTable (PersonID, LastName, FirstName,Address,City, JOB)
VALUES (12, 'kumar10', 'prasanna10','BTM10','Bangalore10','S/W');

select *
from prasannaTable
order by personID;

UPDATE prasannaTable
SET LastName = 'Alfred Schmidt'
WHERE PersonID = 1;

select personID*5 as "new ID"
from PRASANNATABLE;

SELECT distinct PERSONID
FROM PRASANNATABLE

ALTER TABLE PRASANNATABLE
ADD JOB varchar(255);

INSERT INTO prasannaTable (JOB)
VALUES ("S/W")
WHERE PersonID=1;

SELECT COUNT(LASTNAME), LASTNAME
FROM PRASANNATABLE
WHERE LASTNAME='Kumar10'


select *
from PRASANNATABLE
where personID in (select personID
from PRASANNATABLE
where lastname in('kumar10'))

create table DEPT(
	PERSONID INT,
	DEPT VARCHAR(500)
)

SELECT *
FROM DEPT;

INSERT INTO DEPT(PERSONID, DEPT)
VALUES (3,'H/W');


--INNER JOINS--

SELECT *
FROM DEPT INNER JOIN PRASANNATABLE
ON PRASANNATABLE.PERSONID = (DEPT.PERSONID)