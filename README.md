# 问题记录
所有userid->varchar20改为50  
userorderdetailorderid: 20->50

# 更新内容
基于user（对应表为customers）表的增删改查单元测试，其余Dao的insert方法。  

# 工程简介
目前只是结构简单框架，计划先将每个实体类的CRUD实现，涉及多个表的业务逻辑可以直接定义controller实现


controller负责具体url  
Dao负责数据访问，只需要定义接口而不需要具体实现  
Entities对应各个表实体  
test目前是一个辅助工具类  
具体的单元测试就在src->test目录下  
![testdir](img/testdir.png)

# 延伸阅读
目前的测试数据库只有一个customers表,遇到一个问题就是外键问题，单独插入一套一条数据比较困难，我直接先去掉了的所有的外键
```aidl
-- 建表语句
create table CUSTOMERS
(
    "user_id"             VARCHAR2(20)  not null
        constraint SYS_C008128
            primary key
        constraint SYS_C008119
            check ("user_id" IS NOT NULL),
    "user_name"           VARCHAR2(100),
    "user_password"       VARCHAR2(20),
    "user_tel"            VARCHAR2(11),
    "user_email"          VARCHAR2(30)  not null
        constraint SYS_C008123
            check ("user_email" IS NOT NULL),
    "user_zip_code"       VARCHAR2(20)  not null
        constraint SYS_C008124
            check ("user_zip_code" IS NOT NULL),
    "user_address_detail" VARCHAR2(200) not null
        constraint SYS_C008125
            check ("user_address_detail" IS NOT NULL),
    "user_type"           NUMBER(1)     not null
        constraint SYS_C008126
            check ("user_type" IS NOT NULL),
    "user_register_time"  DATE          not null
        constraint SYS_C008127
            check ("user_register_time" IS NOT NULL),
    "real_name"           VARCHAR2(100) not null
        constraint SYS_C008136
            check ("real_name" IS NOT NULL)
)
/

comment on table CUSTOMERS is '用户表'
/

comment on column CUSTOMERS."user_id" is '用户ID'
/

comment on column CUSTOMERS."user_name" is '用户名'
/

comment on column CUSTOMERS."user_password" is '用户密码'
/

comment on column CUSTOMERS."user_tel" is '用户联系电话'
/

comment on column CUSTOMERS."user_email" is '用户邮箱'
/

comment on column CUSTOMERS."user_zip_code" is '用户邮编'
/

comment on column CUSTOMERS."user_address_detail" is '用户地址'
/

comment on column CUSTOMERS."user_type" is '用户类型（1-个人，2-企业）'
/

comment on column CUSTOMERS."user_register_time" is '用户注册时间'
/

comment on column CUSTOMERS."real_name" is '用户真实姓名'
/

-- 插入数据
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1001', 'jzs', '314400', '13867332255', 'XBX17@163.com', '314400', '浙江省海宁市西立交路4号', 1, TO_DATE('2020-12-01 17:59:52', 'YYYY-MM-DD HH24:MI:SS'), '金建胜');
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1002', 'hzlyyz', '310014', '13967972900', 'XBX16@163.com', '310014', '杭州市余杭区余杭镇禹杭路164-2号', 2, TO_DATE('2020-12-02 18:04:51', 'YYYY-MM-DD HH24:MI:SS'), '杭州联邮邮政设备有限公司');
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1003', 'hzztdx', '311418', '15158151059', 'XBX34@163.com', '311418', '浙江省富阳市灵桥镇山基村3号', 2, TO_DATE('2020-12-01 18:07:23', 'YYYY-MM-DD HH24:MI:SS'), '杭州中天电信器材有限公司');
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1004', 'qgp', '310051', '13805783755', 'BZX01@163.com', '310051', '杭州市滨江区楚天路269号', 1, TO_DATE('2020-12-03 18:07:36', 'YYYY-MM-DD HH24:MI:SS'), '钱国平');
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1005', 'ylg', '314002', '13868071188', 'BZD01@163.com', '314002', '嘉兴市南湖区七星镇湘湖社区永富路2号', 1, TO_DATE('2020-12-02 18:10:25', 'YYYY-MM-DD HH24:MI:SS'), '俞连根');
INSERT INTO OUTLN.CUSTOMERS ("user_id", "user_name", "user_password", "user_tel", "user_email", "user_zip_code", "user_address_detail", "user_type", "user_register_time", "real_name") VALUES ('1007', 'hahahaha', '2222', '12233', 'qwweerg@qq.com', '111', 'sichuang', 1, TO_DATE('2021-01-02 17:49:19', 'YYYY-MM-DD HH24:MI:SS'), '牛');
```
