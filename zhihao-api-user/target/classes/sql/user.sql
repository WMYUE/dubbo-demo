create table user(
  userId bigint not null primary key auto_increment,
  userName varchar(50) COMMENT '用户名称',
  userPhone varchar(50) COMMENT '用户电话',
  createTime DATE COMMENT '创建时间',
  score varchar(10) default '0' COMMENT '积分'
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8mb4;

insert user(userName,userPhone,createTime,score) VALUES ('zhangsan','15707236782','1983-11-23 00:20:00','1000');
insert user(userName,userPhone,createTime,score) VALUES ('lisi','15703236782','1998-02-25 10:10:00','110000');
insert user(userName,userPhone,createTime,score) VALUES ('wangwu','18807236782','1983-10-03 00:00:10','20000');
insert user(userName,userPhone,createTime,score) VALUES ('wangsan','18007236782','2003-01-11 00:10:00','340000');
insert user(userName,userPhone,createTime,score) VALUES ('lina','15607236724','2016-12-23 00:30:00','100');