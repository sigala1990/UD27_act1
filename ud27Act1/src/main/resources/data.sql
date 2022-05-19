


CREATE TABLE piezas (
codigo int auto_increment primary key,
nombre nvarchar(100));

CREATE TABLE proveedores ( 
id char(4) primary key,
nombre nvarchar(100));

CREATE TABLE suministra (
id int auto_increment primary key,
codigopieza int,
idproveedor char(4),
precio int,
foreign key (codigopieza) references piezas (codigo) ON DELETE CASCADE,
foreign key (idproveedor) references proveedores (id) ON DELETE CASCADE);

insert into piezas (nombre) values("tornillo");
insert into piezas (nombre) values("tuerca");
insert into piezas (nombre) values("arandela");

insert into proveedores (id,nombre) values("AA2","pryca");
insert into proveedores (id,nombre) values("AA1","mercadona");
insert into proveedores (id,nombre) values("AA3","carrefour");
insert into proveedores (id,nombre) values("AA4","dia");

insert into suministra (codigopieza,idproveedor,precio) values (1,"AA2",200);
insert into suministra (codigopieza,idproveedor,precio) values (2,"AA3",500);
insert into suministra (codigopieza,idproveedor,precio) values (3,"AA4",600);