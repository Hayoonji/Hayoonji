-- 코드를 입력하세요
WITH TBL AS(
SELECT *,LEFT(PRODUCT_CODE,2)AS CATEGORY
FROM PRODUCT )

SELECT CATEGORY,COUNT(product_id)
FROM TBL
GROUP BY CATEGORY
ORDER BY CATEGORY
