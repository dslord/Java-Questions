USE hospital_db;

CREATE TABLE books (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

CREATE TABLE book_issue (
    book_id INT,
    student_name VARCHAR(100),
    issue_date DATE,
    return_date DATE
);