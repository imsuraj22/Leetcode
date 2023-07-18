# Write your MySQL query statement below
select e.name from employee as e
join employee as m on e.id=m.managerid
group by m.managerid having count(e.id)>=5