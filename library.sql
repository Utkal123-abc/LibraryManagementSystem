CREATE DATABASE library;

USE library;

CREATE TABLE books (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    author VARCHAR(255)
);

-- Dropping the table if needed
-- DROP TABLE books;

INSERT INTO books (id, name, author) VALUES
(101, 'Math', 'Rupali'),
(102, 'English', 'Utkal'),
(103, 'Chemistry', 'Kalinga'),
(104, 'Physics', 'Gudu'),
(105, 'Biology', 'Pritam'),
(106, 'Spring-Boot', 'Rahul'),
(107, 'SQL', 'Tiku'),
(108, 'HTML', 'Chotu'),
(109, 'CSS', 'Raza'),
(110, 'Bootstrap', 'Babu');

SELECT * FROM books;
