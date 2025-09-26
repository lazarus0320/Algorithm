def solution(brown, yellow):
    answer = []
    
    total = brown + yellow
    for h in range(3, total):
        
        w = total // h
        if (w - 2) * (h - 2) == yellow:
            return [w, h]
    
    return answer