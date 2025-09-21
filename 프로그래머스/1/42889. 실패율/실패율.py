def solution(N, stages):
    temp = []
    answer = []
    dict = {}
    for i in stages:
        if i > N:
            continue
        dict[i] = dict.get(i, 0) + 1
    
    user = len(stages)
                      
    for i in range(1, N+1):
        cur = dict.get(i, 0)
        
        if user == 0:
            temp.append((i, 0))
        else:
            temp.append((i, cur/user))
            
        user -= cur
    
    temp.sort(key = lambda x: -x[1])
    
    for x, y in temp:
        answer.append(x)
        
    return answer