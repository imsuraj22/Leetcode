select round(count(t2.player_id)/count( distinct t1.player_id),2) as fraction 
from activity as t1 left join 
(select player_id, min(event_date) as min_date from activity group by player_id) as t2
on t1.player_id=t2.player_id and datediff(t1.event_date,t2.min_date)=1;