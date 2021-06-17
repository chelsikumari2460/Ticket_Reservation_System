
insert into train (train_no,train_name,src,dest) values('t1','a','gaya','jalmapur');
insert into train (train_no,train_name,src,dest) values('t2','b','gaya','jalmapur');
insert into train (train_no,train_name,src,dest) values('t3','c','gaya','jalmapur');
insert into train (train_no,train_name,src,dest) values('t4','d','gaya','jalmapur');
insert into train (train_no,train_name,src,dest) values('t5','d','bgp','jalmapur');

insert into user (email,first_name,last_name,password) values('123@gmail.com','name1','last1','1212enfffffffffff');
insert into user (email,first_name,last_name,password) values('456@gmail.com','name2','last2','2212enfffffffffff');
insert into user (email,first_name,last_name,password) values('789@gmail.com','name2','last2','1212enfffffffffff');
insert into user (email,first_name,last_name,password) values('12344@gmail.com','name1','last1','1212enfffffffffff');
insert into user (email,first_name,last_name,password)  values('123hhd@gmail.com','name3','last3','1212enfffffffffff');

insert into ticket (pnr,price,train_nofk,user_idfk) values('pnr1',100,'t1',1);
insert into ticket (pnr,price,train_nofk,user_idfk) values('pnr2',200,'t2',1);
insert into ticket (pnr,price,train_nofk,user_idfk) values('pnr3',300,'t1',2);
insert into ticket (pnr,price,train_nofk,user_idfk) values('pnr4',400,'t2',3);
