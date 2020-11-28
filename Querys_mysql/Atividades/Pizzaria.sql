create database db_pizzaria_legal;
use db_pizzaria_legal;

create table tb_categoria(
	id_categoria int not null auto_increment primary key,
    categoria varchar(255)
);

create table tb_pizza(
	id_pizza bigint not null auto_increment primary key,
    sabor varchar(255) not null,
    preco double(5,2) not null,
    tamanho char(1) default 'M',
    id_categoria int,
     CONSTRAINT fk_categoria FOREIGN KEY (id_categoria) REFERENCES tb_categoria (id_categoria)
);

insert into tb_categoria (categoria) values ("Salgada"), ("Doce"), ("Vegana"), ("Frutos do mar"), ("Especiais");

insert into tb_pizza (sabor, preco, tamanho, id_categoria) values ("Portuguesa", 32.00, 'P',1), ("Brigadeiro", 60.00,'G', 2), ("Brócolis com tofu ", 45.00,'M',3), ("Camarão", 61.00,'M',4), ("A moda da casa II",57.00, 'G', 5),("Mussarela", 30.00, 'M',1), ("Calabresa", 29.00,"G",1) ;

select * from tb_pizza where preco >= 45.00;

select * from tb_pizza inner join tb_categoria where tb_pizza.id_categoria = tb_categoria.id_categoria;

select * from tb_pizza inner join tb_categoria on tb_pizza.id_categoria = tb_categoria.id_categoria where tb_categoria.id_categoria = 1 ;

