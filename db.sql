#
db 생성
drop
database if exists demo;
create
database demo;
use
demo;

#
회원테이블 생성
create table `user`
(
    id          bigint unsigned not null primary key auto_increment,
    reg_date    datetime     not null,
    update_date datetime     not null,
    email       varchar(100) not null,
    `password`  varchar(150) not null,
    `name`      char(50)     not null
);

#
기본 데이터
insert into `user`
set reg_date = now(),
update_date = now(),
email = 'use1@test.com',
`password` = '1234',
`name` = '유저1';

insert into `user`
set reg_date = now(),
update_date = now(),
email = 'use1@test.com',
`password` = '1234',
`name` = '유저2';

insert into `user`
set reg_date = now(),
update_date = now(),
email = 'use1@test.com',
`password` = '1234',
`name` = '유저3';

show
tables;

select *
from `user`;
