select productid,
		productName,
        unitprice,
        unitsinstock,
        (unitprice * unitsinstock) as 'Total por produto', CategoryID
from products
order by UnitPrice;

select orderid
		custumerid,
        employeeid,
        orderdate
from orders
where orderDate between '19960101' and orderDate between '19961231'
order by orderdate desc;

select orderid
		custumerid,
        employeeid,
        orderdate
from orders
where year(orderdate) = '1996'
order by orderdate asc;

select orderid
		custumerid,
        employeeid,
        orderdate
from orders
where orderDate >= '19960101' and orderDate <= '19961231'
order by orderdate desc;



select productid,
		productName,
        unitprice,
        unitsinstock,
        (unitprice * unitsinstock) as 'Total por produto', CategoryID
from products
where (CategoryID in (1,3)) and productname like 'G_a%a';


-- Agregadores --


-- menor/ maior valor, media do valor dos precos e a quantidade de linhas na tabela

select 
min(unitprice) as menorValor,
max(unitprice) as maiorValor,
avg(unitprice) as mediaValor,
count(UnitPrice) as qtdProdutos
from products;

-- Soma do estoque e o preco dos produtos

select sum(unitprice * unitsinstock) as Soma
from products;


-- Produto mais caro

select *
from products
where unitprice = (select min(unitprice) from products);

-- Produto mais barato

select *
from products
where unitprice = (select max(unitprice) from products);


select *
from products
order by unitprice asc
limit 1;


select customerid
from orders;


select *
from customers
where customerid in (select CustomerID from orders);

select *
from customers
where customerid not in (select CustomerID from orders);

select * from categories
where CategoryID not in (select categoryid from products);
