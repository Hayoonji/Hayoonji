-- 코드를 입력하세요
WITH TBL AS(
SELECT CASE WHEN PRICE<10000 THEN 0 ELSE TRUNCATE(PRICE /10000,0)*10000 END AS PRICE_GROUP,PRICE
FROM PRODUCT)

SELECT PRICE_GROUP,COUNT(PRICE) AS PRODUCTS
FROM TBL
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP