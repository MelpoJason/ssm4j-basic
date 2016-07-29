CREATE database ssm4j-basic;

CREATE USER 'ssm4j_admin'@'localhost' IDENTIFIED BY 'admin';

GRANT ALL PRIVILEGES ON ssm4j.* TO 'ssm4j_admin'@'localhost' ;

DROP TABLE IF EXISTS 'user';

create table test_table
(
  _id INTEGER NOT NULL COMMENT 'user id',
  _name varchar(30) NOT NULL COMMENT 'user name',
  context VARCHAR(100) COMMENT 'user context'
);

ALTER TABLE test_table ADD CONSTRAINT PK_TEST_TABLE PRIMARY KEY (_id,_name);

INSERT INTO test_table tt (tt._id, tt._name) VALUES (01,'jason');