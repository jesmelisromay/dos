/*1- Crear tabla EMPLEADOS de la siguiente forma:

CREATE TABLE EMPLEADOS (
APELLIDO VARCHAR2(20),
NOMBRE VARCHAR2(20) NOT NULL,
DOMICILIO VARCHAR2(30));*/

CREATE TABLE EMPLEADOS (
APELLIDO VARCHAR2(20),
NOMBRE VARCHAR2(20) NOT NULL,
DOMICILIO VARCHAR2(30));

--2. Añadir el campo fechaIngreso de tipo DATE  y que acepte valores nulos.
alter table EMPLEADOS add fechaIngreso date DEFAULT SYSDATE;

--3. Comprobar que la tabla ha cambiado con la orden DESCRIBE.
 DESC EMPLEADOS;
 
 --4. Agregar un campo “sección” de tipo carácter que no permita valores nulos
 alter table EMPLEADOS add sección varchar(20);
 
 --5. Agregar el campo “sueldo” no nulo y con valor 0 por defecto
 alter table EMPLEADOS add sueldo NUMBER(2) DEFAULT 0 not null;
 
 /*6. Crear las siguientes tablas:

create table secciones(
  codigo number(2),
  nombre varchar(20),
  primary key (codigo)
 );

 create table empleados(
  apellido varchar2(20) not null,
  nombre varchar2(20),
  domicilio varchar2(30),
  seccion number(2),
  fechaingreso date,
  telefono number(7),
  constraint emp_sec_fk  foreign key (seccion) references secciones (codigo) on delete set null
 );
*/

create table secciones(
codigo number(2),
nombre varchar(20),
primary key (codigo)
);

create table empleados2(
apellido varchar2(20) not null,
nombre varchar2(20),
domicilio varchar2(30),
seccion number(2),
fechaingreso date,
telefono number(7),
constraint emp_sec_fk  foreign key (seccion) references secciones (codigo) on delete set null);

--7. Modificar el campo teléfono a varchar2(11).

alter table empleados2 modify telefono varchar2(11);

--8. Modificar el campo nombre de empleados para que permita cadenas variables de 10 caracteres.
alter table empleados2 modify nombre varchar(10);

--9. Intentar cambiar el tipo de dato del campo “código” de “secciones” a char(2).
alter table secciones modify codigo char(2);
alter table empleados2 drop CONSTRAINT emp_sec_fk;
alter table empleados2 modify seccion char(2);
alter table empleados2 add constraint emp_sec_fk_l  foreign key (seccion) references secciones;

--10. Crear la siguiente tabla de empleados:
create table empleados3(
documento char(8) not null,
nombre varchar2(10),
domicilio varchar2(30),
ciudad varchar2(20) default 'Buenos Aires');

--11. Añadir el campo “hijos” de tipo number(2) y en la misma sentencia una restricción “check” que no permita valores superiores a 30.
alter table empleados3 add hijos number(2) check (hijos>30);
alter table empleados3 modify hijos check (hijos<30);
desc empleados3; 
alter table empleados3 drop constraint SYS_C007033;

--12.  Intentar agregar el campo “sueldo” de tipo number(6,2) no nulo y una restricción “check” que no permita valores negativos para dicho campo.
alter table empleados3 add sueldo number(6,2) not null check (sueldo>0);

--13.  Agregar el campo “sueldo” de tipo number(6,2) no nulo, con un valor por defecto 0  y una restricción “check” que no permita valores negativos para dicho campo.
alter table empleados3 modify sueldo default 0;
