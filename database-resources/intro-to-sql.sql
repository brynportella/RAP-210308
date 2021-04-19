-- Delete whole table 
DROP TABLE IF EXISTS students;

-- Create table 
CREATE TABLE students(
    id BIGINT,
    name VARCHAR(20),
    gpa DECIMAL,
    PRIMARY KEY (id)
);

/*
create table students(
    id bigint,
    name varchar(20),
    gpa decimal,
    constraint students_pk primary key (id)
)

*/

-- Insert into table
INSERT INTO students(id, name, gpa) VALUES (1, 'A', 4.0);
INSERT INTO students(id, name, gpa) VALUES (2, 'B', 3.7);
INSERT INTO students(id, name, gpa) VALUES (3, 'C', 2.0);
INSERT INTO students(id, name, gpa) VALUES (4, 'D', 3.9);
INSERT INTO students(id, name, gpa) VALUES (5, 'E', 2.5);
INSERT INTO students(id, name, gpa) VALUES (6, 'F', 3.0);

-- Delete all records from table
DELETE FROM students;

-- Update records in table
UPDATE students SET gpa = 4.0;

-- Select all records in a table 
SELECT * FROM students; 

-- Alter table 
-- Add a column
ALTER TABLE students ADD COLUMN graduation DATE;
-- Delete a column
ALTER TABLE students DROP COLUMN IF EXISTS graduation;

-- Truncate table 
TRUNCATE TABLE students;

-- Comment on an object 
COMMENT ON TABLE students IS 'Information about students in school abc';

-- Remove a comment on an object 
COMMENT ON TABLE students IS NULL;
