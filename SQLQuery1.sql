create database MessageMS
go
use MessageMS
go
create table MessageInfo
(
	mid int identity(1,1) primary key,--���
	mcontent varchar(200) not null, --��Ϣ����
	publish date not null,--��������
)

insert into MessageInfo(mcontent,publish) values ('���͹�״��������ȫ��󱬷��������ؽ���Σ��','2020-12-1');
insert into MessageInfo(mcontent,publish) values ('�����˵���Ҳ������������ʾ���Ա�������','2020-12-1');
insert into MessageInfo(mcontent,publish) values ('10�·ݷ���һ����ʦ���ڿ�����չʾ�ڽ�������ıɱ�������˹��ڵķ�ŭ','2020-12-2');
insert into MessageInfo(mcontent,publish) values ('�϶����״�ʵ������������ɹ����أ��й���̫������Ĵ�̽��','2020-12-2');

