select ID, EMAIL, FIRST_NAME, LAST_NAME
from DEVELOPERS
where (SKILL_CODE & 256 > 0) or (SKILL_CODE & 1024)
order by ID asc