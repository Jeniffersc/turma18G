-- Lista: Atividade opcional banco de dados - 15/03

-- Atividade
-- Crie um banco de dados para um serviço de uma loja de móveis e decoração, o nome do
-- banco deverá ter o seguinte: db_nome minha_casa_mais_bonita, onde o sistema trabalhará
-- com as informações dos produtos desta loja.
-- O sistema trabalhará com 3 tabelas tb_produto e tb_categoria e tb_usuario.
-- siga exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos relevantes do tb_categoria para se trabalhar com o serviço desta loja.
-- Crie uma tabela de tb_produto e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_produto para se trabalhar com o serviço desta loja
-- não esqueça de criar a foreign key de tb_categoria nesta tabela).
-- Crie a tabela Usuario e utilize a habilidade de abstração e determine 5 atributos relevantes dos tb_usuario para se trabalhar com o serviço desta loja.
-- Popule atabela Categoria com até 5 dados.
-- Popule a tabela Produto com até 8 dados.
-- Popule atabela Usuario com até 5 dados.
-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select utilizando LIKE buscando os Produtos com a letra B.
-- Faça um select utilizando LIKE buscando os Usuários com a letra C.
-- Faça um um select com Inner join entre tabela categoria e produto.
-- faça um select que retorne a média de preços dos produtos;
-- faça um select que retorne a soma de preços dos produtos;
-- faça um select que quantidade de produtos cadastrados na tabela
-- Faça um select onde traga todos os Produtos de uma categoria específica
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).

create database db_nome_minha_casa_mais_bonita;

use db_nome_minha_casa_mais_bonita;

create table tb_categoria (
id bigint auto_increment,
comodo varchar(255) not null,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
);

create table tb_produto (
id bigint auto_increment,
nome varchar(255) not null,
empresa varchar(255) not null,
nacionalidade varchar(255) not null,
preco decimal not null,
cor varchar(255) not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

create table tb_usuario (
id bigint auto_increment,
nome varchar(255) not null,
dinheiro decimal not null,
endereco varchar(255) not null,
primary key(id)
);

insert tb_categoria (comodo,descricao,ativo) values ("Cozinha", "Madeira", true);
insert tb_categoria (comodo,descricao,ativo) values ("Sala", "Almofado", true);
insert tb_categoria (comodo,descricao,ativo) values ("Quarto", "Almofado", true);
insert tb_categoria (comodo,descricao,ativo) values ("Cozinha", "Vidro", true);
insert tb_categoria (comodo,descricao,ativo) values ("Sala", "Vidro", true);

insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Armário","Bartira","Brasil",500.00,"Marrom",1);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Sofá","Bartira","Brasil",5000.00,"Cinza",2);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Fruteira","J&J","EUA",100.00,"Marrom",1);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Mesa","Pato","Israel",800.00,"Marrom",4);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Cama","Bartira","Brasil",4800.00,"Rosa",3);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Cama","Pato","Dinamarca",7.00,"Cinza",3);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Armário","Bartira","Finlândia",5568900.00,"Preto",1);
insert tb_produto (nome,empresa,nacionalidade,preco,cor,categoria_id) values ("Mesa de centro","Jonh","Brasil",10.00,"Marrom",5);

insert tb_usuario (nome,dinheiro,endereco) values ("Joana", 5200, "Rua Japão");
insert tb_usuario (nome,dinheiro,endereco) values ("João", 546896200, "Rua Alemanhã");
insert tb_usuario (nome,dinheiro,endereco) values ("Paulo", 22655200, "Rua Itatiaia");
insert tb_usuario (nome,dinheiro,endereco) values ("Bruno", 2000000, "Rua Paulo Souza");
insert tb_usuario (nome,dinheiro,endereco) values ("Je", 8898985200, "Av Martim Francisco");

select * from tb_categoria;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select * from tb_produto
where preco > '50';

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_produto WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra B.
select * from tb_produto where nome Like "%B%";

-- Faça um select utilizando LIKE buscando os Usuários com a letra C.
select * from tb_produto where nome Like "%C%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id;

-- faça um select que retorne a média de preços dos produtos;
SELECT AVG(preco) FROM tb_produto;

-- faça um select que retorne a soma de preços dos produtos;
SELECT SUM(preco) FROM tb_produto;

-- faça um select que quantidade de produtos cadastrados na tabela
SELECT COUNT(DISTINCT id) FROM tb_produto;

-- Faça um select onde traga todos os Produtos de uma categoria específica
select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.categoria_id
where tb_categoria.descricao = "Vidro";

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são cosméticos).



