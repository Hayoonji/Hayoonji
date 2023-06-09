-- 코드를 입력하세요
WITH TBL AS(SELECT *, DATEDIFF(END_DATE,START_DATE)+1 AS DURATION
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY ),

TBL2 AS (SELECT CAR_ID,ROUND(AVG(DURATION),1) AS AVERAGE_DURATION
FROM TBL
GROUP BY CAR_ID)

SELECT *
FROM TBL2
WHERE AVERAGE_DURATION>=7
ORDER BY AVERAGE_DURATION DESC,CAR_ID DESC
