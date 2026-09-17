# Write your MySQL query statement below

select unique_id, name
from EmployeeUNI o
right join Employees e
on o.id = e.id