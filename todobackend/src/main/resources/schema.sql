create table if not exists run(
    id int not null,
    title varchar(250) not null,
    started_on timestamp not null,
    ends_on timestamp not null,
    category varchar(16) not null,
    status varchar(16) not null,
    version int,
    primary key (id)
);