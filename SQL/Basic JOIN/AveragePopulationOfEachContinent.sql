/*
https://www.hackerrank.com/challenges/average-population-of-each-continent
*/

SELECT DISTINCT COUNTRY.CONTINENT AS Continent, AVG(CITY.POPULATION) AS 'Average city pop'
FROM CITY, COUNTRY
WHERE CITY.COUNTRYCODE = COUNTRY.CODE
GROUP BY COUNTRY.CONTINENT;