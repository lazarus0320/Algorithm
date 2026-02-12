import math

def solution(sizes):
    
    max_a, max_b = 0, 0
    
    for w, h in sizes:
        temp_a = max(w, h)
        temp_b = min(w, h)
        
        max_a = max(max_a, temp_a)
        max_b = max(max_b, temp_b)
    
    return max_a * max_b