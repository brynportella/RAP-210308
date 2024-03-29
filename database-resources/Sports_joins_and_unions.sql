-- Examples courtesy of Joseph Highe

--JOINS utilize a single query and combine the results by appending the appropriate columns
--INNER:
SELECT p.player_name, t.team_name FROM players AS p INNER JOIN team AS t ON p.team_id = t.team_id;

--OUTER:
/* IN Postgresql the keyword 'AS' is implicitly implied in the FROM statement */
SELECT * FROM players p FULL OUTER JOIN team t ON p.player_id = t.team_id;

--LEFT
SELECT p.PLAYER_ID, p.PLAYER_SALARY, t.TEAM_ID, t.TEAM_SPORT FROM players p LEFT JOIN team t ON p.player_id = t.team_id;

--RIGHT
SELECT * FROM players p RIGHT JOIN team t ON p.player_id = t.team_id;

--SET OPERATIONS will combine two queries and append the rows from the queries into a single result, with records from both tables
--Set operations require the same number of columns queries from each table to properly union, intersect or except
--UNION:
SELECT player_id AS "ID", player_name AS "Name" FROM players UNION SELECT team_id, team_name FROM team;
--SELECT * FROM players UNION SELECT * FROM team; -- This gives an error because team and players have different # of columns
SELECT player_id AS "ID" FROM players UNION SELECT team_id FROM team;

--INTERSECT:
SELECT player_id AS "ID", player_name AS "Name" FROM players INTERSECT SELECT team_id, team_name FROM team;
SELECT player_id AS "ID" FROM players INTERSECT SELECT team_id FROM team;

--Except:
SELECT player_id AS "ID", player_name AS "Name" FROM players EXCEPT SELECT team_id, team_name FROM team;
SELECT team_id AS "ID", team_name AS "Name" FROM team EXCEPT SELECT player_id, player_name FROM players;
SELECT player_id AS "ID" FROM players EXCEPT SELECT team_id FROM team;

--Sub queries:
--Using SELECT AVG(player_salary) FROM players reveals an average salary of about ~590000
SELECT AVG(player_salary) FROM players; -- About 590000
SELECT * FROM players WHERE player_salary > 590000;
SELECT * FROM players WHERE player_salary < 590000;

/*
 * THE TOP OPERATIONS MANUALLY PERFORM A SIMILAR SEARCH TO THE BOTTOM.
 * THE SUBQUERIES BELOW ARE THE PROPER WAY TO EXPRESS THIS IDEA.
 * Sub queries allow you to perform operations without prior knowledge to the information within the database
 * Or simply to consolidate multiple queries into one
*/
SELECT * FROM players WHERE PLAYER_SALARY > (SELECT AVG(PLAYER_SALARY) FROM players);
SELECT * FROM players WHERE PLAYER_SALARY < (SELECT AVG(PLAYER_SALARY) FROM players);

--SELF JOIN : performing a join operation where a table references itself 
--This join matches employees who have the same salary, but not the same id (to remove some redundancy)
SELECT a.emp_name AS numberOne, b.emp_name AS numberTwo, a.emp_salary FROM employees a INNER JOIN employees b ON a.EMP_SALARY = b.EMP_SALARY AND a.EMP_ID <> b.EMP_ID;
SELECT a.emp_name AS Emp1, b.emp_name AS Emp2, a.emp_salary FROM employees a INNER JOIN employees b ON a.EMP_SALARY = b.EMP_SALARY;

/* CROSS JOIN - Perform a cartesian cross product on the values from the tables
 * i.e. match each value from table 1, with each value from table 2.
 */ 
SELECT p.player_name, t.team_name FROM players AS p CROSS JOIN team AS t;
