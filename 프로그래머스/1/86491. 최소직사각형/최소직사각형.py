import math

def solution(sizes):
    max_v, min_v = 0, 0
    
    for x, y in sizes:
        temp_a = max(x, y)
        temp_b = min(x, y)
        
        if max_v < temp_a:
            max_v = temp_a
        if min_v < temp_b:
            min_v = temp_b
    
    answer = max_v * min_v
    
    return answer