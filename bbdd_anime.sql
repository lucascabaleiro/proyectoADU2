drop database anime;
create database anime;
use anime;
create table animes (
titulo varchar(50),
valoracion float,
popularidad int,
primary key(titulo)
);
insert into animes values
("Shingeki no Kyojin",8.53,1),
("Death Note",8.62,2),
("Fullmetal Alchemist: Brotherhood",9.12,3),
("One Punch Man",8.51,4),
("Sword Art Online",7.20,5),
("Boku no Hero Academia",7.91,6),
("Naruto",7.98,8),
("Kimetsu no Yaiba",8.53,7),
("Tokyo Ghoul",7.79,9),
("Hunter x Hunter (2011)",9.04,10),
("Kimi no Na wa.",8.86,11),
("Shingeki no Kyojin Season 2",8.50,12),
("Steins;Gate",9.08,13),
("Boku no Hero Academia 2nd Season",8.14,14),
("No Game No Life",8.10,15),
("Naruto: Shippuuden",8.25,16),
("Shingeki no Kyojin Season 3",8.62,17),
("Koe no Katachi",8.95,18);