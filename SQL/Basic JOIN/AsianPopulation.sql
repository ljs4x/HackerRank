/*
https://www.hackerrank.com/challenges/asian-population
*/

SELECT SUM(CITY.POPULATION)
FROM CITY, COUNTRY
WHERE
    COUNTRY.CONTINENT = 'Asia' AND
    CITY.COUNTRYCODE = COUNTRY.CODE;