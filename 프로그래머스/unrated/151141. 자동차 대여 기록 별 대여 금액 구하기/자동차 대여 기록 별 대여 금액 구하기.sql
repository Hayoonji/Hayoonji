-- 코드를 입력하세요
WITH TBL AS(
SELECT history_id,car_id,DATEDIFF(end_date,start_date)+1 AS DIFF
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE CAR_ID IN(
            SELECT CAR_ID
            FROM CAR_RENTAL_COMPANY_CAR 
            WHERE CAR_TYPE='트럭')),
TBL2 AS(
SELECT *,CASE WHEN DIFF>=7 AND DIFF<30 THEN 5
            WHEN DIFF>=30 AND DIFF<90 THEN 8
            WHEN DIFF>=90 THEN 15 ELSE 0 END AS RATE
FROM TBL )

SELECT HISTORY_ID,ROUND(DAILY_FEE*((100-RATE)/100)*DIFF,0) AS FEE
FROM TBL2 LEFT OUTER JOIN CAR_RENTAL_COMPANY_CAR
USING (CAR_ID)
GROUP BY history_id
ORDER BY FEE DESC, history_id DESC
