CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
      declare M INT ;
      SET M = N-1;
  RETURN (
      select ifnull((select distinct(Salary) from Employee ORDER by Salary DESC limit M,1), null)
  );
END