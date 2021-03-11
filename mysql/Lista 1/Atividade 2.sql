-- Crie um banco de dados para um e commerce, onde o sistema trabalhará com as
-- informações dos produtos deste ecommerce.
-- Crie uma tabela produtos e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos produtos para se trabalhar com o serviço deste ecommerce.
-- Popule esta tabela com até 8 dados;
-- Faça um select que retorne os produtos com o valor maior do que 500.
-- Faça um select que retorne os produtos com o valor menor do que 500.
-- Ao término atualize um dado desta tabela através de uma query de atualização.
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
-- coloque no seu GitHuB pessoal e compartilhe esta atividade.

CREATE database db_commerce;

use db_commerce;

create table tb_produtos (
id bigint auto_increment,
nome varchar(255) not null,
validade date not null,
preco float not null,
categoria varchar(20) not null,
nacionalidade varchar(20) default 'Brasil',
primary key(id)
);

insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ('Cerveja','2021-01-02','5','Bebida','Brasil');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ("Bolacha",'2001-04-19','6.52','Alimento','Brasil');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ('Pamonha','1986-09-02','20','Alimento','Portugal');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ("Salgadinho",'2010-05-18','7','Alimento','Portugal');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ('Bolo','2021-01-12','900','Alimento','Italia');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ('Doce','2020-01-02','2','Alimento','China');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ("Refrigerante",'2021-02-19','7.58','Bebida','Brasil');
insert into tb_produtos (nome, validade, preco, categoria, nacionalidade) values ('Pirulito','2019-09-02','2.0','Alimento','China');

-- Faça um select que retorne os produtos com o valor maior do que 500.
select nome from tb_produtos
where preco > '500';

-- Faça um select que retorne os produtos com o valor menor do que 500.
select nome from tb_produtos
where preco < '500';

update tb_produtos
set nacionalidade = 'EUA'
where id = '5';

select * from tb_produtos;