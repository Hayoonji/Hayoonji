-- 코드를 입력하세요

WITH TBL AS(SELECT *
            FROM FOOD_PRODUCT A  JOIN (SELECT *,SUM(AMOUNT) AS AMOUNTS
                                                FROM FOOD_ORDER 
                                                WHERE PRODUCE_DATE LIKE '2022-05%'
                                                 GROUP BY PRODUCT_ID) B
            USING (PRODUCT_ID)
           )

SELECT PRODUCT_ID,PRODUCT_NAME,AMOUNTS*PRICE AS TOTAL_SALES
FROM TBL
ORDER BY TOTAL_SALES DESC,PRODUCT_ID
