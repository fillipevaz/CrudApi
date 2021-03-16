create database crud;

CREATE TABLE livro 
(codigo int NOT NULL AUTO_INCREMENT, 
autor varchar(100) NOT NULL, 
nome varchar(100) NOT NULL, 
edicao int, PRIMARY KEY (codigo)) 
ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 DEFAULT COLLATE=utf8mb4_0900_ai_ci;