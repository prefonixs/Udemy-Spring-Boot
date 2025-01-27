insert into user_details(id,birth_date,name)
values(1001,current_date(),'Sid');

insert into user_details(id,birth_date,name)
values(1002,current_date(),'John');

insert into user_details(id,birth_date,name)
values(1003,current_date(),'Doe');

insert into post(id,description,user_id)
values(2001,'Hello World',1001);

insert into post(id,description,user_id)
values(2002,'Hello Aws',1001);

insert into post(id,description,user_id)
values(2003,'Hello Sid',1002);

insert into post(id,description,user_id)
values(2004,'Spring Boot',1003);