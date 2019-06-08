create sequence hibernate_sequence start 1 increment 1;

create table test (
test_id int4 not null,
test_name varchar(20),
primary key (test_id));

create table task (
task_id int4 not null,
test_id int4 not null,
task_name varchar(350),
question varchar(350),
primary key (task_id),
foreign key (test_id) references test(test_id));

create table answer (
task_id int4 not null,
answer_name varchar(350),
correct boolean,
foreign key (task_id) references task(task_id));

create table usr (
usr_id serial not null,
usr_name varchar(50),
password varchar(50),
primary key (usr_id));

create table usr_role(
usr_id int4 not null,
roles VARCHAR (10),
foreign key (usr_id) references usr(usr_id));