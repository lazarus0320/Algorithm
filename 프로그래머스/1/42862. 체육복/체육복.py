def solution(n, lost, reserve):
    answer = 0
    
    both = set(lost) & set(reserve)
    lost = set(lost) - both
    reserve = set(reserve) - both

    borrow = 0
    for lo in lost:
        if lo - 1 in reserve:
            borrow += 1
            reserve.remove(lo-1)
        
        elif lo + 1 in reserve:
            borrow += 1
            reserve.remove(lo+1)
        
    return n - len(lost) + borrow