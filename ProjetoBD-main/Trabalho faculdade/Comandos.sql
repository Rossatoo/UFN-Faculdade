/* Lógico_1: */
create database FACULDADE;
use faculdade;
CREATE TABLE ALUNO (
    Nome varchar(40),
    Numero_aluno int PRIMARY KEY,
    Tipo_aluno int,
    Curso Char(5)
);

CREATE TABLE TURMA (
    Identificacao_turma int PRIMARY KEY,
    Numero_disciplina varchar(10),
    Semestre varchar(10),
    Ano int,
    Professor varchar(20),
    Numero_disciplina varchar(10)
);

CREATE TABLE DISCIPLINA (
    Nome_disciplina varchar(40),
    Numero_disciplina varchar(10) PRIMARY KEY,
    Creditos int,
    Departamento char(5)
);

CREATE TABLE HISTORICO_ESCOLAR (
    Nota char(1),
    Identificacao_turma int,
    Numero_aluno int,
    PRIMARY KEY (Identificacao_turma, Numero_aluno)
);

CREATE TABLE PRE_REQUISITO (
    Numero_disciplina varchar(10),
    Numero_pre_requisito varchar(10),
    PRIMARY KEY (Numero_disciplina, Numero_pre_requisito)
);
 
ALTER TABLE TURMA ADD CONSTRAINT FK_TURMA_2
    FOREIGN KEY (Numero_disciplina)
    REFERENCES DISCIPLINA (Numero_disciplina)
    ON DELETE CASCADE;
 
ALTER TABLE HISTORICO_ESCOLAR ADD CONSTRAINT FK_HISTORICO_ESCOLAR_1
    FOREIGN KEY (Identificacao_turma)
    REFERENCES TURMA (Identificacao_turma);
 
ALTER TABLE HISTORICO_ESCOLAR ADD CONSTRAINT FK_HISTORICO_ESCOLAR_2
    FOREIGN KEY (Numero_aluno)
    REFERENCES ALUNO (Numero_aluno);
 
ALTER TABLE PRE_REQUISITO ADD CONSTRAINT FK_PRE_REQUISITO_1
    FOREIGN KEY (Numero_disciplina)
    REFERENCES DISCIPLINA (Numero_disciplina)
    ON DELETE RESTRICT;
 
ALTER TABLE PRE_REQUISITO ADD CONSTRAINT FK_PRE_REQUISITO_2
    FOREIGN KEY (Numero_pre_requisito)
    REFERENCES DISCIPLINA (Numero_disciplina)
    ON DELETE RESTRICT;