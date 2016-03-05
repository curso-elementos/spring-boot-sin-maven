
DROP TABLE RESERVACION;
drop table TARJETA1;
DROP TABLE CLIENTE;

CREATE TABLE CLIENTE (ID_CLIENTE INTEGER PRIMARY KEY AUTO_INCREMENT,
NOMBRE VARCHAR(100), EMAIL VARCHAR(100), PATERNO VARCHAR(100));

select * from CLIENTE;

--creamos la tabla empleado
create table empleado (id_empleado integer 
auto_increment primary key,
nombre varchar(40),
paterno varchar(40),
login varchar(20),
password integer);


select * from empleado;

create table control(id_control integer primary key auto_increment,
id_empleado integer,
entreda date,
salida date,
foreign key(id_empleado) references empleado(id_empleado));

select * from control;

