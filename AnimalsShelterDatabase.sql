CREATE SCHEMA `animalsshelter` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE animalsshelter;

CREATE TABLE `medical_state` (
  `medical_state_id` int(11) NOT NULL AUTO_INCREMENT,
  `medical_state_name` varchar(20) NOT NULL,
  `comments` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`medical_state_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `clients_info` (
  `membership_id` int(11) NOT NULL AUTO_INCREMENT,
  `clients_id` varchar(20) NOT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `birth_date` date NOT NULL,
  `phone_number` varchar(20) NOT NULL,
  `adress` varchar(60) NOT NULL,
  `email` varchar(45) NOT NULL,
  `medical_state` int(11) NOT NULL,
  PRIMARY KEY (`membership_id`,`clients_id`),
  UNIQUE KEY `clients_id_UNIQUE` (`clients_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `species` (
  `specie_id` int(11) NOT NULL AUTO_INCREMENT,
  `specie_name` varchar(20) NOT NULL,
  PRIMARY KEY (`specie_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `breeds` (
  `brees_id` int(11) NOT NULL AUTO_INCREMENT,
  `specieID` int(11) NOT NULL,
  `breed_name` varchar(45) NOT NULL,
  PRIMARY KEY (`brees_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `pets` (
  `pet_id` int(11) NOT NULL AUTO_INCREMENT,
  `specie_id` int(11) NOT NULL,
  `breed_id` int(11) NOT NULL,
  `pet_name` varchar(50) NOT NULL,
  `birth_date` date DEFAULT NULL,
  `gender` varchar(10) NOT NULL,
  `size` varchar(15) NOT NULL,
  `color` varchar(20) NOT NULL,
  ` intake_date` date NOT NULL,
  `adoption_state` tinyint(4) NOT NULL DEFAULT '0',
  `adoption_date` date DEFAULT NULL,
  PRIMARY KEY (`pet_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `employees_info` (
  `employee_id` int(11) NOT NULL,
  `employee_name` varchar(45) NOT NULL,
  `employee_email` varchar(45) NOT NULL,
  `employee_password` varchar(15) NOT NULL,
  PRIMARY KEY (`employee_id`),
  UNIQUE KEY `employee_password_UNIQUE` (`employee_password`),
  UNIQUE KEY `employee_email_UNIQUE` (`employee_email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `adoption_data` (
  `adoption_id` int(11) NOT NULL AUTO_INCREMENT,
  `adoption_date` date NOT NULL,
  `employee_id` int(11) NOT NULL,
  `membershipID` int(11) NOT NULL,
  `adapter_first_name` varchar(45) NOT NULL,
  `adapter_last_name` varchar(45) NOT NULL,
  `adapter_medical_state` varchar(20) NOT NULL,
  `petID` int(11) NOT NULL,
  `pet_name` varchar(50) NOT NULL,
  `specie` varchar(20) NOT NULL,
  `breed` varchar(30) NOT NULL,
  PRIMARY KEY (`adoption_id`),
  KEY `pet_name_idx` (`pet_name`),
  KEY `pet_specie_idx` (`specie`),
  KEY `pet_breed_idx` (`breed`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

INSERT INTO species 
VALUES  (1 ,'Dog'),
		(2 ,'Cat'),
        (3 ,'Bird'),
		(4 ,'Rabbit');

INSERT INTO breeds (specieID,breed_name)
VALUES (1 , 'Afador'),
	   (1 , 'Affenpinscher'),
       (1 , 'Alaskan Klee Kai'),
       (1 , 'Origi'),
       (1 , 'valverde'),
       (1 , 'Auggie'),
       (1 , 'Beagle'),
       (1 , 'Belgian'),
       (1 , 'Cavapoo'),
       (1 , 'Daniff'),
      ( 1 , 'BOXER'),
       (1 , 'Docker'),
       (1 , 'Doxle'),
       (1 , 'French Terrier'),
       (1 , 'Gordon'),
       (1 , 'Goldendoodle'),
       (1 , 'Irish Wolfhound'),
       (1 , 'Lowchen'),
       (1 , 'pitsky'),
       (2 , 'Abyssinaian Cat '),
       (2 , 'American curl cat '),
       (2 , 'Origi'),
       (2 , 'valverde'),
       (2 , 'Bengal'),
       (2 , 'Birman Cat '),
       (2 , 'Burmese Cat '),
       (2 , 'Chartreux Cat '),
       (2 , 'Egyption Mau Cat '),
       (2 , 'Devoon Rex Cat '),
       (2 , 'Himalayan Cat '),
       (2 , 'Japanese Bobtail Cat'),
       (2 , 'Maine Coon Cat '),
       (2 , 'Manx'),
       (2 , 'Oriental Cat '),
       (2 , 'Persian Cat'),
       (2 , 'Ragamuffin Cat'),
       (2 , 'Scottish Fold Cat '),
       (3 , 'Cockatoo'),
	   (3 , 'African Gray'),
       (3 , 'Amazon'),
       (3 , 'Cockatiel'),
       (3 , 'Macaw'),
	   (4 , 'Lionhead Rabbit '),
	   (4 , 'Flemish Giant '),
       (4 , 'Flemish Giant '),
       (4 , 'Origi'),
       (4 , 'valverde'),
       (4 , 'Continental Giant'),
       (4 , 'Netherland Dwarf '),
       (4 , 'Dutch Rabbit '),
       (4 , 'English Lop '),
       (4 , 'French Lop '),
       (4 , 'Mini Rex '),
       (4 , 'American Rabbit '),
       (4 , 'Californian Rabbit'),
       (4 , 'Beveren Rabbitt '),
       (4 , 'American Fuzzy Lop Rabbit'),
       (4 , 'American Sable Rabbit '),
       (4 , 'Mini Rex'),
       (4 , 'American Fuzzy Lop'),
       (4 , 'Argente Brun ');


INSERT INTO pets 
values  (1 , 1 , 1 , 'Kashmir' , '2013-05-13' , 'Female' , 'Large' , 'Black/White' , '2019-09-16' , DEFAULT , DEFAULT) ,
		(2 , 1 , 3 , 'Floyd' , '2015-06-24' , 'Male' , 'Medium' , 'Tan/White' , '2019-01-02' , DEFAULT , DEFAULT) ,
	    (3 , 1 , 3 , 'Toby' , '2018-05-31' , 'Male' , 'Medium' , 'Tan' , '2019-07-26' , DEFAULT , DEFAULT) ,
		(4 , 1 , 2 , 'Bones' , '2013-12-05' , 'Male' , 'Large' , 'White/Brown' , '2019-03-08' , DEFAULT , DEFAULT) ,
		(5 , 1 , 4 , 'Gibby' , '2017-03-14' , 'Male' , 'Medium' , 'White/Black' , '2019-03-14' , DEFAULT , DEFAULT) ,
		(6 , 1 , 5 , 'Diamond' , '2017-11-11' , 'Female' , 'Medium' , 'Tan/White' , '2019-06-05' , DEFAULT , DEFAULT) ,
		(7 , 1 , 6 , 'Rocky' , '2018-08-08' , 'Male' , 'Large' , 'White' , '2019-08-06' , DEFAULT , DEFAULT) ,
		(8 , 1 , 7 , 'Hamilton' , '2017-09-1' , 'Male' , 'Medium' , 'Wheaten/Black' , '2019-07-17' , DEFAULT , DEFAULT) ,
		(9 , 1 , 8 , 'Cambria' , '2018-10-31' , 'Female' , 'Medium' , 'Tan/Black' , '2019-08-25' , DEFAULT , DEFAULT) ,
		(10 , 1 , 9 , 'Hank' , '2017-09-29' , 'Male' , 'Medium' , 'White/Brown' , '2019-09-22' , DEFAULT , DEFAULT) ,
		(11 , 1 , 10 , 'June' , '2018-09-26' , 'Female' , 'Medium' , 'Golden' , '2019-09-22' , DEFAULT , DEFAULT) ,
		(12 , 1 , 11 , 'Wren' , '2018-12-23' , 'Female' , 'Medium' , 'Black/White' , '2019-07-11' , DEFAULT , DEFAULT) ,
		(13 , 1 , 12 , 'Myrtle' , '2019-03-19' , 'Female' , 'Medium' , 'Tan/White' , '2019-11-17' , DEFAULT , DEFAULT) ,
		(14 , 1 , 5 , 'Remi' , '2017-12-13' , 'Female' , 'Medium' , 'White' , '2019-07-17' , DEFAULT , DEFAULT) ,
		(15 , 1 , 9 , 'Libby' , '2016-05-27' , 'Female' , 'Medium' , 'Chocolate' , '2019-11-17' , DEFAULT , DEFAULT) ,
		(16 , 1 , 1 , 'Patsy' , '2018-05-24' , 'Female' , 'Small' , 'Brindle' , '2019-11-17' , DEFAULT , DEFAULT) ,
		(17 , 1 , 2 , 'Baler' , '2018-06-21' , 'Female' , 'Medium' , 'Black/White' , '2019-10-17' , DEFAULT , DEFAULT) ,
		(18 , 1 , 7 , 'Ruger' , '2018-11-06' , 'Male' , 'Medium' , 'Black/White' , '2019-03-25' , DEFAULT , DEFAULT) ,
		(19 , 1 , 6 , 'Jack' , '2017-12-17' , 'Male' , 'Small' , 'White/Brown' , '2018-07-28' , DEFAULT , DEFAULT) ,
		(20 , 1 , 6 , 'Jade' , '2019-06-05' , 'Female' , 'Medium' , 'Grey' , '2019-10-24' , DEFAULT , DEFAULT) ,
		(21 , 1 , 10 , 'Franklin' , '2018-05-21' , 'Male' , 'Medium' , 'Grey/White' , '2018-12-30' , DEFAULT , DEFAULT) ,
		(22 , 1 , 11 , 'Schroeder' , '2019-04-18' , 'Male' , 'Medium' , 'Brindle' , '2019-11-04' , DEFAULT , DEFAULT) ,
		(23 , 2 , 20 , 'Snowflake' , '2013-05-29' , 'Female' , 'Small' , 'White' , '2016-07-24' , DEFAULT , DEFAULT) ,
		(24 , 2 , 22 , 'Hinata' , '2012-05-13' , 'Female' , 'Large' , 'White' , '2017-07-12' , DEFAULT , DEFAULT) ,
		(25 , 2 , 21 , 'Floris' , '2013-03-01' , 'Female' , 'Small' , 'Grey/Orange' , '2019-06-01' , DEFAULT , DEFAULT) ,
		(26 , 2 , 23 , 'Zoey' , '2011-10-02' , 'Female' , 'Medium' , 'Black/Grey' , '2016-04-14' , DEFAULT , DEFAULT) ,
		(27 , 2 , 24 , 'Sugar' , '2013-02-01' , 'Female' , 'Large' , 'White/Orange' , '2018-01-31' , DEFAULT , DEFAULT) ,
		(28 , 2 , 25 , 'Sadie' , '2015-12-06' , 'Female' , 'Medium' , 'Black/White' , '2018-05-06' , DEFAULT , DEFAULT) ,
		(29 , 2 , 26 , 'Friskie' , '2009-08-17' , 'Female' , 'Large' , 'Orange/Red' , '2018-08-07' , DEFAULT , DEFAULT) ,
		(30 , 2 , 27 , 'Pearl' , '2018-02-23' , 'Male' , 'Small' , 'Grey/Black' , '2019-02-13' , DEFAULT , DEFAULT) ,
		(31 , 2 , 28 , 'Curtis' , '2017-04-28' , 'Male' , 'Large' , 'Orange' , '2019-03-27' , DEFAULT , DEFAULT) ,
		(32 , 2 , 29 , 'Leo' , '2009-08-17' , 'Male' , 'Large' , 'Brown/Black' , '2019-04-23' , DEFAULT , DEFAULT) ,
		(33 , 2 , 30 , 'Fawn' , '2019-12-01' , 'Female' , 'Small' , 'Black/Tan' , '2019-05-15' , DEFAULT , DEFAULT) ,
		(34 , 2 , 31 , 'Percy Jackson' , '2009-08-17' , 'Female' , 'Small' , 'Brown/Black' , '2019-06-12' , DEFAULT , DEFAULT) ,
		(35 , 2 , 32 , 'Oscar' , '2019-04-02' , 'Male' , 'Small' , 'Grey' , '2019-10-27' , DEFAULT , DEFAULT) ,
		(36 , 2 , 33 , 'Layla' , '2019-05-30' , 'Female' , 'Small' , 'Grey' , '2019-06-30' , DEFAULT , DEFAULT) ,
		(37 , 2 , 34 , 'Bugsy' , '2014-10-31' , 'Male' , 'Medium' , 'Black' , '2019-10-30' , DEFAULT , DEFAULT) ,
		(38 , 2 , 35 , 'Pixie Bob' , '2019-08-17' , 'Female' , 'Medium' , 'White' , '2019-10-30' , DEFAULT , DEFAULT) ,
		(39 , 2 , 36 , 'Molly' , '2009-08-17' , 'Female' , 'Large' , 'Orange/Red' , '2018-08-07' , DEFAULT , DEFAULT),
		(40 , 4 , 43 , 'Orgi' , '2014-04-14' , 'Female' , 'Large' , 'Black/White' , '2019-09-16' , DEFAULT , DEFAULT) ,
		(41 , 4 , 45 , 'Valverdi ' , '2011-09-22' , 'Male' , 'Medium' , 'Tan/White' , '2019-01-02' , DEFAULT , DEFAULT) ,
	    (42 , 4 , 48 , 'Romos' , '2014-07-1' , 'Male' , 'Medium' , 'Tan' , '2019-07-26' , DEFAULT , DEFAULT) ,
		(43 , 4 , 49 , 'Faty' , '2016-02-15' , 'Male' , 'Large' , 'White/Brown' , '2019-03-08' , DEFAULT , DEFAULT) ,
		(44 , 4 , 51 , 'Max' , '2015-05-14' , 'Male' , 'Medium' , 'White/Black' , '2019-03-14' , DEFAULT , DEFAULT) ,
		(45 , 4 , 53 , 'Rock' , '2016-12-11' , 'Female' , 'Medium' , 'Tan/White' , '2019-06-05' , DEFAULT , DEFAULT) ,
		(46 , 4 , 52 , 'Paco' , '2015-04-02' , 'Male' , 'Large' , 'White' , '2019-08-06' , DEFAULT , DEFAULT) ,
		(47 , 4 ,46 , 'Suraze' , '2016-03-01' , 'Male' , 'Medium' , 'Wheaten/Black' , '2019-07-17' , DEFAULT , DEFAULT) ,
		(48 , 4 , 56 , 'Mane' , '2014-04-21' , 'Female' , 'Medium' , 'Tan/Black' , '2019-08-25' , DEFAULT , DEFAULT) ,
		(49 , 4 , 59 , 'Kane' , '2016-09-23' , 'Male' , 'Medium' , 'White/Brown' , '2019-09-22' , DEFAULT , DEFAULT) ,
		(50 , 4 , 60 , 'Diego' , '2014-07-26' , 'Female' , 'Medium' , 'Golden' , '2019-09-22' , DEFAULT , DEFAULT) ,
		(51 , 3 , 39 , 'Zeus' , '2018-07-12' , 'Male' , 'Medium' , 'Gray' , '2015-07-22' , DEFAULT , DEFAULT) ,
		(52 , 3 , 40 , 'Rico' , '2015-09-23' , 'Male' , 'Medium' , 'Green' , '2016-09-30' , DEFAULT , DEFAULT) ,
		(53 , 3 , 41 , 'Gabe' , '2017-10-09' , 'Male' , 'Medium' , 'Gray' , '2018-09-09' , DEFAULT , DEFAULT) ,
		(54 , 3 , 38 , 'Clancy' , '2014-11-06' , 'Female' , 'Medium' , 'Golden' , '2019-08-11' , DEFAULT , DEFAULT) ,
		(55 , 3 , 42 , 'Suraze' , '2014-12-2' , 'Female' , 'Medium' , 'White' , '2017-05-13' , DEFAULT , DEFAULT);

INSERT INTO employees_info 
VALUES  (22090, 'Paula D. Williams', 'PaulaDWilliams@dayrep.com', 'zieLae5vah8'),
		(23502, 'Frank B. Gibbs', 'FrankBGibbs@jourrapide.com', 'oiXiGh9oh'),
        (31210, 'James J. Hunter', 'JamesJHunter@dayrep.com', 'Yahnachoh2oh'),
        (45236, 'Joe G. Harrison', 'JoeGHarrison@jourrapide.com', 'eeneF7mei'),
        (60606, 'Mary C. Fultz', 'MaryCFultz@jourrapide.com', 'ahN2web9jihoo');
        
INSERT INTO adoption_data 
VALUES  (1,'2019-11-29',45236, 1, 'Babara', 'MacCaffrey', 'No allergy', 30972824, 'Floris','Cat','Domestic Shorthair'),
		(2,'2019-12-5',45236, 5, 'Freddi', 'Boagey', 'No allergy', 41067440, 'Gibby','Dog','Terrier'),
        (3,'2019-12-5',45236 ,2, 'Ines', 'Brushfield', 'No allergy', 37738078, 'Sugar','Cat','Domestic Shorthair' );
        
INSERT INTO medical_state 
VALUES  (1,'No allergy',DEFAULT),
		(2,'Dog allergy',DEFAULT),
        (3,'Cat allergy',DEFAULT);
        
INSERT INTO `clients_info` 
VALUES  (1,2001014800086,'Babara','MacCaffrey','1986-03-28','781-932-9754','0 Sage Terrace','xjavid.satary8@lilittka.tk',1),
		(2,2002124800081,'Ines','Brushfield','1986-04-13','804-427-9456','14187 Commercial Trail','whakm.alnasryb@domainaing.ml',1),
		(3,2009064800088,'Freddi','Boagey','1985-02-07','719-724-7869','251 Springs Junction','xhearthacker456m@tvoe-videohd.ru',1),
		(4,2310144800084,'Ambur','Roseburgh','1974-04-14','407-231-8017','30 Arapahoe Terrace','fknzalmarf8@mamkinarbuzer.ga',1),
		(5,3002294800084,'Clemmie','Betchley','1973-11-07',478-477-3067,'5 Spohn Circle','graba@karturoyalking.com',1),
		(6,2505194800088,'Elka','Twiddell','1991-09-04','312-480-8498','7 Manley Drive','cemmey3@securityinsight.net',1),
		(7,2006154800085,'Ilene','Dowson','1964-08-30','615-641-4759','50 Lillian Crossing','6mackmast243q@begisobaka.ga',1),
		(8,2803165800082,'Thacher','Naseby','1993-07-17','941-527-3977','538 Mosinee Center','9rodrigo.robert.y@2xd.ru',1),
		(9,2712055800088,'Romola','Rumgay','1992-05-23','559-181-3744','3520 Ohio Trail','bmiruna.constant3@yjav32.com',1),
		(10,2204105800086,'Levy','Mynett','1969-10-13','404-246-3370','68 Lawn Avenue','3javad.safaripou2@ratcher5648.tk',1);