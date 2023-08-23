select s.student_id,s.student_name,sb.subject_name,count(e.subject_name) as attended_exams
from students as s join subjects as sb
left join examinations as e
on s.student_id=e.student_id and sb.subject_name=e.subject_name
group by s.student_id,sb.subject_name
order by student_id,subject_name;