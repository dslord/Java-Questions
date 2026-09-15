CREATE DATABASE college;
CREATE DATABASE shop;

USE college;

CREATE TABLE student (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    course VARCHAR(50)
);

INSERT INTO student VALUES
(1, 'Devansh', 'BCA'),
(2, 'Rahul', 'BCA'),
(3, 'Aman', 'BCA');

USE shop;

CREATE TABLE product (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    quantity INT,
    price DOUBLE
);

INSERT INTO product VALUES
(101, 'Laptop', 5, 55000),
(102, 'Mouse', 20, 700),
(103, 'Keyboard', 10, 1200);