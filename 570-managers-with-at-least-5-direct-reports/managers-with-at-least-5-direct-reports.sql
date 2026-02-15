/* Write your PL/SQL query statement below */
select name from Employee where id in (select managerId from Employee
group by managerid 
having count(managerId)>=5);