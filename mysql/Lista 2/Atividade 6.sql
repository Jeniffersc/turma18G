-- Atividade 6
-- Crie um banco de dados para um serviço de um site de cursos onlines, o nome do banco
-- deverá ter o seguinte nome db_cursoDaMinhaVida, onde o sistema trabalhará com as
-- informações dos produtos desta empresa.
-- O sistema trabalhará com 2 tabelas tb_curso e tb_categoria.
-- siga exatamente esse passo a passo:
-- Crie uma tabela de categorias utilizando a habilidade de abstração e determine 3 atributos
-- relevantes do tb_categoria para se trabalhar com o serviço deste site de cursos onlines.
-- Crie uma tabela de tb_produto e utilizando a habilidade de abstração e determine 5
-- atributos relevantes dos tb_produto para se trabalhar com o serviço de um site de cursos
-- onlines(não esqueça de criar a foreign key de tb_categoria nesta tabela).
-- Popule esta tabela Categoria com até 5 dados.
-- Popule esta tabela Produto com até 8 dados.
-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select utilizando LIKE buscando os Produtos com a letra J.
-- Faça um um select com Inner join entre tabela categoria e produto.
-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos
-- os produtos que são da categoria Java).

-- criar banco de dados
create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

 create table tb_categoria (
id bigint auto_increment,
descricao varchar(255) not null,
ativo boolean not null,
primary key(id)
 );

create table tb_curso (
id bigint auto_increment,
nome varchar(255) not null,
professor varchar(255) not null,
instituição varchar(255) not null,
preco decimal not null,
categoria_id bigint,
primary key(id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria(id)
);

insert tb_categoria (descricao,ativo) values ("Linguagem de programação", true);
insert tb_categoria (descricao,ativo) values ("Pacote Office", true);
insert tb_categoria (descricao,ativo) values ("Lingugem de marcação", true);
insert tb_categoria (descricao,ativo) values ("Photoshop",true);
insert tb_categoria (descricao,ativo) values ("Design",true);

select * from tb_categoria;

insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de Java","ED","Generation",4000000.00,1);
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de Word","Liza","Generation","567.56","2");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de MySQL","Lucao","Generation","56656867.52","1");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de Adobe Photoshop Mix.","Mari","Coursera","100","4");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de UX","Patricia","Coursera","10.00","5");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de algoritmos","Guanabara","Curso em video","0.00","1");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de PHP","Hudson","Udemy","8555.20","1");
insert tb_curso (nome,professor,instituição,preco,categoria_id) values  ("Curso de HTML","Solange","Coursera","85.96","3");

select * from tb_curso;

-- Faça um select que retorne os Produtos com o valor maior do que 50 reais.
select nome from tb_curso
where preco > '50';

-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
-- Faça um select trazendo os Produtos com valor entre 3 e 60 reais.
SELECT * FROM tb_curso WHERE preco BETWEEN 3 AND 60;

-- Faça um select utilizando LIKE buscando os Produtos com a letra J.
select * from tb_curso where nome Like "%J%";

-- Faça um um select com Inner join entre tabela categoria e produto.
select * from tb_curso
inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id;

-- Faça um select onde traga todos os Produtos de uma categoria específica (exemplo todos os produtos que são da categoria Java).
select * from tb_curso
inner join tb_categoria on tb_categoria.id = tb_curso.categoria_id
where tb_categoria.descricao = "Linguagem de programação";
