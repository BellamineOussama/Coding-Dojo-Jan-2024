SELECT * FROM mysql_workbench_setup.names;
INSERT INTO names (name)
VALUE ('oussama');

INSERT INTO names (name)
VALUE 
	('ahmed'),
	('ala'),
	('wael');

UPDATE names 
SET name = 'amine'
WHERE id = 2;

DELETE FROM names
WHERE id = 2;