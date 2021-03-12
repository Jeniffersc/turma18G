-- Atividade 4 
-- Crie um banco de dados para um serviço de um açougue, o nome do banco deverá ter o
-- seguinte nome db_cidade_das_carnes, onde o sistema trabalhará com as informações dos
-- produtos desta empresa.
-- O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
-- siga exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
-- relevantes do tb_categoria para se trabalhar com o serviço desse açougue.
-- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos tb_produto para se trabalhar com o serviço desse açougue(não
-- esqueça de criar a foreign key de tb_categoria nesta tabela).
-- Popule esta tabela Categoria com até 5 dados.
-- Popule esta tabela Produto com até 8 dados.
-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
-- Faça um um select com Inner join entre tabela categoria e produto.
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).

-- criar banco de dados
create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

insert tb_categoria (descricao,ativo) values ("Bovino",true);
insert tb_categoria (descricao,ativo) values ("Suino",true);
insert tb_categoria (descricao,ativo) values ("Aves",true);
insert tb_categoria (descricao,ativo) values ("pertence feijoada",true);
insert tb_categoria (descricao,ativo) values ("imbutidos",true);
insert tb_categoria (descricao,ativo) values ("Outros",true);

select id,descricao,ativo from tb_categoria;

create table tb_produtos(
id bigint auto_increment,
nome varchar(255) not null,
preco decimal not null,
qtProduto int not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("ASA",40.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Picanha",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Coxa de Frango",20.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Bacon",30.00,30,2);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Hamburguer",60.00,30,2);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Cupim",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Peito de Frango",25.00,30,3);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Orelha de Porco",20.00,30,4);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Salame",18.00,30,5);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Medalhao",50.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Mocoto",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Chuleta",20.00,30,1);
insert tb_produtos (nome,preco,qtProduto,categoria_id) values  ("Acendedor de Churrasqueira",20.00,30,6);

select * from tb_produtos;

select * from tb_produtos where nome Like "%a%";
SELECT * FROM tb_produtos WHERE preco IN(20,30,40);
SELECT * FROM tb_produtos WHERE preco BETWEEN 20 AND 40;

SELECT COUNT(*) FROM tb_produtos; -- quantidade de produtos cadastrados.
SELECT SUM(preco)FROM tb_produtos; -- soma a tabela

SELECT AVG(preco) AS media FROM tb_produtos;

select nome,preco,qtProduto,tb_categoria.descricao as descricao_da_categoria,tb_categoria.ativo as estado_da_categoria
from tb_produtos right join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select nome from tb_produtos
where preco > '50';

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produtos WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
select * from tb_produtos where nome Like "%C%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).
select * from tb_produtos
inner join tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where tb_categoria.descricao = "Aves";
