# Write your MySQL query statement below
SELECT name AS customers
FROM customers
WHERE (
        SELECT COUNT(*)
        FROM orders
        WHERE customerId = customers.id
        ) < 1
