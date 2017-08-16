/*
https://www.hackerrank.com/challenges/the-pads
*/

SELECT CONCAT(Name, '(', SUBSTRING(Occupation FROM 1 FOR 1), ')') 
FROM OCCUPATIONS
ORDER BY Name;

SELECT CONCAT('There are total ', COUNT(Occupation), " ", LOWER(Occupation), "s." ) AS Total
FROM OCCUPATIONS
GROUP BY Occupation
ORDER BY COUNT(Occupation) ASC, Occupation;

