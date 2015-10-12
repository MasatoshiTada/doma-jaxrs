SELECT
  emp_id,
  e.name AS name,
  joined_date,
  e.dept_id AS dept_id,
  d.name AS dept_name
FROM EMPLOYEE e
JOIN DEPARTMENT d
ON e.dept_id = d.dept_id
WHERE e.name LIKE /* name */'%s%'