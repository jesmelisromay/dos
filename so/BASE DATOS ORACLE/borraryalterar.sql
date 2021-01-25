CREATE TABLE usuarios (
credito number (4) CHECK (credito BETWEEN 0 and 2000); --ambos incluidos 

INSERT into usuarios values (1500);

select * from usuarios;

INSERT into usuarios values (2001); -- da error 
 
alter table usuarios ADD nombre VARCHAR (25) primary key;

delete usuarios; --borrar filas su contenido no tablas  
INSERT into usuarios values (1500, 'pepe');
INSERT into usuarios values (2000, 'ana');
INSERT into usuarios values (2000, 'pepe');
INSERT into usuarios (nombre) values ('maria'); --insertar solo inserto un una fila 
INSERT into usuarios values (1652, 'jshdhdfffffffffffffffffffffffffffffffffffffffffffffffffffffffffff');
alter table usuarios modify nombre VARCHAR (80); -- alteerar el tamañano de esta fila 

alter table usuarios drop CONSTRAINT SYS_C007009; -- borro la restrincion o la CONSTRAINT 
alter table usuarios rename CONSTRAINT SYS_C007009 to maxcredito; -- renombras la CONSTRAINT

alter table usuarios disable CONSTRAINT SYS_C007010;-- desctiva la CONSTRAINT
INSERT into usuarios values (2500, 'pepe');

alter table usuarios enable CONSTRAINT SYS_C007010; -- activar la CONSTRAINT

