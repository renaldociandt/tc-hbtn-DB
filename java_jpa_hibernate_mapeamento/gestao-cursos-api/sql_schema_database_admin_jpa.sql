-- TABLE
CREATE TABLE Aluno (id bigint not null, email varchar(255), matricula varchar(255), nascimento date, nomeCompleto varchar(255), primary key (id));
CREATE TABLE Aluno_Curso (Aluno_id bigint not null, cursos_id bigint not null);
CREATE TABLE Aluno_Endereco (Aluno_id bigint not null, enderecos_id bigint not null, unique (enderecos_id));
CREATE TABLE Curso (id  integer, nome varchar(255), sigla varchar(255), materialCurso_id bigint, professor_id bigint, primary key (id));
CREATE TABLE Curso_Aluno (Curso_id bigint not null, alunos_id bigint not null);
CREATE TABLE Endereco (id bigint not null, bairo varchar(255), cep varchar(255), cidade varchar(255), endereco varchar(255), estado varchar(255), logradouro varchar(255), numero varchar(255), aluno_id bigint, primary key (id));
CREATE TABLE MaterialCurso (id bigint not null, url varchar(255), curso_id bigint, primary key (id));
CREATE TABLE Professor (id bigint not null, email varchar(255), matricula varchar(255), nomeCompleto varchar(255), primary key (id));
CREATE TABLE Professor_Curso (Professor_id bigint not null, cursos_id bigint not null, unique (cursos_id));
CREATE TABLE Telefone (id  integer, ddd varchar(255), numero varchar(255), aluno_id bigint, telefones_id bigint, primary key (id));
 
-- INDEX
 
-- TRIGGER
 
-- VIEW
 
