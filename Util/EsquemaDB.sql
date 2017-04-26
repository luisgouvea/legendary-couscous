CREATE TABLE produtos  
( id_produtos(10) NOT NULL,  
  genero varchar2(200) NOT NULL,  
  desconto number(15),
  nomeAutor varchar2(200),
  titulo varchar2(200),
  CONSTRAINT id_produtos PRIMARY KEY (id_produtos)  
);  


INSERT INTO produtos (id_produtos, genero, desconto, nomeAutor, titulo) VALUES (1, "ficcao", 30, "Joao da Silva", "O viver do mundo");