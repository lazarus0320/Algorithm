from collections import deque

def solution(priorities, location):
    answer = 0
    
    queue = deque()
    
    for idx, pri in enumerate(priorities):
        queue.append((pri, idx))
        
    count = 0
    while queue:
        cur_pri, cur_idx = queue.popleft()
        
        if any(cur_pri < other_pri for other_pri, _ in queue):
                queue.append((cur_pri, cur_idx))
                
        else:
                count += 1
                if location == cur_idx:
                    return count
        
    return count