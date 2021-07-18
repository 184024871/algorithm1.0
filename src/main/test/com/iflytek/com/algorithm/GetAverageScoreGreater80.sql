
-- 一个成绩表，包含名称，科目，分数，求出平均分大于80的所有人，名称多个，科目是多种
SELECT DISTINCT t1.NAME, t2.avgscore FROM T_MARK t1,(

    SELECT NAME, AVG(SCORE) AS avgscore
    FROM T_MARK
    GROUP BY NAME

) t2
WHERE t1.NAME=t2.NAME
AND avgscore >= 80