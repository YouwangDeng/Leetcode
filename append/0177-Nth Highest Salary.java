//Solution 1 SQL function
CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
    SET N = N - 1;
    RETURN (
        select ifnull((select DISTINCT salary
        from Employee
        order by salary Desc
        Limit 1 Offset N), NULL) as 'getNthHighestSalary'
    );
END