/*
https://www.hackerrank.com/challenges/what-type-of-triangle
*/

SELECT
CASE
    WHEN A = B AND A = C THEN 'Equilateral'
    WHEN A = B AND C < A + B THEN 'Isosceles'
    WHEN A = C AND B < A + C THEN 'Isosceles'
    WHEN B = C AND A < B + C THEN 'Isosceles'
    WHEN 
        NOT A = B 
        AND NOT B = C 
        AND A <= B + C
        AND B <= A + C
        AND C <= A + B
        THEN 'Scalene'
    ELSE 'Not A Triangle'
END AS Triangle
FROM TRIANGLES;
