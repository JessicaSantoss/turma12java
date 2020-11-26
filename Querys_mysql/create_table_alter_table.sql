create table funcionarios (
	id int not null auto_increment primary key, 
	nome varchar (30) NOT NULL, 
	nascimento date,
	sexo enum ('M', 'F', 'Outro'),
	peso decimal (5,2),
	altura decimal (3,2),
    dia_cadastro datetime default current_timestamp,
	nacionalidade varchar(20) default 'Brasil'
);

#COMANDOS DDL (DATA DEFINITION LANGUAGEM, CREATE, DROP, ALTER, RENAME)
#COMANDOS DDL (DATA DEFINITION LANGUAGEM, 1, 2, 3, 4)

describe funcionarios;

alter table funcionarios modify column nome char (255);
alter table funcionarios add column  historico varchar (50) after nome;
alter table funcionarios drop column  historico ;

rename table funcionarios to colaboradores;

show tables;

	