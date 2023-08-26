# Write your MySQL query statement below
select sum(case when amount>500 then 1 else 0 end) as rich_count from store
 where (customer_id,amount) in(
 select customer_id, max(amount) from store group by customer_id
 )