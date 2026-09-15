-- Database: hospital_db
CREATE DATABASE hospital_db;
USE hospital_db;

-- Table for Exercise 1
CREATE TABLE users (
    id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) NOT NULL,
    password VARCHAR(50) NOT NULL
);
INSERT INTO users (username, password) VALUES ('admin', 'admin123');

-- Table for Exercise 2
CREATE TABLE hospital_staff (
    id INT PRIMARY KEY AUTO_INCREMENT,
    staff_id VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(50) NOT NULL,
    role VARCHAR(20) NOT NULL -- 'Doctor' or 'Nurse'
);
INSERT INTO hospital_staff (staff_id, password, role) VALUES 
('DOC101', 'docpass', 'Doctor'),
('NUR201', 'nurpass', 'Nurse');

CREATE TABLE employee (
    emp_id INT,
    name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

INSERT INTO employee VALUES
(101, 'Rahul', 'IT', 50000),
(102, 'Amit', 'HR', 45000),
(103, 'Neha', 'Finance', 55000);

SELECT * FROM employee;