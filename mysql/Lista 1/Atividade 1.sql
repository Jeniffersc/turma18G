-- Crie um banco de dados para um serviço de RH de uma empresa, onde o sistema
-- trabalhará com as informações dos funcionários desta empresa.
-- Crie uma tabela de funcionários e utilizando a habilidade de abstração 
-- e determine 5 atributos relevantes dos funcionários para se trabalhar com o serviço deste RH.
-- Popule esta tabela com até 5 dados;
-- Faça um select que retorne os funcionários com o salário maior do que 2000.
-- Faça um select que retorne os funcionários com o salário menor do que 2000.
-- Ao término atualize um dado desta tabela através de uma query de atualização.
-- salve as querys para cada uma dos requisitos o exercício em um arquivo .SQL ou texto 
-- e coloque no seu GitHuB pessoal e compartilhe esta atividade.

-- criar um banco de dados;
CREATE database db_empresa_rh;

use db_rh_empresa;

create table tb_func (
id bigint auto_increment,
nome varchar(255) not null,
nascimento date not null,
salario float not null,
genero enum('M','F') not null,
nacionalidade varchar(20) default 'Brasil',
primary key(id)
);

insert into tb_func (nome, nascimento, salario, genero, nacionalidade) values ('Eduardo','1984-01-02','2000','M');
insert into tb_func (nome, nascimento, salario, genero, nacionalidade) values ("Jeniffer",'2001-04-19','7000','F');
insert into tb_func (nome, nascimento, salario, genero, nacionalidade) values ('Maria','1986-09-02','20000','F');
insert into tb_func (nome, nascimento, salario, genero, nacionalidade) values ("Jaqueline",'2010-05-18','700','F');
insert into tb_func (nome, nascimento, salario, genero, nacionalidade) values ('Bruno','1852-11-12','9000','M', 'Mexico');

-- Faça um select que retorne os funcionários com o salário MAIOR do que 2000.
select nome from tb_func
where salario > '2000';

-- Faça um select que retorne os funcionários com o salário MENOR do que 2000.
select nome from tb_func
where salario < '2000';


