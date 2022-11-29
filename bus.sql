create database db;
use db;
CREATE TABLE busdatabase (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `busno` int(10) NOT NULL,
  `journey` varchar(80) DEFAULT NULL,
  `duration` int(11) DEFAULT NULL,
  `seats` int(11) DEFAULT NULL CHECK(seats>-1),
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;

/*
TRUNCATE TABLE busdatabase;
*/
insert into busdatabase values(1,1,'Bangalore to Mumbai',15,60);
insert into busdatabase values(2,2,'Bangalore to Hyderabad',9,60);
insert into busdatabase values(3,3,'Bangalore to Kochi',10,60);
insert into busdatabase values(4,4,'Bangalore to Mysore',4,60);
insert into busdatabase values(5,5,'Bangalore to Chennai',7,60);

select * from busdatabase;