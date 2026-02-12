import math
from collections import deque

def solution(progresses, speeds):
    answer = []
    days = deque()
    
    for p, s in zip(progresses, speeds):
        need_days = math.ceil((100 - p) / s)
        days.append(need_days)
    
    while days:
        curr_max = days.popleft()
        count = 1
        
        while days and days[0] <= curr_max:
            days.popleft()
            count += 1
        
        answer.append(count)
            
    
    return answer