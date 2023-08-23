# Write your MySQL query statement below
select w.id from weather as w, weather as w1 
where w.temperature>w1.temperature  and datediff(w.recordDate,w1.recordDate)=1;