CREATE TABLE EDITORIAL (
Nombre varchar (15) ,
Dirección varchar (15),
primary key (Nombre)
);
CREATE TABLE AUTORES (
Nombre varchar(15), 
Nacionalidad varchar(15),
primary key (Nombre)
);

INSERT into AUTORES values ('pepe', 'venezuela', 'hotmail');

alter table AUTORES ADD CORREO VARCHAR (15) NOT NULL;--añadir columnas 
RENAME EDITORIAL TO EDITORIALES;--renombrar tablas 

CREATE TABLE LIBROS (
ISBN varchar(20) primary key, 
Titulo varchar (10), 
Autor varchar(15) references AUTORES, 
Editorial varchar (15) references EDITORIAL,
AnioEdicion date
);

--INSERT into LIBROS values ('258653', 'ven0ekzuela', 'per0ihco' , 'mi ediutorial', '2019');


CREATE TABLE SOCIOS (
NúmeroSocio number primary key, 
Nombre varchar (10), 
Dirección varchar (20), 
Tfno varchar (10), 
DNI varchar (10) );


CREATE TABLE PRESTAMOS (
Codigo number primary key, 
Fecha date, 
Socio number references SOCIOS , 
Libro varchar(20) references LIBROS );

