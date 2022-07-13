create table user (
	name varchar(50) not null primary key,
	password varchar(100) not null,
	enabled boolean not null
);
create table role (
	name varchar(50) not null,
	authority varchar(50) not null,
	constraint fk_authorities_user foreign key(name) references user(name)
);
create unique index ix_auth_username on role (name,authority);

insert into user(name,password,enabled)
	values('ludo','$2a$10$hbxecwitQQ.dDT4JOFzQAulNySFwEpaFLw38jda6Td.Y/cOiRzDFu',true);
insert into role(name,authority) 
	values('ludo','ROLE_ADMIN');
	
insert into user(name,password,enabled)
	values('marcel','$2a$10$yempYzveKG0LzELJgmew4.27Azl8q.Gz82yegUJJQen3LcBRoLLGq',true);
insert into role(name,authority) 
	values('marcel','ROLE_USER');

