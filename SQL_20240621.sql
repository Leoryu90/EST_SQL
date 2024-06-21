-- use test_db;
-- CREATE TABLE students (
--     name VARCHAR(255) NOT NULL,
--     age INT NOT NULL,
--     address VARCHAR(255) NOT NULL
-- );
-- INSERT INTO students (name, age, address) VALUES
-- ('이황', 28, '경상북도'),
-- ('정약용', 29, '경기도'),
-- ('김정호', 30, '전라북도'),
-- ('박지원', 31, '전라북도'),
-- ('김홍도', 32, '경기도'),
-- ('신윤복', 33, '서울특별시'),
-- ('김광균', 34, '서울특별시'),
-- ('한용운', 35, '경상남도'),
-- ('박두진', 36, '경기도');

-- CREATE TABLE classes (
--   name VARCHAR(255) NOT NULL,
--   class_name VARCHAR(255) NOT NULL
-- );

-- INSERT INTO classes (name, class_name) VALUES
-- ('이황', '데이터베이스'),
-- ('이황', '알고리즘'),
-- ('정약용', '데이터베이스'),
-- ('김정호', '자료구조'),
-- ('박지원', '데이터베이스'),
-- ('김홍도', '알고리즘'),
-- ('신윤복', '자료구조'),
-- ('신윤복', '알고리즘'),
-- ('김광균', '데이터베이스'),
-- ('김광균', '자료구조'),
-- ('김광균', '알고리즘');

-- select * from students;
-- select * from classes 

-- select name, age
-- from students;

-- select name AS col1, age AS col2
-- from students;

-- select *
-- from students
-- where age >= 30;

-- INSERT INTO students (name, age, address)
-- VALUES ('김나박이', 40, '서울특별시');

-- select *
-- from students
-- where name = '김나박이';

-- drop table students

-- CREATE TABLE students (
--   name VARCHAR(255) ,
--   age INT ,
--   address VARCHAR(255));
  
--   INSERT INTO students (name, age, address) VALUES
-- ('이황', 28, '경상북도'),
-- ('정약용', 29, '경기도'),
-- ('김정호', 30, '전라북도'),
-- ('박지원', 31, '전라북도'),
-- ('김홍도', 32, '경기도'),
-- ('신윤복', 33, '서울특별시'),
-- ('김광균', 34, '서울특별시'),
-- ('한용운', 35, '경상남도'),
-- ('박두진', 36, '경기도');

-- INSERT INTO students (name, age)
-- VALUES ('유석호', 150);

-- INSERT INTO students
-- VALUES ('유석호1', 11, '미국'), ('류석호2', 22, '영국'), ('유턱코', 33, '서울');

-- insert into students (name, age, address)
-- select name, age, address from students where age <30;

-- SET SQL_SAFE_UPDATES = 0;

-- update students
-- set address = '우주'
-- where age <= 30;

-- DELETE
-- FROM students
-- WHERE age =28;

select *
from students