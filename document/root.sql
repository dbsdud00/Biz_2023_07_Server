CREATE DATABASE bookDB;
use bookDB;
truncate tbl_books;
CREATE TABLE tbl_books (
	b_code	VARCHAR(6)		PRIMARY KEY,
b_name	VARCHAR(125)	NOT NULL	,
b_auther	VARCHAR(125)	NOT NULL	,
b_comp	VARCHAR(125)		,
b_year	INT	NOT NULL	,
b_iprice	INT		,
b_rprice	INT	NOT NULL	
);
CREATE TABLE tbl_users (
u_code	VARCHAR(6)		PRIMARY KEY,
u_name	VARCHAR(125)	NOT NULL	,
u_tel	VARCHAR(125)		,
u_addr	VARCHAR(125)		

);
DROP TABLE tbl_rent_book;
CREATE TABLE tbl_rent_book (
rent_seq	BIGINT		PRIMARY KEY AUTO_INCREMENT,
rent_date	VARCHAR(30)	NOT NULL	,
rent_return_date	VARCHAR(10)	NOT NULL	,
rent_bcode	VARCHAR(6)	NOT NULL	,
rent_ucode	VARCHAR(6)	NOT NULL	,
rent_return_yn	VARCHAR(1)		,
rent_point	INT		
);
INSERT INTO tbl_books(
b_code,b_name,b_auther,b_comp,b_year,b_iprice,b_rprice)
VALUES(
'000001','윤영','윤영','한빛',2000,20000,20000
);

INSERT INTO tbl_users(
u_code,u_name,u_tel,u_addr)
VALUES(
'U00001','최윤영','010-1111-1111','광주'
);
SELECT * FROM tbl_users;

SELECT * FROM tbl_books;
ALTER TABLE tbl_rent_book
ADD CONSTRAINT FK_BOOKS FOREIGN KEY(rent_bcode) 
REFERENCES tbl_books(b_code);

ALTER TABLE tbl_rent_book
ADD CONSTRAINT FK_USERS FOREIGN KEY(rent_ucode) 
REFERENCES tbl_users(u_code);

SELECT * FROM tbl_books
WHERE b_code='000001';

SELECT * FROM tbl_books
WHERE b_name='000001';

UPDATE tbl_books
SET b_name='책이름',
	b_auther='저자',
    b_comp='출판사',
    b_year=2010,
    b_iprice=20001,
    b_rprice=1000
WHERE b_code = '000001';

	
DELETE FROM tbl_books
WHERE b_code='000002';

UPDATE tbl_users
SET u_name='윤영',
	u_tel='010-1234-1234',
    u_addr= '순천'
WHERE u_code = 'U00001';


SELECT * FROM tbl_rent_book;




SELECT  COUNT(*) FROM tbl_users
GROUP BY u_name, u_tel
HAVING COUNT(*) > 1;






