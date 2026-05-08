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
