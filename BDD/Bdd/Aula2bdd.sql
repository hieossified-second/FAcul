SELECT * From actor
    INNER JOIN film
    ON actor_id = film_id;
CREATE VIEW atores_filmes
AS
SELECT actor.actor_id, first_name, film.film_id, title
FROM actor
INNER JOIN 
ON actor_id = film_id
ORDER BY actor.first_name;

SELECT * FROM atores_filmes 

SELECT * from address;
SELECT * FROM customer;

CREATE View customer_address
AS
SELECT customer.customer_id, CONCAT(customer.first_name + ' ' + customer.last_name), address.address, city.city
FROM customer
INNER JOIN address
ON customer.customer_id = address.address_id
INNER JOIN city ON city.city_id = address.city_id;

SELECT * FROM customer_address

CREATE View customer_address2
AS
SELECT customer.customer_id, CONCAT(customer.first_name + ' ' + customer.last_name), address.address, city.city
FROM customer
INNER JOIN address
ON customer.customer_id = address.address_id
INNER JOIN city ON city.city_id = address.city_id;

CREATE View solox
AS
SELECT customer.customer_id, CONCAT(customer.first_name + " " + customer.last_name) as 'Nome completo', address.address, city.city
FROM customer
INNer JOIN address
on customer.customer_id = address.address_id
INNER JOIN city ON city.city_id = address.city_id;

CREATE View cust_address
    AS
    SELECT customer.customer_id as 'Codigo cliente', CONCAT(customer.first_name + " " + customer.last_name) as 'Nome completo', 
    address.address as 'Endereco',
    city.city as 'Cidade'
    FROM customer
    INNer JOIN address
    on customer.customer_id = address.address_id
    INNER JOIN city ON city.city_id = address.city_id;



SELECT * from store;

SELECT * FROM film;

CREATE VIEW filme_lancamento2
    AS
    SELECT film.film_id, 
    film.title,
    film.description,
    film.`length`,
    film.release_year
    FROM film
    ORDER BY release_year;

Select * FROM filme_lancamento2;
