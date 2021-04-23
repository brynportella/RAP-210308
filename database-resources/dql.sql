-- Use WHERE after from to spefiy which records are returned from the table
SELECT * 
    FROM students
    WHERE gpa > 3.0;

-- Use WHERE .. IN to specify that a value must be contained in a list
SELECT * 
    FROM students
    WHERE name 
    IN ('A', 'B', 'C');

-- Use WHERE BETWEEN to get all records in a certain range
SELECT * 
    FROM students
    WHERE graduation 
    BETWEEN '2021-06-01' AND '2022-05-31';

-- Use LIKE to match a CHAR datatype to a particular value 
-- NOTE % is a wild card
SELECT * 
    FROM students
    WHERE name 
    LIKE 'B%'; 

-- Use IS NULL to find records that don't have a value in the column
SELECT * 
    FROM students
    WHERE graduation 
    IS NULL; 

-- Use COUNT to get the number of records for a particular column
SELECT COUNT(name) 
    FROM students;

-- Use GROUP BY to "group together" values for a particular column
-- This will return the distinct values for graduation
SELECT graduation
    FROM students
    GROUP BY graduation;

-- Use GROUP BY with aggregate functions to find the value accross the group
-- Use COUNT to get the number of records for a particular column
SELECT COUNT(name), graduation
    FROM students
    GROUP BY graduation;

-- Use WHERE before group by to determine which records may factor into the group
-- Use COUNT to get the number of records for a particular column
SELECT COUNT(name), graduation 
    FROM students
    WHERE gpa > 3.0
    GROUP BY graduation;

-- Use HAVING after GROUP BY to limit the groups that the query returns
SELECT COUNT(name), graduation 
    FROM students
    WHERE gpa > 3.0
    GROUP BY graduation
    HAVING COUNT(name) > 2;

-- Use the AS keyword to specify an alias 
-- This will cause the result set to include the grades as the column name
SELECT MAX(gpa) AS grades, 
    graduation 
    FROM students 
    GROUP BY graduation; 

-- Use scalar functions to perform operations on the values of a column
SELECT LOWER(name) 
    FROM students 
    WHERE LOWER(name) LIKE '%a%'; 

-- Use ORDER BY to organize the way in which the data is returned
SELECT MAX(gpa), graduation 
    FROM students 
    GROUP BY graduation 
    HAVING MAX(gpa)<= 2.0 
    ORDER BY graduation ASC; 

-- Use LIMIT after ORDER BY to limit the number of records returned
SELECT MAX(gpa), graduation 
    FROM students 
    GROUP BY graduation 
    HAVING MAX(gpa)<= 2.0 
    ORDER BY graduation ASC
    LIMIT 1;

-- Use OFFSET after LIMIT to modify which records are returned.
 SELECT MAX(gpa), graduation 
    FROM students 
    GROUP BY graduation 
    HAVING MAX(gpa)<= 2.0 
    ORDER BY graduation ASC
    LIMIT 1
    OFFSET 1;