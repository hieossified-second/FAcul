show DATABASES;
show tables;

--Atividade de revisao

-- 1) gere uma consulta com os de pagamente do cliente de codigo = 1


--select payment.customer_id as CODIGO,
--    customer.first_name as NOME,
--    payment.amount as VALOR
--    FROM payment
--    INNER JOIN customer USING(customer_id)
--    WHERE customer_id = 1
--    ORDER BY VALOR;



-- 2)Gere uma consulta informe os titulos do filme que o ator de codigo = 1 participou

SELECT film.title
    FROM
    INNER join actor on film.actor_id = actor.actor_id




-- 3)quanto faturou o gerente de codigo = 1, com uma comissao de 5%




