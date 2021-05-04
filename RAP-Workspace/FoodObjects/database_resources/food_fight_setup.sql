create table player(
	player_id SERIAL,
	name VARCHAR(20) not null, 
	stamina INTEGER, 
	cleanliness INTEGER,
	primary key(player_id)
); 

create table food_item_type(
	type_id SERIAL, 
	type_of_food VARCHAR(20), 
	primary key(type_id)
); 

create table food_item(
	food_item_id SERIAL, 
	player_id integer references player(player_id) 
		on delete cascade,
	type_id integer references food_item_type(type_id)
		on delete cascade,
	cost decimal,
	primary key(food_item_id)
); 