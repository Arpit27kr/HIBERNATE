describe student;
Select*  from student;
alter Table student Auto_Increment=1;
alter table student add primary key (roll);
ALTER TABLE student
ALTER roll SET DEFAULT 5;
ALTER TABLE student MODIFY COLUMN roll INT auto_increment
