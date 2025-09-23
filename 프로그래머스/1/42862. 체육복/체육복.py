def solution(n, lost, reserve):
    answer = 0
    
    both = set(lost) & set(reserve)
    
    lost = [x for x in lost if x not in both]
    reserve = [x for x in reserve if x not in both]
    
    lost_c = sorted(lost[:])
    
    for lo in lost_c:
        if (lo - 1) in reserve:
            reserve.remove(lo - 1)
            lost.remove(lo)
        elif (lo + 1) in reserve:
            reserve.remove(lo + 1)
            lost.remove(lo)
    
    answer = n - len(lost)
    return answer