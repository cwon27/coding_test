# 2진수 변환 : &(AND)
# -> A & 2^n = 2^n은 A를 2진수로 변환했을 때 n+1 자리가 1인지 여부 파악 가능
# -> 예를 들어서 13 & 4(2^2) = 4(0100)이면 13의 2진수 표현(1101)에서 3(2+1)번째 자리가 1임을 알 수 있음

SELECT COUNT(*) AS COUNT
FROM ECOLI_DATA
# 2번 형질을 보유하지 않으면서
WHERE GENOTYPE & 2 = 0
# 1번 형질 보유
    AND( GENOTYPE & 1 > 0
# 3번 형질 보유
    OR GENOTYPE & 4 > 0);