select animal_type, count(*)
from ANIMAL_INS
group by animal_type
order by animal_type