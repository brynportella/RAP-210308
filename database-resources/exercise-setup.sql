DROP TABLE IF EXISTS students; 

CREATE TABLE students(
    id SERIAL,
    name VARCHAR(20),
    gpa DECIMAL,
    graduation DATE,
    PRIMARY KEY (id)
);

INSERT INTO students(name, gpa, graduation) values('Anna Smith', 4.0,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Anna Bob', 2.8,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Anna John', 2.5,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Anna Jacob', 3.0,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Anna Jo', 2.1,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Anne Smith', 1.0,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Art Smith', 3.7,'2022-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Anna Johnson', 4.0,'2022-06-01'); 

INSERT INTO students(name, gpa, graduation) values('Belle Smith', 4.0,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Bill Bob', 1.8,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Betty John', 2.5,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Bertha Jacob', 3.0,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Bee Jo', 2.1,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Bobby Smith', 1.0,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Bart Smith', 3.7,'2022-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Ben Johnson', 4.0,'2022-06-01'); 

INSERT INTO students(name, gpa, graduation) values('Charlie Smith', 4.0,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Charlie Bob', 3.8,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Charlie John', 4.5,'2021-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Carl Jacob', 3.2,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Charlie Jo', 2.1,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Carl Smith', 1.3,'2021-09-01'); 
INSERT INTO students(name, gpa, graduation) values('Charles Smith', 2.7,'2022-06-01'); 
INSERT INTO students(name, gpa, graduation) values('Charlie Johnson', 4.0,'2022-06-01'); 


-- Get the minimum of the gpa of each graduation date. 
SELECT MIN(gpa), graduation FROM students GROUP BY GRADUATION;

-- Bonus - which student has the minumum gpa of their date?  
SELECT name, gpa, GRADUATION FROM students where gpa in (
	SELECT MIN(gpa) FROM students GROUP BY GRADUATION);
-- ^^ sort of incorrect.

-- Get the minimum of the gpa of each graduation YEAR. 
SELECT date_part('year', graduation) , MIN(gpa) FROM students GROUP BY date_part('year', graduation);

-- Get the distinct gpa's. 
SELECT distinct(gpa) FROM students;

-- How many students have the last name Smith? 
SELECT count(name) FROM students WHERE name LIKE '%Smith'; 