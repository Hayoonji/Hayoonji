-- 코드를 입력하세요
# END_DATE가 <='2022-10-16' : 대여가능, 반대면 대여중
# END_DATE가 젤 최신껄로만
SELECT CAR_ID
    ,if(sum(if('2022-10-16' between start_date and end_date, 1, 0))>0, '대여중', '대여 가능') as AVAILABILITY
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
