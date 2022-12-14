--Создание таблицы с вопросами
create table question (id int8 not null generated by default as identity, display_text varchar(2000) not null);

--Изменение структуры таблицы с вопросами
alter table question add constraint question_pkey primary key (id);

--Добавление констрейна уникальности
alter table question add constraint unique_question_display_text unique (display_text);

--Добавление вопросов
insert into question (display_text)
values 
	('В файл с каким расширением компилируется java-файл?'),
	('С помощью какой команды git можно получить полную копию удаленного репозитория?'),
	('Какой применяется цикл, когда не известно количество итераций?');

--Создание таблицы с ответами (явный nextVal)???
create table answer (id int8 serial PRIMARY KEY, display_text varchar(2000) not null);

--Создание таблицы с ответами (с параметрыми последовательности)
create table answer (id int8 not null generated by default as identity, display_text varchar(2000) not null, CONSTRAINT answer_pkey PRIMARY KEY (id));

--Добавление констрейна уникальности
alter table answer add constraint unique_display_text unique (display_text);

--Добавление ответов
insert into answer (display_text)
values 
	('class'),
	('cs'),
	('java'),
	('exe'),
	('clone'),
	('commit'),
	('push'),
	('copy'),
	('while'),
	('for'),
	('loop');

--Удаление таблицы с ответами
drop table question_answer_map;
	
--Создание мостовой таблицы с вопрос-ответ
create table question_answer_map (id int8 not null generated by default as identity, question_id int8 not null, answer_id int8 not null, valid_answer bool not null default false, CONSTRAINT unique_question_answer unique (question_id, answer_id));
--Добавление констрейна FK
alter table question_answer_map add constraint question_id_fkey foreign key (question_id) references question (id);
alter table question_answer_map add constraint answer_id_fkey foreign key (answer_id) references answer (id);


--Наполнение таблицы с вопрос-ответ
insert into question_answer_map (question_id, answer_id)
values 
	(1, 1),
	(1, 2),
	(1, 3),
	(1, 4),
	(2, 5),
	(2, 6),
	(2, 7),
	(2, 8),
	(3, 9),
	(3, 10),
	(3, 11);

--Наполнение таблицы с вопрос-ответ - правильный ответ	
update question_answer_map
set valid_answer = true
where question_id = 1 and answer_id = 1;
update question_answer_map
set valid_answer = true
where question_id = 2 and answer_id = 5;
update question_answer_map
set valid_answer = true
where question_id = 3 and answer_id = 9;

select *
from java_basic.java_test.question q 

select *
from java_basic.java_test.answer a 

select *
from java_basic.java_test.question_answer_map qam 

select q.display_text, a.display_text, qam.valid_answer 
from question_answer_map qam 
join question q on qam.question_id  = q.id 
join answer a on qam.answer_id  = a.id 
order by q.id, a.id 

