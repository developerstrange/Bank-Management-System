CREATE DATABASE BMS;
USE BMS;

CREATE TABLE signup(
formno VARCHAR(30),
name VARCHAR(40),
fname VARCHAR(40),
dob VARCHAR(30),
gender VARCHAR(30),
email VARCHAR(50),
MS VARCHAR(40),
address VARCHAR(40),
city VARCHAR(40),
pin VARCHAR(40),
state VARCHAR(40),
id VARCHAR(40)
);

SELECT * FROM signup;

CREATE TABLE signupTwo(
formno VARCHAR(30),
rel VARCHAR(40),
cate VARCHAR(40),
income VARCHAR(30),
profession VARCHAR(30),
education VARCHAR(50),
id VARCHAR(40),
scitizen VARCHAR(40),
e_account VARCHAR(40)
);

SELECT * FROM signupTwo;

CREATE TABLE signupThree(
formno VARCHAR(30),
actype VARCHAR(40),
cardno VARCHAR(30),
pin VARCHAR(30),
service VARCHAR(250)
);

SELECT * FROM signupThree;

CREATE TABLE login(
formno VARCHAR(30),
card_number VARCHAR(50),
pin VARCHAR(30)
);

SET SQL_SAFE_UPDATES = 0;
UPDATE login SET card_number = TRIM(card_number), pin = TRIM(pin);

SELECT LENGTH(card_number), LENGTH(pin) FROM login;
SELECT * FROM login;

CREATE TABLE bank(
pin VARCHAR(10),
date VARCHAR(200),
type VARCHAR(20),
amount VARCHAR(30)
);

SELECT * FROM bank;


