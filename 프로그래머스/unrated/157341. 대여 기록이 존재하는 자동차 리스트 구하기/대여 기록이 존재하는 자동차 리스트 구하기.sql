-- 코드를 입력하세요
SELECT CAR_ID
FROM CAR_RENTAL_COMPANY_CAR NATURAL JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY 
WHERE (EXTRACT(MONTH FROM START_DATE)=10)AND(CAR_TYPE='세단')
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
