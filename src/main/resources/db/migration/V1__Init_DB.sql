create sequence hibernate_sequence start 1 increment 1;

create table test (
test_id int4 not null,
test_name varchar(255),
primary key (test_id));

create table task (
task_id int4 not null,
test_id int4 not null,
task_name varchar(255),
question varchar(255),
primary key (task_id),
foreign key (test_id) references test(test_id));

create table answer (
answer_id int4 not null,
task_id int4 not null,
answer_name varchar(255),
ans boolean,
primary key (answer_id),
foreign key (task_id) references task(task_id));

create table usr (
usr_id int8 not null,
usr_name varchar(255),
password varchar(255),
primary key (usr_id));

create table usr_role(
usr_id int4,
roles VARCHAR (300),
foreign key (usr_id) references usr(usr_id));

/*
create sequence hibernate_sequence start 1 increment 1;

create table test(
    test_id INTEGER PRIMARY KEY ,
    test_name VARCHAR (300)
);

create table task(
    task_id INTEGER primary key,
    task_test_id BIGINT,
    FOREIGN KEY (task_test_id) REFERENCES test(test_id),
    task_name VARCHAR (300),
    question VARCHAR (300)
);

create table answer(
    answer_id INTEGER PRIMARY KEY ,
    answer_task_id INTEGER ,
    FOREIGN KEY (answer_task_id) REFERENCES task(task_id) ,
    answer_name VARCHAR (300),
    ans BOOLEAN NOT NULL
);

create table usr (
    usr_id INTEGER PRIMARY KEY ,
    usr_name VARCHAR (300),
    password VARCHAR (300),
    email VARCHAR (300),
    activation_code VARCHAR (300)
);

create table usr_role (
    usr_role_usr_id INTEGER,
    FOREIGN KEY ( usr_role_usr_id) REFERENCES usr(usr_id),
    roles VARCHAR (300)
);
*/
/*
alter table if exists answer
add constraint answer_task_fk
foreign key (task_id) references task;

alter table if exists task
add constraint task_test_fk
foreign key (test_id) references test;

alter table if exists usr_role
add constraint usr_role_usr_fk
foreign key (usr_id) references usr
*/