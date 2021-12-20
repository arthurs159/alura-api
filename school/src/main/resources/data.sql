insert into User (username, email) values ('alex', 'alex@email.com');
insert into User (username, email) values ('ana', 'ana@email.com');
insert into User (username, email) values ('joao', 'joao@email.com');
insert into User (username, email) values ('bob', 'bob@email.com');
insert into User (username, email) values ('cleb', 'cleb@email.com');
insert into User (username, email) values ('bruce', 'bruce@email.com');

insert into Course (code, name, description) values ('java-1', 'Java OO', 'Java and Object Orientation: Encapsulation, Inheritance and Polymorphism.');
insert into Course (code, name, description) values ('java-2', 'Java Collections', 'Java Collections: Lists, Sets, Maps and more.');
insert into Course (code, name, description) values ('java-3', 'Java Exception', 'Java Exception: How to deal with exceptions');
insert into Course (code, name, description) values ('java-4', 'Java Numbers', 'Java Numbers: Format numbers');
insert into Course (code, name, description) values ('java-5', 'Java Date', 'Java Date: Dealing with Date in Java.');

insert into Matricula(date, user_id, course_id) values (now(), 1, 1);
insert into Matricula(date, user_id, course_id) values (now(), 1, 2);
insert into Matricula(date, user_id, course_id) values (now(), 1, 3);
insert into Matricula(date, user_id, course_id) values (now(), 2, 1);
insert into Matricula(date, user_id, course_id) values (now(), 2, 2);
insert into Matricula(date, user_id, course_id) values (now(), 2, 3);
insert into Matricula(date, user_id, course_id) values (now(), 2, 4);
insert into Matricula(date, user_id, course_id) values (now(), 3, 1);
insert into Matricula(date, user_id, course_id) values (now(), 4, 1);
insert into Matricula(date, user_id, course_id) values (now(), 4, 2);
insert into Matricula(date, user_id, course_id) values (now(), 4, 3);

