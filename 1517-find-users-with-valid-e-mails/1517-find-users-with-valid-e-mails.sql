# Write your MySQL query statement below
select user_id,name,mail from users
where mail REGEXP '^[A-Za-z][A-Za-z0-9_.-]*@leetcode\\.com$'; 