SELECT * FROM dojos_and_ninjas_schema.dojos;
SELECT * FROM dojos_and_ninjas_schema.ninjas;


-- Create 3 new dojos
INSERT INTO dojos (name) 
VALUES 
	('Dojo1'), 
	('Dojo2'), 
    ('Dojo3');

-- Query: Delete the 3 dojos you just created
SET SQL_SAFE_UPDATES = 0;
DELETE FROM dojos WHERE name IN ('Dojo1', 'Dojo2', 'Dojo3');

-- Query: Create 3 more dojos
INSERT INTO dojos (name) 
VALUES 
	('Dojo4'), 
	('Dojo5'), 
	('Dojo6');

-- Query: Create 3 ninjas that belong to the first dojo
INSERT INTO ninjas (first_name, last_name, age, dojo_id) 
VALUES 
	('Oussama','Bellamine', '27', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1)),
	('AZIZ','Kouki', '23', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1)),
	('Muftah','Alabar', '33', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1));

-- Query: Create 3 ninjas that belong to the second dojo
INSERT INTO ninjas (first_name, last_name, age, dojo_id) 
VALUES 
	('ahmed','sakly', '24', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1,1)),
	('Ala','Debabi', '34', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1,1)),
	('Amine','Kraim', '31', (SELECT id FROM dojos ORDER BY id ASC LIMIT 1,1));
    
-- Query: Create 3 ninjas that belong to the third dojo
INSERT INTO ninjas (first_name, last_name, age, dojo_id) 
VALUES 
	('Siwar','Benromthan', '20', (SELECT id FROM dojos ORDER BY id DESC LIMIT 1)),
	('Haifa','Trimech', '21', (SELECT id FROM dojos ORDER BY id DESC LIMIT 1)),
	('Farah','Rasas', '22', (SELECT id FROM dojos ORDER BY id DESC LIMIT 1));
    
-- Query: Retrieve all the ninjas from the first dojo
SELECT * FROM ninjas 
WHERE dojo_id = (SELECT id FROM dojos ORDER BY id ASC LIMIT 1);

-- Query: Retrieve all the ninjas from the last dojo
SELECT * FROM ninjas 
WHERE dojo_id = (SELECT id FROM dojos ORDER BY id DESC LIMIT 1);

-- Query: Retrieve the last ninja's dojo
SELECT * FROM dojos 
JOIN ninjas ON dojos.id = ninjas.dojo_id 
ORDER BY ninjas.id DESC LIMIT 1;

/* 
Query: Use a JOIN to retrieve the ninja with id 6  as well as the data from its dojo.
Be sure to do this in one query using a join statement. 
 */
SELECT ninjas.*, dojos.name AS dojo_name FROM ninjas
JOIN dojos ON ninjas.dojo_id = dojos.id 
WHERE ninjas.id = 6;

/*
Query: Use a JOIN to retrieve all the ninjas as well as that ninja's dojo,
note, you will see repeated data on dojos as a dojo can have many ninjas!
*/
SELECT ninjas.*, dojos.name FROM ninjas
JOIN dojos ON ninjas.dojo_id = dojos.id;



















