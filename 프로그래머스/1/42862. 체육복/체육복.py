def solution(n, lost, reserve):
    answer = 0
    
    both = set(lost) & set(reserve)
    lost = set(lost) - both
    reserve = sorted(set(reserve) - both)
    
    for r in reserve:
        front = r - 1
        back = r + 1
        
        if front in lost:
            lost.remove(front)
        elif back in lost:
            lost.remove(back)
        
    return n - len(lost)