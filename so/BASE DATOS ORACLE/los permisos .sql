desc dba_users; --descripcion de la base de datos
select username from dba_users; --consultar los usuarios
select username, created from dba_users; --consultar usuarios con fechas 
create user prueba identified by prueba;
select from cat; -- muestra todas mis tablas

--permisos de sistemas 
--show user
-- grant create session to usuario, usuario; --nos conectamos
--whit admin option que el usuario puede compartir el permiso que se le de 
--grant create table to usuario --damos permisos de tabla
--grant resource to usuario--da permisos de crear tabla en un espacio 
--select * from cat--mostrar todas las tablas
--revoke create session from usuario;

--privilegios de objectos  -- solo existe insertar modificar borrar 
--grant select on tabla to usuario --da permiso sobre la tabla y para consultar esa tabla en el usuario dado el permiso se pone select * from usuario.tabla;
--grant insert on tabla to  usuario -- da permiso sobre la tabla para insertar ---insert into usuarioprincipal.tabla values (...,...); 
--revoke insert on tabla from usuario
/*verificar mis permisos de objectos select * from user_tab_privs_recd


--un rol es un conjunto de privilegios /*
/*en oracle viene por defecto connect  resourse  dba 
al dar permiso por objactos puedo poner whint gran option 
any table es crear tabla en cualquier esquema
create role acesso
grant select, insert on tabla to acceso --le doy al rol acceso estos permisos de objectos
grant  insert on tabla to acceso--le doy al rol acceso estos permisos de objectos
grant create session to acceso--le doy al rol acceso estos permisos de sistemas 
grant acceso to usuario -- le doy a este usuario todos los permiso que tiene acceso 