create table S(`S#` char(5) not null, Sname char(20),Status smallint, city char(15));

insert into S values('S1', 'Smith', 20, 'London');
insert into S values('S2', 'Janes', 21, 'Paris');
insert into S values('S3', 'Blake', 30, 'Paris');
insert into S values('S4', 'Clark', 20, 'London');
insert into S values('S4', 'Adam', 30, 'Athens');

create table P (`P#` char(6) not null, Pname char(20), Color char(6),Weight smallint, City char(15));

insert into P values('P1', 'Nut', 'Red', 12, 'London');
insert into P values('P2', 'Bolt', Green, 17, 'Paris');
insert into P  values('S3', 'Screw', Blue, 17, 'Rome');
insert into P values('P4', 'Screw', 'Red', 14, 'London');
insert into P values('P5','Cam','Blue',12,'Paris');
insert into P values('P6','Cog','Red',19,'London');


create table J (`J#` char(4) not null, Jname char(10),City char(15));

insert into j values('J1', 'Sorter', 'Paris');
insert into j values('J2', 'Punch', 'Rome');
insert into j values('J3', 'Reader', 'Athens');
insert into j values('J4', 'Console', 'Athens');
insert into j values('J5', 'Collator', 'London');
insert into j values('J6', 'Terminal', 'Oslo');

create table sp (`SP#` char(4) not null, `P#` char(4) not null, `J#` char(4) not null,QTY int);

insert into sp values('S1','P1','J1',200);
insert into sp values('S1','P1','J4',700);
insert into sp values('S2','P3','J1',400);
insert into sp values('S2','P3','J2',200);
insert into sp values('S2','P3','J3',200);
insert into sp values('S2','P3','J4',500);
insert into sp values('S2','P3','J5',600);
insert into sp values('S2','P3','J6',400);
insert into sp values('S2','P3','J7',800);
insert into sp values('S2','P5','J2',100);
insert into sp values('S3','P3','J1',200);
insert into sp values('S3','P4','J2',500);
insert into sp values('S4','P6','J3',300);
insert into sp values('S4','P6','J7',300);
insert into sp values('S5','P2','J2',200);
insert into sp values('S5','P2','J4',100);
insert into sp values('S5','P5','J5',500);
insert into sp values('S5','P5','J7',100);
insert into sp values('S5','P6','J2',200);
insert into sp values('S5','P3','J4',200);
insert into sp values('S5','P4','J4',800);
insert into sp values('S5','P5','J4',400);
insert into sp values('S5','P6','J4',500);
