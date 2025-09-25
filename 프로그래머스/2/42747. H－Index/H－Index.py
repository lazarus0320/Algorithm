def solution(citations):
    answer = 0
    
    citations.sort()
    
    for h in range(len(citations)+1):
        count = sum(1 for cit in citations if h <= cit)
        if h <= count:
            answer = h
    return answer