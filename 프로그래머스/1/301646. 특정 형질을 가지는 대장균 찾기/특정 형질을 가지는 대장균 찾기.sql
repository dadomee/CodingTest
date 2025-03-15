select count(*) as count
from ECOLI_DATA A
where 1=1
and (GENOTYPE&2)!=2 -- 2번째 비트 맞는지 1,2,4,8 순
and ((GENOTYPE&4) = 4 or (GENOTYPE & 1)=1);
-- 3번째 비트 비교 , 첫번째 비트 비교 