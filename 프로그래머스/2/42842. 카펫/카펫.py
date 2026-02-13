def solution(brown, yellow):
    answer = []
    
    total = brown + yellow
    
    for h in range(3, total + 1):
        w = total // h
        
        if (w - 2) * (h - 2) == yellow:
            return [w, h]