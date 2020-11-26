create database ecommerce;
use ecommerce;

create table produtos (
	id int not null auto_increment primary key, 
	nome varchar (30) NOT NULL, 
	validade date,
	fabricante varchar (30),
	preco double
);

insert into produtos (nome, validade, fabricante, preco)values 
			('Pack Bolhaca Trakinas', '2024-04-08','Mondelez Brasil',496),
			('Pack Farofa Yoki', '2021-01-21','General Mills Brasil',499),
            ('Pack Leite Integral ', '2020-12-23','ITALAC',399),
            ('Pack Macarrão Talharim', '2022-06-19','QUALITÁ',549),
            ('Pack Refrigerante Coca-Cola', '2021-03-07','The Coca-Cola Company',687),
            ('Pack Sabão em pó', '2022-02-18','Unilever',625),
            ('Pack Papel higiênico', '2027-03-29','Neve',572),
            ('Pack Café em pó', '2021-12-27','Pelé',497);
            
select * from produtos;

select * from produtos where preco <=500;            
select * from produtos where preco >=500;

alter table produtos modify column fabricante char (255);
