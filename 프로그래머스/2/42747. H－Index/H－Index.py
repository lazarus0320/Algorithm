def solution(citations):
    answer = 0
    
    citations.sort()
    
    for h in range(0, len(citations) + 1):
        count = 0
        for cit in citations:
            if h <= cit:
                count += 1
        
        if h <= count:
            answer = h
    
    return answer