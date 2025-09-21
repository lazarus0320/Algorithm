def solution(N, stages):
    temp = []
    answer = []
    user = 0
    fail_count = [0] * (N + 1)
    
    for stage in stages:
        if stage <= N:
            fail_count[stage] += 1
        user += 1
    
                      
    for i in range(1, N+1):

        if user == 0:
            temp.append((i, 0))
        else:
            temp.append((i, fail_count[i]/user))
            
        user -= fail_count[i]
    
    temp.sort(key = lambda x: -x[1])
        
    return [x[0] for x in temp]