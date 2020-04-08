-- creates a database corona if it not exists
create database if not exists corona;

-- using corona database for all the queries now
use corona;

-- dropping the table coronadata if already exists
drop table if exists coronadata;

/* creating the table coronadata using database engine 
   as InnoDB which is default from the 5.5.5 version of mysql */
CREATE TABLE `coronadata` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `State` varchar(30) DEFAULT NULL,
  `City` varchar(30) DEFAULT NULL,
  `Male` int(5) DEFAULT NULL,
  `Female` int(5) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

/* inserting values into the coronadata 
   if you left the id field since it has not null 
   and autoIncrement it is automatically incremented by 1 */
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (1, 'Tamilnadu', 'Chennai', 60, 30);
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (2, 'Tamilnadu', 'Coimbatore', 25, 10);
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (3, 'AP', 'Chitoor', 15, 20);
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (4, 'AP', 'Vijayawada', 45, 31);
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (5, 'Kerala', 'Cochin', 75, 45);
insert into `coronadata` (`id`,`State`,`City`,`Male`, `Female`) VALUES (6, 'Kerala', 'Wayanad', 15, 15);

-- selecting all data from the table coronadata
select * from coronadata;
