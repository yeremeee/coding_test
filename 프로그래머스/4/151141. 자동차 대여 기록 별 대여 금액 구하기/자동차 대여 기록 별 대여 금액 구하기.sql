SELECT CH.HISTORY_ID,
    CASE
        WHEN CH.DAYS >= 90 
            THEN CH.TOTAL_FEE * (
                100 - (
                    SELECT DISCOUNT_RATE
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                    WHERE CAR_TYPE = '트럭' 
                        AND DURATION_TYPE = '90일 이상'
                )) / 100            
            
        WHEN CH.DAYS >= 30 
            THEN CH.TOTAL_FEE * (
                100 - (
                    SELECT DISCOUNT_RATE
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                    WHERE CAR_TYPE = '트럭' 
                        AND DURATION_TYPE = '30일 이상'
                )) / 100          
        
        WHEN CH.DAYS >= 7 
            THEN CH.TOTAL_FEE * (
                100 - (
                    SELECT DISCOUNT_RATE
                    FROM CAR_RENTAL_COMPANY_DISCOUNT_PLAN
                    WHERE CAR_TYPE = '트럭' 
                        AND DURATION_TYPE = '7일 이상'
                )) / 100
        
        ELSE CH.TOTAL_FEE
    END AS FEE
FROM (
    SELECT C.CAR_ID,
        H.HISTORY_ID,
        DATEDIFF(H.END_DATE, H.START_DATE) + 1 AS DAYS,
        C.DAILY_FEE * (DATEDIFF(H.END_DATE, H.START_DATE) + 1) AS TOTAL_FEE
    FROM CAR_RENTAL_COMPANY_CAR C
    JOIN CAR_RENTAL_COMPANY_RENTAL_HISTORY H
        ON C.CAR_ID = H.CAR_ID
            AND C.CAR_TYPE = '트럭'
) CH
ORDER BY FEE DESC, HISTORY_ID DESC




