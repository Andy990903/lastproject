create database MessageMS
go
use MessageMS
go
create table MessageInfo
(
	mid int identity(1,1) primary key,--编号
	mcontent varchar(200) not null, --消息内容
	publish date not null,--发布日期
)

insert into MessageInfo(mcontent,publish) values ('新型冠状病毒肺炎全球大爆发引发严重金融危机','2020-12-1');
insert into MessageInfo(mcontent,publish) values ('“黑人的命也是命”反暴力示威以暴力告终','2020-12-1');
insert into MessageInfo(mcontent,publish) values ('10月份法国一名教师因在课堂上展示宗教漫画被谋杀，引起了公众的愤怒','2020-12-2');
insert into MessageInfo(mcontent,publish) values ('嫦娥五首次实现月球采样并成功返回，中国在太空领域的大探索','2020-12-2');
