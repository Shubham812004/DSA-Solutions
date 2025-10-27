select e.name 
from Employee e 
join Employee b 
on e.id = b.managerID
group by b.managerID
having count(*) >=5;
