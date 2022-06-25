DROP TABLE IF EXISTS Employee;

CREATE TABLE Employee (
	emp_id INT AUTO_INCREMENT PRIMARY KEY,
	emp_first_name VARCHAR(250) NOT NULL,
	emp_last_name VARCHAR(250) NOT NULL,
	emp_role VARCHAR(250) DEFAULT NULL
	);
	
INSERT INTO Employee(emp_first_name,emp_last_name,emp_role) VALUES
	('AK','Gupta','Backend Dev'),
	('Ravi','Ranjan','Junior Dev'),
	('AL','Sharma','Senior Dev'); 