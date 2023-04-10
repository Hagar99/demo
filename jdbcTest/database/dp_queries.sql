
DROP DATABASE if EXISTS jdbcTest_db;

CREATE DATABASE jdbcTest_db;

USE jdbcTest_db;

CREATE TABLE employee(
    id INT (15) PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(30),
    gender BOOLEAN,
    birth_date DATE,
    salary REAL    
);