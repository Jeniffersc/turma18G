-- Atividade 3
-- Crie um banco de dados para um serviço de farmácia de uma empresa, o nome do banco
-- deverá ter o seguinte nome db_farmacia_do_bem, onde o sistema trabalhará com as
-- informações dos produtos desta empresa.
-- O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
-- siga exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
-- relevantes do tb_categoria para se trabalhar com o serviço desta farmacia.
-- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos tb_produto para se trabalhar com o serviço deste farmacia(não
-- esqueça de criar a foreign key de tb_categoria nesta tabela).
-- Popule esta tabela Categoria com até 5 dados.
-- Popule esta tabela Produto com até 8 dados.
-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select utilizando LIKE buscando os Produtos com a letra B.
-- Faça um um select com Inner join entre tabela categoria e produto.
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
-- os produtos que são cosméticos).

-- criar banco de dados
create database db_farmacia_do_bem;

use db_farmacia_do_bem;

 create table tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
 );

create table tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
marca varchar(255) not null,
validade date not null,
preco decimal not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_categoria (descricao,ativo) values ("Cosméticos", true);
insert tb_categoria (descricao,ativo) values ("Bebês", true);
insert tb_categoria (descricao,ativo) values ("Comprimidos", true);
insert tb_categoria (descricao,ativo) values ("Xaropes",true);
insert tb_categoria (descricao,ativo) values ("Higiene",true);

select * from tb_categoria;

insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Dor de cabeça","Dor Flex","2021-05-09",40.00,3);
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Fralda", "Turma da Monica","2060-09-06","56.56","2");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Gripe","S&S","2015-06-30","68.52","4");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Termômetro","Mari","2090-05-11","100.55","2");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Shampoo","Patricia","2022-09-14","10.00","5");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Condicionador","Tati","2060-12-31","526.00","5");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Perfume","Boticario","2030-04-07","8555.20","1");
insert tb_produto (nome,marca,validade,preco,categoria_id) values  ("Creme","Solange","2021-09-05","85.96","1");

select * from tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select nome, preco from tb_produto
where preco > '50';

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B..
select * from tb_produto where nome Like "%B%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria cosméticos).
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.descricao = "cosméticos";




