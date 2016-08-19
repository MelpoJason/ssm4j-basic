CREATE database ssm4j-basic;

CREATE USER 'ssm4j_admin'@'localhost' IDENTIFIED BY 'admin';

GRANT ALL PRIVILEGES ON ssm4j.* TO 'ssm4j_admin'@'localhost' ;

DROP TABLE IF EXISTS 'users';

CREATE TABLE users (
  _id INTEGER NOT NULL COMMENT 'id',
  _name VARCHAR(30) NOT NULL COMMENT 'name',
  _password VARCHAR(100) NOT NULL COMMENT 'password',
  _email VARCHAR(100) NOT NULL COMMENT 'email',
  state BOOLEAN NOT NULL COMMENT 'state',
  createDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP() ON UPDATE CURRENT_TIMESTAMP() COMMENT 'create date',
  content VARCHAR(200) COMMENT 'content'
);

INSERT INTO users  (users._id,users._name,users._password, users._email, users.state,users.createDate,users.content)
  value (45, 'Jason', '------','jasonchan9280@gmail.com', TRUE , now(),'test data');

ALTER TABLE users add CONSTRAINT PK_test_table PRIMARY KEY (_id, _name ,_password, _email, state);