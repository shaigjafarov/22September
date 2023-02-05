Select count(id) from myschema.teacher3;

create table myschema.example (

                                  id integer primary key,
                                  name varchar,
                                  unique (name, id)
);


insert into myschema.example
values(154, 'sdfsf');


select * from myschema.example where
        name like '%s%';


select distinct name from myschema.example;

update myschema.example set name='ferid' where name='sdkjfsd';

select salary , count(id) from myschema.example
where salary >
group by salary having count(id)=2 ;



alter table myschema.example drop column salary;

alter table  myschema.example add column salary integer default 500;


select * from  myschema.example order by id  FETCH FIRST 5 ROW  ONLY;


select * from  myschema.example order by id  LIMIT 3 OFFSET 1;

select * from  myschema.example WHERE NAME  similar to '%#';

select * from  myschema.example WHERE id = 1#4;

select salary, count(id) from myschema.example
where salary >1000
group by salary;


CREATE TABLE myschema.student(
                                 id INT primary key,
                                 name VARCHAR(255) NOT NULL,
                                 phone VARCHAR(15),
                                 teacher_id INT,
                                 CONSTRAINT fk_student
                                     FOREIGN KEY(teacher_id)
                                         REFERENCES myschema.teacher(id)
);






select s.id telebe_id , t.id teacher_id  from myschema.student  s
                                                  left join myschema.teacher t on s.teacher_id=t.id
where teacher_id is null

