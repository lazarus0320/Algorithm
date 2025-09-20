import math

def solution(sizes):
    w, h = 0, 0
    
    for i, j in sizes:
        width = max(i, j)
        height = min(i, j)
        
        if w < width:
            w = width
        if h < height:
            h = height
    
    answer = w * h
        
    
    return answer