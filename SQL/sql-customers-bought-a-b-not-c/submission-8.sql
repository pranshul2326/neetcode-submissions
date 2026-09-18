-- Write your query below
select
customers.customer_id, customers.customer_name 
from customers left join orders
on customers.customer_id = orders.customer_id
group by customers.customer_id
HAVING SUM(CASE WHEN orders.product_name = 'A' THEN 1 ELSE 0 END) > 0
   AND SUM(CASE WHEN orders.product_name = 'B' THEN 1 ELSE 0 END) > 0
   AND SUM(CASE WHEN orders.product_name = 'C' THEN 1 ELSE 0 END) = 0
order

 by customers.customer_name;