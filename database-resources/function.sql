CREATE OR REPLACE function new_employee(
	 e_username TEXT , 
	 e_name TEXT,
	 e_password TEXT
)
RETURNS INTEGER
AS $$
DECLARE e_user_id INTEGER;
BEGIN
	INSERT INTO user_food_fight(
		username,
		name,
		password
	) VALUES(
		e_username,
		e_name,
		e_password
	);

	SELECT user_id INTO e_user_id FROM user_food_fight
	WHERE name = e_name AND 
	username = e_username AND 
	PASSWORD = e_password; 
	
	INSERT INTO employee(user_id) VALUES(e_user_id); 
	RETURN e_user_id;
END;
$$ LANGUAGE plpgsql; 


SELECT * FROM employee e JOIN user_food_fight u ON u.user_id = e.user_id;