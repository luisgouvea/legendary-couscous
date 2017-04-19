CREATE TABLE produtos  
( id_produtos number(10) NOT NULL,  
  genero varchar2(200) NOT NULL,  
  desconto number(15),
  nomeAutor varchar2(200),
  titulo varchar2(200),
  CONSTRAINT id_produtos PRIMARY KEY (id_produtos)  
);  
