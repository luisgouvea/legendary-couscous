drop table produtos;

CREATE TABLE produtos  
( id_produtos(10) NOT NULL,  
  genero varchar2(200) NOT NULL,  
  desconto number(15),
  nomeAutor varchar2(200),
  titulo varchar2(200),
  CONSTRAINT id_produtos PRIMARY KEY (id_produtos)  
);  

CREATE SEQUENCE AUT_INC_PRODUTOS START WITH 1 increment by 1 minvalue 1 maxvalue 9999999999;

CREATE OR REPLACE TRIGGER TRIGGER_AUT_INC_PRODUTOS  
   before insert on "BD109323"."PRODUTOS" 
   for each row 
begin  
   if inserting then 
      if :NEW."ID_PRODUTOS" is null then 
         select AUT_INC_PRODUTOS.nextval into :NEW."ID_PRODUTOS" from dual; 
      end if; 
   end if; 
end;



INSERT INTO produtos (genero, desconto, nomeAutor, titulo) VALUES ('ficcao', 30, 'Joao da Silva', 'O viver do mundo');
INSERT INTO produtos (genero, desconto, nomeAutor, titulo) VALUES ('romance', 5, 'Joana Viana', 'A maquina mortifera');
INSERT INTO produtos (genero, desconto, nomeAutor, titulo) VALUES ('suspense', 10, 'Carlos Moreira', 'SGBD em Sistemas');
INSERT INTO produtos (genero, desconto, nomeAutor, titulo) VALUES ('escolar', 10, 'Beth Goncalves', 'Ingles na cabeca');
INSERT INTO produtos (genero, desconto, nomeAutor, titulo) VALUES ('narrativas', 15, 'Rosangela Vieira', 'O caminho do Sertao');