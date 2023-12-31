#Criação do Esquema
CREATE DATABASE EMPRESA;

USE EMPRESA;

#Criação da Tabela FUNCIONARIO
CREATE TABLE EMPRESA.FUNCIONARIO (
	Pnome varchar(15) NOT NULL,
	Minicial char,
	Unome varchar(15) NOT NULL,
	Cpf char(11),
	Datanasc date,
	endereco varchar(255),
	Sexo char,
	Salario decimal (10,2),
	Cpf_supervisor char(11),
	Dnr int,
	PRIMARY KEY (Cpf),
	FOREIGN KEY (Cpf_supervisor) REFERENCES FUNCIONARIO(Cpf)
);

#Tabela de DEPARTAMENTO
CREATE TABLE EMPRESA.DEPARTAMENTO(
	Dnome VARCHAR(15) NOT NULL,
	Dnumero INT,
	Cpf_gerente CHAR(11),
	Data_Inicio_Gerente DATE,
	PRIMARY KEY (Dnumero),
	UNIQUE (Dnome),
	FOREIGN KEY (Cpf_gerente) REFERENCES FUNCIONARIO(Cpf)
);

#Adicionando restrição referencial em FUNCIONARIO de DEPARTAMENTO
#Criando um ALTERAÇÃO de Tabela
ALTER TABLE EMPRESA.FUNCIONARIO
ADD CONSTRAINT Dnr
FOREIGN KEY (Dnr) REFERENCES DEPARTAMENTO(Dnumero);

#Criação da Tabela de LOCALIZAO_DEP
CREATE TABLE EMPRESA.LOCALIZACAO_DEP(
	Dnumero INT NOT NULL,
    Dlocal VARCHAR(15) NOT NULL,
    PRIMARY KEY (Dnumero, Dlocal),
    FOREIGN KEY (Dnumero) REFERENCES DEPARTAMENTO(Dnumero)
);

#Criação da tabela PROJETO
CREATE TABLE EMPRESA.PROJETO(
	Projnome VARCHAR(15) NOT NULL,
	Projnumero INT NOT  NULL,
	Projlocal VARCHAR(15),
	Dnum INT,
	PRIMARY KEY (Projnumero),
    UNIQUE (Projnome),
    FOREIGN KEY (Dnum) REFERENCES DEPARTAMENTO(Dnumero)
);

#Criação da tabela TRABALHA_EM
CREATE TABLE EMPRESA.TRABALHA_EM(
	Fcpf CHAR(11) NOT NULL,
    Pnr INT NOT NULL,
    Horas DECIMAL(3,1) NOT NULL,
    PRIMARY KEY (Fcpf, Pnr),
    FOREIGN KEY (Fcpf) REFERENCES FUNCIONARIO(Cpf),
    FOREIGN KEY (Pnr) REFERENCES PROJETO (Projnumero)
);

#Criação da tabela DEPENDENTE 
CREATE TABLE EMPRESA.DEPENDENTE (
	Fcpf CHAR(11) NOT NULL,
    Nome_dependente VARCHAR(15) NOT NULL,
    Sexo CHAR,
    Datanasc DATE,
    Parentesco VARCHAR(8),
    PRIMARY KEY (Fcpf, Nome_dependente),
    FOREIGN KEY (Fcpf) REFERENCES FUNCIONARIO(Cpf)

);

INSERT INTO DEPARTAMENTO (Dnome, Dnumero) VALUES ("Pesquisa", 5);
INSERT INTO DEPARTAMENTO (Dnome, Dnumero) VALUES ("Administração", 4);
INSERT INTO DEPARTAMENTO (Dnome, Dnumero) VALUES ("Matriz", 1);
INSERT INTO FUNCIONARIO VALUES ("Jorge", "E", "Brito", "88866555576", '1937-11-10', "Rua do Horto, 35, São Paulo, SP", "M", 35.000, NULL, 1);
INSERT INTO FUNCIONARIO VALUES ("Jennifer", "S", "Souza", "98765432168", '1941-06-20', "Av. Arthur de Lima. 54, Santo André, SP", "F", 43.000, "88866555576", 4);
INSERT INTO FUNCIONARIO VALUES ("Fernando", "T", "Wong", "33344555587", '1955-12-08', "Rua da Lapa, 34, São Paulo, SP", "M", 40.000, "88866555576", 5);
INSERT INTO FUNCIONARIO VALUES ("João", "B", "Silva", "12345678966", '1965-01-09', "Rua das Flores, 751, São Paulo, SP", "M", 30.000, "33344555587", 5);
INSERT INTO FUNCIONARIO VALUES ("Alice", "J", "Zelaya", "99988777767", '1968-01-19', "Rua Souza Lima, 35, Curitiba, PR", "F", 25.000, "98765432168", 4);
INSERT INTO FUNCIONARIO VALUES ("Ronaldo", "K", "Lima", "66688444476", '1962-09-15', "Rua Rebbouças, 65, Piracicaba, SP", "M", 38.000, "33344555587", 5);
INSERT INTO FUNCIONARIO VALUES ("Joice", "A", "Leite", "45345345376", '1972-07-31', "Av. Lucas Obes, 74, São Paulo, SP", "F", 25.000, "33344555587", 5);
INSERT INTO FUNCIONARIO VALUES ("André", "V", "Pereira", "98798798733", '1969-03-29', "Rua Timbira, 35, São Paulo, SP", "M", 25.000, "98765432168", 4);

#Corrigindo erro de inserçãoptimize
UPDATE FUNCIONARIO SET endereco = "Rua Rebouças, 65, Piracicaba, SP" WHERE Cpf = "66688444476";

#Finalizando o preenchimento da tabela DEPARTAMENTO
UPDATE DEPARTAMENTO SET Cpf_gerente = "33344555587", Data_Inicio_Gerente = '1988-05-22' WHERE Dnumero = 5;
UPDATE DEPARTAMENTO SET Cpf_gerente = "98765432168", Data_Inicio_Gerente = '1995-01-01' WHERE Dnumero = 4;
UPDATE DEPARTAMENTO SET Cpf_gerente = "88866555576", Data_Inicio_Gerente = '1981-06-19' WHERE Dnumero = 1;

SELECT * FROM DEPARTAMENTO;

INSERT INTO LOCALIZACAO_DEP VALUES (1, "São Paulo");
INSERT INTO LOCALIZACAO_DEP VALUES (4, "Mauá");
INSERT INTO LOCALIZACAO_DEP VALUES (5, "Santo André");
INSERT INTO LOCALIZACAO_DEP VALUES (5, "Itu");
INSERT INTO LOCALIZACAO_DEP VALUES (5, "São Paulo");

SELECT * FROM LOCALIZACAO_DEP;

INSERT INTO PROJETO VALUES ("ProdutoX", 1, "Santo André", 5);
INSERT INTO PROJETO VALUES ("ProdutoY", 2, "Itu", 5);
INSERT INTO PROJETO VALUES ("ProdutoZ", 3, "São Paulo", 5);
INSERT INTO PROJETO VALUES ("Informatização", 10, "Mauá", 4);
INSERT INTO PROJETO VALUES ("Reorganização", 20, "São Paulo", 1);
INSERT INTO PROJETO VALUES ("Novosbenefícios", 30, "Mauá", 4);

SELECT * FROM FUNCIONARIO;

INSERT INTO TRABALHA_EM VALUES ("12345678966", 1, 32.5);
INSERT INTO TRABALHA_EM VALUES ("12345678966", 2, 7.5);
INSERT INTO TRABALHA_EM VALUES ("66688444476", 3, 40.0);
INSERT INTO TRABALHA_EM VALUES ("45345345376", 1, 20.0);
INSERT INTO TRABALHA_EM VALUES ("45345345376", 2, 20.0);
INSERT INTO TRABALHA_EM VALUES ("33344555587", 2, 10.0);
INSERT INTO TRABALHA_EM VALUES ("33344555587", 3, 10.0);
INSERT INTO TRABALHA_EM VALUES ("33344555587", 10, 10.0);
INSERT INTO TRABALHA_EM VALUES ("33344555587", 20, 10.0);
INSERT INTO TRABALHA_EM VALUES ("99988777767", 30, 30.0);
INSERT INTO TRABALHA_EM VALUES ("99988777767", 10, 10.0);
INSERT INTO TRABALHA_EM VALUES ("98798798733", 10, 35.0);
INSERT INTO TRABALHA_EM VALUES ("98798798733", 30, 5.0);
INSERT INTO TRABALHA_EM VALUES ("98765432168", 30, 20.0);
INSERT INTO TRABALHA_EM VALUES ("98765432168", 20, 15.0);
INSERT INTO TRABALHA_EM VALUES ("88866555576", 20, NULL);

#Mudando o campo Horas da tabela TRABALHA_EM  para NULL
ALTER TABLE TRABALHA_EM MODIFY COLUMN Horas DECIMAL(3,1) NULL;

SELECT * FROM TRABALHA_EM;

INSERT INTO DEPENDENTE VALUES ("33344555587", "Alicia", "F", '1986-04-05', "Filha");
INSERT INTO DEPENDENTE VALUES ("33344555587", "Tiago", "M", '1983-10-25', "Filho");
INSERT INTO DEPENDENTE VALUES ("33344555587", "Janaína", "F", '1958-05-03', "Esposa");
INSERT INTO DEPENDENTE VALUES ("98765432168", "Antonio", "M", '1942-02-28', "Marido");
INSERT INTO DEPENDENTE VALUES ("12345678966", "Michael", "M", '1988-01-04', "Filho");
INSERT INTO DEPENDENTE VALUES ("12345678966", "Alicia", "F", '1988-12-30', "Filha");
INSERT INTO DEPENDENTE VALUES ("12345678966", "Elizabeth", "F", '1967-05-05', "Esposa");

SELECT * FROM DEPENDENTE;

SELECT * FROM DEPARTAMENTO;

SELECT DataNasc, endereco FROM FUNCIONARIO WHERE Pnome = "João" && Minicial = "B" && Unome = "Silva";
SELECT Datanasc AS 'data', endereco AS 'endereço' FROM FUNCIONARIO WHERE Pnome = "João" && Minicial = "B" && Unome = "Silva";
SELECT Pnome, endereco FROM FUNCIONARIO, DEPARTAMENTO WHERE Dnome = "Pesquisa" && Dnumero = Dnr;
SELECT Projnumero, Dnumero, Unome, endereco, Datanasc FROM PROJETO, DEPARTAMENTO, FUNCIONARIO WHERE Projlocal = "Maua" && Cpf = Cpf_gerente && Dnumero = Dnum; 

SELECT F.Pnome, F.Unome, F.endereco 
FROM FUNCIONARIO F, DEPARTAMENTO D
WHERE D.DNome = 'Pesquisa' AND D.DNumero = F.Dnr;

SELECT Cpf FROM FUNCIONARIO;
SELECT Cpf, Dnome FROM FUNCIONARIO, DEPARTAMENTO;

SELECT ALL Salario FROM FUNCIONARIO;
SELECT DISTINCT Salario FROM FUNCIONARIO;

SELECT Pnome, Unome 
FROM FUNCIONARIO 
WHERE endereco LIKE '%São Paulo, SP%';

SELECT Pnome, Unome
FROM FUNCIONARIO 
WHERE Datanasc LIKE '__5_______';

SELECT F.Pnome, F.Unome, 1.1 * F.Salario AS Aumento_Salario
FROM FUNCIONARIO AS F, TRABALHA_EM AS T, PROJETO AS P
WHERE F.Cpf = T.Fcpf && T.Pnr = P.Projnumero && P.Projnome = 'ProdutoX';

SELECT *
FROM funcionario 
WHERE (Salario BETWEEN 30.000 AND 40.000) AND Dnr = 5;

SELECT D.Dnome, F.Unome, P.Projnome
FROM DEPARTAMENTO D, FUNCIONARIO F, TRABALHA_EM T, PROJETO P 
WHERE D.Dnumero = F.Dnr && F.Cpf = T.Fcpf && T.Pnr = P.Projnumero 
ORDER BY D.Dnome, F.Unome, F.Pnome;

SELECT D.Dnome, F.Unome, P.Projnome
FROM DEPARTAMENTO D, FUNCIONARIO F, TRABALHA_EM T, PROJETO P 
WHERE D.Dnumero = F.Dnr && F.Cpf = T.Fcpf && T.Pnr = P.Projnumero 
ORDER BY D.Dnome DESC, F.Unome ASC, F.Pnome ASC;