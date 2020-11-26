create database RH;
use RH;

create table funcionarios (
	id int not null auto_increment primary key, 
	nome varchar (30) NOT NULL, 
	nascimento date,
	sexo enum ('M', 'F', 'Outro'),
	salario double
);

insert into funcionarios (nome, nascimento, sexo, salario)values 
			('Gabriela Santos', '1997-01-09','F',2250),
			('João Paulo', '1993-05-08','M',2500),
			('Marcio Garcia', '1999-04-01','M',1900),
            ('Debora Ana', '1992-09-12','F', 1375),
            ('Felipe Leonel', '1994-02-11', 'M', 2900);

select * from funcionarios where salario <=2000;            
select * from funcionarios where salario >=2000;

alter table funcionarios modify column nome char (255);





