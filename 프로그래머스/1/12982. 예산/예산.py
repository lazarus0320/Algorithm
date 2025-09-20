def solution(d, budget):
    answer = 0
    
    d.sort()
    cur_budget = budget
    for i in d:
        if cur_budget - i < 0:
            break
        cur_budget -= i
        answer += 1
        
        
    return answer