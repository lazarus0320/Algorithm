from itertools import permutations

def solution(k, dungeons):
    answer = 0
    
    for perm in permutations(dungeons):
        cur_k = k
        count = 0
        
        for need, spend in perm:
            if cur_k >= need:
                cur_k -= spend
                count += 1
            else:
                break
                
        answer = max(answer, count)
    
    return answer