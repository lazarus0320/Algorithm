def solution(answers):
    answer = []
    spj1 = [1,2,3,4,5]
    spj2 = [2, 1, 2, 3, 2, 4, 2, 5]
    spj3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    rank = {1: 0, 2: 0, 3: 0}
    
    for i in range(len(answers)):
        if spj1[i % len(spj1)] == answers[i]:
            rank[1] += 1
        
        if spj2[i % len(spj2)] == answers[i]:
            rank[2] += 1
        
        if spj3[i % len(spj3)] == answers[i]:
            rank[3] += 1
            
    
    answer = [k for k, v in rank.items() if v == max(rank.values())]
    
    return answer