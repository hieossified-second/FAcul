create database tads1mb;
use tads1mb;

create table vendedores
(
	codigoVendedor int primary key,
	nome varchar (50),
	salarioFixo dec (10,4)
    
);

insert into vendedores (codigoVendedor, 
nome,
salarioFixo)

values (1, 'Joao da Silva', 5500.99);

select *
from vendedores;

create table produtos 
(
		codigoProduto int primary key,
        nome varchar(50),
        precoUnitario dec (10,4),
        quantidadeEstoque int
);

create table clientes 
(
	codigoCliente int primary key,
	nome varchar(50),
    logradouro varchar(50),
    numero varchar (8),
    bairro varchar(50),
    CEP char (8),
    Cidade varchar(20),
    UF char(2),
    CNPJ char(14),
    IE varchar(20)
);

create table pedido
(
	codigoPedido int primary key,
    dataPedido timeStamp,
    dataEntrega datetime,
    codigoVendedor int,
    codigoCliente int,
    constraint ChaveEst1 foreign key(codigoVendedor)
    references vendedores(codigoVendedor),
    constraint chaveEst2 foreign key(codigoCliente)
    references clientes(codigoCliente)

);

create table itemPedidos
(
	codigoPedidos int,
    codigoProduto int,
    quantidade int,
    constraint chaveEst3 foreign key(codigoPedido)
    references pedidos(codigoPedido),
    constraint ChaveEst4 foreign key(codigoProduto)
    references produtos(codigoProduto),
    constraint chavePri1 primary key(codigoPedido, codigoProduto)
);


insert into vendedores (codigoVendedor, 
nome,
salarioFixo)

values (5, 'Pedro Silva', 4500),
	   (3, 'Ana Silva', 6000),
       (4, 'Joaquim Silva', 10000);
       
       
update vendedores
set nome = 'Joao da Silva Peireira Fonseca',
	salarioFixo = 20000
where codigoVendedor = 1;

update vendedores
set salarioFixo = salarioFixo + (salarioFixo*10)/100
where codigoVendedor = 3;


delete from vendedores
where codigoVendedor = 3;
