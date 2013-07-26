--creates/inserts for teams
create table teams(
	id int NOT NULL,
	name varchar(100),
	cntyId int,
	PRIMARY KEY (id),
	FOREIGN KEY (cntyId) REFERENCES country(id)
);

insert into teams (id, name, cntyId) values (id, 'Saxo-Tinkoff',countryId);
insert into teams (id, name, cntyId) values (id, 'AG2R La Mondiale',countryId);
insert into teams (id, name, cntyId) values (id, 'Radioshack Leopard',countryId);
insert into teams (id, name, cntyId) values (id, 'Movistar',countryId);
insert into teams (id, name, cntyId) values (id, 'Belkin Pro Cycling',countryId);
insert into teams (id, name, cntyId) values (id, 'Katusha',countryId);
insert into teams (id, name, cntyId) values (id, 'Euskaltel-Euskadi',countryId);
insert into teams (id, name, cntyId) values (id, 'Omega Pharma-Quick Step',countryId);
insert into teams (id, name, cntyId) values (id, 'Sky Pro Cycling',countryId);
insert into teams (id, name, cntyId) values (id, 'Cofidis-Solutions Credit',countryId);
insert into teams (id, name, cntyId) values (id, 'Garmin-Sharp',countryId);
insert into teams (id, name, cntyId) values (id, 'BMC Racing Team',countryId);
insert into teams (id, name, cntyId) values (id, 'Europcar',countryId);
insert into teams (id, name, cntyId) values (id, 'FDJ',countryId);
insert into teams (id, name, cntyId) values (id, 'Sojasun',countryId);
insert into teams (id, name, cntyId) values (id, 'Lampre-Merida',countryId);
insert into teams (id, name, cntyId) values (id, 'Vacansoleil-DCM',countryId);
insert into teams (id, name, cntyId) values (id, 'Astana Pro Team',countryId);
insert into teams (id, name, cntyId) values (id, 'Orica Greenedge',countryId);
insert into teams (id, name, cntyId) values (id, 'Lotto-Belisol',countryId);
insert into teams (id, name, cntyId) values (id, 'Argos-Shimano',countryId);
insert into teams (id, name, cntyId) values (id, 'Cannondale Pro Cycling',countryId);

--creates/inserts for country domain table
create table country(
	id int NOT NULL,
	name varchar(200),
	abbr varchar(10),
	flagImgUrl varchar(200),
	PRIMARY KEY (id)
);

insert into country (id, name, abbr, flagImgUrl) values (id , 'United States','USA','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Great Britain','GBR','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Spain','ESP','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Italy','ITA','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Portugal','POR','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Luxembourg','LUX','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Switzerland','SUI','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Germany','GER','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Netherlands','NED','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Slovakia','SVK','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Australia','AUS','/img/flags/flag.jpg');
insert into country (id, name, abbr, flagImgUrl) values (id , 'Austria','AUT','/img/flags/flag.jpg');

--creates/inserts for riders
--url has the easiest formatting to copy/paste
--http://www.cyclingweekly.co.uk/news/latest/539108/tour-de-france-2013-start-list.html
create table riders(
	id int NOT NULL,
	firstName varchar(75),
	lastName varchar(75),
	teamId int,
	cntyId ing,
	PRIMARY KEY (id),
	FOREIGN KEY (teamId) REFERENCES teams(id)
	FOREIGN KEY (cntyId) REFERENCES country(id)
);

insert into riders (id, firstName, lastName, teamId, cntyId) values (1,'Chris','Froome',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('GBr'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (2,'Edvald','Boasson Hagen',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Nor'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (3,'Peter','Kennaugh',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Gbr'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (4,'Vasil','Kiryienka',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Blr'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (5,'David','Lopez',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Esp'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (6,'Richie','Porte',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Aus'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (7,'Kanstantsin','Siutsou',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Blr'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (8,'Ian','Stannard',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Gbr'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (9,'Geraint','Thomas',(select id from teams where name = 'Sky Pro Cycling'),(select id from country where abbr = UPPER('Gbr'));

insert into riders (id, firstName, lastName, teamId, cntyId) values (31,'Cadel','Evans',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Aus'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (32,'Brent','Bookwalter',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('USA'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (33,'Marcus','Burghardt',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Ger'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (34,'Philippe','Gilbert',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Bel'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (35,'Amael','Moinard',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Fra'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (36,'Steve','Morabito',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Sui'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (37,'Manuel','Quinziato',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Ita'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (38,'Michael','Schar',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('Sui'));
insert into riders (id, firstName, lastName, teamId, cntyId) values (39,'Tejay','van Garderen',(select id from teams where name = 'BMC Racing Team'),(select id from country where abbr = UPPER('USA'));


