-- Atividade 5
-- Crie um banco de dados para um serviço de uma loja de produtos de construção, o nome
-- do banco deverá ter o seguinte nome db_construindo_a_nossa_vida, onde o sistema
-- trabalhará com as informações dos produtos desta empresa.
-- O sistema trabalhará com 2 tabelas tb_produto e tb_categoria.
-- siga exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
-- relevantes do tb_categoria para se trabalhar com o serviço deste ecommerce.
-- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos tb_produto para se trabalhar com o serviço de uma loja de produtos
-- (não esqueça de criar a foreign key de tb_categoria nesta tabela).
-- Popule esta tabela Categoria com até 5 dados.
-- Popule esta tabela Produto com até 8 dados.
-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
-- Faça um um select com Inner join entre tabela categoria e produto.
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
-- os produtos que são da categoria hidráulica).

-- criar banco de dados
create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

 create table tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
 );

create table tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
profissional varchar(255) not null,
empresa varchar(255) not null,
preco decimal not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_categoria (descricao,ativo) values ("Hidraulica", true);
insert tb_categoria (descricao,ativo) values ("Eletrica", true);
insert tb_categoria (descricao,ativo) values ("Automotiva", true);
insert tb_categoria (descricao,ativo) values ("Bancaria",true);
insert tb_categoria (descricao,ativo) values ("Educacional",true);

select * from tb_categoria;

insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Aulas particulares","ED","Generation",4000.00,5);
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Limpeza de Caixa d'água", "Andre","D&D","567.56","1");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Instalação de rede elétrica","Lucao","MaisEVoce","6867.52","2");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Aulas de Java","Mari","Coursera","100.55","5");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Revisão de carro","Patricia","Pedrao","105745.00","3");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Aulas de educação financeira","Tati","Me Poupe","526898910.00","4");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Aulas de MySQL","Hudson","Udemy","8555.20","5");
insert tb_produto (nome,profissional,empresa,preco,categoria_id) values  ("Limpeza de carro","Solange","Pedrao","85.96","3");

select * from tb_produto;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select nome, preco from tb_produto
where preco > '50';

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra C.
select * from tb_produto where nome Like "%C%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria hidráulica).
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.descricao = "hidráulica";



