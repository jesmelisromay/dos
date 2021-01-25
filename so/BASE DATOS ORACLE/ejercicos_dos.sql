--EJERCICIOS DE CREACIÓN DE TABLAS CON RESTRICCIONES
--Realizar los siguientes ejercicios:
--1.	Crea la tabla EJEMPLO1 con los campos: DNI varchar2(10) y no nulo, nombre varchar2(30)
--y fecha con la fecha del sistema como valor por defecto.

create table EJEMPLO1(
DNI varchar2(10)  not null,
nombre varchar2(30),
fecha date DEFAULT SYSDATE);

--2. Crea la tabla EJEMPLO2 con las columnas DNI, NOMBRE y USUARIO y asignar por defecto a la
--columna NOMBRE el literal ‘No definido’ y a la columna USUARIO, el número identificativo del usuario (pseudocolumna UID).
select UID from dual;--mi numero de usuario

create table EJEMPLO2(
DNI varchar(10) ,
NOMBRE varchar(30) default 'no definido',
USUARIO varchar(10) default UID);

--3.	Crea una tabla EJEMPLO3 con las siguientes columnas: DNI varchar2(10),
--NOMBRE varchar2 (30), EDAD number(2) y CURSO number y las restricciones siguientes:

--	El DNI no puede ser nulo.
--	La clave primaria es el DNI.
--	El NOMBRE no puede ser nulo.
--	La EDAD debe estar comprendida entre 5 y 20 años.
--	El NOMBRE debe estar en mayúsculas.
--	El CURSO solo puede almacenar 1, 2 o 3.

create table EJEMPLO3 (
DNI varchar2(10)not null,
NOMBRE varchar2 (30) primary key check (NOMBRE = upper(NOMBRE)),
EDAD number(2) check (edad BETWEEN 5 and 20),
CURSO number check (CURSO in (1,2,3))
);

/*4.	Crea las siguientes tablas con las restricciones definidas.
Tabla ARTICULOS
ARTICULO VARCHAR2(20)
COD_FABRICANTE NUMBER(3)
PESO NUMBER(3)
CATEGORIA VARCHAR2(10)
PRECIO_VENTA NUMBER(6,2)
PRECIO_COSTO NUMBER(6,2)
EXISTENCIAS NUMBER(5)


Tabla FABRICANTES 
COD_FABRICANTE NUMBER(3)
NOMBRE VARCHAR2(15)
PAIS VARCHAR2(15)

Restricciones para la tabla FABRICANTES:
– La clave primaria es COD_FABRICANTE.
– Las columnas NOMBRE y PAIS han de almacenarse en mayúscula.
Restricciones para la tabla ARTICULOS:
– La clave primaria está formada por las columnas: ARTICULO, COD_FABRICANTE, PESO y CATEGORIA.
– COD_FABRICANTE es clave ajena que referencia a la tabla FABRICANTES.
– PRECIO_VENTA, PRECIO_COSTO y PESO han de ser > 0.
– CATEGORIA ha de ser 'Primera', 'Segunda' o 'Tercera'.*/


create table ARTICULOS(
ARTICULO VARCHAR2(20),
COD_FABRICANTE NUMBER(3) references FABRICANTES ,
PESO NUMBER(3),
CATEGORIA VARCHAR2(10) check (CATEGORIA in ('Primera', 'Segunda' , 'Tercera')) ,
PRECIO_VENTA NUMBER(6,2),
PRECIO_COSTO NUMBER(6,2),
EXISTENCIAS NUMBER(5),
CONSTRAINT mayorp CHECK (PESO > 0),
CONSTRAINT mayorv CHECK (PRECIO_VENTA > 0),
CONSTRAINT mayorc CHECK (PRECIO_COSTO > 0),
primary key(ARTICULO, COD_FABRICANTE, PESO, CATEGORIA)
);

create table FABRICANTES (
COD_FABRICANTE NUMBER(3) primary key,
NOMBRE VARCHAR2(15) check (NOMBRE = upper(NOMBRE)),
PAIS VARCHAR2(15) check (PAIS = upper(pais))
);

insert into EJEMPLO1 values (1, 'pepe' , '01/01/2019');
insert into EJEMPLO1 (DNI, NOMBRE) values (1, 'ana');

insert into EJEMPLO2  values (1, 'juanito', 2);
insert into EJEMPLO2 (DNI) values (1);


insert into EJEMPLO3  values (1, 'ANITA', 25 ,1);--error por edad
insert into EJEMPLO3  values (1, 'anais', 20 ,1);--eror por nombre en minuscula
insert into EJEMPLO3  values (1, 'PEPITO', 20 ,4);--error por curso
insert into EJEMPLO3  values (1, 'ANITA', 20 ,1);

insert into FABRICANTES values (100, 'PEPE', 'FRANCIA');
INSERT INTO ARTICULOS VALUES ('ARTI1', 102, 2, 'PRIMERA' ,5,3,50);
INSERT INTO ARTICULOS VALUES ('ARTI1', 100, 2, 'Primera', 5, 3, 50);
INSERT INTO ARTICULOS VALUES ('ARTI1', 100, 2, 'Segunda', 5, 3, 50);
INSERT INTO ARTICULOS VALUES ('ARTI1', 100, 2, 'Tercera', -1, 3, 50);