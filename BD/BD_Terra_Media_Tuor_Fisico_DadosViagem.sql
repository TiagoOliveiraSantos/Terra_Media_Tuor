/*Dados da viagem*/
create table Dados_Viagem(
idViagem int auto_increment primary key not null,
Origem varchar(50) not null,
Destino varchar (50) not null,
DataHora_Ida timestamp not null,
DataHora_Volta timestamp not null,
Qt_Passagens tinyint default(1),
TipoPassagem enum ('Econômica','Executiva','Primeira Classe') not null,
Bagagem enum ('Sim','Não') not null,
CompanhiaAerea enum ('Azul','Gol','Latam','Avianca') not null,
ValorPassagem double not null
 ) default charset = utf8;
 
