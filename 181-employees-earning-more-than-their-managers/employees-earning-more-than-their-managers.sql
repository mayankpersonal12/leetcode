/* Write your PL/SQL query statement below */
select emp.name as Employee from Employee emp,employee mgr 
where emp.managerId=mgr.id and emp.salary>mgr.salary