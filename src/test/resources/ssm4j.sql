CREATE database ssm4j-basic;

CREATE USER 'ssm4j_admin'@'localhost' IDENTIFIED BY 'admin';

GRANT ALL PRIVILEGES ON ssm4j.* TO 'ssm4j_admin'@'localhost' ;

DROP TABLE IF EXISTS 'user';

CREATE TABLE user (
  _id INTEGER NOT NULL COMMENT 'id',
  _name VARCHAR(30) NOT NULL COMMENT 'name',
  _password VARCHAR(100) NOT NULL COMMENT 'password',
  _email VARCHAR(100) NOT NULL COMMENT 'email',
  content VARCHAR(200) COMMENT 'content'
);

INSERT INTO user  (user._id,user._name,user._password, user._email, user.content)
  value (45, 'Jason', '------','jasonchan9280@gmail.com','test data');

SELECT  * from user t where t._id = 45;

ALTER TABLE user add CONSTRAINT PK_test_table PRIMARY KEY (_id, _name ,_password, _email)