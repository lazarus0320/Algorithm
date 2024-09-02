def solution(N, stages):
    stages_counts = [0] * (N + 2)
    for stage in stages:
        stages_counts[stage] += 1
    
    fail_rate_list = []
    users_remain = len(stages)
    
    
    for i in range(1, N+1):
        if users_remain == 0:
            fail_rate = 0
            
        else:
            fail_rate = stages_counts[i] / users_remain
        fail_rate_list.append((i, fail_rate))
        users_remain -= stages_counts[i]
    
    fail_rate_list.sort(key = lambda x: (-x[1], x[0]))
    
    answer = [stage for stage, _ in fail_rate_list]
    return answer;