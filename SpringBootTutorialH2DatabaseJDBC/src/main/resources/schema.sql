CREATE TABLE users(
	id int auto_increment,
	firstname varchar(255) not null,
	lastname varchar(255) not null
);



INSERT INTO users(firstname, lastname) VALUES ('Willy', 'De Keyser');
INSERT INTO users(firstname, lastname) VALUES ('Walter', 'De Keyser');
INSERT INTO users(firstname, lastname) VALUES ('Bill', 'Gates');
INSERT INTO users(firstname, lastname) VALUES ('Steve', 'Jobs');