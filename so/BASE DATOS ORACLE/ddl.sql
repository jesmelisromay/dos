create user ddl IDENTIFIED BY ddl;
grant dba to ddl;

create table empleados (
dni number (8) primary key,
nombre varchar (10) not null,
apellido1 varchar (15)not null,
apellido2 varchar (15),
direccion1 varchar (25),
direccion2 varchar (25),
ciudad varchar (20),
municipio varchar (20),
cod_postal varchar (5),
sexo char (1) check (sexo in('m','h')),
fecha_nac date
);

create table estudios(
empleado_dni number (8)  references empleados ,
universidad number (5) references UNIVERSIDADES ,
anio smallint,
grado varchar(3),
especialidad varchar (20) );

create table historial_salarial (
empleado_dni number(8) references empleados,
salario integer,
fecha_comienzo date,
fecha_fin date,
CONSTRAINT fechamayor check (fecha_comienzo>fecha_fin), 
primary key (EMPLEADO_DNI, fecha_comienzo, salario)
);

create table trabajos (
trabajo_cod number (5) PRIMARY key,
nombre_trab varchar (20) unique,
salario_min number(2) not null,
salario_max number (2) not null 
);

create table departamentos (
DPTO_COD NUMBER(5) primary key,
NOMBRE_DPTO VARCHAR(30) unique,
JEFE NUMBER(5),
PRESUPUESTO INTEGER not null,
PRES_ACTUAL INTEGER not null
);


create table UNIVERSIDADES (
UNIV_COD NUMBER(5) primary key ,
NOMBRE_UNIV VARCHAR(25) unique,
CIUDAD VARCHAR(20),
MUNICIPIO VARCHAR(20),
COD_POSTAL VARCHAR(5)
);

create table HISTORIAL_LABORAL (
EMPLEADO_DNI NUMBER(8) references empleados,
TRAB_COD NUMBER(5) references trabajos,
FECHA_INICIO DATe,
FECHA_FIN DATE ,
DPTO_COD NUMBER(5) references departamentos ,
SUPERVISOR_DNI NUMBER(8),
CONSTRAINT fechamayorlaboral check (FECHA_INICIO>fecha_fin),
primary key(EMPLEADO_DNI, FECHA_INICIO)
);



---.  Añada una restricción que obligue a que las personas de sexo masculino hayan de tener el campo Fecha de Nacimiento NOT NULL.

alter table empleados add CONSTRAINT hombresfechasnull check ((sexo='h' and fecha_nac is not null) or sexo='m');

--.  Añada un nuevo atributo Valoración en la tabla de Empleados que indica de 1 a 10 la valoración que obtuvo el 
--empleado en su entrevista de trabajo al iniciar su andadura en la empresa. Ponga el valor por defecto 5 para ese campo.


alter table empleados add valoracion number default 5 check (valoracion between 1 and 10) ;
insert into EMPLEADOS (dni , nombre, apellido1) values  (4363883, 'ayari', 'apellido');
select * from EMPLEADOS;

--Elimine la restricción de que el atributo Nombre de la tabla empleado no puede ser nulo.
alter table empleados drop constraint SYS_C007040; 

--Modificar el tipo de datos de Direcc1 de la tabla Empleados a cadena de caracteres de 40 como máximo. 
--¿Podría modificar el tipo de datos del atributo Código de empleado a VARCHAR(40)?
--¿Y la fecha de nacimiento convertirla a tipo cadena?

alter table empleados modify direccion1 varchar (40);
--no se puede  ya que es primary key y tiene foring key
--no se puede por que tiene una contraisn asociada 

--5.  Cambiar la clave primaria de Empleados al nombre y los dos apellidos.
--no se puede y ya esta 

--Borrar todas las tablas. ¿Hay que tener en cuenta las claves foráneas a la hora de borrar las tablas?
-- lo mas facil es borrar el usuario 
--estudios 
--univerdisidad 
--historiales
--


