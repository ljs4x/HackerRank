/*
https://www.hackerrank.com/challenges/weather-observation-station-5
*/

SELECT 
    CITY, 
    LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) ASC
LIMIT 1;

SELECT 
    CITY,
    LENGTH(CITY)
FROM STATION
ORDER BY LENGTH(CITY) DESC
LIMIT 1; 