-- Crie um banco de dados para um registro de uma escola, onde o sistema trabalhará com as
-- informações dos alunos deste registro dessa escola.
-- Crie uma tabela alunos/a e utilizando a habilidade de abstração e determine 5 atributos
-- relevantes dos alunos/a para se trabalhar com o serviço dessa escola.
-- Popule esta tabela com até 8 dados;
-- Faça um select que retorne o/as alunos/a com a nota maior do que 7.
-- Faça um select que retorne o/as alunos/a com a nota menor do que 7.
-- Ao término atualize um dado desta tabela através de uma query de atualização.
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto e
-- coloque no seu GitHuB pessoal e compartilhe esta atividade.

create database db_escola;

use db_escola;

create table tb_alune(
id bigint auto_increment,
nome varchar(255) not null,
nascimento date not null,
nota float not null,
genero enum('M','F') not null,
-- Matutino, Tarde, Noite
periodo enum('M','T','N') not null, 
primary key(id)
);

insert into tb_alune (nome, nascimento, nota, genero, periodo) values ('Angelina','2021-01-02','5','F','M');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ("João",'2001-04-19','6.52','M','M');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ('Murilo','1986-09-02','10','M','T');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ("Liza",'2010-05-18','7','F','M');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ('Camis','2021-01-12','9','F','T');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ('Ed','2020-01-02','2','M','N');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ("Lucas",'2021-02-19','7.58','M','N');
insert into tb_alune (nome, nascimento, nota, genero, periodo) values ('Igor','2019-09-02','2','M','N');

-- Faça um select que retorne o/as alunos/a com a nota maior do que 7.
select nome from tb_alune
where nota >= '7';

-- Faça um select que retorne o/as alunos/a com a nota menor do que 7.
select nome from tb_alune
where nota < '7';

update tb_alune
set nota = '9'
where id = '6';

select * from tb_alune;