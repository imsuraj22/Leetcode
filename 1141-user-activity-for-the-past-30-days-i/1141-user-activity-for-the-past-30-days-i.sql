# Write your MySQL query statement below
select activity_date as day , count(distinct user_id) as active_users from activity
where datediff('2019-07-27',activity_date)<30 and activity_date<='2019-07-27' and 
(activity_type='open_session' or activity_type='scroll_down' or activity_type='end_session'
or activity_type='send_message'
)
group by activity_date;