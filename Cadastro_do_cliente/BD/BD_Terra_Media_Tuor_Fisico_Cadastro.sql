/*Dados pessoais*/
create table Cadastro(

idCliente int auto_increment primary key,
Nome varchar(50) not null,
CPF bigint not null,
RG bigint not null,
Data_Nasmento date not null,

/*Dados de correspondencia*/
Rua varchar(30) not null,
NCasa varchar(5) default 'S/N',
Bairro varchar(30) not null,
Cidade varchar(30) not null,
Estado varchar(30) not null ,
CEP varchar(30) not null ,
Email varchar(50) not null,
Telefone varchar(12) not null,

/*Dados sensíveis*/
Login varchar(30) not null,
Senha varchar(8) not null
) default charset = utf8;