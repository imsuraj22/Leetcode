select s.user_id, round(avg(if(action='confirmed',1,0)),2) as confirmation_rate
from signups as s left join confirmations as c using(user_id)
group by s.user_id order by s.user_id;