# Write your MySQL query statement below
select score,
(select count(distinct score) from scores where score>=s.score) as 'rank' from scores as s
order by score desc